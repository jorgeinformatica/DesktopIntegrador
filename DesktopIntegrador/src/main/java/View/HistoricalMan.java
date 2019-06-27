package View;

import Controller.BLogic;
import Models.XHistmedicoModel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class HistoricalMan extends javax.swing.JDialog {

    private XHistmedicoModel history;
    private final String MED = "medico";
    private String name;
    private boolean opc;
    private BLogic controller;

    public HistoricalMan(java.awt.Frame parent, boolean modal, String name) {
        super(parent, modal);
        this.history = new XHistmedicoModel();
        this.name = name;
        opc = false;
        initComponents();
        initUI();
    }

    public HistoricalMan(java.awt.Frame parent, boolean modal, String name, BLogic controller, Object datos) {
        super(parent, modal);
        this.name = name;
        this.history = (XHistmedicoModel) datos;
        opc = true;
        this.controller = controller;
        initComponents();
        fillUI();
        initUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHistory = new javax.swing.JPanel();
        jBtnAccept = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();
        jTFDescription = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelHistory.setBackground(new java.awt.Color(204, 204, 204));
        jPanelHistory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HISTORIAL MEDICO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jBtnAccept.setForeground(new java.awt.Color(0, 102, 102));
        jBtnAccept.setText("ACEPTAR");
        jBtnAccept.setPreferredSize(new java.awt.Dimension(110, 40));
        jBtnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAcceptActionPerformed(evt);
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

        jTFDescription.setBackground(new java.awt.Color(255, 255, 255));
        jTFDescription.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFDescription.setToolTipText("");
        jTFDescription.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* DESCRIPCIÓN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jTFDescription.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanelHistoryLayout = new javax.swing.GroupLayout(jPanelHistory);
        jPanelHistory.setLayout(jPanelHistoryLayout);
        jPanelHistoryLayout.setHorizontalGroup(
            jPanelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistoryLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHistoryLayout.createSequentialGroup()
                        .addGap(0, 375, Short.MAX_VALUE)
                        .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jBtnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanelHistoryLayout.setVerticalGroup(
            jPanelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHistoryLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTFDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        history = null;
        dispose();
    }//GEN-LAST:event_jBtnCancelActionPerformed

    private void jBtnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAcceptActionPerformed
        if (this.jTFDescription.getText().length() > 0) {
            if (opc) {
                controller.abrirTransaccion();
            }
            history.setDescripcion(this.jTFDescription.getText());
            history.setName(name);
            if (opc) {
                controller.lanzarCommit();
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, introduzca la información pertinente.");
        }
    }//GEN-LAST:event_jBtnAcceptActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAccept;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JPanel jPanelHistory;
    private javax.swing.JTextField jTFDescription;
    // End of variables declaration//GEN-END:variables

    public XHistmedicoModel getHistory() {
        return history;
    }

    private void initUI() {
        jPanelHistory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HISTORIAL " + name.toUpperCase(),
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102)));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void fillUI() {
        this.jTFDescription.setText(history.getDescripcion());
    }

}
