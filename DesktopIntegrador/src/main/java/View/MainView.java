package View;

import Controller.BLogic;
import Controller.ControlTask;
import Models.XAlarmaModel;
import Models.XAsistenteModel;
import Models.XCiudadModel;
import Models.XCsModel;
import Models.XDependienteModel;
import Models.XEstadoModel;
import Models.XFamiliarModel;
import Models.XHistmedicoModel;
import Models.XMedicoModel;
import Models.XOfrecerrcModel;
import Models.XPersonaModel;
import Models.XViviendaModel;
import Utils.JasperClient;
import Utils.SentenciasSQL;
import Utils.Utils;
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author vesprada
 */
public class MainView extends javax.swing.JFrame {
    
    private final String HEALTH = "CENTRO MEDICO", HOME = "VIVIENDA", DEPENDENT = "DEPENDIENTES", SOC = "social", MED = "medico";
    private final static int MAX_MAPS_ZOOM = 21;
    private final static int MIN_MAPS_ZOOM = 5;
    private final double CURRENTLAT = 38.6915899;
    private final double CURRENTLNG = -0.4948671;
    private double latitude, longitude;
    private int currentZoom;
    private boolean nuevo;
    private BLogic controller;
    private XAsistenteModel asistente;
    private XDependienteModel dep, tempo;
    private List<Object> listaDependientes;
    private List<Object> listaCiudades;
    private GoHome ruta;
    private DefaultComboBoxModel medico;
    private DefaultComboBoxModel cSalud;
    private DefaultComboBoxModel vivienda;
    private DefaultComboBoxModel genero;
    private JasperClient jClient;
    
    public MainView(BLogic controller, XAsistenteModel asistente) {
        this.controller = controller;
        this.asistente = asistente;
        this.nuevo = false;
        this.currentZoom = 17;
        initCombos();
        initComponents();
        initTabs();
        initData();
        initMaps();
        initJasper();
        controller.getAppServer().start();
        lockEnabled(false);
        lockEnabledAsist(false);
        ruta=null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane9 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelTitle = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jTabbedPaneIzq = new javax.swing.JTabbedPane();
        jPanelPrincipal = new javax.swing.JPanel();
        jPaneldependiente = new javax.swing.JPanel();
        jComboBoxDependienteVivienda = new javax.swing.JComboBox<>();
        this.jComboBoxDependienteVivienda.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        tfDependienteId = new javax.swing.JTextField();
        tfDependientePass = new javax.swing.JPasswordField();
        jComboBoxDependienteGenero = new javax.swing.JComboBox<>();
        tfDependienteNSS = new javax.swing.JTextField();
        tfDependienteTelf = new javax.swing.JTextField();
        tfDependienteNombre = new javax.swing.JTextField();
        tfDependienteApe1 = new javax.swing.JTextField();
        tfDependienteApe2 = new javax.swing.JTextField();
        tfDependienteEmail = new javax.swing.JTextField();
        dateChooserDependienteAlta = new datechooser.beans.DateChooserCombo();
        dateChooserDependienteNac = new datechooser.beans.DateChooserCombo();
        tfDependienteDNI = new javax.swing.JTextField();
        jbtnAddCasa = new javax.swing.JButton();
        jbtnModViv = new javax.swing.JButton();
        jPanelProfesionales = new javax.swing.JPanel();
        jComboBoxMedico = new javax.swing.JComboBox<>();
        this.jComboBoxMedico.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jComboBoxCS = new javax.swing.JComboBox<>();
        jbtnAddCenSal = new javax.swing.JButton();
        jbtnAddMedico = new javax.swing.JButton();
        jbtnModMed = new javax.swing.JButton();
        jbtnModCen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTACentro = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAMedico = new javax.swing.JTextArea();
        jButtonSearch = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelEstado = new javax.swing.JPanel();
        jScrollPaneestado = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jbtnMod = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();
        jbtnRemov = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnAddDepen = new javax.swing.JButton();
        jPanelHistorial = new javax.swing.JPanel();
        jPanelViviendas = new javax.swing.JPanel();
        jScrollPaneViv = new javax.swing.JScrollPane();
        jTableViviendas = new javax.swing.JTable();
        jScrollPaneHmed = new javax.swing.JScrollPane();
        jTableHistorialMed = new javax.swing.JTable();
        jScrollPaneHsoc = new javax.swing.JScrollPane();
        jTableHistorialSoc = new javax.swing.JTable();
        jScrollPaneAlleg = new javax.swing.JScrollPane();
        jTableAllegados = new javax.swing.JTable();
        jbtnAddVivienda = new javax.swing.JButton();
        jbtnModVivienda = new javax.swing.JButton();
        jbtnRemovVivienda = new javax.swing.JButton();
        jbtnAddHisMed = new javax.swing.JButton();
        jbtnModHisMed = new javax.swing.JButton();
        jbtnRemovHisMed = new javax.swing.JButton();
        jbtnAddHisSoc = new javax.swing.JButton();
        jbtnModHisSoc = new javax.swing.JButton();
        jbtnRemovHisSoc = new javax.swing.JButton();
        jbtnAddAlle = new javax.swing.JButton();
        jbtnModAlle = new javax.swing.JButton();
        jbtnRemovAlle = new javax.swing.JButton();
        jPanelAsistente = new javax.swing.JPanel();
        jPanelAsistenteMod = new javax.swing.JPanel();
        tfAsistenteNombre = new javax.swing.JTextField();
        tfAsistenteApe1 = new javax.swing.JTextField();
        tfAsistenteApe2 = new javax.swing.JTextField();
        tfAsistenteEmail = new javax.swing.JTextField();
        tfAsistenteId = new javax.swing.JTextField();
        tfAsistentePass = new javax.swing.JPasswordField();
        tfAsistenteDni = new javax.swing.JTextField();
        tfAsistenteTelf = new javax.swing.JTextField();
        jBtnCancel = new javax.swing.JButton();
        jBtnSave = new javax.swing.JButton();
        jBtnEditAsi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanelAnalisis = new javax.swing.JPanel();
        jTabbedPaneDcha = new javax.swing.JTabbedPane();
        jPanelAlertas = new javax.swing.JPanel();
        jPanelRecursos = new javax.swing.JPanel();
        jScrollPaneRecursos = new javax.swing.JScrollPane();
        jTableRecursos = new javax.swing.JTable();
        jbtnAddRecurso = new javax.swing.JButton();
        jbtnModRecurso = new javax.swing.JButton();
        jBtnLlamar = new javax.swing.JButton();
        jPanelAlarmas = new javax.swing.JPanel();
        jScrollPaneAlarm = new javax.swing.JScrollPane();
        jTableAlarmas = new javax.swing.JTable();
        jBtnAceptAlarm = new javax.swing.JButton();
        jBtnCancelAlarm = new javax.swing.JButton();
        jScrollPaneAlarm1 = new javax.swing.JScrollPane();
        jTableAlarmasHistory = new javax.swing.JTable();
        jPanelLlamadas = new javax.swing.JPanel();
        jScrollPaneAvis = new javax.swing.JScrollPane();
        jTableAvisos = new javax.swing.JTable();
        jBtnCrearAviso = new javax.swing.JButton();
        jBtnRefrescoAviso = new javax.swing.JButton();
        jPanelGeo = new javax.swing.JPanel();
        jLabelMapcaption = new javax.swing.JLabel();
        jScrollPaneMaps = new javax.swing.JScrollPane();
        jLabelMaps = new javax.swing.JLabel();
        jButtonCenterMap = new javax.swing.JButton();
        jButtonZoomOut = new javax.swing.JButton();
        jButtonZoomIn = new javax.swing.JButton();
        jScrollPaneCoord = new javax.swing.JScrollPane();
        jTableCoordenadas = new javax.swing.JTable();
        jBtnRefrescoMaps = new javax.swing.JButton();
        jBtnSelecCoord = new javax.swing.JButton();
        jBtnGoHome = new javax.swing.JButton();
        menuBarAsist = new javax.swing.JMenuBar();
        menuAsist = new javax.swing.JMenu();
        itemCerrarSesion = new javax.swing.JMenuItem();
        itemInfo = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));

        jPanelTitle.setBackground(new java.awt.Color(204, 255, 255));

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/title background.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneIzq.setBackground(new java.awt.Color(204, 255, 255));

        jPanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        jPaneldependiente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PRINCIPALES", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jComboBoxDependienteVivienda.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxDependienteVivienda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBoxDependienteVivienda.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxDependienteVivienda.setModel(vivienda);
        jComboBoxDependienteVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* VIVIENDA ACTUAL", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jComboBoxDependienteVivienda.setPreferredSize(new java.awt.Dimension(270, 55));

        tfDependienteId.setEditable(false);
        tfDependienteId.setBackground(java.awt.Color.white);
        tfDependienteId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteId.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteId.setToolTipText("");
        tfDependienteId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* ID DEPENDIENTE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteId.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependientePass.setBackground(java.awt.Color.white);
        tfDependientePass.setForeground(new java.awt.Color(0, 0, 0));
        tfDependientePass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependientePass.setText("1234");
        tfDependientePass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* PASSWORD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependientePass.setPreferredSize(new java.awt.Dimension(150, 50));

        jComboBoxDependienteGenero.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxDependienteGenero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBoxDependienteGenero.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxDependienteGenero.setModel(genero);
        jComboBoxDependienteGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* GÉNERO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jComboBoxDependienteGenero.setPreferredSize(new java.awt.Dimension(150, 55));

        tfDependienteNSS.setBackground(java.awt.Color.white);
        tfDependienteNSS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteNSS.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteNSS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteNSS.setToolTipText("");
        tfDependienteNSS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* Nº SEGURIDAD SOCIAL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteNSS.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependienteTelf.setBackground(java.awt.Color.white);
        tfDependienteTelf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteTelf.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteTelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteTelf.setToolTipText("");
        tfDependienteTelf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* TELÉFONO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteTelf.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependienteNombre.setBackground(java.awt.Color.white);
        tfDependienteNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteNombre.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteNombre.setToolTipText("");
        tfDependienteNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* NOMBRE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteNombre.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependienteApe1.setBackground(java.awt.Color.white);
        tfDependienteApe1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteApe1.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteApe1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteApe1.setToolTipText("");
        tfDependienteApe1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* PRIMER APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteApe1.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependienteApe2.setBackground(java.awt.Color.white);
        tfDependienteApe2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteApe2.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteApe2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteApe2.setToolTipText("");
        tfDependienteApe2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* SEGUNDO APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteApe2.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependienteEmail.setBackground(java.awt.Color.white);
        tfDependienteEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteEmail.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteEmail.setToolTipText("");
        tfDependienteEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* EMAIL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteEmail.setPreferredSize(new java.awt.Dimension(250, 50));

        dateChooserDependienteAlta.setCalendarBackground(new java.awt.Color(255, 255, 255));
        dateChooserDependienteAlta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA ALTA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        dateChooserDependienteAlta.setCalendarPreferredSize(new java.awt.Dimension(350, 250));
        dateChooserDependienteAlta.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 14));

        dateChooserDependienteNac.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserDependienteNac.setCalendarBackground(new java.awt.Color(255, 255, 255));
    dateChooserDependienteNac.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA NACIMIENTO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    dateChooserDependienteNac.setCalendarPreferredSize(new java.awt.Dimension(350, 250));
    dateChooserDependienteNac.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 14));

    tfDependienteDNI.setBackground(java.awt.Color.white);
    tfDependienteDNI.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    tfDependienteDNI.setForeground(new java.awt.Color(0, 0, 0));
    tfDependienteDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfDependienteDNI.setToolTipText("");
    tfDependienteDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* D.N.I", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    tfDependienteDNI.setPreferredSize(new java.awt.Dimension(150, 50));
    tfDependienteDNI.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            tfDependienteDNIFocusGained(evt);
        }
    });
    tfDependienteDNI.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tfDependienteDNIKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            tfDependienteDNIKeyTyped(evt);
        }
    });

    jbtnAddCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddCasa.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddCasa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddCasaActionPerformed(evt);
        }
    });

    jbtnModViv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModViv.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModViv.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModVivActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPaneldependienteLayout = new javax.swing.GroupLayout(jPaneldependiente);
    jPaneldependiente.setLayout(jPaneldependienteLayout);
    jPaneldependienteLayout.setHorizontalGroup(
        jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPaneldependienteLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPaneldependienteLayout.createSequentialGroup()
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfDependienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxDependienteGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dateChooserDependienteNac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDependientePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfDependienteTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateChooserDependienteAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbtnAddCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnModViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBoxDependienteVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPaneldependienteLayout.createSequentialGroup()
                    .addComponent(tfDependienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(tfDependienteApe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(tfDependienteApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPaneldependienteLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                            .addComponent(tfDependienteNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDependienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tfDependienteEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
    );
    jPaneldependienteLayout.setVerticalGroup(
        jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPaneldependienteLayout.createSequentialGroup()
            .addGap(8, 8, 8)
            .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tfDependienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfDependienteApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfDependienteApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfDependienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tfDependientePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfDependienteTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfDependienteNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfDependienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfDependienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPaneldependienteLayout.createSequentialGroup()
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateChooserDependienteNac, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooserDependienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBoxDependienteVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPaneldependienteLayout.createSequentialGroup()
                            .addComponent(jbtnAddCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jbtnModViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(8, 8, 8))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneldependienteLayout.createSequentialGroup()
                    .addComponent(jComboBoxDependienteGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())))
    );

    jComboBoxDependienteGenero.getAccessibleContext().setAccessibleName("Genero");

    jPanelProfesionales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CENTRO SALUD  /  PROFESIONALES ASOCIADOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

    jComboBoxMedico.setBackground(new java.awt.Color(255, 255, 255));
    jComboBoxMedico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jComboBoxMedico.setForeground(new java.awt.Color(0, 0, 0));
    jComboBoxMedico.setModel(medico);
    jComboBoxMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* MÉDICO", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    jComboBoxMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    jComboBoxMedico.setPreferredSize(new java.awt.Dimension(240, 60));
    jComboBoxMedico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBoxMedicoActionPerformed(evt);
        }
    });

    jComboBoxCS.setBackground(new java.awt.Color(255, 255, 255));
    jComboBoxCS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jComboBoxCS.setForeground(new java.awt.Color(0, 0, 0));
    jComboBoxCS.setModel(cSalud);
    jComboBoxCS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* CENTRO SALUD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    jComboBoxCS.setPreferredSize(new java.awt.Dimension(240, 60));
    jComboBoxCS.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBoxCSActionPerformed(evt);
        }
    });

    jbtnAddCenSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddCenSal.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddCenSal.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddCenSalActionPerformed(evt);
        }
    });

    jbtnAddMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddMedico.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddMedico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddMedicoActionPerformed(evt);
        }
    });

    jbtnModMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModMed.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModMed.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModMedActionPerformed(evt);
        }
    });

    jbtnModCen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModCen.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModCen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModCenActionPerformed(evt);
        }
    });

    jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jScrollPane1.setPreferredSize(new java.awt.Dimension(238, 80));

    jTACentro.setColumns(20);
    jTACentro.setRows(5);
    jTACentro.setBorder(null);
    jTACentro.setPreferredSize(new java.awt.Dimension(200, 80));
    jScrollPane1.setViewportView(jTACentro);

    jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jScrollPane2.setPreferredSize(new java.awt.Dimension(238, 80));

    jTAMedico.setEditable(false);
    jTAMedico.setColumns(20);
    jTAMedico.setRows(5);
    jTAMedico.setBorder(null);
    jTAMedico.setPreferredSize(new java.awt.Dimension(200, 80));
    jScrollPane2.setViewportView(jTAMedico);

    javax.swing.GroupLayout jPanelProfesionalesLayout = new javax.swing.GroupLayout(jPanelProfesionales);
    jPanelProfesionales.setLayout(jPanelProfesionalesLayout);
    jPanelProfesionalesLayout.setHorizontalGroup(
        jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBoxCS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                    .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnAddCenSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnModCen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnAddMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnModMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfesionalesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanelProfesionalesLayout.setVerticalGroup(
        jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
            .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                    .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBoxCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                            .addComponent(jbtnAddCenSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jbtnModCen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                    .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                            .addComponent(jbtnAddMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jbtnModMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(33, Short.MAX_VALUE))
    );

    jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoBuscar25x25.png"))); // NOI18N
    jButtonSearch.setPreferredSize(new java.awt.Dimension(50, 40));
    jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonSearchActionPerformed(evt);
        }
    });

    jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoGuardar25x25.png"))); // NOI18N
    jButtonSave.setPreferredSize(new java.awt.Dimension(50, 40));
    jButtonSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonSaveActionPerformed(evt);
        }
    });

    jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/IconoCancelar25x25.png"))); // NOI18N
    jButtonCancel.setPreferredSize(new java.awt.Dimension(50, 40));
    jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCancelActionPerformed(evt);
        }
    });

    jPanelEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTADO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
    jPanelEstado.setPreferredSize(new java.awt.Dimension(658, 120));

    jScrollPaneestado.setPreferredSize(new java.awt.Dimension(600, 403));

    jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jTableEstado.setPreferredSize(new java.awt.Dimension(500, 80));
    jScrollPaneestado.setViewportView(jTableEstado);

    jbtnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnMod.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnMod.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModActionPerformed(evt);
        }
    });

    jbtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAdd.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddActionPerformed(evt);
        }
    });

    jbtnRemov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
    jbtnRemov.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnRemov.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnRemovActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelEstadoLayout = new javax.swing.GroupLayout(jPanelEstado);
    jPanelEstado.setLayout(jPanelEstadoLayout);
    jPanelEstadoLayout.setHorizontalGroup(
        jPanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelEstadoLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbtnRemov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPaneestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanelEstadoLayout.setVerticalGroup(
        jPanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelEstadoLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneestado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGroup(jPanelEstadoLayout.createSequentialGroup()
                    .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnRemov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, 0))
    );

    jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnEditar.setText("Editar");
    jbtnEditar.setPreferredSize(new java.awt.Dimension(95, 40));
    jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnEditarActionPerformed(evt);
        }
    });

    jbtnAddDepen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddDepen.setPreferredSize(new java.awt.Dimension(50, 40));
    jbtnAddDepen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddDepenActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
    jPanelPrincipal.setLayout(jPanelPrincipalLayout);
    jPanelPrincipalLayout.setHorizontalGroup(
        jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanelProfesionales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnAddDepen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34))
                .addComponent(jPaneldependiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
            .addGap(8, 8, 8))
    );
    jPanelPrincipalLayout.setVerticalGroup(
        jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbtnAddDepen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPaneldependiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanelProfesionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jTabbedPaneIzq.addTab("Dependiente (Datos principales)", null, jPanelPrincipal, "");

    jPanelHistorial.setBackground(new java.awt.Color(204, 204, 204));

    jPanelViviendas.setBackground(new java.awt.Color(204, 204, 204));
    jPanelViviendas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos adicionales del dependiente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

    jScrollPaneViv.setBackground(new java.awt.Color(255, 255, 255));
    jScrollPaneViv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Viviendas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

    jTableViviendas.setBackground(new java.awt.Color(255, 255, 255));
    jTableViviendas.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPaneViv.setViewportView(jTableViviendas);

    jScrollPaneHmed.setBackground(new java.awt.Color(255, 255, 255));
    jScrollPaneHmed.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial medico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

    jTableHistorialMed.setBackground(new java.awt.Color(255, 255, 255));
    jTableHistorialMed.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPaneHmed.setViewportView(jTableHistorialMed);

    jScrollPaneHsoc.setBackground(new java.awt.Color(255, 255, 255));
    jScrollPaneHsoc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial social", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

    jTableHistorialSoc.setBackground(new java.awt.Color(255, 255, 255));
    jTableHistorialSoc.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPaneHsoc.setViewportView(jTableHistorialSoc);

    jScrollPaneAlleg.setBackground(new java.awt.Color(255, 255, 255));
    jScrollPaneAlleg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Allegados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

    jTableAllegados.setBackground(new java.awt.Color(255, 255, 255));
    jTableAllegados.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPaneAlleg.setViewportView(jTableAllegados);

    jbtnAddVivienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddVivienda.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddVivienda.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddViviendaActionPerformed(evt);
        }
    });

    jbtnModVivienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModVivienda.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModVivienda.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModViviendaActionPerformed(evt);
        }
    });

    jbtnRemovVivienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
    jbtnRemovVivienda.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnRemovVivienda.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnRemovViviendaActionPerformed(evt);
        }
    });

    jbtnAddHisMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddHisMed.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddHisMed.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddHisMedActionPerformed(evt);
        }
    });

    jbtnModHisMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModHisMed.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModHisMed.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModHisMedActionPerformed(evt);
        }
    });

    jbtnRemovHisMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
    jbtnRemovHisMed.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnRemovHisMed.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnRemovHisMedActionPerformed(evt);
        }
    });

    jbtnAddHisSoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddHisSoc.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddHisSoc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddHisSocActionPerformed(evt);
        }
    });

    jbtnModHisSoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModHisSoc.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModHisSoc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModHisSocActionPerformed(evt);
        }
    });

    jbtnRemovHisSoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
    jbtnRemovHisSoc.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnRemovHisSoc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnRemovHisSocActionPerformed(evt);
        }
    });

    jbtnAddAlle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddAlle.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddAlle.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddAlleActionPerformed(evt);
        }
    });

    jbtnModAlle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModAlle.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModAlle.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModAlleActionPerformed(evt);
        }
    });

    jbtnRemovAlle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
    jbtnRemovAlle.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnRemovAlle.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnRemovAlleActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelViviendasLayout = new javax.swing.GroupLayout(jPanelViviendas);
    jPanelViviendas.setLayout(jPanelViviendasLayout);
    jPanelViviendasLayout.setHorizontalGroup(
        jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelViviendasLayout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnModVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAddVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRemovVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnModHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAddHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRemovHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnModHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAddHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRemovHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnModAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAddAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRemovAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(6, 6, 6)
            .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneAlleg, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addComponent(jScrollPaneHsoc, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPaneViv)
                .addComponent(jScrollPaneHmed))
            .addGap(0, 0, 0))
    );
    jPanelViviendasLayout.setVerticalGroup(
        jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViviendasLayout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelViviendasLayout.createSequentialGroup()
                    .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelViviendasLayout.createSequentialGroup()
                            .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPaneViv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelViviendasLayout.createSequentialGroup()
                                    .addComponent(jbtnAddVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnModVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnRemovVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPaneHmed, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelViviendasLayout.createSequentialGroup()
                            .addComponent(jbtnAddHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnModHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnRemovHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPaneHsoc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelViviendasLayout.createSequentialGroup()
                    .addComponent(jbtnAddHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnModHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnRemovHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(20, 20, 20)
            .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPaneAlleg, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelViviendasLayout.createSequentialGroup()
                    .addComponent(jbtnAddAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnModAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnRemovAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, 0))
    );

    jPanelViviendasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPaneAlleg, jScrollPaneHmed, jScrollPaneHsoc, jScrollPaneViv});

    javax.swing.GroupLayout jPanelHistorialLayout = new javax.swing.GroupLayout(jPanelHistorial);
    jPanelHistorial.setLayout(jPanelHistorialLayout);
    jPanelHistorialLayout.setHorizontalGroup(
        jPanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelHistorialLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanelViviendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanelHistorialLayout.setVerticalGroup(
        jPanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelHistorialLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(jPanelViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(239, Short.MAX_VALUE))
    );

    jTabbedPaneIzq.addTab("Dependiente (Historial, vivienda y allegados)", jPanelHistorial);

    jPanelAsistente.setBackground(new java.awt.Color(204, 204, 204));

    jPanelAsistenteMod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del asistente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
    jPanelAsistenteMod.setPreferredSize(new java.awt.Dimension(840, 174));

    tfAsistenteNombre.setBackground(java.awt.Color.white);
    tfAsistenteNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteNombre.setToolTipText("");
    tfAsistenteNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* NOMBRE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    tfAsistenteNombre.setPreferredSize(new java.awt.Dimension(150, 50));
    tfAsistenteNombre.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tfAsistenteNombreActionPerformed(evt);
        }
    });

    tfAsistenteApe1.setBackground(java.awt.Color.white);
    tfAsistenteApe1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteApe1.setToolTipText("");
    tfAsistenteApe1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* PRIMER APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    tfAsistenteApe1.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistenteApe2.setBackground(java.awt.Color.white);
    tfAsistenteApe2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteApe2.setToolTipText("");
    tfAsistenteApe2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* SEGUNDO APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    tfAsistenteApe2.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistenteEmail.setBackground(java.awt.Color.white);
    tfAsistenteEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteEmail.setToolTipText("");
    tfAsistenteEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* E-MAIL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    tfAsistenteEmail.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistenteId.setEditable(false);
    tfAsistenteId.setBackground(java.awt.Color.white);
    tfAsistenteId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteId.setToolTipText("");
    tfAsistenteId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* ID ASISTENTE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    tfAsistenteId.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistentePass.setBackground(java.awt.Color.white);
    tfAsistentePass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistentePass.setText("1234");
    tfAsistentePass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* PASSWORD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    tfAsistentePass.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistenteDni.setBackground(java.awt.Color.white);
    tfAsistenteDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteDni.setToolTipText("");
    tfAsistenteDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* DNI", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    tfAsistenteDni.setPreferredSize(new java.awt.Dimension(150, 50));
    tfAsistenteDni.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            tfAsistenteDniFocusGained(evt);
        }
    });
    tfAsistenteDni.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tfAsistenteDniKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            tfAsistenteDniKeyTyped(evt);
        }
    });

    tfAsistenteTelf.setBackground(java.awt.Color.white);
    tfAsistenteTelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteTelf.setToolTipText("");
    tfAsistenteTelf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* TELÉFONO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    tfAsistenteTelf.setPreferredSize(new java.awt.Dimension(150, 50));

    javax.swing.GroupLayout jPanelAsistenteModLayout = new javax.swing.GroupLayout(jPanelAsistenteMod);
    jPanelAsistenteMod.setLayout(jPanelAsistenteModLayout);
    jPanelAsistenteModLayout.setHorizontalGroup(
        jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                    .addComponent(tfAsistenteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(tfAsistenteApe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(tfAsistenteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(tfAsistenteApe2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(tfAsistenteDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(tfAsistenteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(tfAsistenteTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfAsistentePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanelAsistenteModLayout.setVerticalGroup(
        jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tfAsistenteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistenteApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistenteApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistenteDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistenteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tfAsistenteTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistenteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistentePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(19, 19, 19))
    );

    jBtnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/IconoCancelar25x25.png"))); // NOI18N
    jBtnCancel.setPreferredSize(new java.awt.Dimension(50, 40));
    jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnCancelActionPerformed(evt);
        }
    });

    jBtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoGuardar25x25.png"))); // NOI18N
    jBtnSave.setPreferredSize(new java.awt.Dimension(50, 40));
    jBtnSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnSaveActionPerformed(evt);
        }
    });

    jBtnEditAsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jBtnEditAsi.setText("Editar");
    jBtnEditAsi.setPreferredSize(new java.awt.Dimension(95, 40));
    jBtnEditAsi.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnEditAsiActionPerformed(evt);
        }
    });

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANÁLISIS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
    jPanel1.setPreferredSize(new java.awt.Dimension(840, 500));

    jPanelAnalisis.setPreferredSize(new java.awt.Dimension(830, 490));

    javax.swing.GroupLayout jPanelAnalisisLayout = new javax.swing.GroupLayout(jPanelAnalisis);
    jPanelAnalisis.setLayout(jPanelAnalisisLayout);
    jPanelAnalisisLayout.setHorizontalGroup(
        jPanelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 818, Short.MAX_VALUE)
    );
    jPanelAnalisisLayout.setVerticalGroup(
        jPanelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 465, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanelAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanelAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanelAsistenteLayout = new javax.swing.GroupLayout(jPanelAsistente);
    jPanelAsistente.setLayout(jPanelAsistenteLayout);
    jPanelAsistenteLayout.setHorizontalGroup(
        jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAsistenteLayout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addGroup(jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAsistenteLayout.createSequentialGroup()
                    .addComponent(jBtnEditAsi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jBtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelAsistenteMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGap(6, 6, 6))
    );
    jPanelAsistenteLayout.setVerticalGroup(
        jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAsistenteLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jBtnEditAsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanelAsistenteMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(16, 16, 16))
    );

    jTabbedPaneIzq.addTab("Asistente", null, jPanelAsistente, "");

    jTabbedPaneDcha.setBackground(new java.awt.Color(204, 255, 255));

    jPanelAlertas.setBackground(new java.awt.Color(204, 204, 204));

    jPanelRecursos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMERGENCIA Y OTROS RECURSOS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
    jPanelRecursos.setPreferredSize(new java.awt.Dimension(655, 140));

    jScrollPaneRecursos.setBackground(new java.awt.Color(255, 255, 255));
    jScrollPaneRecursos.setPreferredSize(new java.awt.Dimension(540, 100));

    jTableRecursos.setBackground(new java.awt.Color(255, 255, 255));
    jTableRecursos.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPaneRecursos.setViewportView(jTableRecursos);

    jbtnAddRecurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddRecurso.setPreferredSize(new java.awt.Dimension(35, 35));
    jbtnAddRecurso.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddRecursoActionPerformed(evt);
        }
    });

    jbtnModRecurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModRecurso.setPreferredSize(new java.awt.Dimension(35, 35));
    jbtnModRecurso.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModRecursoActionPerformed(evt);
        }
    });

    jBtnLlamar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jBtnLlamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/call.png"))); // NOI18N
    jBtnLlamar.setPreferredSize(new java.awt.Dimension(35, 35));
    jBtnLlamar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnLlamarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelRecursosLayout = new javax.swing.GroupLayout(jPanelRecursos);
    jPanelRecursos.setLayout(jPanelRecursosLayout);
    jPanelRecursosLayout.setHorizontalGroup(
        jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelRecursosLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanelRecursosLayout.createSequentialGroup()
                    .addComponent(jbtnModRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnAddRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jBtnLlamar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(16, 16, 16)
            .addComponent(jScrollPaneRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanelRecursosLayout.setVerticalGroup(
        jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRecursosLayout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jScrollPaneRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
            .addContainerGap())
        .addGroup(jPanelRecursosLayout.createSequentialGroup()
            .addComponent(jBtnLlamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(16, 16, 16)
            .addGroup(jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jbtnAddRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbtnModRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(36, 36, 36))
    );

    jPanelAlarmas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALARMAS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

    jScrollPaneAlarm.setBackground(new java.awt.Color(255, 255, 255));

    jTableAlarmas.setBackground(new java.awt.Color(255, 255, 255));
    jTableAlarmas.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPaneAlarm.setViewportView(jTableAlarmas);

    jBtnAceptAlarm.setForeground(new java.awt.Color(0, 102, 102));
    jBtnAceptAlarm.setText("ACEPTAR");
    jBtnAceptAlarm.setPreferredSize(new java.awt.Dimension(100, 35));
    jBtnAceptAlarm.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnAceptAlarmActionPerformed(evt);
        }
    });

    jBtnCancelAlarm.setForeground(new java.awt.Color(0, 102, 102));
    jBtnCancelAlarm.setText("PASAR");
    jBtnCancelAlarm.setPreferredSize(new java.awt.Dimension(100, 35));
    jBtnCancelAlarm.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnCancelAlarmActionPerformed(evt);
        }
    });

    jScrollPaneAlarm1.setBackground(new java.awt.Color(255, 255, 255));
    jScrollPaneAlarm1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HISTORICO DE ALARMAS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 10), new java.awt.Color(0, 102, 102))); // NOI18N

    jTableAlarmasHistory.setBackground(new java.awt.Color(255, 255, 255));
    jTableAlarmasHistory.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPaneAlarm1.setViewportView(jTableAlarmasHistory);

    javax.swing.GroupLayout jPanelAlarmasLayout = new javax.swing.GroupLayout(jPanelAlarmas);
    jPanelAlarmas.setLayout(jPanelAlarmasLayout);
    jPanelAlarmasLayout.setHorizontalGroup(
        jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAlarmasLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneAlarm)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlarmasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jBtnCancelAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jBtnAceptAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPaneAlarm1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanelAlarmasLayout.setVerticalGroup(
        jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAlarmasLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPaneAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6)
            .addGroup(jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jBtnAceptAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jBtnCancelAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jScrollPaneAlarm1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jPanelLlamadas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Avisos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

    jScrollPaneAvis.setBackground(new java.awt.Color(255, 255, 255));

    jTableAvisos.setBackground(new java.awt.Color(255, 255, 255));
    jTableAvisos.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPaneAvis.setViewportView(jTableAvisos);

    jBtnCrearAviso.setForeground(new java.awt.Color(0, 102, 102));
    jBtnCrearAviso.setText("CREAR AVISO");
    jBtnCrearAviso.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnCrearAvisoActionPerformed(evt);
        }
    });

    jBtnRefrescoAviso.setForeground(new java.awt.Color(0, 102, 102));
    jBtnRefrescoAviso.setText("REFRESCO");
    jBtnRefrescoAviso.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnRefrescoAvisoActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelLlamadasLayout = new javax.swing.GroupLayout(jPanelLlamadas);
    jPanelLlamadas.setLayout(jPanelLlamadasLayout);
    jPanelLlamadasLayout.setHorizontalGroup(
        jPanelLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelLlamadasLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneAvis)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLlamadasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jBtnRefrescoAviso)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jBtnCrearAviso)))
            .addContainerGap())
    );
    jPanelLlamadasLayout.setVerticalGroup(
        jPanelLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelLlamadasLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPaneAvis, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jBtnCrearAviso)
                .addComponent(jBtnRefrescoAviso))
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanelAlertasLayout = new javax.swing.GroupLayout(jPanelAlertas);
    jPanelAlertas.setLayout(jPanelAlertasLayout);
    jPanelAlertasLayout.setHorizontalGroup(
        jPanelAlertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAlertasLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelAlertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAlarmas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelLlamadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelRecursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanelAlertasLayout.setVerticalGroup(
        jPanelAlertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlertasLayout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jPanelRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanelAlarmas, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanelLlamadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jTabbedPaneDcha.addTab("Alertas y llamadas", jPanelAlertas);

    jPanelGeo.setBackground(new java.awt.Color(204, 204, 204));

    jLabelMapcaption.setBackground(new java.awt.Color(204, 204, 204));
    jLabelMapcaption.setForeground(new java.awt.Color(0, 102, 102));
    jLabelMapcaption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelMapcaption.setText("Ubicación del dependiente en tiempo real");
    jLabelMapcaption.setOpaque(true);

    jScrollPaneMaps.setViewportView(jLabelMaps);

    jButtonCenterMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/center.png"))); // NOI18N
    jButtonCenterMap.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCenterMapActionPerformed(evt);
        }
    });

    jButtonZoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/zoomout.png"))); // NOI18N
    jButtonZoomOut.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonZoomOutActionPerformed(evt);
        }
    });

    jButtonZoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/zoomin.png"))); // NOI18N
    jButtonZoomIn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonZoomInActionPerformed(evt);
        }
    });

    jScrollPaneCoord.setBackground(new java.awt.Color(255, 255, 255));

    jTableCoordenadas.setBackground(new java.awt.Color(255, 255, 255));
    jTableCoordenadas.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPaneCoord.setViewportView(jTableCoordenadas);

    jBtnRefrescoMaps.setForeground(new java.awt.Color(0, 102, 102));
    jBtnRefrescoMaps.setText("REFRESCAR TABLA");
    jBtnRefrescoMaps.setPreferredSize(new java.awt.Dimension(140, 35));
    jBtnRefrescoMaps.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnRefrescoMapsActionPerformed(evt);
        }
    });

    jBtnSelecCoord.setForeground(new java.awt.Color(0, 102, 102));
    jBtnSelecCoord.setText("ELEGIR PUNTO");
    jBtnSelecCoord.setPreferredSize(new java.awt.Dimension(140, 35));
    jBtnSelecCoord.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnSelecCoordActionPerformed(evt);
        }
    });

    jBtnGoHome.setForeground(new java.awt.Color(0, 102, 102));
    jBtnGoHome.setText("LLEVAR A CASA");
    jBtnGoHome.setPreferredSize(new java.awt.Dimension(140, 35));
    jBtnGoHome.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnGoHomeActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelGeoLayout = new javax.swing.GroupLayout(jPanelGeo);
    jPanelGeo.setLayout(jPanelGeoLayout);
    jPanelGeoLayout.setHorizontalGroup(
        jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelGeoLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelMapcaption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addGroup(jPanelGeoLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGeoLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPaneCoord)
                            .addGap(16, 16, 16)
                            .addGroup(jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelGeoLayout.createSequentialGroup()
                                    .addComponent(jButtonZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonCenterMap, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnSelecCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnRefrescoMaps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnGoHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPaneMaps))))
            .addContainerGap())
    );
    jPanelGeoLayout.setVerticalGroup(
        jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelGeoLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabelMapcaption)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPaneMaps, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelGeoLayout.createSequentialGroup()
                    .addGroup(jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonZoomIn)
                        .addComponent(jButtonZoomOut)
                        .addComponent(jButtonCenterMap))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jBtnRefrescoMaps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jBtnSelecCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jBtnGoHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 85, Short.MAX_VALUE))
                .addComponent(jScrollPaneCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addContainerGap())
    );

    jTabbedPaneDcha.addTab("Geolocalización", jPanelGeo);

    menuAsist.setText("Inicio");

    itemCerrarSesion.setText("Cerrar Sesion");
    itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            itemCerrarSesionActionPerformed(evt);
        }
    });
    menuAsist.add(itemCerrarSesion);

    itemInfo.setText("Información");
    menuAsist.add(itemInfo);

    itemSalir.setText("Salir");
    itemSalir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            itemSalirActionPerformed(evt);
        }
    });
    menuAsist.add(itemSalir);

    menuBarAsist.add(menuAsist);

    setJMenuBar(menuBarAsist);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTabbedPaneIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTabbedPaneDcha)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPaneIzq)
                .addComponent(jTabbedPaneDcha, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addContainerGap())
    );

    jTabbedPaneIzq.getAccessibleContext().setAccessibleName("Dependientes");
    jTabbedPaneIzq.getAccessibleContext().setAccessibleDescription("");

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCenterMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCenterMapActionPerformed
        this.centerScroll();
    }//GEN-LAST:event_jButtonCenterMapActionPerformed

    private void jButtonZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZoomOutActionPerformed
        if (currentZoom > MIN_MAPS_ZOOM) {
            currentZoom--;
            if (this.jTableCoordenadas.getModel().getRowCount() > 0) {
                initMaps(latitude, longitude, currentZoom);
            } else {
                initMaps(CURRENTLAT, CURRENTLNG, currentZoom);
            }
            initMaps(latitude, longitude, currentZoom);
        }
        mapButtonsAvailable();
    }//GEN-LAST:event_jButtonZoomOutActionPerformed

    private void jButtonZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZoomInActionPerformed
        if (currentZoom < MAX_MAPS_ZOOM) {
            currentZoom++;
            if (this.jTableCoordenadas.getModel().getRowCount() > 0) {
                initMaps(latitude, longitude, currentZoom);
            } else {
                initMaps(CURRENTLAT, CURRENTLNG, currentZoom);
            }
            initMaps(latitude, longitude, currentZoom);
        }
        mapButtonsAvailable();
    }//GEN-LAST:event_jButtonZoomInActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        this.controller.getHibernate().logOffAndClose();
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (controlDatos()) {
            guardardependiente();
            listaDependientes = this.controller.cargarDatos(XDependienteModel.class);
            nuevo = false;
            
            cargadependiente(dep);
            lockEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, rellene todos los datos.");
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jbtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModActionPerformed
        if (this.jTableEstado.getSelectedRow() >= 0) {
            DepenStat estado = new DepenStat(this, true, controller, this.jTableEstado.getModel().getValueAt(this.jTableEstado.getSelectedRow(), 0));
            if (estado.getEstado() != null) {
                manipulateEstadoTable(dep, 0);
            }
        }
    }//GEN-LAST:event_jbtnModActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        DepenStat estado = new DepenStat(this, true, controller);
        if (estado.getEstado() != null) {
            estado.getEstado().setXDependienteModel(dep);
            controller.guardarObjeto(estado.getEstado());
            manipulateEstadoTable(dep, 0);
        }
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnRemovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovActionPerformed
        if (this.jTableEstado.getSelectedRow() >= 0) {
            controller.borrarObjeto(controller.cargarDatos(XEstadoModel.class, SentenciasSQL.objectDatosId, this.jTableEstado.getModel().getValueAt(this.jTableEstado.getSelectedRow(), 0)));
            manipulateEstadoTable(dep, 0);
        }
    }//GEN-LAST:event_jbtnRemovActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        listaDependientes = this.controller.cargarDatos(XDependienteModel.class);
        Search search = new Search(null, true, listaDependientes, DEPENDENT);
        if (search.getElemento() != null) {
            dep = (XDependienteModel) search.getElemento();
            lockEnabled(true);
            cargadependiente(dep);
            initMaps();
            lockEnabled(false);
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        nuevo = false;
        cargadependiente(dep);
        lockEnabled(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        lockEnabled(true);
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnAddDepenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddDepenActionPerformed
        lockEnabled(true);
        limpiarPanel();
        nuevo = true;
        tempo = new XDependienteModel(new XPersonaModel());
    }//GEN-LAST:event_jbtnAddDepenActionPerformed

    private void jbtnAddCenSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddCenSalActionPerformed
        DirectionMan center = new DirectionMan(this, true, controller, HEALTH, listaCiudades, nuevo);
        if (center.getObject() != null) {
            controller.guardarObjeto(center.getObject());
            manipulateCS(null, 0);
        }

    }//GEN-LAST:event_jbtnAddCenSalActionPerformed

    private void jbtnAddMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddMedicoActionPerformed
        DoctorMan doctorMan = new DoctorMan(this, true);
        if (doctorMan.getMedico() != null) {
            controller.guardarObjeto(doctorMan.getMedico());
            manipulateMed(null, 0);
        }
    }//GEN-LAST:event_jbtnAddMedicoActionPerformed

    private void jBtnEditAsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditAsiActionPerformed
        lockEnabledAsist(true);
    }//GEN-LAST:event_jBtnEditAsiActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        cargarAsistente();
        lockEnabledAsist(false);
    }//GEN-LAST:event_jBtnCancelActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        guardarAsistente();
        cargarAsistente();
        lockEnabledAsist(false);
    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
        int resp = JOptionPane.showConfirmDialog(this, "¿Desea cambiar de usuario?", "AVISO", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            this.setVisible(false);
            AccessAsist access = null;
            try {
                access = new AccessAsist(null, true, controller);
            } catch (SQLException ex) {
                System.err.println("PROBLEMAS ACCEDIENDO A LA BD");
            }
            asistente = access.getAsistente();
            this.setVisible(true);
        }
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    private void jbtnAddCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddCasaActionPerformed
        DirectionMan center = new DirectionMan(this, true, controller, HOME, listaCiudades, nuevo);
        if (center.getObject() != null) {
            ((XViviendaModel) center.getObject()).setXDependienteModel(nuevo ? tempo : dep);
            if (!nuevo) {
                if (((XViviendaModel) center.getObject()).getHabitual()) {
                    controller.reasignarHabitual(dep);
                }
                controller.guardarObjeto(center.getObject());
                manipulateViviTable(dep, 0);
                //  manipulateHome(null, 0);
            }
            manipulateHome(((XViviendaModel) center.getObject()), 1);
        }
    }//GEN-LAST:event_jbtnAddCasaActionPerformed

    private void jBtnRefrescoAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRefrescoAvisoActionPerformed
        manipulateAvisosTable(dep, 0);
    }//GEN-LAST:event_jBtnRefrescoAvisoActionPerformed

    private void jbtnModMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModMedActionPerformed
        if (this.jComboBoxMedico.getModel().getSelectedItem() != null) {
            DoctorMan doctorMan = new DoctorMan(this, true, (XMedicoModel) this.jComboBoxMedico.getModel().getSelectedItem(), controller);
            if (doctorMan.getMedico() != null) {
                manipulateMed(null, 0);
            }
        }
    }//GEN-LAST:event_jbtnModMedActionPerformed

    private void jbtnModCenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModCenActionPerformed
        if (this.jComboBoxCS.getModel().getSelectedItem() != null) {
            DirectionMan center = new DirectionMan(this, true, controller, HEALTH, listaCiudades, (XCsModel) this.jComboBoxCS.getModel().getSelectedItem());
            if (center.getObject() != null) {
                manipulateCS(null, 0);
            }
        }
    }//GEN-LAST:event_jbtnModCenActionPerformed

    private void jbtnModVivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModVivActionPerformed
        if (this.jComboBoxDependienteVivienda.getModel().getSelectedItem() != null) {
            DirectionMan center = new DirectionMan(this, true, controller, HOME, listaCiudades, (XViviendaModel) this.jComboBoxDependienteVivienda.getModel().getSelectedItem());
            if (center.getObject() != null) {
                manipulateViviTable(dep, 0);
                if (((XViviendaModel) center.getObject()).getHabitual()) {
                    controller.reasignarHabitual(dep, ((XViviendaModel) center.getObject()));
                }
                manipulateHome(null, 0);
            }
        }
    }//GEN-LAST:event_jbtnModVivActionPerformed

    private void tfDependienteDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDependienteDNIKeyReleased
        if (this.tfDependienteDNI.getText().length() == 8) {
            this.tfDependienteDNI.setText(Utils.laLetra(this.tfDependienteDNI.getText()));
            this.tfDependienteDNI.selectAll();
        }
    }//GEN-LAST:event_tfDependienteDNIKeyReleased

    private void tfDependienteDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDependienteDNIKeyTyped
        char caracter = evt.getKeyChar();
        if (this.tfDependienteDNI.getText().length() <= 8) {
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
                evt.consume();
            }
        } else {
            if (caracter != '\b') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfDependienteDNIKeyTyped

    private void tfDependienteDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDependienteDNIFocusGained
        this.tfDependienteDNI.selectAll();
    }//GEN-LAST:event_tfDependienteDNIFocusGained

    private void jbtnAddViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddViviendaActionPerformed
        DirectionMan center = new DirectionMan(this, true, controller, HOME, listaCiudades, nuevo);
        if (center.getObject() != null) {
            if (((XViviendaModel) center.getObject()).getHabitual()) {
                controller.reasignarHabitual(dep);
            }
            ((XViviendaModel) center.getObject()).setXDependienteModel(dep);
            controller.guardarObjeto(center.getObject());
            manipulateViviTable(dep, 0);
            manipulateHome(null, 0);
        }
    }//GEN-LAST:event_jbtnAddViviendaActionPerformed

    private void jbtnModViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModViviendaActionPerformed
        XViviendaModel actual = null;
        if (this.jTableViviendas.getSelectedRow() >= 0) {
            actual = (XViviendaModel) controller.cargarDatos(XViviendaModel.class, SentenciasSQL.objectDatosId,
                    this.jTableViviendas.getModel().getValueAt(this.jTableViviendas.getSelectedRow(), 0));
            DirectionMan center = new DirectionMan(this, true, controller, HOME, listaCiudades, actual);
            if (center.getObject() != null) {
                if (((XViviendaModel) center.getObject()).getHabitual()) {
                    controller.reasignarHabitual(dep, ((XViviendaModel) center.getObject()));
                }
                
                manipulateViviTable(dep, 0);
                manipulateHome(null, 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnModViviendaActionPerformed

    private void jbtnRemovViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovViviendaActionPerformed
        if (this.jTableViviendas.getSelectedRow() >= 0) {
            XViviendaModel casa = (XViviendaModel) controller.cargarDatos(XViviendaModel.class, SentenciasSQL.objectDatosId, this.jTableViviendas.getModel().getValueAt(this.jTableViviendas.getSelectedRow(), 0));
            if (casa.getHabitual()) {
                JOptionPane.showMessageDialog(this, "La vivienda habitual no se puede eliminar. Debe asignar otra como habitual, para eliminar esta vivienda");
            } else {
                controller.borrarObjeto(casa);
                manipulateViviTable(dep, 0);
                manipulateHome(null, 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnRemovViviendaActionPerformed

    private void jbtnAddHisMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddHisMedActionPerformed
        HistoricalMan his = new HistoricalMan(this, true, MED);
        if (his.getHistory() != null) {
            his.getHistory().setXDependienteModel(dep);
            controller.guardarObjeto(his.getHistory());
            manipulateHisMedTable(dep, 0);
        }
    }//GEN-LAST:event_jbtnAddHisMedActionPerformed

    private void jbtnModHisMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModHisMedActionPerformed
        if (this.jTableHistorialMed.getSelectedRow() >= 0) {
            HistoricalMan his = new HistoricalMan(this, true, MED, controller,
                    controller.cargarDatos(XHistmedicoModel.class, SentenciasSQL.objectDatosId,
                            this.jTableHistorialMed.getModel().getValueAt(this.jTableHistorialMed.getSelectedRow(), 0)));
            if (his.getHistory() != null) {
                manipulateHisMedTable(dep, 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnModHisMedActionPerformed

    private void jbtnRemovHisMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovHisMedActionPerformed
        if (this.jTableHistorialMed.getSelectedRow() >= 0) {
            controller.borrarObjeto(controller.cargarDatos(XHistmedicoModel.class,
                    SentenciasSQL.objectDatosId, this.jTableHistorialMed.getModel().getValueAt(this.jTableHistorialMed.getSelectedRow(), 0)));
            manipulateHisMedTable(dep, 0);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnRemovHisMedActionPerformed

    private void jbtnAddHisSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddHisSocActionPerformed
        HistoricalMan his = new HistoricalMan(this, true, SOC);
        if (his.getHistory() != null) {
            his.getHistory().setXDependienteModel(dep);
            controller.guardarObjeto(his.getHistory());
            manipulateHisSocTable(dep, 0);
        }
    }//GEN-LAST:event_jbtnAddHisSocActionPerformed

    private void jbtnModHisSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModHisSocActionPerformed
        if (this.jTableHistorialSoc.getSelectedRow() >= 0) {
            HistoricalMan his = new HistoricalMan(this, true, SOC, controller,
                    controller.cargarDatos(XHistmedicoModel.class, SentenciasSQL.objectDatosId,
                            this.jTableHistorialSoc.getModel().getValueAt(this.jTableHistorialSoc.getSelectedRow(), 0)));
            if (his.getHistory() != null) {
                manipulateHisSocTable(dep, 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnModHisSocActionPerformed

    private void jbtnRemovHisSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovHisSocActionPerformed
        if (this.jTableHistorialSoc.getSelectedRow() >= 0) {
            controller.borrarObjeto(controller.cargarDatos(XHistmedicoModel.class,
                    SentenciasSQL.objectDatosId, this.jTableHistorialSoc.getModel().getValueAt(this.jTableHistorialSoc.getSelectedRow(), 0)));
            manipulateHisSocTable(dep, 0);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnRemovHisSocActionPerformed

    private void jbtnAddAlleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddAlleActionPerformed
        FamilyMan fam = new FamilyMan(this, true, listaCiudades, controller.cargarDatos(XFamiliarModel.class), controller, dep);
        if (fam.getContacto() != null) {
            controller.guardarObjeto(fam.getContacto());
            manipulateAllegadosTable(dep, 0);
        }
    }//GEN-LAST:event_jbtnAddAlleActionPerformed

    private void jbtnModAlleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModAlleActionPerformed
        if (this.jTableAllegados.getSelectedRow() >= 0) {
            FamilyMan fam = new FamilyMan(this, true, listaCiudades, controller, controller.cargarDatos(XFamiliarModel.class, SentenciasSQL.objectDatosId,
                    this.jTableAllegados.getModel().getValueAt(this.jTableAllegados.getSelectedRow(), 0)), dep);
            if (fam.getContacto() != null) {
                manipulateAllegadosTable(dep, 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnModAlleActionPerformed

    private void jbtnRemovAlleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovAlleActionPerformed
        if (this.jTableAllegados.getSelectedRow() >= 0) {
            controller.borrarObjeto(controller.cargarDatos(XFamiliarModel.class,
                    SentenciasSQL.objectDatosId, this.jTableAllegados.getModel().getValueAt(this.jTableAllegados.getSelectedRow(), 0)));
            manipulateAllegadosTable(dep, 0);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnRemovAlleActionPerformed

    private void tfAsistenteDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAsistenteDniFocusGained
        this.tfAsistenteDni.selectAll();
    }//GEN-LAST:event_tfAsistenteDniFocusGained

    private void tfAsistenteDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAsistenteDniKeyTyped
        char caracter = evt.getKeyChar();
        if (this.tfDependienteDNI.getText().length() <= 8) {
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
                evt.consume();
            }
        } else {
            if (caracter != '\b') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfAsistenteDniKeyTyped

    private void tfAsistenteDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAsistenteDniKeyReleased
        if (this.tfAsistenteDni.getText().length() == 8) {
            this.tfAsistenteDni.setText(Utils.laLetra(this.tfAsistenteDni.getText()));
            this.tfAsistenteDni.selectAll();
        }
    }//GEN-LAST:event_tfAsistenteDniKeyReleased

    private void jbtnAddRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddRecursoActionPerformed
        XCiudadModel city = (XCiudadModel) controller.cargarDatos(XCiudadModel.class, SentenciasSQL.objectDatosId,
                controller.obtenerIdCiudad(dep));
        new ResourceStat(this, true, controller, city);
        manipulateRecursosTable(city.getId(), 0);
    }//GEN-LAST:event_jbtnAddRecursoActionPerformed

    private void jbtnModRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModRecursoActionPerformed
        ResourceStat recurso = null;
        if (this.jTableRecursos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione el recurso que desea modificar.");
        } else {
            XOfrecerrcModel oferta = (XOfrecerrcModel) controller.cargarDatos(XOfrecerrcModel.class, SentenciasSQL.objectDatosId,
                    this.jTableRecursos.getModel().getValueAt(this.jTableRecursos.getSelectedRow(), 0));
            recurso = new ResourceStat(this, true, controller, oferta);
            manipulateRecursosTable(recurso.getCiudad().getId(), 0);
        }
    }//GEN-LAST:event_jbtnModRecursoActionPerformed

    private void jBtnAceptAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptAlarmActionPerformed
        if (this.jTableAlarmas.getSelectedRow() >= 0) {
            ControlTask conn = (ControlTask) this.jTableAlarmas.getValueAt(this.jTableAlarmas.getSelectedRow(), 0);
            dep = BLogic.getDependiente((String) this.jTableAlarmas.getValueAt(this.jTableAlarmas.getSelectedRow(), 2), listaDependientes);
            XAlarmaModel alarm = new XAlarmaModel(asistente, dep, (Date) this.jTableAlarmas.getValueAt(this.jTableAlarmas.getSelectedRow(), 1));
            controller.guardarObjeto(alarm);
            manipulateAlarmHistory(null, 0);
            controller.removeAlarm(((ControlTask) this.jTableAlarmas.getValueAt(this.jTableAlarmas.getSelectedRow(), 0)));
            conn.setStatus(true);
            conn.interrupt();
            cargadependiente(dep);
            initMaps();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jBtnAceptAlarmActionPerformed

    private void jBtnCancelAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelAlarmActionPerformed
        if (this.jTableAlarmas.getSelectedRow() >= 0) {
            ((ControlTask) this.jTableAlarmas.getValueAt(this.jTableAlarmas.getSelectedRow(), 0)).interrupt();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jBtnCancelAlarmActionPerformed

    private void jBtnRefrescoMapsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRefrescoMapsActionPerformed
        manipulateCoordenadasTable(dep, 0);
    }//GEN-LAST:event_jBtnRefrescoMapsActionPerformed

    private void tfAsistenteNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsistenteNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsistenteNombreActionPerformed

    private void jComboBoxCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCSActionPerformed
        if (jComboBoxCS.getModel().getSelectedItem() != null) {
            XCsModel cs = (XCsModel) jComboBoxCS.getModel().getSelectedItem();
            this.jTACentro.setText(cs.datos());
        }
    }//GEN-LAST:event_jComboBoxCSActionPerformed

    private void jBtnCrearAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCrearAvisoActionPerformed
        new NotificationMan(this, true, controller, dep);
        manipulateAvisosTable(dep, 0);
    }//GEN-LAST:event_jBtnCrearAvisoActionPerformed

    private void jBtnLlamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLlamarActionPerformed
        if (this.jTableRecursos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione a quien desea llamar");
        } else {
            String elemento = (String) this.jTableRecursos.getModel().getValueAt(jTableRecursos.getSelectedRow(), 1);
            String numero = (String) this.jTableRecursos.getModel().getValueAt(jTableRecursos.getSelectedRow(), 3);
            JOptionPane.showMessageDialog(this, "Se está llamando a " + elemento + ".", "Llamando a " + numero, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnLlamarActionPerformed

    private void jComboBoxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMedicoActionPerformed
        if (jComboBoxMedico.getModel().getSelectedItem() != null) {
            XMedicoModel med = (XMedicoModel) jComboBoxMedico.getModel().getSelectedItem();
            this.jTAMedico.setText(med.datos());
        }
    }//GEN-LAST:event_jComboBoxMedicoActionPerformed

    private void jBtnSelecCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSelecCoordActionPerformed
        if (this.jTableCoordenadas.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Por favor, elija unaposicion de la tabla.");
        } else {
            latitude = (Double) this.jTableCoordenadas.getModel().getValueAt(this.jTableCoordenadas.getSelectedRow(), 2);
            longitude = (Double) this.jTableCoordenadas.getModel().getValueAt(this.jTableCoordenadas.getSelectedRow(), 3);
            initMaps(latitude, longitude, currentZoom);
        }
    }//GEN-LAST:event_jBtnSelecCoordActionPerformed

    private void jBtnGoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGoHomeActionPerformed
        String origen = "";
        String destino = "";
        if (this.jTableCoordenadas.getModel().getRowCount() > 0) {
            origen = (Double) this.jTableCoordenadas.getModel().getValueAt(0, 2)
                    + "," + (Double) this.jTableCoordenadas.getModel().getValueAt(0, 3);
            XViviendaModel habitual = controller.getActualHome(dep);
            if (habitual != null) {
                destino = habitual.getXDireccionModel().getXCiudadModel().getName() + "+"
                        + habitual.getXDireccionModel().getDireccion() + "+"
                        + habitual.getXDireccionModel().getNum();
                if (ruta == null) {
                    ruta = new GoHome(this, false, origen, destino);
                } else {
                    ruta.initUI(origen, destino);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El dependiente no tiene definida su vivienda actual");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay coordenadas del dependiente");
        }
        

    }//GEN-LAST:event_jBtnGoHomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserDependienteAlta;
    private datechooser.beans.DateChooserCombo dateChooserDependienteNac;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemInfo;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JButton jBtnAceptAlarm;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnCancelAlarm;
    private javax.swing.JButton jBtnCrearAviso;
    private javax.swing.JButton jBtnEditAsi;
    private javax.swing.JButton jBtnGoHome;
    private javax.swing.JButton jBtnLlamar;
    private javax.swing.JButton jBtnRefrescoAviso;
    private javax.swing.JButton jBtnRefrescoMaps;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JButton jBtnSelecCoord;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCenterMap;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonZoomIn;
    private javax.swing.JButton jButtonZoomOut;
    private javax.swing.JComboBox<XCsModel> jComboBoxCS;
    private javax.swing.JComboBox<String> jComboBoxDependienteGenero;
    private javax.swing.JComboBox<XViviendaModel> jComboBoxDependienteVivienda;
    private javax.swing.JComboBox<XMedicoModel> jComboBoxMedico;
    private javax.swing.JLabel jLabelMapcaption;
    private javax.swing.JLabel jLabelMaps;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAlarmas;
    private javax.swing.JPanel jPanelAlertas;
    private javax.swing.JPanel jPanelAnalisis;
    private javax.swing.JPanel jPanelAsistente;
    private javax.swing.JPanel jPanelAsistenteMod;
    private javax.swing.JPanel jPanelEstado;
    private javax.swing.JPanel jPanelGeo;
    private javax.swing.JPanel jPanelHistorial;
    private javax.swing.JPanel jPanelLlamadas;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelProfesionales;
    private javax.swing.JPanel jPanelRecursos;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPanel jPanelViviendas;
    private javax.swing.JPanel jPaneldependiente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPaneAlarm;
    private javax.swing.JScrollPane jScrollPaneAlarm1;
    private javax.swing.JScrollPane jScrollPaneAlleg;
    private javax.swing.JScrollPane jScrollPaneAvis;
    private javax.swing.JScrollPane jScrollPaneCoord;
    private javax.swing.JScrollPane jScrollPaneHmed;
    private javax.swing.JScrollPane jScrollPaneHsoc;
    private javax.swing.JScrollPane jScrollPaneMaps;
    private javax.swing.JScrollPane jScrollPaneRecursos;
    private javax.swing.JScrollPane jScrollPaneViv;
    private javax.swing.JScrollPane jScrollPaneestado;
    private javax.swing.JTextArea jTACentro;
    private javax.swing.JTextArea jTAMedico;
    private javax.swing.JTabbedPane jTabbedPaneDcha;
    private javax.swing.JTabbedPane jTabbedPaneIzq;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableAlarmas;
    private javax.swing.JTable jTableAlarmasHistory;
    private javax.swing.JTable jTableAllegados;
    private javax.swing.JTable jTableAvisos;
    private javax.swing.JTable jTableCoordenadas;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTable jTableHistorialMed;
    private javax.swing.JTable jTableHistorialSoc;
    private javax.swing.JTable jTableRecursos;
    private javax.swing.JTable jTableViviendas;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnAddAlle;
    private javax.swing.JButton jbtnAddCasa;
    private javax.swing.JButton jbtnAddCenSal;
    private javax.swing.JButton jbtnAddDepen;
    private javax.swing.JButton jbtnAddHisMed;
    private javax.swing.JButton jbtnAddHisSoc;
    private javax.swing.JButton jbtnAddMedico;
    private javax.swing.JButton jbtnAddRecurso;
    private javax.swing.JButton jbtnAddVivienda;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnMod;
    private javax.swing.JButton jbtnModAlle;
    private javax.swing.JButton jbtnModCen;
    private javax.swing.JButton jbtnModHisMed;
    private javax.swing.JButton jbtnModHisSoc;
    private javax.swing.JButton jbtnModMed;
    private javax.swing.JButton jbtnModRecurso;
    private javax.swing.JButton jbtnModViv;
    private javax.swing.JButton jbtnModVivienda;
    private javax.swing.JButton jbtnRemov;
    private javax.swing.JButton jbtnRemovAlle;
    private javax.swing.JButton jbtnRemovHisMed;
    private javax.swing.JButton jbtnRemovHisSoc;
    private javax.swing.JButton jbtnRemovVivienda;
    private javax.swing.JMenu menuAsist;
    private javax.swing.JMenuBar menuBarAsist;
    private javax.swing.JTextField tfAsistenteApe1;
    private javax.swing.JTextField tfAsistenteApe2;
    private javax.swing.JTextField tfAsistenteDni;
    private javax.swing.JTextField tfAsistenteEmail;
    private javax.swing.JTextField tfAsistenteId;
    private javax.swing.JTextField tfAsistenteNombre;
    private javax.swing.JPasswordField tfAsistentePass;
    private javax.swing.JTextField tfAsistenteTelf;
    private javax.swing.JTextField tfDependienteApe1;
    private javax.swing.JTextField tfDependienteApe2;
    private javax.swing.JTextField tfDependienteDNI;
    private javax.swing.JTextField tfDependienteEmail;
    private javax.swing.JTextField tfDependienteId;
    private javax.swing.JTextField tfDependienteNSS;
    private javax.swing.JTextField tfDependienteNombre;
    private javax.swing.JPasswordField tfDependientePass;
    private javax.swing.JTextField tfDependienteTelf;
    // End of variables declaration//GEN-END:variables

    //Métodos de la vista
    private void initMaps() {
        if (this.jTableCoordenadas.getModel().getRowCount() > 0) {
            latitude = (Double) this.jTableCoordenadas.getModel().getValueAt(0, 2);
            longitude = (Double) this.jTableCoordenadas.getModel().getValueAt(0, 3);
            Utils.generatingMap(latitude, longitude, currentZoom);
        } else {
            latitude = CURRENTLAT;
            longitude = CURRENTLNG;
            Utils.generatingMap(latitude, longitude, currentZoom);
        }
        URL fileIcon = MainView.class.getResource("/Recursos/image.jpg");
        this.jLabelMaps.setVisible(false);
        this.jLabelMaps.setIcon(new ImageIcon((new ImageIcon(fileIcon)).getImage().getScaledInstance(1280, 1280,
                java.awt.Image.SCALE_SMOOTH)));
        this.jLabelMaps.setVisible(true);
        //  initMaps(latitude, longitude, currentZoom);
    }
    
    private void initMaps(double lat, double lng, int zoom) {
        Utils.generatingMap(lat, lng, zoom);
        URL fileIcon = MainView.class.getResource("/Recursos/image.jpg");
        this.jLabelMaps.setIcon(new ImageIcon((new ImageIcon(fileIcon)).getImage().getScaledInstance(1280, 1280,
                java.awt.Image.SCALE_SMOOTH)));
        this.jLabelMaps.setVisible(true);
        
    }
    
    public void centerScroll() {
        //Centrar el scrollPanel
        Rectangle bounds = this.jScrollPaneMaps.getViewport().getViewRect();
        Dimension size = this.jScrollPaneMaps.getViewport().getViewSize();
        int x = (size.width - bounds.width) / 2;
        int y = (size.height - bounds.height) / 2;
        this.jScrollPaneMaps.getViewport().setViewPosition(new Point(x, y));
    }
    
    private void initTabs() {
        this.jTabbedPaneDcha.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                if (jTabbedPaneDcha.getSelectedIndex() == 1) {
                    centerScroll();
                }
            }
        });
    }

    //Controlamos los botones del zoom del maps, en base a la valor de la variable currentZoom
    private void mapButtonsAvailable() {
        if (currentZoom > MIN_MAPS_ZOOM && currentZoom < MAX_MAPS_ZOOM) {
            this.jButtonZoomOut.setEnabled(true);
            this.jButtonZoomIn.setEnabled(true);
        }
        if (currentZoom == MIN_MAPS_ZOOM) {
            this.jButtonZoomOut.setEnabled(false);
        }
        if (currentZoom == MAX_MAPS_ZOOM) {
            this.jButtonZoomIn.setEnabled(false);
        }
    }

    //Llenamos las tablas y los combos de la aplicacion
    private void initData() {

        //Llenar Listas
        manipulateDepenList(null, 0);
        dep = (XDependienteModel) listaDependientes.get(0);
        manipulateCityList(null, 0);

        //Llenar combos
        manipulateMed(null, 0);
        manipulateCS(null, 0);

        //Llenamos datos del asistente
        cargarAsistente();

        //Llenamos datos del dependiente (primer id por defecto)
        cargadependiente(dep);

        //Inicializar y llenar tablas. 
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ALARMAS");
        model.addColumn("FECHA");
        model.addColumn("NIF");
        model.addColumn("TIPO");
        this.jTableAlarmas.setModel(model);
        manipulateAlarmHistory(null, 0);
    }
    
    private void initCombos() {
        medico = new DefaultComboBoxModel();
        cSalud = new DefaultComboBoxModel();
        vivienda = new DefaultComboBoxModel();
        String[] sex = {"Hombre", "Mujer", "Indefinido"};
        genero = new DefaultComboBoxModel(sex);
    }

    //Asignamos los datos del dependiente seleccionado en los respectivos campos del panel
    private void cargadependiente(Object dependiente) {
        dep = (XDependienteModel) dependiente;
        manipulateHome(null, 0);
        this.tfDependienteNombre.setText(dep.getXPersonaModel().getName());
        this.tfDependienteApe1.setText(dep.getXPersonaModel().getApellido1());
        this.tfDependienteApe2.setText(dep.getXPersonaModel().getApellido2());
        this.tfDependienteEmail.setText(dep.getXPersonaModel().getEmail());
        this.tfDependienteId.setText(String.valueOf(dep.getId()));
        this.tfDependientePass.setText(dep.getPassword());
        this.tfDependienteTelf.setText(dep.getXPersonaModel().getTelefono());
        this.tfDependienteNSS.setText(dep.getNss());
        this.tfDependienteDNI.setText(dep.getXPersonaModel().getDni());

        //Fechas
        Calendar alta = Calendar.getInstance();
        alta.setTime(dep.getFecAlta() != null ? dep.getFecAlta() : new Date());
        this.dateChooserDependienteAlta.setSelectedDate(alta);
        
        Calendar nac = Calendar.getInstance();
        nac.setTime(dep.getFecNacim() != null ? dep.getFecNacim() : new Date());
        this.dateChooserDependienteNac.setSelectedDate(nac);

        //Se muestran los elementos asociados al dependiente en los comboBox
        manipulateMed(dep.getXMedicoModel() != null ? dep.getXMedicoModel() : null, 3);
        manipulateCS(dep.getXCsModel() != null ? dep.getXCsModel() : null, 3);
        manipulateHome(viviendaActual(), 3);
        genero.setSelectedItem(dep.getGenero());

        //Se muestran los datos asociados al dependiente en los jTable
        manipulateAllegadosTable(dep, 0);
        manipulateAvisosTable(dep, 0);
        manipulateCoordenadasTable(dep, 0);
        manipulateEstadoTable(dep, 0);
        manipulateHisMedTable(dep, 0);
        manipulateHisSocTable(dep, 0);
        manipulateViviTable(dep, 0);
        int id = controller.obtenerIdCiudad(dep);
        manipulateRecursosTable(id, 0);
    }
    
    private void lockEnabled(boolean enabled) {
        //Panel dependiente
        this.tfDependienteNombre.setEditable(enabled);
        this.tfDependienteApe1.setEditable(enabled);
        this.tfDependienteApe2.setEditable(enabled);
        this.tfDependienteEmail.setEditable(enabled);
        this.tfDependientePass.setEditable(enabled);
        this.tfDependienteTelf.setEditable(enabled);
        this.tfDependienteNSS.setEditable(enabled);
        this.tfDependienteDNI.setEditable(enabled);
        this.dateChooserDependienteAlta.setLocked(!enabled);
        this.dateChooserDependienteNac.setLocked(!enabled);
        this.jComboBoxDependienteVivienda.setEnabled(enabled);
        this.jComboBoxDependienteGenero.setEnabled(enabled);
        this.jComboBoxMedico.setEnabled(enabled);
        this.jComboBoxCS.setEnabled(enabled);
        this.jButtonSave.setVisible(enabled);
        this.jButtonCancel.setVisible(enabled);
        this.jbtnEditar.setVisible(!enabled);
        this.jButtonSearch.setVisible(!enabled);
        this.jbtnAddCasa.setVisible(enabled);
        this.jbtnAddCenSal.setVisible(enabled);
        this.jbtnAddMedico.setVisible(enabled);
        this.jbtnAddDepen.setVisible(!enabled);
        this.jbtnAdd.setVisible(!enabled);
        this.jbtnMod.setVisible(!enabled);
        this.jbtnRemov.setVisible(!enabled);
        this.jbtnModCen.setVisible(enabled);
        this.jbtnModMed.setVisible(enabled);
        this.jbtnModViv.setVisible(enabled);
        this.jTabbedPaneIzq.setEnabledAt(1, !enabled);
        this.jTabbedPaneIzq.setEnabledAt(2, !enabled);
        this.jTabbedPaneDcha.setEnabledAt(0, !enabled);
        this.jTabbedPaneDcha.setEnabledAt(1, !enabled);
        this.jTableCoordenadas.setVisible(!enabled);
        this.jTableEstado.setVisible(!enabled);
    }
    
    private void cargarAsistente() {
        this.tfAsistenteNombre.setText(asistente.getXPersonaModel().getName());
        this.tfAsistenteApe1.setText(asistente.getXPersonaModel().getApellido1());
        this.tfAsistenteApe2.setText(asistente.getXPersonaModel().getApellido2());
        this.tfAsistenteEmail.setText(asistente.getXPersonaModel().getEmail());
        this.tfAsistenteId.setText(String.valueOf(asistente.getId()));
        this.tfAsistentePass.setText(asistente.getPassword());
        this.tfAsistenteDni.setText(asistente.getXPersonaModel().getDni());
        this.tfAsistenteTelf.setText(asistente.getXPersonaModel().getTelefono());
    }
    
    private void guardardependiente() {
        if (nuevo) {
            dep = tempo;
        } else {
            controller.abrirTransaccion();
        }
        dep.setFecAlta(this.dateChooserDependienteAlta.getCurrent().getTime());
        dep.setFecNacim(this.dateChooserDependienteNac.getCurrent().getTime());
        dep.setGenero(this.jComboBoxDependienteGenero.getSelectedItem().toString());
        dep.setNss(this.tfDependienteNSS.getText());
        dep.setPassword(String.valueOf(this.tfDependientePass.getPassword()));
        dep.setXCsModel((XCsModel) this.jComboBoxCS.getSelectedItem());
        dep.setXMedicoModel((XMedicoModel) this.jComboBoxMedico.getSelectedItem());
        dep.getXPersonaModel().setName(this.tfDependienteNombre.getText());
        dep.getXPersonaModel().setApellido1(this.tfDependienteApe1.getText());
        dep.getXPersonaModel().setApellido2(this.tfDependienteApe2.getText());
        dep.getXPersonaModel().setEmail(this.tfDependienteEmail.getText());
        dep.getXPersonaModel().setTelefono(this.tfDependienteTelf.getText());
        dep.getXPersonaModel().setDni(this.tfDependienteDNI.getText());
        dep.setXCsModel((XCsModel) this.jComboBoxCS.getSelectedItem());
        dep.setXMedicoModel((XMedicoModel) this.jComboBoxMedico.getSelectedItem());
        if (nuevo) {
            dep.getXViviendaModels().add((XViviendaModel) this.jComboBoxDependienteVivienda.getSelectedItem());
            controller.guardarObjeto(dep);
            controller.guardarObjeto((XViviendaModel) this.jComboBoxDependienteVivienda.getSelectedItem());
        } else {
            controller.lanzarCommit();
        }
    }
    
    private void lockEnabledAsist(boolean enable) {
        //Panel del Asistente
        this.tfAsistenteApe1.setEditable(enable);
        this.tfAsistenteApe2.setEditable(enable);
        this.tfAsistenteEmail.setEditable(enable);
        this.tfAsistenteNombre.setEditable(enable);
        this.tfAsistentePass.setEditable(enable);
        this.tfAsistenteDni.setEditable(enable);
        this.tfAsistenteTelf.setEditable(enable);
        this.jBtnCancel.setVisible(enable);
        this.jBtnSave.setVisible(enable);
        this.jBtnEditAsi.setVisible(!enable);
        this.jTabbedPaneIzq.setEnabledAt(0, !enable);
        this.jTabbedPaneIzq.setEnabledAt(1, !enable);
        this.jTabbedPaneDcha.setEnabledAt(0, !enable);
        this.jTabbedPaneDcha.setEnabledAt(1, !enable);
    }
    
    private void guardarAsistente() {
        controller.abrirTransaccion();
        asistente.setPassword(String.valueOf(this.tfAsistentePass.getPassword()));
        asistente.getXPersonaModel().setName(this.tfAsistenteNombre.getText());
        asistente.getXPersonaModel().setApellido1(this.tfAsistenteApe1.getText());
        asistente.getXPersonaModel().setApellido2(this.tfAsistenteApe2.getText());
        asistente.getXPersonaModel().setDni(this.tfAsistenteDni.getText());
        asistente.getXPersonaModel().setEmail(this.tfAsistenteEmail.getText());
        asistente.getXPersonaModel().setTelefono(this.tfAsistenteTelf.getText());
        controller.lanzarCommit();
    }
    
    private void initJasper() {
        try {
            jClient = new JasperClient();
            JRViewer jrv = jClient.insertReport();
            jrv.setSize(820, 480);
            this.jPanelAnalisis.add(jrv, BorderLayout.CENTER);
            jrv.setVisible(true);
            jrv.setZoomRatio(0.5F);
            jrv.setEnabled(true);
            this.jPanelAnalisis.repaint();
            this.jPanelAnalisis.update(this.jPanelAnalisis.getGraphics());
            this.jPanelAnalisis.validate();
        } catch (IOException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void manipulateViviTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableViviendas.setModel(controller.cargarResultSet(SentenciasSQL.viviendasTM, obj));
                Utils.resizeColumnWidth(this.jTableViviendas);
                break;
        }
    }
    
    private void manipulateHisMedTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableHistorialMed.setModel(controller.cargarResultSet(SentenciasSQL.historialMedicoTM, obj));
                Utils.resizeColumnWidth(this.jTableHistorialMed);
                break;
        }
    }
    
    private void manipulateHisSocTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableHistorialSoc.setModel(controller.cargarResultSet(SentenciasSQL.historialSocialTM, obj));
                Utils.resizeColumnWidth(this.jTableHistorialSoc);
                break;
        }
    }
    
    private void manipulateAllegadosTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableAllegados.setModel(controller.cargarResultSet(SentenciasSQL.allegadosTM, obj));
                Utils.resizeColumnWidth(this.jTableAllegados);
                break;
        }
    }
    
    private void manipulateCoordenadasTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableCoordenadas.setModel(controller.cargarResultSet(SentenciasSQL.coordenadasTM, obj));
                Utils.resizeColumnWidth(this.jTableCoordenadas);
                break;
        }
    }
    
    private void manipulateAvisosTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableAvisos.setModel(controller.cargarResultSet(SentenciasSQL.avisosTM, obj));
                Utils.resizeColumnWidth(this.jTableAvisos);
                break;
        }
    }
    
    private void manipulateEstadoTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableEstado.setModel(controller.cargarResultSet(SentenciasSQL.estadoTM, obj));
                Utils.resizeColumnWidth(this.jTableEstado);
                break;
        }
    }
    
    private void manipulateRecursosTable(int obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableRecursos.setModel(controller.cargarResultSet(SentenciasSQL.recursosTM, obj));
                Utils.resizeColumnWidth(this.jTableRecursos);
                break;
        }
    }
    
    private void manipulateAlarmHistory(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableAlarmasHistory.setModel(controller.cargarResultSet(SentenciasSQL.alarmasTM, obj));
                Utils.resizeColumnWidth(this.jTableAlarmasHistory);
                break;
        }
    }
    
    private void manipulateDepenList(Object obj, int opc) {
        switch (opc) {
            case 0://cargar los datos en la lista
                listaDependientes = this.controller.cargarDatos(XDependienteModel.class);
                break;
            case 1://añadir elemento al modelo
                listaDependientes.add(obj);
                break;
            case 2://eliminar elemento al modelo
                listaDependientes.remove(obj);
                break;
        }
    }
    
    private void manipulateCityList(Object obj, int opc) {
        switch (opc) {
            case 0://cargar los datos en la lista
                listaCiudades = this.controller.cargarDatos(XCiudadModel.class);
                break;
            case 1://añadir elemento al modelo
                listaCiudades.add(obj);
                break;
            case 2://eliminar elemento al modelo
                listaCiudades.remove(obj);
                break;
        }
    }
    
    private void manipulateMed(Object obj, int opc) {
        switch (opc) {
            case 0://cargar los datos en el modelo del combo
                Vector<Object> lista = new Vector<>(this.controller.cargarDatos(XMedicoModel.class));
                this.jComboBoxMedico.setModel(new DefaultComboBoxModel(lista));
                break;
            case 1://añadir elemento al modelo
                this.jComboBoxMedico.addItem((XMedicoModel) obj);
                break;
            case 2://eliminar elemento al modelo
                this.jComboBoxMedico.removeItem(obj);
                break;
            case 3://elegir elemento del modelo
                this.jComboBoxMedico.setSelectedItem(obj);
                break;
        }
    }
    
    private void manipulateCS(Object obj, int opc) {
        switch (opc) {
            case 0://cargar los datos en el modelo del combo
                Vector<Object> lista = new Vector<>(this.controller.cargarDatos(XCsModel.class));
                this.jComboBoxCS.setModel(new DefaultComboBoxModel(lista));
                break;
            case 1://añadir elemento al modelo
                this.jComboBoxCS.addItem((XCsModel) obj);
                break;
            case 2://eliminar elemento al modelo
                this.jComboBoxCS.removeItem(obj);
                break;
            case 3://elegir elemento del modelo
                this.jComboBoxCS.setSelectedItem(obj);
                break;
        }
    }
    
    private void manipulateHome(Object obj, int opc) {
        switch (opc) {
            case 0://cargar los datos en el modelo del combo
                Vector<Object> lista = new Vector<>(this.controller.cargarDatos("FROM XViviendaModel WHERE id_dependiente=" + dep.getId() + " ORDER BY habitual DESC"));
                this.jComboBoxDependienteVivienda.setModel(new DefaultComboBoxModel(lista));
                break;
            case 1://añadir elemento al modelo
                this.jComboBoxDependienteVivienda.addItem((XViviendaModel) obj);
                break;
            case 2://eliminar elemento al modelo
                this.jComboBoxDependienteVivienda.removeItem(obj);
                break;
            case 3://elegir elemento del modelo
                this.jComboBoxDependienteVivienda.setSelectedItem(obj);
                break;
        }
    }
    
    private Object viviendaActual() {
        for (Iterator<XViviendaModel> iterator = dep.getXViviendaModels().iterator(); iterator.hasNext();) {
            XViviendaModel next = iterator.next();
            if (next.getHabitual()) {
                return next;
            }
        }
        return null;
    }
    
    private boolean controlDatos() {
        if (this.jComboBoxDependienteVivienda.getSelectedItem() == null) {
            return false;
        }
        if (this.tfDependienteApe1.getText().length() == 0) {
            return false;
        }
        if (this.tfDependienteApe2.getText().length() == 0) {
            return false;
        }
        if (this.tfDependienteDNI.getText().length() == 0) {
            return false;
        }
        if (this.tfDependienteEmail.getText().length() == 0) {
            return false;
        }
        if (this.tfDependienteNSS.getText().length() == 0) {
            return false;
        }
        if (this.tfDependienteNombre.getText().length() == 0) {
            return false;
        }
        if (this.tfDependienteTelf.getText().length() == 0) {
            return false;
        }
        if (this.tfDependientePass.getPassword().length == 0) {
            return false;
        }
        if (this.jComboBoxCS.getSelectedItem() == null) {
            return false;
        }
        if (this.jComboBoxMedico.getSelectedItem() == null) {
            return false;
        }
        return true;
    }
    
    private void limpiarPanel() {
        this.jComboBoxDependienteVivienda.setModel(new DefaultComboBoxModel());
        this.tfDependienteApe1.setText("");
        this.tfDependienteApe2.setText("");
        this.tfDependienteDNI.setText("");
        this.tfDependienteEmail.setText("");
        this.tfDependienteNSS.setText("");
        this.tfDependienteNombre.setText("");
        this.tfDependienteTelf.setText("");
        this.tfDependientePass.setText("");
        this.tfDependienteId.setText("");
    }
    
    public JTable getjTableAlarmas() {
        return jTableAlarmas;
    }
    
    public List<Object> getListaDependientes() {
        return listaDependientes;
    }
    
    public JTabbedPane getjTabbedPaneDcha() {
        return jTabbedPaneDcha;
    }
    
}
