/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.XDependienteModel;
import Models.XIpModel;
import Utils.HibernateUtil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.jdbc.ReturningWork;
import org.hibernate.query.Query;

/**
 *
 * @author vesprada
 */
public class HibernateController extends Thread {

    private static Session session;
    private static XIpModel ipLog;

    public HibernateController() {
    }

    @Override
    public void run() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    private String saberMiIp() {
        String ip = null;
        if (ip != null) {
            return ip;
        } else {
            String miIP = null;
            try {
                Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
                while (interfaces.hasMoreElements()) {
                    NetworkInterface iface = (NetworkInterface) interfaces.nextElement();
// filters out 127.0.0.1 and inactive interfaces
                    if (iface.isLoopback() || !iface.isUp()) {
                        continue;
                    }
                    Enumeration addresses = iface.getInetAddresses();
                    while (addresses.hasMoreElements()) {
                        InetAddress addr = (InetAddress) addresses.nextElement();
                        miIP = addr.getHostAddress();
                    }
                }
            } catch (SocketException e) {
                throw new RuntimeException(e);
            }
            return miIP;
        }
    }

    //Métodos para el logueo de la aplicación desktop
    //--------------------------------------------------------------------------
    //Loguea la aplicación en la BD, marcándola como disponible.
    public void logDesktopApp(ServerSocket server) {

//  InetAddress ip = null;
        String systemipaddress = null;
        try {
            URL url_name = new URL("http://bot.whatismyipaddress.com");

            BufferedReader sc
                    = new BufferedReader(new InputStreamReader(url_name.openStream()));

            // reads system IPAddress 
            systemipaddress = sc.readLine().trim();
        } catch (Exception e) {
            systemipaddress = "Cannot Execute Properly";
        }

        /*    try {
            ip = InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            Logger.getLogger(BLogic.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        session.beginTransaction();
        ipLog = new XIpModel();

        ipLog.setIp(saberMiIp());
        session.save(ipLog);

        session.getTransaction().commit();
    }

    //desloguea la aplicación de la BD, borrando el registro de la tabla
    public void logOffAndClose() {
        remove(ipLog);
    }

    //Métodos 
    //--------------------------------------------------------------------------
    //Elimina un objeto de la BD
    public void remove(Object object) throws HibernateException {
        session.beginTransaction();
        session.remove(object);
        session.getTransaction().commit();
    }

    //Guarda un objeto en la BD
    public void save(Object object) throws HibernateException {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    //Actualiza un objeto en la BD
    //--------------------------------------------------------------------------
    //Abrimos transaccion
    public void openTransaction() {
        session.beginTransaction();
    }

    //Hacemos commit de los cambios
    public void commitTransaction() {
        session.flush();
        session.getTransaction().commit();
    }

    //Devuelve todos los registros de la BD del tipo recibido como parámetro
    public List<Object> read(Class c) {
        List<Object> list = session.createQuery("from " + c.getName()).list();
        return list;
    }

    public Object read(Class c, String critery, Object[] opc) {
        Query query = session.createQuery("from " + c.getName() + critery);
        for (int i = 0; i < opc.length; i++) {
            query.setParameter(i + 1, opc[i]);
        }
        List<Object> list = query.list();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public Object read(Class c, String critery, Object opc) {
        List<Object> list = session.createQuery("from " + c.getName() + critery).setParameter(1, opc).list();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    //Consulta y recupera una lista de objetos de la BD dada una query concreta
    public List<Object> readWithQuery(String query) throws HibernateException {
        List<Object> list = session.createQuery(query).list();
        return list;
    }

    public TableModel getRs(String query, Object dependiente) {
        session.beginTransaction();
        TableModel tm;
        tm = session.doReturningWork(new ReturningWork<TableModel>() {
            @Override
            public TableModel execute(Connection connection) throws SQLException {
                TableModel dtm;
                try (PreparedStatement stmt = connection.prepareStatement(query)) {
                    if (dependiente != null) {
                        stmt.setInt(1, ((XDependienteModel) dependiente).getId());
                    }
                    ResultSet rs = stmt.executeQuery();
                    dtm = Utils.Utils.buildTableModel(rs);
                }
                return dtm;
            }
        });
        session.getTransaction().commit();
        return tm;
    }

    public TableModel getRs(String query, int id) {
        session.beginTransaction();
        TableModel tm;
        tm = session.doReturningWork(new ReturningWork<TableModel>() {
            @Override
            public TableModel execute(Connection connection) throws SQLException {
                TableModel dtm;
                try (PreparedStatement stmt = connection.prepareStatement(query)) {
                    stmt.setInt(1, id);
                    ResultSet rs = stmt.executeQuery();
                    dtm = Utils.Utils.buildTableModel(rs);
                }
                return dtm;
            }
        });
        session.getTransaction().commit();
        return tm;
    }
}
