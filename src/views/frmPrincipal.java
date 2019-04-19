package views;

import Logics.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
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
        pnlPrecos.hide();
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
        txtValorUnitario = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JTextField();
        btnNovoProduto = new javax.swing.JLabel();
        btnFinalizarPedido = new javax.swing.JLabel();
        pnlPrecos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtValor6 = new javax.swing.JTextField();
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

        txtValorUnitario.setEditable(false);
        txtValorUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorUnitario.setText("VALOR UNITÁRIO");
        txtValorUnitario.setBorder(null);

        txtValorTotal.setEditable(false);
        txtValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorTotal.setText("VALOR TOTAL DA COMPRA");
        txtValorTotal.setBorder(null);

        btnNovoProduto.setBackground(new java.awt.Color(255, 153, 0));
        btnNovoProduto.setForeground(new java.awt.Color(75, 75, 75));
        btnNovoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovoProduto.setText("NOVO PRODUTO");
        btnNovoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoProduto.setOpaque(true);
        btnNovoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoProdutoMouseClicked(evt);
            }
        });

        btnFinalizarPedido.setBackground(new java.awt.Color(255, 153, 0));
        btnFinalizarPedido.setForeground(new java.awt.Color(75, 75, 75));
        btnFinalizarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinalizarPedido.setText("FINALIZAR PEDIDO");
        btnFinalizarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarPedido.setOpaque(true);

        javax.swing.GroupLayout pnlSaborTipoLayout = new javax.swing.GroupLayout(pnlSaborTipo);
        pnlSaborTipo.setLayout(pnlSaborTipoLayout);
        pnlSaborTipoLayout.setHorizontalGroup(
            pnlSaborTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaborTipoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlSaborTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlSaborTipoLayout.createSequentialGroup()
                        .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(btnFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSaborTipo)
                    .addComponent(txtValorUnitario)
                    .addComponent(txtValorTotal))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlSaborTipoLayout.setVerticalGroup(
            pnlSaborTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaborTipoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtSaborTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(pnlSaborTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pnlCadastrar.add(pnlSaborTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 177, 390, 290));

        jPanel2.add(pnlCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        pnlPrecos.setBackground(new java.awt.Color(75, 75, 75));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("TABELA DE PREÇOS");

        jPanel4.setBackground(new java.awt.Color(85, 85, 85));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(55, 55, 55));
        jTextField6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 204, 204));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("R$ 3.70");
        jTextField6.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("DOCE FINO");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(55, 55, 55));
        jTextField7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(204, 204, 204));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("R$ 3.70");
        jTextField7.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 0));
        jLabel18.setText("FRIO");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(55, 55, 55));
        jTextField5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("R$ 3.70");
        jTextField5.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jLabel16.setText("DOCE ORNAMENTAL");

        jLabel13.setBackground(new java.awt.Color(255, 153, 0));
        jLabel13.setForeground(new java.awt.Color(45, 45, 45));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("EDITAR");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("PÃOZINHO");

        jLabel9.setBackground(new java.awt.Color(255, 153, 0));
        jLabel9.setForeground(new java.awt.Color(45, 45, 45));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EDITAR");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setOpaque(true);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(55, 55, 55));
        jTextField4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("R$ 3.70");
        jTextField4.setBorder(null);

        jLabel15.setBackground(new java.awt.Color(255, 153, 0));
        jLabel15.setForeground(new java.awt.Color(45, 45, 45));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("EDITAR");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(255, 153, 0));
        jLabel11.setForeground(new java.awt.Color(45, 45, 45));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("EDITAR");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("DOCE GOURMET");

        jLabel17.setBackground(new java.awt.Color(255, 153, 0));
        jLabel17.setForeground(new java.awt.Color(45, 45, 45));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("EDITAR");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.setOpaque(true);

        txtValor1.setEditable(false);
        txtValor1.setBackground(new java.awt.Color(55, 55, 55));
        txtValor1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor1.setForeground(new java.awt.Color(204, 204, 204));
        txtValor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor1.setText("R$ 3.70");
        txtValor1.setBorder(null);

        jLabel8.setBackground(new java.awt.Color(255, 153, 0));
        jLabel8.setForeground(new java.awt.Color(45, 45, 45));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("EDITAR");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("DOCE DE FESTA");

        txtValor6.setEditable(false);
        txtValor6.setBackground(new java.awt.Color(55, 55, 55));
        txtValor6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor6.setForeground(new java.awt.Color(204, 204, 204));
        txtValor6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor6.setText("R$ 3.70");
        txtValor6.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPrecosLayout = new javax.swing.GroupLayout(pnlPrecos);
        pnlPrecos.setLayout(pnlPrecosLayout);
        pnlPrecosLayout.setHorizontalGroup(
            pnlPrecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrecosLayout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
            .addGroup(pnlPrecosLayout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPrecosLayout.setVerticalGroup(
            pnlPrecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrecosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel6)
                .addGap(70, 70, 70)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jPanel2.add(pnlPrecos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

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
        btnNovaEncomenda.setText("VISUALIZAR TBL DE PREÇOS");
        btnNovaEncomenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaEncomenda.setOpaque(true);
        btnNovaEncomenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovaEncomendaMouseClicked(evt);
            }
        });
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
          pnlPrecos.hide();
          atualizarCampos();
        
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
                txtValorUnitario.setText(txtValor1.getText());
                break;
            case 3: //doce
                JOptionPane.showMessageDialog(null, "Doce!");
                pnlSaborTipo.show();
                txtSaborTipo.setText("TIPO");
                break;
        }
    }//GEN-LAST:event_cboxTipoAlimentoActionPerformed

    private void btnNovaEncomendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaEncomendaMouseClicked
        pnlCadastrar.hide();
        pnlPrecos.show();
    }//GEN-LAST:event_btnNovaEncomendaMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // EDITAR PAOZINHO:
        try {
            double novoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o novo valor", "Editando valor do Pãozinho", 3));
            txtValor1.setText("R$ "+novoValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnNovoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProdutoMouseClicked
        ArrayList<Produto> produtos = new ArrayList<>();
        int indexProduto = cboxTipoAlimento.getSelectedIndex();
        GregorianCalendar calendario = new GregorianCalendar(Locale.US);
        int validade = calendario.getTime().getMonth()+7;
        switch(indexProduto){
            case 1: // frio
                
                break;
            case 2: //paozinho
                double valor = Double.parseDouble(txtValor1.getText().split(" ")[1]);
                Paozinho p = new Paozinho(valor,""+validade,"",txtSaborTipo.getText());
                System.out.println(p.getPreco());
                System.out.println(p.getEspecificacao());
                System.out.println(p.getSabor());
                System.out.println(p.getValidade());
                break;
            case 3: //doce
                
                break;
        }
        limparCampos();
    }//GEN-LAST:event_btnNovoProdutoMouseClicked

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
    
    public void atualizarCampos(){
        int escolha = cboxTipoAlimento.getSelectedIndex();
        switch(escolha){
            case 0://NADA SELECIONADO
                break;
            case 1: // frio
                txtValorUnitario.setText(txtValor6.getText());
                break;
            case 2: //paozinho
                txtValorUnitario.setText(txtValor1.getText());
                break;
            case 3: //doce
                break;
        }
    }
    
    public void limparCampos(){
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
                txtValorUnitario.setText(txtValor1.getText());
                break;
            case 3: //doce
                JOptionPane.showMessageDialog(null, "Doce!");
                pnlSaborTipo.show();
                txtSaborTipo.setText("TIPO");
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnFinalizarPedido;
    private javax.swing.JLabel btnNovaEncomenda;
    private javax.swing.JLabel btnNovaEncomenda1;
    private javax.swing.JLabel btnNovaEncomenda2;
    private javax.swing.JLabel btnNovoProduto;
    private javax.swing.JComboBox<String> cboxTipoAlimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel pnlCadastrar;
    private javax.swing.JPanel pnlControlBar;
    private javax.swing.JPanel pnlPrecos;
    private javax.swing.JPanel pnlSaborTipo;
    private javax.swing.JTextField txtSaborTipo;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor6;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
