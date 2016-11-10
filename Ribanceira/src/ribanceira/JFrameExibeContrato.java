/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import DAO.Contrato;
import controladores.G_Contrato;
import javax.swing.JOptionPane;

/**
 *
 * @author Alessandra
 */
public class JFrameExibeContrato extends javax.swing.JFrame {

    /**
     * Creates new form JFrameExibeContrato
     */
    
    Contrato contrato;
    boolean abonoPecuniario;
    boolean experiencia;
    boolean valeTransporte;
    boolean valeRefeicao;
    
    public JFrameExibeContrato(Contrato c) {
        initComponents();
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        jTextFieldNomeFuncionarioExibeContrato.setEditable(false);
        jTextFieldNomeEmpresaExibeContrato.setEditable(false);
        jTextFieldCargaHorariaExibeContrato.setEditable(false);
        jTextFieldComissaoExibeContrato.setEditable(false);
        jTextFieldDuracaoExibeContrato.setEditable(false);
        jTextFieldFeriasExibeContrato.setEditable(false);
        jTextFieldHorasExtrasExibeContrato.setEditable(false);
        jComboBoxAbonoPecuniarioExibeContrato.setEditable(false);
        jComboBoxExperienciaExibeContrato.setEditable(false);
        jComboBoxValeRefeicaoExibeContrato.setEditable(false);
        jComboBoxValeTransporteExibeContrato.setEditable(false);
        
        contrato = c;
        abonoPecuniario = c.isAbonoPecuniario();
        experiencia = c.isExperiencia();
        valeTransporte = c.isValeTransporte();
        valeRefeicao = c.isValeRefeicao();
        
        jTextFieldNomeFuncionarioExibeContrato.setText(c.getFuncionario().getNome());
        jTextFieldNomeEmpresaExibeContrato.setText(c.getEmpresa().getNomeEmpresa());
        jTextFieldCargaHorariaExibeContrato.setText(String.valueOf(c.getCargaHoraria()));
        jTextFieldComissaoExibeContrato.setText(String.valueOf(c.getComissao()));
        jTextFieldDuracaoExibeContrato.setText(String.valueOf(c.getDuracao()));
        jTextFieldFeriasExibeContrato.setText(String.valueOf(c.getFerias()));
        jTextFieldHorasExtrasExibeContrato.setText(String.valueOf(c.getHorasExtras()));
        if(abonoPecuniario) {
            jComboBoxAbonoPecuniarioExibeContrato.setSelectedItem("Sim");
        } else {
            jComboBoxAbonoPecuniarioExibeContrato.setSelectedItem("Não");
        }
        if(experiencia) {
            jComboBoxExperienciaExibeContrato.setSelectedItem("Sim");
        } else {
            jComboBoxExperienciaExibeContrato.setSelectedItem("Não");
        }
        if(valeTransporte) {
            jComboBoxValeTransporteExibeContrato.setSelectedItem("Sim");
        } else {
            jComboBoxValeTransporteExibeContrato.setSelectedItem("Não");
        }
        if(valeRefeicao) {
            jComboBoxValeRefeicaoExibeContrato.setSelectedItem("Sim");
        } else {
            jComboBoxValeRefeicaoExibeContrato.setSelectedItem("Não");
        }
    }

    private JFrameExibeContrato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxExperienciaExibeContrato = new javax.swing.JComboBox<>();
        jComboBoxAbonoPecuniarioExibeContrato = new javax.swing.JComboBox<>();
        jLabelHorasExtrasExibeContrato = new javax.swing.JLabel();
        jLabelDuracaoExibeContrato = new javax.swing.JLabel();
        jLabelFeriasExibeContrato = new javax.swing.JLabel();
        jTextFieldDuracaoExibeContrato = new javax.swing.JTextField();
        jTextFieldHorasExtrasExibeContrato = new javax.swing.JTextField();
        jTextFieldFeriasExibeContrato = new javax.swing.JTextField();
        jLabelValeTransporteExibeContrato = new javax.swing.JLabel();
        jComboBoxValeTransporteExibeContrato = new javax.swing.JComboBox<>();
        jLabelValeRefeicaoExibeContrato = new javax.swing.JLabel();
        jLabelNomeFuncionarioExibeContrato = new javax.swing.JLabel();
        jComboBoxValeRefeicaoExibeContrato = new javax.swing.JComboBox<>();
        jLabelNomeEmpresaExibeContrato = new javax.swing.JLabel();
        jLabelCargaHorariaExibeContrato = new javax.swing.JLabel();
        jLabelComissaoExibeContrato = new javax.swing.JLabel();
        jLabelExperienciaExibeContrato = new javax.swing.JLabel();
        jLabelAbonoPecuniarioExibeContrato = new javax.swing.JLabel();
        jTextFieldNomeEmpresaExibeContrato = new javax.swing.JTextField();
        jButtonAlterarExibeContrato = new javax.swing.JButton();
        jButtonSalvarAlteracoesExibeContrato = new javax.swing.JButton();
        jTextFieldNomeFuncionarioExibeContrato = new javax.swing.JTextField();
        jTextFieldCargaHorariaExibeContrato = new javax.swing.JTextField();
        jTextFieldComissaoExibeContrato = new javax.swing.JTextField();
        jButtonFecharExibeContrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxExperienciaExibeContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        jComboBoxAbonoPecuniarioExibeContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        jLabelHorasExtrasExibeContrato.setText("Horas extras:");

        jLabelDuracaoExibeContrato.setText("Duração (meses):");

        jLabelFeriasExibeContrato.setText("Férias (dias):");

        jLabelValeTransporteExibeContrato.setText("Vale transporte:");

        jComboBoxValeTransporteExibeContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        jLabelValeRefeicaoExibeContrato.setText("Vale refeição:");

        jLabelNomeFuncionarioExibeContrato.setText("Nome funcionário:");

        jComboBoxValeRefeicaoExibeContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        jLabelNomeEmpresaExibeContrato.setText("Nome empresa:");

        jLabelCargaHorariaExibeContrato.setText("Carga horária:");

        jLabelComissaoExibeContrato.setText("Comissão:");

        jLabelExperienciaExibeContrato.setText("Experiência:");

        jLabelAbonoPecuniarioExibeContrato.setText("Abono pecuniário:");

        jButtonAlterarExibeContrato.setText("Alterar");
        jButtonAlterarExibeContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarExibeContratoActionPerformed(evt);
            }
        });

        jButtonSalvarAlteracoesExibeContrato.setText("Salvar alterações");
        jButtonSalvarAlteracoesExibeContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAlteracoesExibeContratoActionPerformed(evt);
            }
        });

        jButtonFecharExibeContrato.setText("Fechar");
        jButtonFecharExibeContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharExibeContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeFuncionarioExibeContrato)
                    .addComponent(jLabelNomeEmpresaExibeContrato)
                    .addComponent(jLabelCargaHorariaExibeContrato)
                    .addComponent(jLabelComissaoExibeContrato)
                    .addComponent(jLabelExperienciaExibeContrato)
                    .addComponent(jLabelAbonoPecuniarioExibeContrato))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldNomeEmpresaExibeContrato, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomeFuncionarioExibeContrato)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonSalvarAlteracoesExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCargaHorariaExibeContrato)
                                    .addComponent(jTextFieldComissaoExibeContrato)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxExperienciaExibeContrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxAbonoPecuniarioExibeContrato, 0, 82, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                        .addComponent(jLabelValeTransporteExibeContrato)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelDuracaoExibeContrato)
                                            .addComponent(jLabelHorasExtrasExibeContrato)
                                            .addComponent(jLabelFeriasExibeContrato)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxValeTransporteExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelValeRefeicaoExibeContrato)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAlterarExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jButtonFecharExibeContrato))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldDuracaoExibeContrato)
                                        .addComponent(jTextFieldHorasExtrasExibeContrato)
                                        .addComponent(jTextFieldFeriasExibeContrato, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addComponent(jComboBoxValeRefeicaoExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFuncionarioExibeContrato)
                    .addComponent(jTextFieldNomeFuncionarioExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeEmpresaExibeContrato)
                    .addComponent(jTextFieldNomeEmpresaExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCargaHorariaExibeContrato)
                    .addComponent(jTextFieldCargaHorariaExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHorasExtrasExibeContrato)
                    .addComponent(jTextFieldHorasExtrasExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComissaoExibeContrato)
                    .addComponent(jTextFieldComissaoExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDuracaoExibeContrato)
                    .addComponent(jTextFieldDuracaoExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExperienciaExibeContrato)
                    .addComponent(jComboBoxExperienciaExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFeriasExibeContrato)
                    .addComponent(jTextFieldFeriasExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAbonoPecuniarioExibeContrato)
                    .addComponent(jComboBoxAbonoPecuniarioExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValeTransporteExibeContrato)
                    .addComponent(jComboBoxValeTransporteExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValeRefeicaoExibeContrato)
                    .addComponent(jComboBoxValeRefeicaoExibeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterarExibeContrato)
                    .addComponent(jButtonSalvarAlteracoesExibeContrato)
                    .addComponent(jButtonFecharExibeContrato))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarExibeContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarExibeContratoActionPerformed
        // TODO add your handling code here:
        jTextFieldCargaHorariaExibeContrato.setEditable(true);
        jTextFieldComissaoExibeContrato.setEditable(true);
        jTextFieldHorasExtrasExibeContrato.setEditable(true);
        jTextFieldDuracaoExibeContrato.setEditable(true);
        jTextFieldFeriasExibeContrato.setEditable(true);
        jComboBoxAbonoPecuniarioExibeContrato.setEditable(true);
        jComboBoxValeRefeicaoExibeContrato.setEditable(true);
        jComboBoxValeTransporteExibeContrato.setEditable(true);
    }//GEN-LAST:event_jButtonAlterarExibeContratoActionPerformed

    private void jButtonSalvarAlteracoesExibeContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAlteracoesExibeContratoActionPerformed
        // TODO add your handling code here:
        abonoPecuniario = (jComboBoxAbonoPecuniarioExibeContrato.getSelectedItem() == "Sim");
        valeRefeicao = (jComboBoxValeRefeicaoExibeContrato.getSelectedItem() == "Sim");
        valeTransporte = (jComboBoxValeTransporteExibeContrato.getSelectedItem() == "Sim");
        jTextFieldCargaHorariaExibeContrato.setEditable(false);
        jTextFieldComissaoExibeContrato.setEditable(false);
        jTextFieldHorasExtrasExibeContrato.setEditable(false);
        jTextFieldDuracaoExibeContrato.setEditable(false);
        jTextFieldFeriasExibeContrato.setEditable(false);
        jComboBoxAbonoPecuniarioExibeContrato.setEditable(false);
        jComboBoxValeRefeicaoExibeContrato.setEditable(false);
        jComboBoxValeTransporteExibeContrato.setEditable(false);
        contrato.setCargaHoraria(Float.parseFloat(jTextFieldCargaHorariaExibeContrato.getText()));
        contrato.setComissao(Float.parseFloat(jTextFieldComissaoExibeContrato.getText()));
        contrato.setHorasExtras(Float.parseFloat(jTextFieldHorasExtrasExibeContrato.getText()));
        contrato.setDuracao(Float.parseFloat(jTextFieldDuracaoExibeContrato.getText()));
        contrato.setFerias(Integer.parseInt(jTextFieldFeriasExibeContrato.getText()));
        contrato.setAbonoPecuniario(abonoPecuniario);
        contrato.setValeRefeicao(valeRefeicao);
        contrato.setValeTransporte(valeTransporte);
        new G_Contrato().atualizaContrato(contrato);
        JOptionPane.showMessageDialog(null, "Contrato alterado com sucesso!", "Alteração de Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonSalvarAlteracoesExibeContratoActionPerformed

    private void jButtonFecharExibeContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharExibeContratoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonFecharExibeContratoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameExibeContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameExibeContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameExibeContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameExibeContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameExibeContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarExibeContrato;
    private javax.swing.JButton jButtonFecharExibeContrato;
    private javax.swing.JButton jButtonSalvarAlteracoesExibeContrato;
    private javax.swing.JComboBox<String> jComboBoxAbonoPecuniarioExibeContrato;
    private javax.swing.JComboBox<String> jComboBoxExperienciaExibeContrato;
    private javax.swing.JComboBox<String> jComboBoxValeRefeicaoExibeContrato;
    private javax.swing.JComboBox<String> jComboBoxValeTransporteExibeContrato;
    private javax.swing.JLabel jLabelAbonoPecuniarioExibeContrato;
    private javax.swing.JLabel jLabelCargaHorariaExibeContrato;
    private javax.swing.JLabel jLabelComissaoExibeContrato;
    private javax.swing.JLabel jLabelDuracaoExibeContrato;
    private javax.swing.JLabel jLabelExperienciaExibeContrato;
    private javax.swing.JLabel jLabelFeriasExibeContrato;
    private javax.swing.JLabel jLabelHorasExtrasExibeContrato;
    private javax.swing.JLabel jLabelNomeEmpresaExibeContrato;
    private javax.swing.JLabel jLabelNomeFuncionarioExibeContrato;
    private javax.swing.JLabel jLabelValeRefeicaoExibeContrato;
    private javax.swing.JLabel jLabelValeTransporteExibeContrato;
    private javax.swing.JTextField jTextFieldCargaHorariaExibeContrato;
    private javax.swing.JTextField jTextFieldComissaoExibeContrato;
    private javax.swing.JTextField jTextFieldDuracaoExibeContrato;
    private javax.swing.JTextField jTextFieldFeriasExibeContrato;
    private javax.swing.JTextField jTextFieldHorasExtrasExibeContrato;
    private javax.swing.JTextField jTextFieldNomeEmpresaExibeContrato;
    private javax.swing.JTextField jTextFieldNomeFuncionarioExibeContrato;
    // End of variables declaration//GEN-END:variables
}