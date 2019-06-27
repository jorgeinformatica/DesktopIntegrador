package View;

import Controller.BLogic;
import Models.XAsistenteModel;
import Models.XPersonaModel;
import Utils.SentenciasSQL;
import Utils.Utils;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class AccessAsist extends javax.swing.JDialog {

    private XAsistenteModel asistente;
    private BLogic controler;

    public AccessAsist(java.awt.Frame parent, boolean modal, BLogic controler) throws SQLException {
        super(parent, modal);
        initComponents();
        this.controler = controler;
        initUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLPArriba = new javax.swing.JLayeredPane();
        jLabTitulo = new javax.swing.JLabel();
        tFieldUser = new javax.swing.JTextField();
        tFieldPass = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 200));
        setResizable(false);

        jLPArriba.setBackground(new java.awt.Color(204, 204, 204));
        jLPArriba.setOpaque(true);
        jLPArriba.setPreferredSize(new java.awt.Dimension(400, 200));

        jLabTitulo.setBackground(new java.awt.Color(224, 224, 224));
        jLabTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabTitulo.setForeground(new java.awt.Color(0, 102, 102));
        jLabTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabTitulo.setText("ACCESO");
        jLabTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabTitulo.setMaximumSize(new java.awt.Dimension(100, 35));
        jLabTitulo.setMinimumSize(new java.awt.Dimension(100, 35));
        jLabTitulo.setPreferredSize(new java.awt.Dimension(100, 35));

        tFieldUser.setBackground(new java.awt.Color(255, 255, 255));
        tFieldUser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tFieldUser.setForeground(new java.awt.Color(0, 0, 0));
        tFieldUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tFieldUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ASISTENTE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tFieldUser.setPreferredSize(new java.awt.Dimension(150, 40));
        tFieldUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFieldUserFocusGained(evt);
            }
        });
        tFieldUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFieldUserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tFieldUserKeyTyped(evt);
            }
        });

        tFieldPass.setBackground(new java.awt.Color(255, 255, 255));
        tFieldPass.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tFieldPass.setForeground(new java.awt.Color(0, 0, 0));
        tFieldPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tFieldPass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTRASEÑA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tFieldPass.setPreferredSize(new java.awt.Dimension(150, 40));

        btnAceptar.setForeground(new java.awt.Color(0, 102, 102));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setPreferredSize(new java.awt.Dimension(150, 35));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setForeground(new java.awt.Color(0, 102, 102));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 35));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLPArriba.setLayer(jLabTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPArriba.setLayer(tFieldUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPArriba.setLayer(tFieldPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPArriba.setLayer(btnAceptar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPArriba.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLPArribaLayout = new javax.swing.GroupLayout(jLPArriba);
        jLPArriba.setLayout(jLPArribaLayout);
        jLPArribaLayout.setHorizontalGroup(
            jLPArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPArribaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jLPArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLPArribaLayout.createSequentialGroup()
                        .addGroup(jLPArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jLPArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jLPArribaLayout.setVerticalGroup(
            jLPArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPArribaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jLPArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jLPArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPArriba, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPArriba, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (tFieldPass.getPassword().length > 0 && tFieldUser.getText().length() == 9) {
            getAssistant();
            if (asistente == null) {
                JOptionPane.showMessageDialog(this, "El usuario introducido no existe");
            } else {
                if (asistente.getPassword().equals(String.valueOf(tFieldPass.getPassword()))) {
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "La contraseña introducida es incorrecta");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Rellene los campos, por favor");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Si cancela, se saldrá de la aplicación", "!AVISO¡", JOptionPane.YES_NO_OPTION) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tFieldUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFieldUserKeyTyped
        char caracter = evt.getKeyChar();
        if (this.tFieldUser.getText().length() <= 8) {
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
                evt.consume();
            }
        } else {
            if (caracter != '\b') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tFieldUserKeyTyped

    private void tFieldUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFieldUserKeyReleased
        if (this.tFieldUser.getText().length() == 8) {
            this.tFieldUser.setText(Utils.laLetra(this.tFieldUser.getText()));
            this.tFieldUser.selectAll();
        }
    }//GEN-LAST:event_tFieldUserKeyReleased

    private void tFieldUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFieldUserFocusGained
        this.tFieldUser.selectAll();
    }//GEN-LAST:event_tFieldUserFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLayeredPane jLPArriba;
    private javax.swing.JLabel jLabTitulo;
    private javax.swing.JPasswordField tFieldPass;
    private javax.swing.JTextField tFieldUser;
    // End of variables declaration//GEN-END:variables

    public XAsistenteModel getAsistente() {
        return asistente;
    }

    private void getAssistant() {
        try {
            controler.getHibernate().join();
            XPersonaModel persona = (XPersonaModel) controler.cargarDatos(XPersonaModel.class, SentenciasSQL.personaDatos, tFieldUser.getText());
            if (persona != null) {
                asistente = (XAsistenteModel) controler.cargarDatos(XAsistenteModel.class, SentenciasSQL.asistenteDatos, persona.getId());
            } else {
                asistente = null;
            }
        } catch (InterruptedException ex) {
            System.err.println("ERROR EN AccessAsist.getAssistant(). " + ex.getMessage());
        }
    }

    private void initUI() {
        JLabel cargando = new JLabel(new ImageIcon());
        cargando.setVisible(true);
        this.jLPArriba.add(cargando, 4);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
