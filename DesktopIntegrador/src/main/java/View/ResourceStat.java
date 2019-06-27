package View;

import Controller.BLogic;
import Models.XCiudadModel;
import Models.XOfrecerrcModel;
import Models.XRecursocomModel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class ResourceStat extends javax.swing.JDialog {

    private final String RESOURCES = "recursos";
    private BLogic controller;
    private XOfrecerrcModel oferta;
    private XCiudadModel ciudad;
    private XRecursocomModel recurso;
    private boolean opc;

    public ResourceStat(java.awt.Frame parent, boolean modal, BLogic controller, XCiudadModel city) {
        super(parent, modal);
        initComponents();
        this.opc = false;
        this.controller = controller;
        this.oferta = new XOfrecerrcModel();
        this.ciudad = city;
        fillUI();
        initUI();
    }

    public ResourceStat(java.awt.Frame parent, boolean modal, BLogic controller, XOfrecerrcModel oferta) {
        super(parent, modal);
        initComponents();
        this.opc = true;
        this.controller = controller;
        this.oferta = oferta;
        this.recurso = oferta.getXRecursocomModel();
        this.ciudad = oferta.getXCiudadModel();
        fillUI();
        initUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfCity = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfDescrip = new javax.swing.JTextField();
        tfTelf = new javax.swing.JTextField();
        jBtnAcept = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RECURSOS DE LA CIUDAD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        tfCity.setEditable(false);
        tfCity.setBackground(new java.awt.Color(255, 255, 255));
        tfCity.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfCity.setForeground(new java.awt.Color(0, 0, 0));
        tfCity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCity.setToolTipText("");
        tfCity.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* CIUDAD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfCity.setPreferredSize(new java.awt.Dimension(150, 40));

        tfName.setBackground(new java.awt.Color(255, 255, 255));
        tfName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfName.setForeground(new java.awt.Color(0, 0, 0));
        tfName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfName.setToolTipText("");
        tfName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* NOMBRE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfName.setPreferredSize(new java.awt.Dimension(150, 40));

        tfDescrip.setBackground(new java.awt.Color(255, 255, 255));
        tfDescrip.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDescrip.setForeground(new java.awt.Color(0, 0, 0));
        tfDescrip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDescrip.setToolTipText("");
        tfDescrip.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* DESCRIPCIÓN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDescrip.setPreferredSize(new java.awt.Dimension(150, 40));

        tfTelf.setBackground(new java.awt.Color(255, 255, 255));
        tfTelf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfTelf.setForeground(new java.awt.Color(0, 0, 0));
        tfTelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelf.setToolTipText("");
        tfTelf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* TELÉFONO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfTelf.setPreferredSize(new java.awt.Dimension(150, 40));

        jBtnAcept.setForeground(new java.awt.Color(0, 102, 102));
        jBtnAcept.setText("ACEPTAR");
        jBtnAcept.setPreferredSize(new java.awt.Dimension(110, 40));
        jBtnAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptActionPerformed(evt);
            }
        });

        jBtnCancel.setForeground(new java.awt.Color(0, 102, 102));
        jBtnCancel.setText("CANCELAR");
        jBtnCancel.setPreferredSize(new java.awt.Dimension(110, 40));
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnAcept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAcept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        oferta = null;
        dispose();
    }//GEN-LAST:event_jBtnCancelActionPerformed

    private void jBtnAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptActionPerformed
        if (control()) {
            if (opc) {
                controller.abrirTransaccion();
            } else {
                recurso.setName(this.tfName.getText());
                recurso.setDescripcion(this.tfDescrip.getText());
                controller.guardarObjeto(recurso);
            }
            oferta.setXCiudadModel(ciudad);
            oferta.setTelefono(this.tfTelf.getText());
            oferta.setXRecursocomModel(recurso);
            if (opc) {
                controller.lanzarCommit();
            } else {
                controller.guardarObjeto(oferta);
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, rellene los campos obligatorios.");
        }
    }//GEN-LAST:event_jBtnAceptActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAcept;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfDescrip;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTelf;
    // End of variables declaration//GEN-END:variables

    private void initUI() {
        this.tfCity.setText(ciudad.getName());
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void fillUI() {
        if (!opc) {
            Search elec = new Search(null, true, controller.cargarDatos(XRecursocomModel.class), RESOURCES);
            this.recurso = (XRecursocomModel) elec.getElemento();
        }
        if (recurso != null) {
            this.tfName.setText(recurso.getName());
            this.tfDescrip.setText(recurso.getDescripcion());
            this.tfTelf.setText(oferta.getTelefono());
        }
    }

    private boolean control() {
        if (this.tfCity.getText().length() == 0) {
            return false;
        }
        if (this.tfName.getText().length() == 0) {
            return false;
        }
        if (this.tfDescrip.getText().length() == 0) {
            return false;
        }
        if (this.tfTelf.getText().length() == 0) {
            return false;
        }
        return true;
    }

    public XOfrecerrcModel getOferta() {
        return oferta;
    }

    public XCiudadModel getCiudad() {
        return ciudad;
    }

}
