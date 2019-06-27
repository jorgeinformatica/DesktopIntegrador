package View;

import Utils.PanelFX;
import java.awt.BorderLayout;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class GoHome extends javax.swing.JDialog {
    
    private final int ANCHO = 1440, ALTO = 900;
    private PanelFX panel;
    private final String INIT = "https://www.google.com/maps/dir/?api=1";
    private final String ORIGIN = "&origin=";
    private final String DESTINATION = "&destination=";
    private final String END = "&travelmode=walking";
    private String url;
    public GoHome(java.awt.Frame parent, boolean modal, String origen, String destino) {
        super(parent, modal);
        panel = new PanelFX(ANCHO, ALTO);
        initComponents();
        initUI(origen, destino);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCanvas = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanelCanvas.setPreferredSize(new java.awt.Dimension(950, 650));

        javax.swing.GroupLayout jPanelCanvasLayout = new javax.swing.GroupLayout(jPanelCanvas);
        jPanelCanvas.setLayout(jPanelCanvasLayout);
        jPanelCanvasLayout.setHorizontalGroup(
            jPanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelCanvasLayout.setVerticalGroup(
            jPanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/IconoCancelar25x25.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(796, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanelCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanelCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.panel.loadURL(url);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void initUI(String origen, String destino) {
        url = INIT + ORIGIN + origen + DESTINATION + destino + END;
        panel.loadURL(url);
        panel.setBounds(1, 1, jPanelCanvas.getWidth() - 1, jPanelCanvas.getHeight() - 1);
        this.jPanelCanvas.setLayout(new BorderLayout());
        this.jPanelCanvas.add(panel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.repaint();
        this.update(this.getGraphics());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanelCanvas;
    // End of variables declaration//GEN-END:variables

    public PanelFX getPanel() {
        return panel;
    }
    
}
