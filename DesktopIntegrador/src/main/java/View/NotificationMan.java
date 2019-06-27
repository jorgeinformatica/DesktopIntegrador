package View;

import Controller.BLogic;
import Models.XAvisoModel;
import Models.XDependienteModel;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Dimension;
import java.net.URL;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class NotificationMan extends javax.swing.JDialog {

    private final URL URLIMAGECALENDAR = NotificationMan.class.getResource("/Recursos/calendar.png");
    private XAvisoModel aviso;
    private BLogic controller;
    private XDependienteModel dep;

    public NotificationMan(java.awt.Frame parent, boolean modal, BLogic controller, XDependienteModel dep) {
        super(parent, modal);
        this.aviso = new XAvisoModel();
        this.dep = dep;
        this.controller = controller;
        initComponents();
        initUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCBTipo = new javax.swing.JComboBox<>();
        DatePickerSettings dateSettingsAp = new DatePickerSettings();
        dateSettingsAp.setFormatForDatesCommonEra("dd/MM/yyyy");
        dateSettingsAp.setFormatForDatesBeforeCommonEra("dd/MM/uuuu");
        dateSettingsAp.setAllowKeyboardEditing(false);
        dPDesde = new com.github.lgooddatepicker.components.DatePicker();
        DatePickerSettings dateSettingsAp2 = new DatePickerSettings();
        dateSettingsAp2.setFormatForDatesCommonEra("dd/MM/yyyy");
        dateSettingsAp2.setFormatForDatesBeforeCommonEra("dd/MM/uuuu");
        dateSettingsAp2.setAllowKeyboardEditing(false);
        dPHasta = new com.github.lgooddatepicker.components.DatePicker();
        jTFNom = new javax.swing.JTextField();
        jTFDesc = new javax.swing.JTextField();
        jCBTomas = new javax.swing.JComboBox<>();
        jBtnCancel = new javax.swing.JButton();
        jBtnAcept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AVISO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medicinas", "medico", "otros" }));
        jCBTipo.setBackground(new java.awt.Color(255, 255, 255));
        jCBTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jCBTipo.setPreferredSize(new java.awt.Dimension(150, 40));
        jCBTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoActionPerformed(evt);
            }
        });

        dPDesde.setBackground(new java.awt.Color(255, 255, 255));
        dPDesde.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESDE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        dPDesde.setPreferredSize(new java.awt.Dimension(231, 50));

        dPHasta.setBackground(new java.awt.Color(255, 255, 255));
        dPHasta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HASTA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        dPHasta.setPreferredSize(new java.awt.Dimension(231, 50));

        jTFNom.setBackground(new java.awt.Color(255, 255, 255));
        jTFNom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* NOMBRE ELEMENTO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jTFNom.setPreferredSize(new java.awt.Dimension(150, 40));

        jTFDesc.setBackground(new java.awt.Color(255, 255, 255));
        jTFDesc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* DESCRIPCIÓN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jTFDesc.setPreferredSize(new java.awt.Dimension(150, 40));
        jTFDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFDescKeyTyped(evt);
            }
        });

        jCBTomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        jCBTomas.setBackground(new java.awt.Color(255, 255, 255));
        jCBTomas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOMAS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jCBTomas.setPreferredSize(new java.awt.Dimension(80, 40));

        jBtnCancel.setText("CANCELAR");
        jBtnCancel.setForeground(new java.awt.Color(0, 102, 102));
        jBtnCancel.setPreferredSize(new java.awt.Dimension(110, 40));
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        jBtnAcept.setText("ACEPTAR");
        jBtnAcept.setForeground(new java.awt.Color(0, 102, 102));
        jBtnAcept.setPreferredSize(new java.awt.Dimension(110, 40));
        jBtnAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(dPDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dPHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jTFNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(jCBTomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAcept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dPHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dPDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jTFDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAcept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jCBTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoActionPerformed
        if (!jCBTipo.getSelectedItem().equals("medicinas")) {
            this.jCBTomas.setVisible(false);
        } else {
            this.jCBTomas.setVisible(true);
        }
    }//GEN-LAST:event_jCBTipoActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        aviso = null;
        dispose();
    }//GEN-LAST:event_jBtnCancelActionPerformed

    private void jBtnAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptActionPerformed
        if (this.jTFNom.getText().length() > 0 && this.jTFDesc.getText().length() > 0) {
            aviso.setName(this.jTFNom.getText());
            aviso.setPeriodicidad(this.jTFDesc.getText());
            aviso.setRecibido(false);
            aviso.setTipo(this.jCBTipo.getSelectedItem().toString());
            if (aviso.getTipo().equals("medicinas")) {
                int tomas = Integer.valueOf(this.jCBTomas.getSelectedItem().toString());
                aviso.setTomas(tomas);
                aviso.setTomas_constantes(tomas);
            } else {
                aviso.setTomas(1);
                aviso.setTomas_constantes(1);
            }
            if (aviso.getTipo().equals("medico")) {
                aviso.setLlamada(true);
            } else {
                aviso.setLlamada(false);
            }
            Date tempo = Date.from(this.dPDesde.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            aviso.setFecDesde(tempo);
            tempo = Date.from(this.dPHasta.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            aviso.setFecHasta(tempo);
            aviso.setXDependienteModel(dep);
            controller.guardarObjeto(aviso);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, rellene los campos obligatorios.");
        }
    }//GEN-LAST:event_jBtnAceptActionPerformed

    private void jTFDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDescKeyTyped
        char caracter = evt.getKeyChar();
        if (this.jTFDesc.getText().length() >= 40 && caracter != '\b') {
            evt.consume();
        }
    }//GEN-LAST:event_jTFDescKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker dPDesde;
    private com.github.lgooddatepicker.components.DatePicker dPHasta;
    private javax.swing.JButton jBtnAcept;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JComboBox<String> jCBTipo;
    private javax.swing.JComboBox<String> jCBTomas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFDesc;
    private javax.swing.JTextField jTFNom;
    // End of variables declaration//GEN-END:variables

    private void initUI() {
        ImageIcon dateIcon = new ImageIcon(URLIMAGECALENDAR);
        Dimension dateSize = new Dimension(dateIcon.getIconWidth() + 10, dateIcon.getIconHeight() + 10);

        JButton dateButtonAp = this.dPDesde.getComponentToggleCalendarButton();
        dateButtonAp.setText("");
        dateButtonAp.setIcon(dateIcon);
        dateButtonAp.setPreferredSize(dateSize);
        this.dPDesde.setDateToToday();
        JButton dateButtonAp2 = this.dPHasta.getComponentToggleCalendarButton();
        dateButtonAp2.setText("");
        dateButtonAp2.setIcon(dateIcon);
        dateButtonAp2.setPreferredSize(dateSize);
        this.dPHasta.setDateToToday();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public XAvisoModel getAviso() {
        return aviso;
    }

}
