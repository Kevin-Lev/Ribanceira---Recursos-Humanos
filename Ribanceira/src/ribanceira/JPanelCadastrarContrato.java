/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import DAO.Empresa;
import DAO.Funcionario;
import controladores.G_Contrato;
import controladores.G_Empresa;
import controladores.G_Funcionario;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alessandra
 */
public class JPanelCadastrarContrato extends javax.swing.JPanel {

    /**
     * Creates new form JPanelCadastrarContrato
     */
    ArrayList<Funcionario> listaFuncionarios;
    ArrayList<Empresa> listaEmpresas;

    boolean experiencia = false;
    boolean valeTransporte = false;
    boolean valeRefeicao = false;

    public JPanelCadastrarContrato() {
        initComponents();

        listaFuncionarios = new G_Funcionario().getListaFuncionario();
        for (Funcionario f : listaFuncionarios) {
            if(f.isAtivo()){
                jComboBoxListaFuncionarios.addItem(f.getNome());
            }
        }

        listaEmpresas = new G_Empresa().getListaEmpresa();
        for (Empresa e : listaEmpresas) {
            jComboBoxListaEmpresas.addItem(e.getNomeEmpresa());
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

        jLabelFuncionarioContrato = new javax.swing.JLabel();
        jLabelEmpresaContrato = new javax.swing.JLabel();
        jLabelCargaHorariaContrato = new javax.swing.JLabel();
        jLabelHorasExtrasContrato = new javax.swing.JLabel();
        jLabelComissaoContrato = new javax.swing.JLabel();
        jLabelDuracaoContrato = new javax.swing.JLabel();
        jLabelExperienciaContrato = new javax.swing.JLabel();
        jLabelFeriasContrato = new javax.swing.JLabel();
        jLabelBaseSalarialContrato = new javax.swing.JLabel();
        jLabelValeTransporteContrato = new javax.swing.JLabel();
        jLabelValeRefeicao = new javax.swing.JLabel();
        jButtonSalvarContrato = new javax.swing.JButton();
        jTextFieldCargaHorariaContrato = new javax.swing.JTextField();
        jTextFieldHorasExtrasContrato = new javax.swing.JTextField();
        jTextFieldComissaoContrato = new javax.swing.JTextField();
        jTextFieldDuracaoContrato = new javax.swing.JTextField();
        jTextFieldFeriasContrato = new javax.swing.JTextField();
        jComboBoxExperienciaContrato = new javax.swing.JComboBox<>();
        jComboBoxValeTransporteContrato = new javax.swing.JComboBox<>();
        jComboBoxValeRefeicaoContrato = new javax.swing.JComboBox<>();
        jComboBoxListaFuncionarios = new javax.swing.JComboBox<>();
        jComboBoxListaEmpresas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelHoraEntradaContrato = new javax.swing.JLabel();
        jTextFieldHoraEntradaContrato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldHoraSaidaContrato = new javax.swing.JTextField();
        jTextFieldBaseSalarialContrato = new javax.swing.JTextField();
        jLabelExperienciaContrato1 = new javax.swing.JLabel();
        jTextFieldImpostosContrato = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabelFuncionarioContrato.setText("Funcionário: *");

        jLabelEmpresaContrato.setText("Empresa: *");

        jLabelCargaHorariaContrato.setText("Carga horária: *");

        jLabelHorasExtrasContrato.setText("Horas extras: ");

        jLabelComissaoContrato.setText("Comissão: ");

        jLabelDuracaoContrato.setText("Duração (meses):");

        jLabelExperienciaContrato.setText("Experiência: *");

        jLabelFeriasContrato.setText("Férias (dias): *");

        jLabelBaseSalarialContrato.setText("Base salarial:");

        jLabelValeTransporteContrato.setText("Vale transporte: *");

        jLabelValeRefeicao.setText("Vale refeição: *");

        jButtonSalvarContrato.setText("Salvar");
        jButtonSalvarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarContratoActionPerformed(evt);
            }
        });

        jTextFieldComissaoContrato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldComissaoContratoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldComissaoContratoFocusLost(evt);
            }
        });
        jTextFieldComissaoContrato.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldComissaoContratoInputMethodTextChanged(evt);
            }
        });
        jTextFieldComissaoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComissaoContratoActionPerformed(evt);
            }
        });

        jComboBoxExperienciaContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxExperienciaContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxExperienciaContratoMouseClicked(evt);
            }
        });

        jComboBoxValeTransporteContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxValeTransporteContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxValeTransporteContratoMouseClicked(evt);
            }
        });
        jComboBoxValeTransporteContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxValeTransporteContratoActionPerformed(evt);
            }
        });

        jComboBoxValeRefeicaoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxValeRefeicaoContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxValeRefeicaoContratoMouseClicked(evt);
            }
        });

        jComboBoxListaFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxListaFuncionariosMouseClicked(evt);
            }
        });

        jComboBoxListaEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxListaEmpresasMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("* Campos obrigatórios");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel2.setText("Formato: 0.00");

        jLabelHoraEntradaContrato.setText("Hora de entrada:");

        jLabel3.setText("Hora de saída:");

        jTextFieldBaseSalarialContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBaseSalarialContratoActionPerformed(evt);
            }
        });

        jLabelExperienciaContrato1.setText("Impostos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelExperienciaContrato1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmpresaContrato)
                            .addComponent(jLabelFuncionarioContrato)
                            .addComponent(jLabelCargaHorariaContrato)
                            .addComponent(jLabelComissaoContrato))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDuracaoContrato)
                                    .addComponent(jLabelHorasExtrasContrato)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabelFeriasContrato)
                                    .addComponent(jLabelValeRefeicao))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldHorasExtrasContrato)
                                            .addComponent(jTextFieldDuracaoContrato)
                                            .addComponent(jTextFieldHoraSaidaContrato)
                                            .addComponent(jTextFieldFeriasContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jComboBoxValeRefeicaoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jComboBoxListaFuncionarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalvarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldCargaHorariaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelHoraEntradaContrato)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldHoraEntradaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldComissaoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextFieldBaseSalarialContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelBaseSalarialContrato)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxListaEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBoxExperienciaContrato, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                                    .addComponent(jTextFieldImpostosContrato, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelValeTransporteContrato)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxValeTransporteContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addComponent(jLabelExperienciaContrato))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFuncionarioContrato)
                    .addComponent(jComboBoxListaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmpresaContrato)
                    .addComponent(jComboBoxListaEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCargaHorariaContrato)
                            .addComponent(jTextFieldCargaHorariaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHoraEntradaContrato)
                            .addComponent(jTextFieldHoraEntradaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelComissaoContrato)
                            .addComponent(jTextFieldComissaoContrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHorasExtrasContrato)
                            .addComponent(jTextFieldHorasExtrasContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldHoraSaidaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDuracaoContrato)
                            .addComponent(jTextFieldDuracaoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBaseSalarialContrato)
                    .addComponent(jTextFieldBaseSalarialContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFeriasContrato)
                    .addComponent(jTextFieldFeriasContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValeTransporteContrato)
                    .addComponent(jComboBoxExperienciaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelExperienciaContrato)
                    .addComponent(jComboBoxValeTransporteContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExperienciaContrato1)
                    .addComponent(jTextFieldImpostosContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValeRefeicao)
                    .addComponent(jComboBoxValeRefeicaoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarContrato)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxListaFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxListaFuncionariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxListaFuncionariosMouseClicked

    private void jComboBoxListaEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxListaEmpresasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxListaEmpresasMouseClicked

    private void jButtonSalvarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarContratoActionPerformed
        // TODO add your handling code here:
        Empresa emp;
        Funcionario func;

        emp = listaEmpresas.get(jComboBoxListaEmpresas.getSelectedIndex());
        func = listaFuncionarios.get(jComboBoxListaFuncionarios.getSelectedIndex());

        new G_Contrato().salvaContrato(emp, func,
            Float.parseFloat(jTextFieldCargaHorariaContrato.getText()),
            jTextFieldHoraEntradaContrato.getText(),
            jTextFieldHoraSaidaContrato.getText(),
            Float.parseFloat(jTextFieldHorasExtrasContrato.getText()),
            Float.parseFloat(jTextFieldComissaoContrato.getText()),
            Float.parseFloat(jTextFieldDuracaoContrato.getText()),
            experiencia,
            Integer.parseInt(jTextFieldFeriasContrato.getText()),
            valeTransporte,
            valeRefeicao,
            Float.parseFloat(jTextFieldBaseSalarialContrato.getText()), true);
        JOptionPane.showMessageDialog(this, "Contrato cadastrado com sucesso!", "Cadastro de contrato", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonSalvarContratoActionPerformed

    private void jComboBoxExperienciaContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxExperienciaContratoMouseClicked
        // TODO add your handling code here:
        if (jComboBoxExperienciaContrato.getSelectedItem() == "Sim") {
            experiencia = true;
        } else {
            experiencia = false;
        }
    }//GEN-LAST:event_jComboBoxExperienciaContratoMouseClicked

    private void jComboBoxValeTransporteContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxValeTransporteContratoMouseClicked
        // TODO add your handling code here:
        if (jComboBoxValeTransporteContrato.getSelectedItem() == "Sim") {
            valeTransporte = true;
        } else {
            valeTransporte = false;
        }
    }//GEN-LAST:event_jComboBoxValeTransporteContratoMouseClicked

    private void jComboBoxValeRefeicaoContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxValeRefeicaoContratoMouseClicked
        // TODO add your handling code here:
        if (jComboBoxValeRefeicaoContrato.getSelectedItem() == "Sim") {
            valeRefeicao = true;
        } else {
            valeRefeicao = false;
        }
    }//GEN-LAST:event_jComboBoxValeRefeicaoContratoMouseClicked

    private void jTextFieldComissaoContratoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldComissaoContratoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComissaoContratoFocusGained

    private void jTextFieldComissaoContratoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldComissaoContratoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComissaoContratoFocusLost

    private void jTextFieldComissaoContratoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldComissaoContratoInputMethodTextChanged
        // TODO add your handling code here:        
    }//GEN-LAST:event_jTextFieldComissaoContratoInputMethodTextChanged

    private void jTextFieldComissaoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComissaoContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComissaoContratoActionPerformed

    private void jTextFieldBaseSalarialContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBaseSalarialContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBaseSalarialContratoActionPerformed

    private void jComboBoxValeTransporteContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxValeTransporteContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxValeTransporteContratoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarContrato;
    private javax.swing.JComboBox<String> jComboBoxExperienciaContrato;
    private javax.swing.JComboBox<String> jComboBoxListaEmpresas;
    private javax.swing.JComboBox<String> jComboBoxListaFuncionarios;
    private javax.swing.JComboBox<String> jComboBoxValeRefeicaoContrato;
    private javax.swing.JComboBox<String> jComboBoxValeTransporteContrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBaseSalarialContrato;
    private javax.swing.JLabel jLabelCargaHorariaContrato;
    private javax.swing.JLabel jLabelComissaoContrato;
    private javax.swing.JLabel jLabelDuracaoContrato;
    private javax.swing.JLabel jLabelEmpresaContrato;
    private javax.swing.JLabel jLabelExperienciaContrato;
    private javax.swing.JLabel jLabelExperienciaContrato1;
    private javax.swing.JLabel jLabelFeriasContrato;
    private javax.swing.JLabel jLabelFuncionarioContrato;
    private javax.swing.JLabel jLabelHoraEntradaContrato;
    private javax.swing.JLabel jLabelHorasExtrasContrato;
    private javax.swing.JLabel jLabelValeRefeicao;
    private javax.swing.JLabel jLabelValeTransporteContrato;
    private javax.swing.JTextField jTextFieldBaseSalarialContrato;
    private javax.swing.JTextField jTextFieldCargaHorariaContrato;
    private javax.swing.JTextField jTextFieldComissaoContrato;
    private javax.swing.JTextField jTextFieldDuracaoContrato;
    private javax.swing.JTextField jTextFieldFeriasContrato;
    private javax.swing.JTextField jTextFieldHoraEntradaContrato;
    private javax.swing.JTextField jTextFieldHoraSaidaContrato;
    private javax.swing.JTextField jTextFieldHorasExtrasContrato;
    private javax.swing.JTextField jTextFieldImpostosContrato;
    // End of variables declaration//GEN-END:variables
}
