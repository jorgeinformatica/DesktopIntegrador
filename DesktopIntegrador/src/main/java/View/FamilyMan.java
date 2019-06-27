package View;

import Controller.BLogic;
import Models.XCiudadModel;
import Models.XContactofamiliarModel;
import Models.XDependienteModel;
import Models.XDireccionModel;
import Models.XFamiliarModel;
import Models.XPersonaModel;
import Models.XProvinciaModel;
import Utils.SentenciasSQL;
import Utils.Utils;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class FamilyMan extends javax.swing.JDialog {

    private final String CITY = "CIUDADES", RELATIVES = "ALLEGADOS";
    private XFamiliarModel family;
    private XContactofamiliarModel contacto;
    private XCiudadModel ciudad;
    private XDependienteModel dep;
    private XDireccionModel direccion;
    private List<Object> listaCiudades, listaAllegados;
    private BLogic controller;

    private boolean opc;

    public FamilyMan(java.awt.Frame parent, boolean modal, List<Object> listaCiudades, List<Object> listaAllegados, BLogic controller, XDependienteModel dep) {
        super(parent, modal);
        initComponents();
        opc = false;
        this.dep = dep;
        this.controller = controller;
        this.listaAllegados = listaAllegados;
        this.listaCiudades = listaCiudades;
        this.family = null;
        this.ciudad = null;
        this.direccion = null;
        this.contacto = null;
        fillUI();
        setUI();

    }

    public FamilyMan(java.awt.Frame parent, boolean modal, List<Object> listaCiudades, BLogic controller, Object datos, XDependienteModel dep) {
        super(parent, modal);
        initComponents();
        opc = true;
        this.dep = dep;
        this.controller = controller;
        this.family = (XFamiliarModel) datos;
        this.listaCiudades = listaCiudades;
        fillUI();
        setUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDireccion = new javax.swing.JPanel();
        tfNomVia = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfNum = new javax.swing.JTextField();
        tfEsc = new javax.swing.JTextField();
        tfLetra = new javax.swing.JTextField();
        tfPiso = new javax.swing.JTextField();
        jComboTipo = new javax.swing.JComboBox<>();
        tfNomCity = new javax.swing.JTextField();
        tfNomProv = new javax.swing.JTextField();
        jbtnSearchCity = new javax.swing.JButton();
        jCheckBox = new javax.swing.JCheckBox();
        jbtnAyuda3 = new javax.swing.JButton();
        jPanelAllegado = new javax.swing.JPanel();
        tfTelf = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApe1 = new javax.swing.JTextField();
        tfApe2 = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfRelacion = new javax.swing.JTextField();
        tfDisponibilidad = new javax.swing.JTextField();
        tfObserv = new javax.swing.JTextField();
        tfDNI = new javax.swing.JTextField();
        tfPrioridad = new javax.swing.JTextField();
        jbtnAyuda4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelDireccion.setBackground(new java.awt.Color(204, 204, 204));
        jPanelDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIRECCIÓN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        tfNomVia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNomVia.setForeground(new java.awt.Color(0, 0, 0));
        tfNomVia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNomVia.setToolTipText("");
        tfNomVia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* NOMBRE DE VÍA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNomVia.setPreferredSize(new java.awt.Dimension(300, 40));

        btnAceptar.setForeground(new java.awt.Color(0, 102, 102));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setForeground(new java.awt.Color(0, 102, 102));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tfNum.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNum.setForeground(new java.awt.Color(0, 0, 0));
        tfNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNum.setToolTipText("");
        tfNum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* NUMERO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNum.setPreferredSize(new java.awt.Dimension(80, 40));
        tfNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumKeyTyped(evt);
            }
        });

        tfEsc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfEsc.setForeground(new java.awt.Color(0, 0, 0));
        tfEsc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEsc.setToolTipText("");
        tfEsc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESCALERA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfEsc.setPreferredSize(new java.awt.Dimension(80, 40));

        tfLetra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfLetra.setForeground(new java.awt.Color(0, 0, 0));
        tfLetra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfLetra.setToolTipText("");
        tfLetra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LETRA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfLetra.setPreferredSize(new java.awt.Dimension(80, 40));

        tfPiso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfPiso.setForeground(new java.awt.Color(0, 0, 0));
        tfPiso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPiso.setToolTipText("");
        tfPiso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PISO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfPiso.setPreferredSize(new java.awt.Dimension(80, 40));
        tfPiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPisoKeyTyped(evt);
            }
        });

        jComboTipo.setBackground(new java.awt.Color(255, 255, 255));
        jComboTipo.setForeground(new java.awt.Color(0, 102, 102));
        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO VÍA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jComboTipo.setPreferredSize(new java.awt.Dimension(100, 40));

        tfNomCity.setEditable(false);
        tfNomCity.setBackground(new java.awt.Color(255, 255, 255));
        tfNomCity.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNomCity.setForeground(new java.awt.Color(0, 0, 0));
        tfNomCity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNomCity.setToolTipText("");
        tfNomCity.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* CIUDAD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNomCity.setPreferredSize(new java.awt.Dimension(150, 40));

        tfNomProv.setEditable(false);
        tfNomProv.setBackground(new java.awt.Color(255, 255, 255));
        tfNomProv.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNomProv.setForeground(new java.awt.Color(0, 0, 0));
        tfNomProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNomProv.setToolTipText("");
        tfNomProv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROVINCIA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNomProv.setPreferredSize(new java.awt.Dimension(150, 40));

        jbtnSearchCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
        jbtnSearchCity.setPreferredSize(new java.awt.Dimension(40, 40));
        jbtnSearchCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchCityActionPerformed(evt);
            }
        });

        jCheckBox.setForeground(new java.awt.Color(0, 102, 102));
        jCheckBox.setText("Tiene llaves");
        jCheckBox.setPreferredSize(new java.awt.Dimension(150, 40));

        jbtnAyuda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info.png"))); // NOI18N
        jbtnAyuda3.setPreferredSize(new java.awt.Dimension(40, 40));
        jbtnAyuda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAyuda3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDireccionLayout = new javax.swing.GroupLayout(jPanelDireccion);
        jPanelDireccion.setLayout(jPanelDireccionLayout);
        jPanelDireccionLayout.setHorizontalGroup(
            jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDireccionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDireccionLayout.createSequentialGroup()
                        .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfNomVia, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelDireccionLayout.createSequentialGroup()
                            .addComponent(jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(jbtnAyuda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelDireccionLayout.createSequentialGroup()
                            .addComponent(jbtnSearchCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(tfNomCity, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(tfNomProv, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(tfPiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfLetra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDireccionLayout.setVerticalGroup(
            jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNomVia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDireccionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNomCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNomProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnSearchCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnAyuda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanelAllegado.setBackground(new java.awt.Color(204, 204, 204));
        jPanelAllegado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL ALLEGADO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        tfTelf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfTelf.setForeground(new java.awt.Color(0, 0, 0));
        tfTelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelf.setToolTipText("");
        tfTelf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* TELËFONO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfTelf.setPreferredSize(new java.awt.Dimension(150, 40));
        tfTelf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelfKeyTyped(evt);
            }
        });

        tfNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(0, 0, 0));
        tfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNombre.setToolTipText("");
        tfNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* NOMBRE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNombre.setPreferredSize(new java.awt.Dimension(150, 40));

        tfApe1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfApe1.setForeground(new java.awt.Color(0, 0, 0));
        tfApe1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfApe1.setToolTipText("");
        tfApe1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* PRIMER APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfApe1.setPreferredSize(new java.awt.Dimension(150, 40));

        tfApe2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfApe2.setForeground(new java.awt.Color(0, 0, 0));
        tfApe2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfApe2.setToolTipText("");
        tfApe2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* SEGUNDO APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfApe2.setPreferredSize(new java.awt.Dimension(150, 40));

        tfEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        tfEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEmail.setToolTipText("");
        tfEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* EMAIL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfEmail.setPreferredSize(new java.awt.Dimension(150, 40));

        tfRelacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfRelacion.setForeground(new java.awt.Color(0, 0, 0));
        tfRelacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRelacion.setToolTipText("");
        tfRelacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* RELACIÓN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfRelacion.setPreferredSize(new java.awt.Dimension(150, 40));

        tfDisponibilidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDisponibilidad.setForeground(new java.awt.Color(0, 0, 0));
        tfDisponibilidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDisponibilidad.setToolTipText("");
        tfDisponibilidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* DISPONIBILIDAD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDisponibilidad.setPreferredSize(new java.awt.Dimension(150, 40));

        tfObserv.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfObserv.setForeground(new java.awt.Color(0, 0, 0));
        tfObserv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfObserv.setToolTipText("");
        tfObserv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* OBSERVACIONES", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfObserv.setPreferredSize(new java.awt.Dimension(150, 40));

        tfDNI.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDNI.setForeground(new java.awt.Color(0, 0, 0));
        tfDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDNI.setToolTipText("");
        tfDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* D.N.I", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDNI.setPreferredSize(new java.awt.Dimension(150, 40));
        tfDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDNIFocusGained(evt);
            }
        });
        tfDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDNIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDNIKeyTyped(evt);
            }
        });

        tfPrioridad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfPrioridad.setForeground(new java.awt.Color(0, 0, 0));
        tfPrioridad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPrioridad.setToolTipText("");
        tfPrioridad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* PRIORIDAD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfPrioridad.setPreferredSize(new java.awt.Dimension(100, 40));
        tfPrioridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPrioridadKeyTyped(evt);
            }
        });

        jbtnAyuda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info.png"))); // NOI18N
        jbtnAyuda4.setPreferredSize(new java.awt.Dimension(40, 40));
        jbtnAyuda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAyuda4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAllegadoLayout = new javax.swing.GroupLayout(jPanelAllegado);
        jPanelAllegado.setLayout(jPanelAllegadoLayout);
        jPanelAllegadoLayout.setHorizontalGroup(
            jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAllegadoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAllegadoLayout.createSequentialGroup()
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfApe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAllegadoLayout.createSequentialGroup()
                        .addGroup(jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAllegadoLayout.createSequentialGroup()
                                .addComponent(tfTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(tfRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAllegadoLayout.createSequentialGroup()
                                .addComponent(tfDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(tfPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnAyuda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfObserv, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );
        jPanelAllegadoLayout.setVerticalGroup(
            jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAllegadoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfObserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnAyuda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelAllegado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAllegado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSearchCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchCityActionPerformed
        Search search = new Search(null, true, listaCiudades, CITY);
        if (search.getElemento() != null) {
            ciudad = (XCiudadModel) search.getElemento();
            this.tfNomCity.setText(ciudad.getName());
            this.tfNomProv.setText(((XProvinciaModel) controller.cargarDatos(XProvinciaModel.class, SentenciasSQL.objectDatosId, ciudad.getXProvinciaModel().getId())).getName());
        }
    }//GEN-LAST:event_jbtnSearchCityActionPerformed

    private void tfDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDNIFocusGained
        this.tfDNI.selectAll();
    }//GEN-LAST:event_tfDNIFocusGained

    private void tfDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDNIKeyReleased
        if (this.tfDNI.getText().length() == 8) {
            this.tfDNI.setText(Utils.laLetra(this.tfDNI.getText()));
            this.tfDNI.selectAll();
        }
    }//GEN-LAST:event_tfDNIKeyReleased

    private void tfDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDNIKeyTyped
        char caracter = evt.getKeyChar();
        if (this.tfDNI.getText().length() <= 8) {
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
                evt.consume();
            }
        } else {
            if (caracter != '\b') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfDNIKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        family = null;
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (comprobarDatos()) {
            crearDirecc();
            crearFamiliar();
            crearRelacion();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, introduzca todos los campo obligatorios.");
        }


    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jbtnAyuda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAyuda3ActionPerformed
        JOptionPane.showMessageDialog(this, "Los campos obligatorios son: La Ciudad, Nombre de Via y el Numero");
    }//GEN-LAST:event_jbtnAyuda3ActionPerformed

    private void tfTelfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelfKeyTyped
        Utils.soloNumeros(evt);
    }//GEN-LAST:event_tfTelfKeyTyped

    private void tfPrioridadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrioridadKeyTyped
        Utils.soloNumeros(evt);
    }//GEN-LAST:event_tfPrioridadKeyTyped

    private void tfNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumKeyTyped
        Utils.soloNumeros(evt);
    }//GEN-LAST:event_tfNumKeyTyped

    private void tfPisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPisoKeyTyped
        Utils.soloNumeros(evt);
    }//GEN-LAST:event_tfPisoKeyTyped

    private void jbtnAyuda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAyuda4ActionPerformed
        JOptionPane.showMessageDialog(this, "La prioridad es un numero, el cual, siendo 1 es maxima y 10 minima prioridad.");
    }//GEN-LAST:event_jbtnAyuda4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JPanel jPanelAllegado;
    private javax.swing.JPanel jPanelDireccion;
    private javax.swing.JButton jbtnAyuda3;
    private javax.swing.JButton jbtnAyuda4;
    private javax.swing.JButton jbtnSearchCity;
    private javax.swing.JTextField tfApe1;
    private javax.swing.JTextField tfApe2;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDisponibilidad;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEsc;
    private javax.swing.JTextField tfLetra;
    private javax.swing.JTextField tfNomCity;
    private javax.swing.JTextField tfNomProv;
    private javax.swing.JTextField tfNomVia;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNum;
    private javax.swing.JTextField tfObserv;
    private javax.swing.JTextField tfPiso;
    private javax.swing.JTextField tfPrioridad;
    private javax.swing.JTextField tfRelacion;
    private javax.swing.JTextField tfTelf;
    // End of variables declaration//GEN-END:variables

    private void setUI() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void fillUI() {
        this.jComboTipo.setModel(Utils.listaTipo());
        if (family == null) {
            Search search = new Search(null, true, listaAllegados, RELATIVES);
            if (search.getElemento() != null) {
                family = (XFamiliarModel) search.getElemento();
                opc = true;
            } else {
                family = new XFamiliarModel();
            }
        }
        this.tfApe2.setText(family.getXPersonaModel() != null ? family.getXPersonaModel().getApellido2() : "");
        this.tfApe1.setText(family.getXPersonaModel() != null ? family.getXPersonaModel().getApellido1() : "");
        this.tfDNI.setText(family.getXPersonaModel() != null ? family.getXPersonaModel().getDni() : "");
        this.tfEmail.setText(family.getXPersonaModel() != null ? family.getXPersonaModel().getEmail() : "");
        this.tfNombre.setText(family.getXPersonaModel() != null ? family.getXPersonaModel().getName() : "");
        this.tfTelf.setText(family.getXPersonaModel() != null ? family.getXPersonaModel().getTelefono() : "");
        this.tfRelacion.setText(family.getRelacion() != null ? family.getRelacion() : "");
        this.tfObserv.setText(family.getObservaciones() != null ? family.getObservaciones() : "");
        this.jCheckBox.setSelected(family.getLlaves() != null ? family.getLlaves() : false);
        this.direccion = family.getXDireccionModel();
        if (direccion != null) {

            this.ciudad = family.getXDireccionModel() != null ? family.getXDireccionModel().getXCiudadModel() : null;
            if (ciudad != null) {
                this.tfNomCity.setText(ciudad.getName());

                this.tfNomProv.setText(((XProvinciaModel) controller.cargarDatos(XProvinciaModel.class,
                        SentenciasSQL.objectDatosId, ciudad.getXProvinciaModel().getId())).getName());
            }
            if (direccion.getTipovia() != null) {
                this.jComboTipo.setSelectedItem(direccion.getTipovia().toString());
            }
            this.tfEsc.setText(direccion.getEscalera() != null ? direccion.getEscalera() : "");
            this.tfLetra.setText(direccion.getLetra() != null ? direccion.getLetra() : "");
            this.tfNomVia.setText(direccion.getDireccion() != null ? direccion.getDireccion() : "");
            this.tfNum.setText(direccion.getNum() != null ? String.valueOf(direccion.getNum()) : "");
            this.tfPiso.setText(direccion.getPiso() != null ? String.valueOf(direccion.getPiso()) : "");
        }

        if (family.getXPersonaModel() != null) {
            Object[] objetos = {family.getId(), dep.getId()};
            contacto
                    = ((XContactofamiliarModel) controller.cargarDatos(XContactofamiliarModel.class,
                            SentenciasSQL.contactoDatos, objetos));
        }

        if (contacto != null) {
            this.tfPrioridad.setText(String.valueOf(contacto.getPrioridad()));
            this.tfDisponibilidad.setText(contacto.getDisponibilidad());
        }
    }

    private boolean comprobarDatos() {
        boolean status = true;
        if (this.tfApe1.getText().length() <= 0) {
            return false;
        }
        if (this.tfApe2.getText().length() <= 0) {
            return false;
        }
        if (this.tfDNI.getText().length() <= 0) {
            return false;
        }
        if (this.tfDisponibilidad.getText().length() <= 0) {
            return false;
        }
        if (this.tfEmail.getText().length() <= 0) {
            return false;
        }
        if (this.tfNomProv.getText().length() <= 0) {
            return false;
        }
        if (this.tfNomVia.getText().length() <= 0) {
            return false;
        }
        if (this.tfNombre.getText().length() <= 0) {
            return false;
        }
        if (this.tfNum.getText().length() <= 0) {
            return false;
        }
        if (this.tfObserv.getText().length() <= 0) {
            return false;
        }
        if (this.tfPrioridad.getText().length() <= 0) {
            return false;
        }
        if (this.tfRelacion.getText().length() <= 0) {
            return false;
        }
        if (this.tfTelf.getText().length() <= 0) {
            return false;
        }
        return status;
    }

    private void crearDirecc() {
        boolean control = false;
        if (direccion != null) {
            controller.abrirTransaccion();
            control = true;
        } else {
            direccion = new XDireccionModel();
        }
        direccion.setXCiudadModel(ciudad);
        direccion.setDireccion(this.tfNomVia.getText());
        direccion.setNum(Integer.valueOf(this.tfNum.getText()));
        direccion.setTipovia(this.jComboTipo.getSelectedItem().toString());
        direccion.setEscalera(this.tfEsc.getText().length() > 0 ? this.tfEsc.getText() : null);
        direccion.setLetra(this.tfLetra.getText().length() > 0 ? this.tfLetra.getText() : null);
        if (this.tfPiso.getText().length() > 0) {
            direccion.setPiso(Integer.valueOf(this.tfPiso.getText()));
        }
        if (control) {
            controller.lanzarCommit();
        } else {
            controller.guardarObjeto(direccion);
        }
    }

    private void crearRelacion() {
        boolean control = false;
        if (contacto != null) {
            controller.abrirTransaccion();
            control = true;
        } else {
            contacto = new XContactofamiliarModel();
        }
        contacto.setDisponibilidad(this.tfDisponibilidad.getText());
        contacto.setPrioridad(this.tfPrioridad.getText());
        contacto.setXDependienteModel(dep);
        contacto.setXFamiliarModel(family);
        if (control) {
            controller.lanzarCommit();
        }
    }

    private void crearFamiliar() {
        boolean control = false;
        if (opc) {
            controller.abrirTransaccion();
            control = true;
        } else {
            family.setXPersonaModel(new XPersonaModel());
        }
        family.setLlaves(this.jCheckBox.isSelected());
        family.setObservaciones(this.tfObserv.getText());
        family.setRelacion(this.tfRelacion.getText());
        family.setXDireccionModel(direccion);
        family.getXPersonaModel().setApellido1(this.tfApe1.getText());
        family.getXPersonaModel().setApellido2(this.tfApe2.getText());
        family.getXPersonaModel().setDni(this.tfDNI.getText());
        family.getXPersonaModel().setEmail(this.tfEmail.getText());
        family.getXPersonaModel().setName(this.tfNombre.getText());
        family.getXPersonaModel().setTelefono(this.tfTelf.getText());
        if (control) {
            controller.lanzarCommit();
        } else {
            controller.guardarObjeto(family.getXPersonaModel());
            controller.guardarObjeto(family);
        }
    }

    public XFamiliarModel getFamily() {
        return family;
    }

    public XContactofamiliarModel getContacto() {
        return contacto;
    }

    public XDireccionModel getDireccion() {
        return direccion;
    }

}
