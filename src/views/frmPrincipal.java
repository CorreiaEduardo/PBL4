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
        pnlPaozinho.hide();
        pnlDoce.hide();
        pnlFrio.hide();
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
        pnlPaozinho = new javax.swing.JPanel();
        txtValorUnitario = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JTextField();
        btnNovoProduto = new javax.swing.JLabel();
        btnFinalizarPedido = new javax.swing.JLabel();
        cboxSaborPaozinho = new javax.swing.JComboBox<>();
        pnlDoce = new javax.swing.JPanel();
        txtValorUnitario1 = new javax.swing.JTextField();
        txtValorTotal1 = new javax.swing.JTextField();
        btnNovoProduto1 = new javax.swing.JLabel();
        btnFinalizarPedido1 = new javax.swing.JLabel();
        cboxTipoDoce = new javax.swing.JComboBox<>();
        pnlFrio = new javax.swing.JPanel();
        txtValorUnitario2 = new javax.swing.JTextField();
        txtValorTotal2 = new javax.swing.JTextField();
        btnNovoProduto2 = new javax.swing.JLabel();
        btnFinalizarPedido2 = new javax.swing.JLabel();
        cboxTipoDoce1 = new javax.swing.JComboBox<>();
        pnlPrecos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtValor6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtValor7 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtValor5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnEditar6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEditar4 = new javax.swing.JLabel();
        txtValor4 = new javax.swing.JTextField();
        btnEditar7 = new javax.swing.JLabel();
        btnEditar5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnEditar8 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        btnEditar1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtValor8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtValor2 = new javax.swing.JTextField();
        btnEditar2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtValor3 = new javax.swing.JTextField();
        btnEditar3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtValor9 = new javax.swing.JTextField();
        btnEditar9 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtValor10 = new javax.swing.JTextField();
        btnEditar10 = new javax.swing.JLabel();
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

        pnlPaozinho.setBackground(new java.awt.Color(85, 85, 85));

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

        cboxSaborPaozinho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<selecionar>", "REQUEIJÃO", "CHEDDAR", "PATÊ DE ATUM" }));
        cboxSaborPaozinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxSaborPaozinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPaozinhoLayout = new javax.swing.GroupLayout(pnlPaozinho);
        pnlPaozinho.setLayout(pnlPaozinhoLayout);
        pnlPaozinhoLayout.setHorizontalGroup(
            pnlPaozinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPaozinhoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlPaozinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPaozinhoLayout.createSequentialGroup()
                        .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(btnFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtValorUnitario)
                    .addComponent(txtValorTotal)
                    .addComponent(cboxSaborPaozinho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlPaozinhoLayout.setVerticalGroup(
            pnlPaozinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPaozinhoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(cboxSaborPaozinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(pnlPaozinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pnlCadastrar.add(pnlPaozinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 177, 390, 290));

        pnlDoce.setBackground(new java.awt.Color(85, 85, 85));

        txtValorUnitario1.setEditable(false);
        txtValorUnitario1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorUnitario1.setText("VALOR UNITÁRIO");
        txtValorUnitario1.setBorder(null);

        txtValorTotal1.setEditable(false);
        txtValorTotal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorTotal1.setText("VALOR TOTAL DA COMPRA");
        txtValorTotal1.setBorder(null);

        btnNovoProduto1.setBackground(new java.awt.Color(255, 153, 0));
        btnNovoProduto1.setForeground(new java.awt.Color(75, 75, 75));
        btnNovoProduto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovoProduto1.setText("NOVO PRODUTO");
        btnNovoProduto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoProduto1.setOpaque(true);
        btnNovoProduto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoProduto1MouseClicked(evt);
            }
        });

        btnFinalizarPedido1.setBackground(new java.awt.Color(255, 153, 0));
        btnFinalizarPedido1.setForeground(new java.awt.Color(75, 75, 75));
        btnFinalizarPedido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinalizarPedido1.setText("FINALIZAR PEDIDO");
        btnFinalizarPedido1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarPedido1.setOpaque(true);

        cboxTipoDoce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<selecionar>", "FINO", "DE FESTA", "ORNAMENTAL" }));

        javax.swing.GroupLayout pnlDoceLayout = new javax.swing.GroupLayout(pnlDoce);
        pnlDoce.setLayout(pnlDoceLayout);
        pnlDoceLayout.setHorizontalGroup(
            pnlDoceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoceLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlDoceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDoceLayout.createSequentialGroup()
                        .addComponent(btnNovoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(btnFinalizarPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtValorUnitario1)
                    .addComponent(txtValorTotal1)
                    .addComponent(cboxTipoDoce, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlDoceLayout.setVerticalGroup(
            pnlDoceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoceLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(cboxTipoDoce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtValorUnitario1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtValorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(pnlDoceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pnlCadastrar.add(pnlDoce, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 177, 390, -1));

        pnlFrio.setBackground(new java.awt.Color(85, 85, 85));

        txtValorUnitario2.setEditable(false);
        txtValorUnitario2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorUnitario2.setText("VALOR UNITÁRIO");
        txtValorUnitario2.setBorder(null);

        txtValorTotal2.setEditable(false);
        txtValorTotal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorTotal2.setText("VALOR TOTAL DA COMPRA");
        txtValorTotal2.setBorder(null);

        btnNovoProduto2.setBackground(new java.awt.Color(255, 153, 0));
        btnNovoProduto2.setForeground(new java.awt.Color(75, 75, 75));
        btnNovoProduto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovoProduto2.setText("NOVO PRODUTO");
        btnNovoProduto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoProduto2.setOpaque(true);
        btnNovoProduto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoProduto2MouseClicked(evt);
            }
        });

        btnFinalizarPedido2.setBackground(new java.awt.Color(255, 153, 0));
        btnFinalizarPedido2.setForeground(new java.awt.Color(75, 75, 75));
        btnFinalizarPedido2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinalizarPedido2.setText("FINALIZAR PEDIDO");
        btnFinalizarPedido2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarPedido2.setOpaque(true);

        cboxTipoDoce1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<selecionar>", "COXINHA", "KIBE", "PASTELZINHO" }));

        javax.swing.GroupLayout pnlFrioLayout = new javax.swing.GroupLayout(pnlFrio);
        pnlFrio.setLayout(pnlFrioLayout);
        pnlFrioLayout.setHorizontalGroup(
            pnlFrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlFrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFrioLayout.createSequentialGroup()
                        .addComponent(btnNovoProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(btnFinalizarPedido2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtValorUnitario2)
                    .addComponent(txtValorTotal2)
                    .addComponent(cboxTipoDoce1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlFrioLayout.setVerticalGroup(
            pnlFrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(cboxTipoDoce1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtValorUnitario2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtValorTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(pnlFrioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarPedido2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pnlCadastrar.add(pnlFrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 177, 390, -1));

        jPanel2.add(pnlCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        pnlPrecos.setBackground(new java.awt.Color(75, 75, 75));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("TABELA DE PREÇOS");

        jPanel4.setBackground(new java.awt.Color(85, 85, 85));

        txtValor6.setEditable(false);
        txtValor6.setBackground(new java.awt.Color(55, 55, 55));
        txtValor6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor6.setForeground(new java.awt.Color(204, 204, 204));
        txtValor6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor6.setText("R$ 3.70");
        txtValor6.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("DOCE FINO");

        txtValor7.setEditable(false);
        txtValor7.setBackground(new java.awt.Color(55, 55, 55));
        txtValor7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor7.setForeground(new java.awt.Color(204, 204, 204));
        txtValor7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor7.setText("R$ 3.70");
        txtValor7.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 0));
        jLabel18.setText("COXINHA");

        txtValor5.setEditable(false);
        txtValor5.setBackground(new java.awt.Color(55, 55, 55));
        txtValor5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor5.setForeground(new java.awt.Color(204, 204, 204));
        txtValor5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor5.setText("R$ 3.70");
        txtValor5.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jLabel16.setText("DOCE ORNAMENTAL");

        btnEditar6.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar6.setForeground(new java.awt.Color(45, 45, 45));
        btnEditar6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar6.setText("EDITAR");
        btnEditar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar6.setOpaque(true);
        btnEditar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditar6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("PÃOZINHO - REQUEIJÃO");

        btnEditar4.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar4.setForeground(new java.awt.Color(45, 45, 45));
        btnEditar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar4.setText("EDITAR");
        btnEditar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar4.setOpaque(true);
        btnEditar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditar4MouseClicked(evt);
            }
        });

        txtValor4.setEditable(false);
        txtValor4.setBackground(new java.awt.Color(55, 55, 55));
        txtValor4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor4.setForeground(new java.awt.Color(204, 204, 204));
        txtValor4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor4.setText("R$ 3.70");
        txtValor4.setBorder(null);

        btnEditar7.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar7.setForeground(new java.awt.Color(45, 45, 45));
        btnEditar7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar7.setText("EDITAR");
        btnEditar7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar7.setOpaque(true);
        btnEditar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditar7MouseClicked(evt);
            }
        });

        btnEditar5.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar5.setForeground(new java.awt.Color(45, 45, 45));
        btnEditar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar5.setText("EDITAR");
        btnEditar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar5.setOpaque(true);
        btnEditar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditar5MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("DOCE GOURMET");

        btnEditar8.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar8.setForeground(new java.awt.Color(45, 45, 45));
        btnEditar8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar8.setText("EDITAR");
        btnEditar8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar8.setOpaque(true);
        btnEditar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditar8MouseClicked(evt);
            }
        });

        txtValor1.setEditable(false);
        txtValor1.setBackground(new java.awt.Color(55, 55, 55));
        txtValor1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor1.setForeground(new java.awt.Color(204, 204, 204));
        txtValor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor1.setText("R$ 3.70");
        txtValor1.setBorder(null);

        btnEditar1.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar1.setForeground(new java.awt.Color(45, 45, 45));
        btnEditar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar1.setText("EDITAR");
        btnEditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar1.setOpaque(true);
        btnEditar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditar1MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("DOCE DE FESTA");

        txtValor8.setEditable(false);
        txtValor8.setBackground(new java.awt.Color(55, 55, 55));
        txtValor8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor8.setForeground(new java.awt.Color(204, 204, 204));
        txtValor8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor8.setText("R$ 3.70");
        txtValor8.setBorder(null);

        jLabel19.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 0));
        jLabel19.setText("PÃOZINHO - CHEDDAR");

        txtValor2.setEditable(false);
        txtValor2.setBackground(new java.awt.Color(55, 55, 55));
        txtValor2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor2.setForeground(new java.awt.Color(204, 204, 204));
        txtValor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor2.setText("R$ 3.70");
        txtValor2.setBorder(null);

        btnEditar2.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar2.setForeground(new java.awt.Color(45, 45, 45));
        btnEditar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar2.setText("EDITAR");
        btnEditar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar2.setOpaque(true);
        btnEditar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditar2MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 153, 0));
        jLabel21.setText("PÃOZINHO - PATÊ DE ATUM");

        txtValor3.setEditable(false);
        txtValor3.setBackground(new java.awt.Color(55, 55, 55));
        txtValor3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor3.setForeground(new java.awt.Color(204, 204, 204));
        txtValor3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor3.setText("R$ 3.70");
        txtValor3.setBorder(null);

        btnEditar3.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar3.setForeground(new java.awt.Color(45, 45, 45));
        btnEditar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar3.setText("EDITAR");
        btnEditar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar3.setOpaque(true);
        btnEditar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditar3MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 153, 0));
        jLabel23.setText("KIBE");

        txtValor9.setEditable(false);
        txtValor9.setBackground(new java.awt.Color(55, 55, 55));
        txtValor9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor9.setForeground(new java.awt.Color(204, 204, 204));
        txtValor9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor9.setText("R$ 3.70");
        txtValor9.setBorder(null);

        btnEditar9.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar9.setForeground(new java.awt.Color(45, 45, 45));
        btnEditar9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar9.setText("EDITAR");
        btnEditar9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar9.setOpaque(true);
        btnEditar9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditar9MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 153, 0));
        jLabel25.setText("PASTELZINHO");

        txtValor10.setEditable(false);
        txtValor10.setBackground(new java.awt.Color(55, 55, 55));
        txtValor10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtValor10.setForeground(new java.awt.Color(204, 204, 204));
        txtValor10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor10.setText("R$ 3.70");
        txtValor10.setBorder(null);

        btnEditar10.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar10.setForeground(new java.awt.Color(45, 45, 45));
        btnEditar10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar10.setText("EDITAR");
        btnEditar10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar10.setOpaque(true);
        btnEditar10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditar10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(46, 46, 46))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGap(44, 44, 44)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnEditar3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel16)
                                .addComponent(jLabel14)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtValor7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(txtValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEditar4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(txtValor10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEditar10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(txtValor9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEditar9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(txtValor8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEditar8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPrecosLayout = new javax.swing.GroupLayout(pnlPrecos);
        pnlPrecos.setLayout(pnlPrecosLayout);
        pnlPrecosLayout.setHorizontalGroup(
            pnlPrecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrecosLayout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
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
                .addContainerGap(244, Short.MAX_VALUE))
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
                limparCampos();
                pnlFrio.show();
                break;
            case 2: //paozinho
                limparCampos();
                pnlPaozinho.show(true);
                break;
            case 3: //doce
                limparCampos();
                pnlDoce.show();
                break;
        }
    }//GEN-LAST:event_cboxTipoAlimentoActionPerformed

    private void btnNovaEncomendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaEncomendaMouseClicked
        pnlCadastrar.hide();
        pnlPrecos.show();
    }//GEN-LAST:event_btnNovaEncomendaMouseClicked

    private void btnEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar1MouseClicked
        // EDITAR PAOZINHO:
        try {
            double novoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o novo valor", "Editando valor do Pãozinho", 3));
            txtValor1.setText("R$ "+novoValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
        
    }//GEN-LAST:event_btnEditar1MouseClicked

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
                Paozinho p = new Paozinho(valor,""+validade,"",cboxSaborPaozinho.getSelectedItem().toString());
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

    private void btnNovoProduto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProduto1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoProduto1MouseClicked

    private void btnNovoProduto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProduto2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoProduto2MouseClicked

    private void btnEditar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar2MouseClicked
        try {
            double novoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o novo valor", "Editando valor", 3));
            txtValor2.setText("R$ "+novoValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
    }//GEN-LAST:event_btnEditar2MouseClicked

    private void btnEditar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar3MouseClicked
        try {
            double novoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o novo valor", "Editando valor", 3));
            txtValor3.setText("R$ "+novoValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
    }//GEN-LAST:event_btnEditar3MouseClicked

    private void btnEditar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar4MouseClicked
        try {
            double novoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o novo valor", "Editando valor", 3));
            txtValor4.setText("R$ "+novoValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
    }//GEN-LAST:event_btnEditar4MouseClicked

    private void btnEditar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar5MouseClicked
        try {
            double novoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o novo valor", "Editando valor", 3));
            txtValor5.setText("R$ "+novoValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
    }//GEN-LAST:event_btnEditar5MouseClicked

    private void btnEditar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar6MouseClicked
        try {
            double novoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o novo valor", "Editando valor", 3));
            txtValor6.setText("R$ "+novoValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
    }//GEN-LAST:event_btnEditar6MouseClicked

    private void btnEditar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar7MouseClicked
        try {
            double novoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o novo valor", "Editando valor", 3));
            txtValor7.setText("R$ "+novoValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
    }//GEN-LAST:event_btnEditar7MouseClicked

    private void btnEditar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar8MouseClicked
        try {
            double novoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o novo valor", "Editando valor", 3));
            txtValor8.setText("R$ "+novoValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
    }//GEN-LAST:event_btnEditar8MouseClicked

    private void btnEditar9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar9MouseClicked
        try {
            double novoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o novo valor", "Editando valor", 3));
            txtValor9.setText("R$ "+novoValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
    }//GEN-LAST:event_btnEditar9MouseClicked

    private void btnEditar10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar10MouseClicked
        try {
            double novoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o novo valor", "Editando valor", 3));
            txtValor10.setText("R$ "+novoValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
    }//GEN-LAST:event_btnEditar10MouseClicked

    private void cboxSaborPaozinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxSaborPaozinhoActionPerformed
        int saborPaozinho = cboxSaborPaozinho.getSelectedIndex();
        switch(saborPaozinho){
            case 0://NADA SELECIONADO
                break;
            case 1: // requeijao
                txtValorUnitario.setText(txtValor8.getText());
                break;
            case 2: //cheddar
                txtValorUnitario.setText(txtValor1.getText());
                break;
            case 3: //pate de atum
                break;
        }
    }//GEN-LAST:event_cboxSaborPaozinhoActionPerformed

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
                txtValorUnitario.setText(txtValor8.getText());
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
                break;
            case 2: //paozinho
                pnlPaozinho.show(true);
                txtValorUnitario.setText(txtValor1.getText());
                break;
            case 3: //doce
                pnlPaozinho.show();
                break;
        }
        pnlPaozinho.hide();
        pnlDoce.hide();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEditar1;
    private javax.swing.JLabel btnEditar10;
    private javax.swing.JLabel btnEditar2;
    private javax.swing.JLabel btnEditar3;
    private javax.swing.JLabel btnEditar4;
    private javax.swing.JLabel btnEditar5;
    private javax.swing.JLabel btnEditar6;
    private javax.swing.JLabel btnEditar7;
    private javax.swing.JLabel btnEditar8;
    private javax.swing.JLabel btnEditar9;
    private javax.swing.JLabel btnFinalizarPedido;
    private javax.swing.JLabel btnFinalizarPedido1;
    private javax.swing.JLabel btnFinalizarPedido2;
    private javax.swing.JLabel btnNovaEncomenda;
    private javax.swing.JLabel btnNovaEncomenda1;
    private javax.swing.JLabel btnNovaEncomenda2;
    private javax.swing.JLabel btnNovoProduto;
    private javax.swing.JLabel btnNovoProduto1;
    private javax.swing.JLabel btnNovoProduto2;
    private javax.swing.JComboBox<String> cboxSaborPaozinho;
    private javax.swing.JComboBox<String> cboxTipoAlimento;
    private javax.swing.JComboBox<String> cboxTipoDoce;
    private javax.swing.JComboBox<String> cboxTipoDoce1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pnlCadastrar;
    private javax.swing.JPanel pnlControlBar;
    private javax.swing.JPanel pnlDoce;
    private javax.swing.JPanel pnlFrio;
    private javax.swing.JPanel pnlPaozinho;
    private javax.swing.JPanel pnlPrecos;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor10;
    private javax.swing.JTextField txtValor2;
    private javax.swing.JTextField txtValor3;
    private javax.swing.JTextField txtValor4;
    private javax.swing.JTextField txtValor5;
    private javax.swing.JTextField txtValor6;
    private javax.swing.JTextField txtValor7;
    private javax.swing.JTextField txtValor8;
    private javax.swing.JTextField txtValor9;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtValorTotal1;
    private javax.swing.JTextField txtValorTotal2;
    private javax.swing.JTextField txtValorUnitario;
    private javax.swing.JTextField txtValorUnitario1;
    private javax.swing.JTextField txtValorUnitario2;
    // End of variables declaration//GEN-END:variables
}
