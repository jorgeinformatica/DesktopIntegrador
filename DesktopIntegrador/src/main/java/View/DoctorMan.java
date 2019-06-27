package View;

import Controller.BLogic;
import Models.XMedicoModel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class DoctorMan extends javax.swing.JDialog {

    private XMedicoModel medico;
    private boolean opc;
    private BLogic controller;

    public DoctorMan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        medico = new XMedicoModel();
        opc = false;
        initComponents();
        initUI();
    }

    public DoctorMan(java.awt.Frame parent, boolean modal, XMedicoModel medico, BLogic controller) {
        super(parent, modal);
        this.medico = medico;
        this.controller = controller;
        opc = true;
        initComponents();
        fillUI();
        initUI();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMedico = new javax.swing.JPanel();
        tfTelf = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApe1 = new javax.swing.JTextField();
        tfApe2 = new javax.swing.JTextField();
        tfDisponibilidad = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelMedico.setBackground(new java.awt.Color(204, 204, 204));
        jPanelMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL MEDICO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        tfTelf.setBackground(new java.awt.Color(255, 255, 255));
        tfTelf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfTelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelf.setToolTipText("");
        tfTelf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* TELÉFONO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfTelf.setPreferredSize(new java.awt.Dimension(150, 40));

        tfNombre.setBackground(new java.awt.Color(255, 255, 255));
        tfNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNombre.setToolTipText("");
        tfNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* NOMBRE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNombre.setPreferredSize(new java.awt.Dimension(150, 40));

        tfApe1.setBackground(new java.awt.Color(255, 255, 255));
        tfApe1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfApe1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfApe1.setToolTipText("");
        tfApe1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* PRIMER APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfApe1.setPreferredSize(new java.awt.Dimension(150, 40));

        tfApe2.setBackground(new java.awt.Color(255, 255, 255));
        tfApe2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfApe2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfApe2.setToolTipText("");
        tfApe2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* SEGUNDO APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfApe2.setPreferredSize(new java.awt.Dimension(150, 40));

        tfDisponibilidad.setBackground(new java.awt.Color(255, 255, 255));
        tfDisponibilidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDisponibilidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDisponibilidad.setToolTipText("");
        tfDisponibilidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* DISPONIBILIDAD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDisponibilidad.setPreferredSize(new java.awt.Dimension(320, 40));

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

        javax.swing.GroupLayout jPanelMedicoLayout = new javax.swing.GroupLayout(jPanelMedico);
        jPanelMedico.setLayout(jPanelMedicoLayout);
        jPanelMedicoLayout.setHorizontalGroup(
            jPanelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMedicoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMedicoLayout.createSequentialGroup()
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfApe1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfDisponibilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMedicoLayout.createSequentialGroup()
                        .addComponent(tfApe2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16)
                        .addComponent(tfTelf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMedicoLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanelMedicoLayout.setVerticalGroup(
            jPanelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMedicoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        medico = null;
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (this.tfNombre.getText().length() > 0
                && this.tfApe1.getText().length() > 0
                && this.tfApe2.getText().length() > 0
                && this.tfTelf.getText().length() > 0
                && this.tfDisponibilidad.getText().length() > 0) {
            if (opc) {
                controller.abrirTransaccion();
            }
            medico.setName(this.tfNombre.getText());
            medico.setApellido1(this.tfApe1.getText());
            medico.setApellido2(this.tfApe2.getText());
            medico.setTelefono(this.tfTelf.getText());
            medico.setDisponibilidad(this.tfDisponibilidad.getText());
            if (opc) {
                controller.lanzarCommit();
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, rellene todos los campos.");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanelMedico;
    private javax.swing.JTextField tfApe1;
    private javax.swing.JTextField tfApe2;
    private javax.swing.JTextField tfDisponibilidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelf;
    // End of variables declaration//GEN-END:variables

    public XMedicoModel getMedico() {
        return medico;
    }

    private void initUI() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void fillUI() {
        this.tfNombre.setText(medico.getName());
        this.tfApe1.setText(medico.getApellido1());
        this.tfApe2.setText(medico.getApellido2());
        this.tfTelf.setText(medico.getTelefono());
        this.tfDisponibilidad.setText(medico.getDisponibilidad());
    }

}
