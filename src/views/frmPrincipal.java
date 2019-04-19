package views;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author Eduardo C.
 */
public class frmPrincipal extends javax.swing.JFrame {
    private int xMouse;
    private int yMouse;
    public frmPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlControlBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNovaEncomenda = new javax.swing.JLabel();
        btnNovaEncomenda2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlControlBar.setBackground(new java.awt.Color(45, 45, 45));
        pnlControlBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlControlBarMouseDragged(evt);
            }
        });
        pnlControlBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlControlBarMousePressed(evt);
            }
        });
        pnlControlBar.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minbtn.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlControlBar.add(jLabel1);
        jLabel1.setBounds(1310, 3, 26, 26);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closebtn.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        pnlControlBar.add(jLabel2);
        jLabel2.setBounds(1340, 3, 26, 26);

        jPanel1.add(pnlControlBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel2.setBackground(new java.awt.Color(75, 75, 75));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 1010, 700));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(75, 75, 75));
        jLabel3.setText("OLÁ, USER");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 65, -1, -1));

        jLabel4.setText("LOGOUTICON");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 74, -1, -1));

        btnNovaEncomenda.setBackground(new java.awt.Color(45, 45, 45));
        btnNovaEncomenda.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        btnNovaEncomenda.setForeground(new java.awt.Color(255, 153, 0));
        btnNovaEncomenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovaEncomenda.setText("VISUALIZAR ENCOMENDAS");
        btnNovaEncomenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaEncomenda.setOpaque(true);
        jPanel3.add(btnNovaEncomenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 360, 50));

        btnNovaEncomenda2.setBackground(new java.awt.Color(45, 45, 45));
        btnNovaEncomenda2.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        btnNovaEncomenda2.setForeground(new java.awt.Color(255, 153, 0));
        btnNovaEncomenda2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovaEncomenda2.setText("CADASTRAR ENCOMENDA");
        btnNovaEncomenda2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaEncomenda2.setOpaque(true);
        btnNovaEncomenda2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovaEncomenda2MouseClicked(evt);
            }
        });
        jPanel3.add(btnNovaEncomenda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 145, 360, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlControlBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlControlBarMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_pnlControlBarMousePressed

    private void pnlControlBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlControlBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_pnlControlBarMouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.hide();
        frmLogin novaTela = new frmLogin();
        novaTela.pack();
        novaTela.setLocationRelativeTo(null);
        novaTela.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnNovaEncomenda2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaEncomenda2MouseClicked
        JPanel p = new JPanelCadastrar();
        p.show(true);
        jPanel2.add(p);
        jPanel2.repaint();
        
    }//GEN-LAST:event_btnNovaEncomenda2MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPrincipal tela = new frmPrincipal();
                tela.pack();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnNovaEncomenda;
    private javax.swing.JLabel btnNovaEncomenda2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlControlBar;
    // End of variables declaration//GEN-END:variables
}
