/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import dao.Conexao;
import javax.swing.JOptionPane;
import model.CadastroEmpresa;
import model.CadastroFuncionarioEmpresa;
import model.Contratar;

public class TelaContratar extends javax.swing.JFrame {

    Conexao conectar = new Conexao();
    CadastroFuncionarioEmpresa cadastroFuncionarioEmpresa = new CadastroFuncionarioEmpresa();
    CadastroEmpresa cadastroEmpresa = new CadastroEmpresa();
    Contratar contratar = new Contratar();

    public TelaContratar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch2 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txfQuantidadeHoras = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxTipoServico = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfObservacao = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        txtNomeEmpresa = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btnSearch3 = new javax.swing.JButton();
        cbxPrestadorServico = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txfCadastroCnpj2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtNomeEmpresa2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPrestadorServico2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTipoServico2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtQuantidadeHoras2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtObservacao2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

        btnSearch2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch2.setText("BUSCAR CNPJ");
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Observações:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Digite a quantidade de horas:");

        cbxTipoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avaliação do Imóvel", "Vistoria", "Análise Cadastral" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Selecione o tipo de serviço:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Digite o Prestador de Serviço:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Digite o Nome da Empresa:");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Digite o CNPJ da Empresa:");

        btnSearch3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch3.setText("BUSCAR CNPJ");
        btnSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch3ActionPerformed(evt);
            }
        });

        cbxPrestadorServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPrestadorServicoActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("PRESTADOR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updated.png"))); // NOI18N
        jButton1.setText("CONTRATAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbxTipoServico, javax.swing.GroupLayout.Alignment.LEADING, 0, 311, Short.MAX_VALUE)
                            .addComponent(txfQuantidadeHoras, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfObservacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch3))
                            .addComponent(cbxPrestadorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(10, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPrestadorServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfQuantidadeHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 340, 370));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("TIPOS DE SERVIÇOS");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Avaliação do Imóvel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Consiste no conhecimento do imóvel e na");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, -1));

        jLabel13.setText("pesquisa detalhada da condição/estado");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, -1));

        jLabel14.setText("de um imóvel.");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 229, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 280, 90));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vistoria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("É uma avaliação feita com o objetivo de");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, -1));

        jLabel8.setText("identificar qualquer possível problema na ");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 270, -1));

        jLabel9.setText("infraestrutura do imóvel.");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, -1));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 280, 90));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Análise Cadastral", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("É avaliado a idoneidade econômica e ");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 244, -1));

        jLabel11.setText("financeira dos locatários e fiador.");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 244, -1));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 270, 70));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/origami__1_-removebg-preview1.png"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 230, 70));

        jTabbedPane3.addTab("CONTRATAR", jPanel4);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/binoculars.png"))); // NOI18N
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updated.png"))); // NOI18N
        jButton3.setText("ATUALIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton4.setText("DELETAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel16.setText("Digite o CNPJ");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/origami__1_-removebg-preview1.png"))); // NOI18N
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 220, 97));
        jPanel3.add(txtNomeEmpresa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 328, -1));

        jLabel17.setText("Empresa");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 7, -1, -1));
        jPanel3.add(txtPrestadorServico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 77, 328, -1));

        jLabel18.setText("Prestador de Serviço");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 59, -1, -1));
        jPanel3.add(txtTipoServico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 129, 328, -1));

        jLabel19.setText("Tipo de Serviço");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 111, -1, -1));
        jPanel3.add(txtQuantidadeHoras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 180, 328, -1));

        jLabel20.setText("Quantidade de Horas");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 157, -1, -1));
        jPanel3.add(txtObservacao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 230, 328, 40));

        jLabel21.setText("Observação");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 208, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfCadastroCnpj2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfCadastroCnpj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("CONSULTAR", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void btnSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch3ActionPerformed
        this.conectar.conectaBanco();

        String consultaCnpj = this.txtCnpj.getText();

        try {
            this.conectar.executarSQL(
                    "SELECT "
                    + "cnpj"
                    + " FROM"
                    + " cadastroEmpresa"
                    + " WHERE"
                    + " cnpj = '" + consultaCnpj + "';"
            );
            while (this.conectar.getResultSet().next()) {
                cadastroEmpresa.setCnpj(this.conectar.getResultSet().getString(1));
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar Empresa: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar Empresa!");

        } finally {
            if (cadastroEmpresa.getCnpj() == null) {
                JOptionPane.showMessageDialog(null, "Empresa não encontrada!");
            } else {
                txtCnpj.setText(cadastroEmpresa.getCnpj());
            }
            this.conectar.fechaBanco();
        }
    }//GEN-LAST:event_btnSearch3ActionPerformed

    private void cbxPrestadorServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPrestadorServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPrestadorServicoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.conectar.conectaBanco();
        cbxPrestadorServico.removeAllItems();

        try {
            this.conectar.executarSQL(
                    "SELECT "
                    + "nome,"
                    + "cpf"
                    + " FROM"
                    + " cadastroFuncionarioEmpresa"
            );
            while (this.conectar.getResultSet().next()) {
                cbxPrestadorServico.addItem(this.conectar.getResultSet().getString(1));
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar prestador: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar Prestador!");

        } finally {
            this.conectar.fechaBanco();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.conectar.conectaBanco();

        String consultaCnpj = this.txfCadastroCnpj2.getText();

        try {
            this.conectar.executarSQL(
                    "SELECT cnpj, nomeEmpresa, prestadorServico, tipoServico, quantidadeHoras, observacoes FROM contratar WHERE cnpj = '" + consultaCnpj + "'" + ";"
            );
            while (this.conectar.getResultSet().next()) {
                contratar.setCnpj(this.conectar.getResultSet().getString(1));
                contratar.setNomeEmpresa(this.conectar.getResultSet().getString(2));
                contratar.setPrestadorServico(this.conectar.getResultSet().getString(3));
                contratar.setTipoServico(this.conectar.getResultSet().getString(4));
                contratar.setQuantidadeHoras(this.conectar.getResultSet().getString(5));
                contratar.setObservacoes(this.conectar.getResultSet().getString(6));
            }
            if (cadastroEmpresa.getCnpj() == "") {
                JOptionPane.showMessageDialog(null, "Empresa não encontrada!");
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Empresa " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar Empresa!");

        } finally {
            txfCadastroCnpj2.setText(contratar.getCnpj());
            txtNomeEmpresa2.setText(contratar.getNomeEmpresa());
            txtPrestadorServico2.setText(contratar.getPrestadorServico());
            txtTipoServico2.setText(contratar.getTipoServico());
            txtQuantidadeHoras2.setText(contratar.getQuantidadeHoras());
            txtObservacao2.setText(contratar.getObservacoes());

            this.conectar.fechaBanco();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.conectar.conectaBanco();

        contratar.setCnpj(txtCnpj.getText());
        contratar.setNomeEmpresa(txtNomeEmpresa.getText());
        cadastroFuncionarioEmpresa.setNome((String) cbxPrestadorServico.getSelectedItem().toString());
        contratar.setTipoServico((String) cbxTipoServico.getSelectedItem().toString());
        contratar.setQuantidadeHoras(txfQuantidadeHoras.getText());
        contratar.setObservacoes(txfObservacao.getText());

        try {
            this.conectar.insertSQL("INSERT INTO contratar ("
                    + "cnpj,"
                    + "nomeEmpresa,"
                    + "prestadorServico,"
                    + "tipoServico,"
                    + "quantidadeHoras,"
                    + "observacoes) VALUES ("
                    + "'" + contratar.getCnpj() + "',"
                    + "'" + contratar.getNomeEmpresa() + "',"
                    + "'" + contratar.getPrestadorServico() + "',"
                    + "'" + contratar.getTipoServico() + "',"
                    + "'" + contratar.getQuantidadeHoras() + "',"
                    + "'" + contratar.getObservacoes() + "'"
                    + ");");
            JOptionPane.showMessageDialog(null, "contrato realizado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao realizar Contrato: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao realizar o contrato!");
        } finally {
            this.conectar.fechaBanco();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.conectar.conectaBanco();

        String deleteCnpj = this.txfCadastroCnpj2.getText();

        try {
            this.conectar.updateSQL(
                    "DELETE FROM contratar "
                    + "WHERE cnpj = '" + deleteCnpj + "';"
            );
            JOptionPane.showMessageDialog(null, "Empresa removida!");
        } catch (Exception e) {
            System.out.println("Erro ao deletar empresa: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao deletar empresa!");

        } finally {
            ClearData();
            this.conectar.fechaBanco();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        contratar.setCnpj(txtCnpj.getText());
        contratar.setNomeEmpresa(txtNomeEmpresa.getText());
        cadastroFuncionarioEmpresa.setNome((String) cbxPrestadorServico.getSelectedItem());
        contratar.setTipoServico((String) cbxTipoServico.getSelectedItem().toString());
        contratar.setQuantidadeHoras(txfQuantidadeHoras.getText());
        contratar.setObservacoes(txfObservacao.getText());

        this.conectar.conectaBanco();
        try {
            this.conectar.updateSQL(
                    "UPDATE contratar SET "
                    + "cnpj = '" + contratar.getCnpj() + "',"
                    + "nomeEmpresa = '" + contratar.getNomeEmpresa() + "',"
                    + "prestadorServico = '" + contratar.getPrestadorServico() + "',"
                    + "tipoServico = '" + contratar.getTipoServico() + "',"
                    + "quantidadeHoras = '" + contratar.getQuantidadeHoras() + "',"
                    + "observacoes = '" + contratar.getObservacoes() + "'"
                    + " WHERE cnpj = '" + contratar.getCnpj() + "';"
            );
            JOptionPane.showMessageDialog(null, "Empresa atualizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar a empresa: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a empresa!");

        } finally {
            ClearData();
            this.conectar.fechaBanco();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ClearData() {
        txfCadastroCnpj2.setText("");
        txtNomeEmpresa2.setText("");
        txtPrestadorServico2.setText("");
        txtTipoServico2.setText("");
        txtQuantidadeHoras2.setText("");
        txtObservacao2.setText("");

    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaContratar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaContratar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaContratar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaContratar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaContratar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton btnSearch3;
    private javax.swing.JComboBox<String> cbxPrestadorServico;
    private javax.swing.JComboBox<String> cbxTipoServico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField txfCadastroCnpj2;
    private javax.swing.JTextField txfObservacao;
    private javax.swing.JTextField txfQuantidadeHoras;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtNomeEmpresa;
    private javax.swing.JTextField txtNomeEmpresa2;
    private javax.swing.JTextField txtObservacao2;
    private javax.swing.JTextField txtPrestadorServico2;
    private javax.swing.JTextField txtQuantidadeHoras2;
    private javax.swing.JTextField txtTipoServico2;
    // End of variables declaration//GEN-END:variables
}
