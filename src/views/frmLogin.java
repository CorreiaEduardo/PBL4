package views;

import java.awt.Color;

/**
 * @author Eduardo C.
 */
public class frmLogin extends javax.swing.JFrame {
    private int xMouse;
    private int yMouse;
    public frmLogin() {
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
        lblLOGIN = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
        jLabel1.setBounds(740, 3, 26, 26);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closebtn.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        pnlControlBar.add(jLabel2);
        jLabel2.setBounds(768, 3, 26, 26);

        jPanel1.add(pnlControlBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jPanel2.setBackground(new java.awt.Color(75, 75, 75));

        lblLOGIN.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        lblLOGIN.setForeground(new java.awt.Color(255, 153, 0));
        lblLOGIN.setText("LOGIN");

        txtUser.setBackground(new java.awt.Color(65, 65, 65));
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setText("USUÁRIO");
        txtUser.setBorder(null);
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(65, 65, 65));
        btnLogin.setForeground(new java.awt.Color(204, 204, 204));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setOpaque(true);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(65, 65, 65));
        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setText("SENHA");
        txtPass.setBorder(null);
        txtPass.setEchoChar((char) 0);
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass))
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(lblLOGIN)
                .addGap(179, 179, 179))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblLOGIN)
                .addGap(69, 69, 69)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 490, 470));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 65, 65));
        jLabel3.setText("PAINEL DO FUNCIONÁRIO");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/funcionario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(91, 91, 91))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 470));

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
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().equals("USUÁRIO")) {
            txtUser.setText("");
        }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if (txtUser.getText().equals("")) {
            txtUser.setText("USUÁRIO");
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        float[] hsb = Color.RGBtoHSB(255, 153, 0, new float[3]);
        btnLogin.setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        float[] hsb = Color.RGBtoHSB(86, 86, 86, new float[3]);
        btnLogin.setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }//GEN-LAST:event_btnLoginMouseExited

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        if (txtPass.getText().equals("SENHA")) {
            txtPass.setText("");
        }
        this.txtPass.setEchoChar('\u2022');
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if (txtPass.getText().equals("")) {
            txtPass.setText("SENHA");
            this.txtPass.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        this.hide();
        frmPrincipal novaTela = new frmPrincipal();
        novaTela.pack();
        novaTela.setLocationRelativeTo(null);
        novaTela.setVisible(true);
    }//GEN-LAST:event_btnLoginMouseClicked

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmLogin tela = new frmLogin();
                tela.pack();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblLOGIN;
    private javax.swing.JPanel pnlControlBar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
