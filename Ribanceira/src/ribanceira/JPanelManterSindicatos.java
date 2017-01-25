/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import DAO.Sindicato;
import controladores.G_ConvencaoColetiva;
import controladores.G_Sindicato;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author christian
 */
public class JPanelManterSindicatos extends javax.swing.JPanel {

    /**
     * Creates new form JPanelManterSindicatos
     */
    
    ArrayList<Sindicato> listaSindicato;
    CardLayout card;
    Sindicato sindicato;
    
    public JPanelManterSindicatos(int i) {
        initComponents();
        jTabbedPaneManterSindicato.setSelectedIndex(i);
        DefaultTableModel tableModel = (DefaultTableModel) jTableBuscaSindicato.getModel();
        tableModel.setNumRows(0);
        listaSindicato = new G_Sindicato().getListaSindicato();
        for (Sindicato s : listaSindicato) {
            tableModel.addRow(new Object[]{s.getNome(), s.getCodigo(), s.getEndereco(), s.getTelefone()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTabbedPaneManterSindicato = new javax.swing.JTabbedPane();
        jPanelAlterar = new javax.swing.JPanel();
        jPanelCadastrar1 = new javax.swing.JPanel();
        jLabelNomeSindicato3 = new javax.swing.JLabel();
        jTextFieldNomeSindicato2 = new javax.swing.JTextField();
        jLabelRamoAtividade2 = new javax.swing.JLabel();
        jLabelCodigoEntidade2 = new javax.swing.JLabel();
        jTextFieldCodigoEntidade2 = new javax.swing.JTextField();
        jLabelEndereco2 = new javax.swing.JLabel();
        jButtonSalvarCadastro1 = new javax.swing.JButton();
        jButtonCancelar2 = new javax.swing.JButton();
        jTextFieldEndereco2 = new javax.swing.JTextField();
        jLabelTelefone2 = new javax.swing.JLabel();
        jTextFieldTelefon2 = new javax.swing.JTextField();
        jTextFieldRamoAtividade2 = new javax.swing.JTextField();
        jPanelCadastrar = new javax.swing.JPanel();
        jLabelNomeSindicato = new javax.swing.JLabel();
        jTextFieldNomeSindicato = new javax.swing.JTextField();
        jLabelRamoAtividade = new javax.swing.JLabel();
        jLabelCodigoEntidade = new javax.swing.JLabel();
        jTextFieldCodigoEntidade = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jButtonSalvarCadastro = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefon = new javax.swing.JTextField();
        jTextFieldRamoAtividade = new javax.swing.JTextField();
        jPanelBuscar = new javax.swing.JPanel();
        jButtonAlterarSindicato = new javax.swing.JButton();
        jButtonExcluirSindicato = new javax.swing.JButton();
        jButtonCadastrarSindicato = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBuscaSindicato = new javax.swing.JTable();
        jButtonAtualizarList = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jLabelNomeSindicato3.setText("Nome do sindicato:");

        jTextFieldNomeSindicato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeSindicato2ActionPerformed(evt);
            }
        });

        jLabelRamoAtividade2.setText("Ramo de  atividade:");

        jLabelCodigoEntidade2.setText("Código da Entidade:");

        jTextFieldCodigoEntidade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoEntidade2ActionPerformed(evt);
            }
        });

        jLabelEndereco2.setText("Endereço:");

        jButtonSalvarCadastro1.setText("Salvar");
        jButtonSalvarCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarCadastro1ActionPerformed(evt);
            }
        });

        jButtonCancelar2.setText("Cancelar");
        jButtonCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar2ActionPerformed(evt);
            }
        });

        jLabelTelefone2.setText("Telefone:");

        jTextFieldRamoAtividade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRamoAtividade2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastrar1Layout = new javax.swing.GroupLayout(jPanelCadastrar1);
        jPanelCadastrar1.setLayout(jPanelCadastrar1Layout);
        jPanelCadastrar1Layout.setHorizontalGroup(
            jPanelCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastrar1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonSalvarCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastrar1Layout.createSequentialGroup()
                        .addGroup(jPanelCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigoEntidade2)
                            .addComponent(jLabelNomeSindicato3)
                            .addComponent(jLabelRamoAtividade2)
                            .addComponent(jLabelEndereco2)
                            .addComponent(jLabelTelefone2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTelefon2)
                            .addComponent(jTextFieldEndereco2)
                            .addComponent(jTextFieldRamoAtividade2)
                            .addComponent(jTextFieldNomeSindicato2)
                            .addGroup(jPanelCadastrar1Layout.createSequentialGroup()
                                .addComponent(jTextFieldCodigoEntidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelCadastrar1Layout.setVerticalGroup(
            jPanelCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrar1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoEntidade2)
                    .addComponent(jTextFieldCodigoEntidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeSindicato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeSindicato3))
                .addGap(29, 29, 29)
                .addGroup(jPanelCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRamoAtividade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRamoAtividade2))
                .addGap(35, 35, 35)
                .addGroup(jPanelCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereco2))
                .addGap(26, 26, 26)
                .addGroup(jPanelCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone2))
                .addGap(178, 178, 178)
                .addGroup(jPanelCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelAlterarLayout = new javax.swing.GroupLayout(jPanelAlterar);
        jPanelAlterar.setLayout(jPanelAlterarLayout);
        jPanelAlterarLayout.setHorizontalGroup(
            jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAlterarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelAlterarLayout.setVerticalGroup(
            jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
            .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAlterarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPaneManterSindicato.addTab("Alterar", jPanelAlterar);

        jLabelNomeSindicato.setText("Nome do sindicato:");

        jTextFieldNomeSindicato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeSindicatoActionPerformed(evt);
            }
        });

        jLabelRamoAtividade.setText("Ramo de  atividade:");

        jLabelCodigoEntidade.setText("Código da Entidade:");

        jLabelEndereco.setText("Endereço:");

        jButtonSalvarCadastro.setText("Salvar");
        jButtonSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarCadastroActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelTelefone.setText("Telefone:");

        jTextFieldRamoAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRamoAtividadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastrarLayout = new javax.swing.GroupLayout(jPanelCadastrar);
        jPanelCadastrar.setLayout(jPanelCadastrarLayout);
        jPanelCadastrarLayout.setHorizontalGroup(
            jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonSalvarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                        .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigoEntidade)
                            .addComponent(jLabelNomeSindicato)
                            .addComponent(jLabelRamoAtividade)
                            .addComponent(jLabelEndereco)
                            .addComponent(jLabelTelefone))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTelefon)
                            .addComponent(jTextFieldEndereco)
                            .addComponent(jTextFieldRamoAtividade)
                            .addComponent(jTextFieldNomeSindicato)
                            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                                .addComponent(jTextFieldCodigoEntidade, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelCadastrarLayout.setVerticalGroup(
            jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoEntidade)
                    .addComponent(jTextFieldCodigoEntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeSindicato))
                .addGap(29, 29, 29)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRamoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRamoAtividade))
                .addGap(35, 35, 35)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereco))
                .addGap(26, 26, 26)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone))
                .addGap(178, 178, 178)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPaneManterSindicato.addTab("Cadastrar", jPanelCadastrar);

        jButtonAlterarSindicato.setText("Alterar");
        jButtonAlterarSindicato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarSindicatoActionPerformed(evt);
            }
        });

        jButtonExcluirSindicato.setText("Excluir sindicato");
        jButtonExcluirSindicato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirSindicatoActionPerformed(evt);
            }
        });

        jButtonCadastrarSindicato.setText("Cadastrar novo sindicato");
        jButtonCadastrarSindicato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarSindicatoActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTableBuscaSindicato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Código", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBuscaSindicato.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableBuscaSindicato);
        if (jTableBuscaSindicato.getColumnModel().getColumnCount() > 0) {
            jTableBuscaSindicato.getColumnModel().getColumn(0).setResizable(false);
            jTableBuscaSindicato.getColumnModel().getColumn(1).setResizable(false);
            jTableBuscaSindicato.getColumnModel().getColumn(2).setResizable(false);
            jTableBuscaSindicato.getColumnModel().getColumn(3).setResizable(false);
        }

        jButtonAtualizarList.setText("Atualizar Lista");
        jButtonAtualizarList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscarLayout = new javax.swing.GroupLayout(jPanelBuscar);
        jPanelBuscar.setLayout(jPanelBuscarLayout);
        jPanelBuscarLayout.setHorizontalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBuscarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addGroup(jPanelBuscarLayout.createSequentialGroup()
                        .addComponent(jButtonExcluirSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButtonAtualizarList, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrarSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonAlterarSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanelBuscarLayout.setVerticalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterarSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrarSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizarList, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneManterSindicato.addTab("Buscar", jPanelBuscar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneManterSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneManterSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCadastrarSindicatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarSindicatoActionPerformed
        // TODO add your handling code here:
        jTabbedPaneManterSindicato.setSelectedIndex(1);
        
        new G_Sindicato().cadastrarSindicato(jTextFieldCodigoEntidade.getText(),
                                             jTextFieldNomeSindicato.getText(),
                                             jTextFieldRamoAtividade.getText(), 
                                             jTextFieldEndereco.getText(),
                                             jTextFieldTelefon.getText());
        JOptionPane.showMessageDialog(this, "Sindicato cadastrado com sucesso!","Cadastro de Sindicato",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCadastrarSindicatoActionPerformed

    private void jTextFieldNomeSindicatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSindicatoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldNomeSindicatoActionPerformed

    private void jButtonSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCadastroActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldNomeSindicato.getText().equals("") && !jTextFieldRamoAtividade.getText().equals("")) {
            
            new G_Sindicato().cadastrarSindicato(jTextFieldCodigoEntidade.getText(),
                                                 jTextFieldNomeSindicato.getText(),
                                                 jTextFieldRamoAtividade.getText(), 
                                                 jTextFieldEndereco.getText(),
                                                 jTextFieldTelefon.getText());
            JOptionPane.showMessageDialog(this, "Sindicato cadastrado com sucesso!","Cadastro de Sindicato",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
        
        else {
            
            JOptionPane.showMessageDialog(this, "Error - Falta de dados à inserir","Erro ao alterar",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonSalvarCadastroActionPerformed

    private void jTextFieldRamoAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRamoAtividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRamoAtividadeActionPerformed

    private void jButtonAtualizarListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarListActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) jTableBuscaSindicato.getModel();
        tableModel.setNumRows(0);
        listaSindicato = new G_Sindicato().getListaSindicato();
        for (Sindicato s : listaSindicato) {
            tableModel.addRow(new Object[]{s.getNome(), s.getCodigo(), s.getEndereco(), s.getTelefone()});
        }
    }//GEN-LAST:event_jButtonAtualizarListActionPerformed

    private void jButtonAlterarSindicatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarSindicatoActionPerformed
        // TODO add your handling code here:
        try {
            
            sindicato = listaSindicato.get(jTableBuscaSindicato.getSelectedRow());
            jTabbedPaneManterSindicato.setSelectedIndex(2);

            jTextFieldCodigoEntidade2.setText(sindicato.getCodigo());
            jTextFieldNomeSindicato2.setText(sindicato.getNome());
            jTextFieldRamoAtividade2.setText(sindicato.getRamoAtividade());
            jTextFieldEndereco2.setText(sindicato.getEndereco());
            jTextFieldTelefon2.setText(sindicato.getTelefone());
        }
        
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, "Error - Falta de dados à inserir","Erro ao alterar",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonAlterarSindicatoActionPerformed

    private void jButtonExcluirSindicatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirSindicatoActionPerformed
        // TODO add your handling code here:
        try{
            
            sindicato = listaSindicato.get(jTableBuscaSindicato.getSelectedRow());

            jTextFieldCodigoEntidade2.setText(sindicato.getCodigo());
            jTextFieldNomeSindicato2.setText(sindicato.getNome());
            jTextFieldRamoAtividade2.setText(sindicato.getRamoAtividade());
            jTextFieldEndereco2.setText(sindicato.getEndereco());
            jTextFieldTelefon2.setText(sindicato.getTelefone());

            new G_Sindicato().ExcluirSindicato(sindicato);
            JOptionPane.showMessageDialog(this, "Sindicato excluído com sucesso!","Exclusão de Sindicato",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
        
        catch(Exception e) {
            
            JOptionPane.showMessageDialog(this, "Error - Sindicato relacionado com uma convenção coletiva","Exclusão de Sindicato",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonExcluirSindicatoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldNomeSindicato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSindicato2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeSindicato2ActionPerformed

    private void jButtonSalvarCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarCadastro1ActionPerformed

    private void jButtonCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelar2ActionPerformed

    private void jTextFieldRamoAtividade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRamoAtividade2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRamoAtividade2ActionPerformed

    private void jTextFieldCodigoEntidade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoEntidade2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoEntidade2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarSindicato;
    private javax.swing.JButton jButtonAtualizarList;
    private javax.swing.JButton jButtonCadastrarSindicato;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCancelar2;
    private javax.swing.JButton jButtonExcluirSindicato;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvarCadastro;
    private javax.swing.JButton jButtonSalvarCadastro1;
    private javax.swing.JLabel jLabelCodigoEntidade;
    private javax.swing.JLabel jLabelCodigoEntidade2;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEndereco2;
    private javax.swing.JLabel jLabelNomeSindicato;
    private javax.swing.JLabel jLabelNomeSindicato3;
    private javax.swing.JLabel jLabelRamoAtividade;
    private javax.swing.JLabel jLabelRamoAtividade2;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTelefone2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanelAlterar;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelCadastrar;
    private javax.swing.JPanel jPanelCadastrar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneManterSindicato;
    private javax.swing.JTable jTableBuscaSindicato;
    private javax.swing.JTextField jTextFieldCodigoEntidade;
    private javax.swing.JTextField jTextFieldCodigoEntidade2;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEndereco2;
    private javax.swing.JTextField jTextFieldNomeSindicato;
    private javax.swing.JTextField jTextFieldNomeSindicato2;
    private javax.swing.JTextField jTextFieldRamoAtividade;
    private javax.swing.JTextField jTextFieldRamoAtividade2;
    private javax.swing.JTextField jTextFieldTelefon;
    private javax.swing.JTextField jTextFieldTelefon2;
    // End of variables declaration//GEN-END:variables

    private void setTitle(String ribanceira_RH__Cadastrar_Sindicato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
