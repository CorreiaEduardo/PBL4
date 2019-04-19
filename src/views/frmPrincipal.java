package views;

import Logics.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Eduardo C.
 */
public class frmPrincipal extends javax.swing.JFrame {
    private int xMouse;
    private int yMouse;
    public frmPrincipal() {
        initComponents();
        pnlCadastrar.hide();
        pnlSaborTipo.hide();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlControlBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlCadastrar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cboxTipoAlimento = new javax.swing.JComboBox<>();
        pnlSaborTipo = new javax.swing.JPanel();
        txtSaborTipo = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        pnlEstoque = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNovaEncomenda = new javax.swing.JLabel();
        btnNovaEncomenda2 = new javax.swing.JLabel();
        btnNovaEncomenda1 = new javax.swing.JLabel();

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCadastrar.setBackground(new java.awt.Color(75, 75, 75));
        pnlCadastrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("NOVO PEDIDO");
        pnlCadastrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 46, -1, -1));

        cboxTipoAlimento.setBackground(new java.awt.Color(45, 45, 45));
        cboxTipoAlimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECIONAR>", "Frio", "Pãozinho", "Doce" }));
        cboxTipoAlimento.setBorder(null);
        cboxTipoAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTipoAlimentoActionPerformed(evt);
            }
        });
        pnlCadastrar.add(cboxTipoAlimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 133, 256, -1));

        pnlSaborTipo.setBackground(new java.awt.Color(85, 85, 85));

        txtSaborTipo.setBackground(new java.awt.Color(255, 153, 0));
        txtSaborTipo.setForeground(new java.awt.Color(45, 45, 45));
        txtSaborTipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaborTipo.setBorder(null);

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("VALOR UNITÁRIO");
        jTextField1.setBorder(null);

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("VALOR TOTAL DA COMPRA");
        jTextField2.setBorder(null);

        javax.swing.GroupLayout pnlSaborTipoLayout = new javax.swing.GroupLayout(pnlSaborTipo);
        pnlSaborTipo.setLayout(pnlSaborTipoLayout);
        pnlSaborTipoLayout.setHorizontalGroup(
            pnlSaborTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaborTipoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlSaborTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSaborTipo)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlSaborTipoLayout.setVerticalGroup(
            pnlSaborTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaborTipoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtSaborTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pnlCadastrar.add(pnlSaborTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 177, 390, 290));

        jPanel2.add(pnlCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        pnlEstoque.setBackground(new java.awt.Color(75, 75, 75));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("ESTOQUE");

        javax.swing.GroupLayout pnlEstoqueLayout = new javax.swing.GroupLayout(pnlEstoque);
        pnlEstoque.setLayout(pnlEstoqueLayout);
        pnlEstoqueLayout.setHorizontalGroup(
            pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstoqueLayout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(jLabel6)
                .addContainerGap(483, Short.MAX_VALUE))
        );
        pnlEstoqueLayout.setVerticalGroup(
            pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstoqueLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel6)
                .addContainerGap(617, Short.MAX_VALUE))
        );

        jPanel2.add(pnlEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

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
        btnNovaEncomenda.setText("VISUALIZAR ESTOQUE");
        btnNovaEncomenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaEncomenda.setOpaque(true);
        jPanel3.add(btnNovaEncomenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 360, 50));

        btnNovaEncomenda2.setBackground(new java.awt.Color(45, 45, 45));
        btnNovaEncomenda2.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        btnNovaEncomenda2.setForeground(new java.awt.Color(255, 153, 0));
        btnNovaEncomenda2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovaEncomenda2.setText("ABRIR PEDIDO");
        btnNovaEncomenda2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaEncomenda2.setOpaque(true);
        btnNovaEncomenda2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovaEncomenda2MouseClicked(evt);
            }
        });
        jPanel3.add(btnNovaEncomenda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 145, 360, 50));

        btnNovaEncomenda1.setBackground(new java.awt.Color(45, 45, 45));
        btnNovaEncomenda1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        btnNovaEncomenda1.setForeground(new java.awt.Color(255, 153, 0));
        btnNovaEncomenda1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovaEncomenda1.setText("VISUALIZAR ENCOMENDAS");
        btnNovaEncomenda1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaEncomenda1.setOpaque(true);
        jPanel3.add(btnNovaEncomenda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 360, 50));

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
          pnlCadastrar.show();
          pnlEstoque.hide();
        
    }//GEN-LAST:event_btnNovaEncomenda2MouseClicked

    private void cboxTipoAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTipoAlimentoActionPerformed
        int escolha = cboxTipoAlimento.getSelectedIndex();
        switch(escolha){
            case 0://NADA SELECIONADO
                break;
            case 1: // frio
                JOptionPane.showMessageDialog(null, "Frio!");
                break;
            case 2: //paozinho
                pnlSaborTipo.show(true);
                txtSaborTipo.setText("SABOR");
                Paozinho p = new Paozinho();
                break;
            case 3: //doce
                JOptionPane.showMessageDialog(null, "Doce!");
                pnlSaborTipo.show();
                txtSaborTipo.setText("TIPO");
                break;
        }
    }//GEN-LAST:event_cboxTipoAlimentoActionPerformed

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
    private javax.swing.JLabel btnNovaEncomenda1;
    private javax.swing.JLabel btnNovaEncomenda2;
    private javax.swing.JComboBox<String> cboxTipoAlimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pnlCadastrar;
    private javax.swing.JPanel pnlControlBar;
    private javax.swing.JPanel pnlEstoque;
    private javax.swing.JPanel pnlSaborTipo;
    private javax.swing.JTextField txtSaborTipo;
    // End of variables declaration//GEN-END:variables
}
