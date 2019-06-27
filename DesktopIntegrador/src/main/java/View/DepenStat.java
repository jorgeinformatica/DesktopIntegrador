package View;

import Controller.BLogic;
import Models.XEstadoModel;
import Utils.SentenciasSQL;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DateTimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings.TimeIncrement;
import java.awt.Dimension;
import java.net.URL;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class DepenStat extends javax.swing.JDialog {
    
    private final URL URLIMAGECLOCK = DepenStat.class.getResource("/Recursos/reloj.png"), URLIMAGECALENDAR = DepenStat.class.getResource("/Recursos/calendar.png");
    private XEstadoModel estado;
    private BLogic controller;
    private boolean opc;
    
    public DepenStat(java.awt.Frame parent, boolean modal, BLogic controller) {
        super(parent, modal);
        estado = new XEstadoModel();
        opc = false;
        initComponents();
        initUI();
    }
    
    public DepenStat(java.awt.Frame parent, boolean modal, BLogic controller, Object value) {
        super(parent, modal);
        estado = (XEstadoModel) controller.cargarDatos(XEstadoModel.class, SentenciasSQL.objectDatosId, value);
        this.controller = controller;
        opc = true;
        initComponents();
        fillUI();
        initUI();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DatePickerSettings dateSettingsAp = new DatePickerSettings();
        dateSettingsAp.setFormatForDatesCommonEra("dd/MM/yyyy");
        dateSettingsAp.setFormatForDatesBeforeCommonEra("dd/MM/uuuu");
        dateSettingsAp.setAllowKeyboardEditing(false);

        TimePickerSettings timeSettingsAp = new TimePickerSettings();
        timeSettingsAp.setAllowKeyboardEditing(false);
        timeSettingsAp.setDisplaySpinnerButtons(true);
        timeSettingsAp.setInitialTimeToNow();
        timeSettingsAp.generatePotentialMenuTimes(TimeIncrement.FifteenMinutes, null, null);

        dateTimeApunte = new DateTimePicker(dateSettingsAp, timeSettingsAp);
        this.dateTimeApunte.datePicker.setDateToToday();
        DatePickerSettings dateSettingsSu = new DatePickerSettings();
        dateSettingsSu.setFormatForDatesCommonEra("dd/MM/yyyy");
        dateSettingsSu.setFormatForDatesBeforeCommonEra("dd/MM/uuuu");
        dateSettingsSu.setAllowKeyboardEditing(false);

        TimePickerSettings timeSettingsSu = new TimePickerSettings();
        timeSettingsSu.setAllowKeyboardEditing(false);
        timeSettingsSu.setDisplaySpinnerButtons(true);
        timeSettingsSu.setInitialTimeToNow();
        timeSettingsSu.generatePotentialMenuTimes(TimeIncrement.FifteenMinutes, null, null);
        dateTimeSuceso = new DateTimePicker(dateSettingsSu, timeSettingsSu);
        this.dateTimeSuceso.datePicker.setDateToToday();
        jTFDescripcion = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 300));
        setPreferredSize(new java.awt.Dimension(800, 300));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTADO DEL DEPENDIENTE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 220));

        dateTimeApunte.setBackground(new java.awt.Color(255, 255, 255));
        dateTimeApunte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA/HORA DEL APUNTE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        dateTimeApunte.setForeground(new java.awt.Color(0, 0, 0));
        dateTimeApunte.setPreferredSize(new java.awt.Dimension(350, 60));

        dateTimeSuceso.setBackground(new java.awt.Color(255, 255, 255));
        dateTimeSuceso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA/HORA DEL SUCESO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        dateTimeSuceso.setForeground(new java.awt.Color(0, 0, 0));
        dateTimeSuceso.setPreferredSize(new java.awt.Dimension(350, 60));

        jTFDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* DESCRIPCIÓN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jTFDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jTFDescripcion.setPreferredSize(new java.awt.Dimension(73, 50));

        jButtonAceptar.setText("ACEPTAR");
        jButtonAceptar.setForeground(new java.awt.Color(0, 102, 102));
        jButtonAceptar.setPreferredSize(new java.awt.Dimension(110, 35));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setForeground(new java.awt.Color(0, 102, 102));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(110, 35));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTFDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(dateTimeApunte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                            .addComponent(dateTimeSuceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTimeApunte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTimeSuceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if (this.jTFDescripcion.getText().length() > 0) {
            if (opc) {
                controller.abrirTransaccion();
            }
            estado.setDescripcion(this.jTFDescripcion.getText());
            estado.setFechaHora(generarFecha(this.dateTimeApunte));
            estado.setFechaHoraInicio(generarFecha(this.dateTimeSuceso));
            if (opc) {
                controller.lanzarCommit();
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, introduzca que ha sucedido.");
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        estado = null;
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DateTimePicker dateTimeApunte;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimeSuceso;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFDescripcion;
    // End of variables declaration//GEN-END:variables

    private void initUI() {
        ImageIcon dateIcon = new ImageIcon(URLIMAGECALENDAR);
        Dimension dateSize = new Dimension(dateIcon.getIconWidth() + 10, dateIcon.getIconHeight() + 10);
        ImageIcon timeIcon = new ImageIcon(URLIMAGECLOCK);
        Dimension timeSize = new Dimension(timeIcon.getIconWidth() + 10, timeIcon.getIconHeight() + 10);
        
        JButton dateButtonAp = this.dateTimeApunte.datePicker.getComponentToggleCalendarButton();
        dateButtonAp.setText("");
        dateButtonAp.setIcon(dateIcon);
        dateButtonAp.setPreferredSize(dateSize);
        
        JButton timeButtonAp = this.dateTimeApunte.timePicker.getComponentToggleTimeMenuButton();
        timeButtonAp.setText("");
        timeButtonAp.setIcon(timeIcon);
        timeButtonAp.setPreferredSize(timeSize);
        
        JButton dateButtonSu = this.dateTimeSuceso.datePicker.getComponentToggleCalendarButton();
        dateButtonSu.setText("");
        dateButtonSu.setIcon(dateIcon);
        dateButtonSu.setPreferredSize(dateSize);
        
        JButton timeButtonSu = this.dateTimeSuceso.timePicker.getComponentToggleTimeMenuButton();
        timeButtonSu.setText("");
        timeButtonSu.setIcon(timeIcon);
        timeButtonSu.setPreferredSize(timeSize);
        
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public XEstadoModel getEstado() {
        return estado;
    }
    
    private void fillUI() {
        this.jTFDescripcion.setText(estado.getDescripcion());
        this.dateTimeApunte.setDateTimeStrict(estado.getFechaHora().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        this.dateTimeSuceso.setDateTimeStrict(estado.getFechaHoraInicio().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
    }
    
    private Date generarFecha(DateTimePicker dateTime) {
        return java.util.Date.from(dateTime.getDateTimeStrict().toInstant(ZoneOffset.UTC));
    }
}
