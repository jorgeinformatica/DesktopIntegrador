package Controller;

import Models.XAsistenteModel;
import Models.XDependienteModel;
import Models.XViviendaModel;
import View.AccessAsist;
import View.MainView;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.net.ServerSocket;
import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author vesprada
 */
public class BLogic {

    private MainView mainView;
    private AppServer appServer;
    private HibernateController hibernate;
    private ServerSocket serverSocket;
    private XAsistenteModel asistente;

    public BLogic() {
        initHibernate();
        serverSocket = initServerSocket();
        asistente = getAssistant();
        initView();
        hibernate.logDesktopApp(serverSocket);
    }

    private void initView() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();

        mainView = new MainView(this, asistente);
        // mainView.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gd.setFullScreenWindow(mainView);
        mainView.setVisible(true);
    }

    private void initHibernate() {
        hibernate = new HibernateController();
        hibernate.start();
    }

    private XAsistenteModel getAssistant() {
        AccessAsist access = null;
        try {
            access = new AccessAsist(null, true, this);
        } catch (SQLException ex) {
            System.err.println("PROBLEMAS ACCEDIENDO A LA BD");
        }
        return access.getAsistente();
    }

    private ServerSocket initServerSocket() {
        appServer = new AppServer(this);
        return appServer.getServer();
    }

    public static XDependienteModel getDependiente(String dni, List<Object> listaDependientes) {
        for (Object dependiente : listaDependientes) {
            if (((XDependienteModel) dependiente).getXPersonaModel().getDni().equals(dni)) {
                return ((XDependienteModel) dependiente);
            }
        }
        return null;
    }

    //Insertamos la ALARMA en la tabla de alarmas activas
    public synchronized void insertAlarm(JSONObject alarm, ControlTask resp) throws JSONException {
        Object[] row = {resp, new Date(alarm.getLong("fecha")), alarm.getString("idDependiente"), alarm.getString("tipo")};
        ((DefaultTableModel) mainView.getjTableAlarmas().getModel()).addRow(row);
        mainView.getjTabbedPaneDcha().setSelectedIndex(0);
    }

    //Eliminamos la ALARMA en la tabla de alarmas activas
    public synchronized void removeAlarm(ControlTask resp) {
        for (int i = 0; i < mainView.getjTableAlarmas().getRowCount(); i++) {
            if (((ControlTask) mainView.getjTableAlarmas().getValueAt(i, 0)).equals(resp)) {
                ((DefaultTableModel) mainView.getjTableAlarmas().getModel()).removeRow(i);
            }
        }
    }

    //Recorre las viviendas del dependiente para ponerlas a false(no son la habitual)
    public void reasignarHabitual(XDependienteModel dep) {
        abrirTransaccion();
        for (Iterator<XViviendaModel> iterator = dep.getXViviendaModels().iterator(); iterator.hasNext();) {
            XViviendaModel next = iterator.next();
            next.setHabitual(false);
        }
        lanzarCommit();
    }

    //Recorre las viviendas del dependiente para ponerlas a false y luego define la actual
    public void reasignarHabitual(XDependienteModel dep, XViviendaModel hab) {
        abrirTransaccion();
        for (Iterator<XViviendaModel> iterator = dep.getXViviendaModels().iterator(); iterator.hasNext();) {
            XViviendaModel next = iterator.next();
            if (next.getId() == hab.getId()) {
                next.setHabitual(true);
            } else {
                next.setHabitual(false);
            }

        }
        lanzarCommit();
    }

    //Recorre las viviendas del dependiente y devuelve la actual
    public XViviendaModel getActualHome(XDependienteModel dep) {
        for (Iterator<XViviendaModel> iterator = dep.getXViviendaModels().iterator(); iterator.hasNext();) {
            XViviendaModel next = iterator.next();
            if (next.getHabitual()) {
                return next;
            }
        }
        return null;
    }
    //Gestión de la BD
    //--------------------------------------------------------------------------
    //Consultas recurrentes

    public List<Object> cargarDatos(Class c) {
        return hibernate.read(c);
    }

    //Consultas personalizadas
    public List<Object> cargarDatos(String query) {
        return hibernate.readWithQuery(query);
    }

    public Object cargarDatos(Class c, String critery, Object[] opc) {
        return hibernate.read(c, critery, opc);
    }

    public Object cargarDatos(Class c, String critery, Object opc) {
        return hibernate.read(c, critery, opc);
    }

    public TableModel cargarResultSet(String query, Object dependiente) {
        return hibernate.getRs(query, dependiente);
    }

    public TableModel cargarResultSet(String query, int id) {
        return hibernate.getRs(query, id);
    }

    //Guardar un nuevo objeto en la base de datos
    public void guardarObjeto(Object object) {
        hibernate.save(object);
    }

    //Actualizar registro
    //--------------------------------------------------------------------------
    //Abrir transaccion
    public void abrirTransaccion() {
        hibernate.openTransaction();
    }

    public void lanzarCommit() {
        hibernate.commitTransaction();
    }

    //Eliminar registro
    public void borrarObjeto(Object object) {
        hibernate.remove(object);
    }

    //Getters and Setters
    public HibernateController getHibernate() {
        return hibernate;
    }

    public AppServer getAppServer() {
        return appServer;
    }

    public MainView getMainView() {
        return mainView;
    }

    public int obtenerIdCiudad(XDependienteModel dep) {
        Set viv = dep.getXViviendaModels();
        for (Iterator iterator = viv.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            if (((XViviendaModel) next).getHabitual()) {
                return ((XViviendaModel) next).getXDireccionModel().getXCiudadModel().getId();
            }
        }
        return 1;
    }

}
