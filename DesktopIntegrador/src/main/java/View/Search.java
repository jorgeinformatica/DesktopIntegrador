package View;

import Utils.ModelList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * @author Yop
 */
public class Search extends javax.swing.JDialog {
    
    private final String CITY = "CIUDADES", RELATIVES = "ALLEGADOS";
    private ModelList modelo;
    private Object elemento;
    private String name;
    
    public Search(java.awt.Frame parent, boolean modal, List<Object> lista, String name) {
        super(parent, modal);
        this.name = name.toUpperCase();
        initList(lista);
        initComponents();
        setUI();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jTfBuscar = new javax.swing.JTextField();
        jScrollPaneLista = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jbtnAceptar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(204, 204, 204));
        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jTfBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jTfBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jTfBuscar.setPreferredSize(new java.awt.Dimension(250, 30));
        jTfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfBuscarKeyReleased(evt);
            }
        });

        jScrollPaneLista.setPreferredSize(new java.awt.Dimension(250, 150));

        jList.setBackground(new java.awt.Color(255, 255, 255));
        jList.setForeground(new java.awt.Color(0, 0, 0));
        jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList.setPreferredSize(new java.awt.Dimension(230, 130));
        jScrollPaneLista.setViewportView(jList);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTfBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(jTfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnAceptar.setForeground(new java.awt.Color(0, 102, 102));
        jbtnAceptar.setText("ACEPTAR");
        jbtnAceptar.setPreferredSize(new java.awt.Dimension(120, 40));
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        jBtnCancelar.setForeground(new java.awt.Color(0, 102, 102));
        jBtnCancelar.setText("CANCELAR");
        jBtnCancelar.setPreferredSize(new java.awt.Dimension(120, 40));
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        elemento = null;
        dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        
        if (!jList.isSelectionEmpty()) {
            elemento = ((ModelList) jList.getModel()).getObject(jList.getSelectedIndex());
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún dependiente");
        }
    }//GEN-LAST:event_jbtnAceptarActionPerformed

    private void jTfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTfBuscarKeyReleased
        ArrayList<Object> lista = modelo.getLista();
        ModelList tempo = new ModelList();
        if (jTfBuscar.getText().length() > 0) {
            for (Object object : lista) {
                Class cla = object.getClass();
                if ((cla.cast(object)).equals(this.jTfBuscar.getText())) {
                    tempo.addObject(object);
                } else {
                }
            }
            jList.setModel(tempo);
            if (tempo.getSize() > 0) {
                jList.setSelectedIndex(0);
                
            }
        } else {
            jList.setModel(modelo);
            
        }
    }//GEN-LAST:event_jTfBuscarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPaneLista;
    private javax.swing.JTextField jTfBuscar;
    private javax.swing.JButton jbtnAceptar;
    // End of variables declaration//GEN-END:variables

    private void initList(List<Object> lista) {
        modelo = new ModelList();
        for (Object object : lista) {
            modelo.addObject(object);
        }
    }
    
    public Object getElemento() {
        return elemento;
    }
    
    private void setUI() {
        jList.setModel(modelo);
        if (jList.getModel().getSize() > 0) {
            jList.setSelectedIndex(0);
        }
        elemento = null;
        if (!name.equals(CITY)) {
            this.jBtnCancelar.setText("NUEVO");
            this.jbtnAceptar.setText("ELEGIR");
        }
        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, name, javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102)));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
