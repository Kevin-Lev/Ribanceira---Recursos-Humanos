/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import controladores.G_Funcionario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alessandra
 */
public class JPanelCadastrarFuncionario extends javax.swing.JPanel {

    /**
     * Creates new form JPanelCadastrarFuncionario
     */
    public JPanelCadastrarFuncionario() {
        initComponents();
        this.setSize(800,600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNomeFuncionario = new javax.swing.JLabel();
        jLabelDataNascimentoFuncionario = new javax.swing.JLabel();
        jLabelEnderecoFuncionario = new javax.swing.JLabel();
        jLabelTelefoneFuncionario = new javax.swing.JLabel();
        jLabelEmailFuncionario = new javax.swing.JLabel();
        jLabelRgFuncionario = new javax.swing.JLabel();
        jLabelCpfFuncionario = new javax.swing.JLabel();
        jLabelTituloEleitorFuncionario = new javax.swing.JLabel();
        jLabelEstadoCivilFuncionario = new javax.swing.JLabel();
        jLabelCarteiraTrabalhoFuncionario = new javax.swing.JLabel();
        jTextFieldNomeFuncionario = new javax.swing.JTextField();
        jTextFieldEnderecoFuncionario = new javax.swing.JTextField();
        jTextFieldEmailFuncionario = new javax.swing.JTextField();
        jFormattedTextFieldDataNascimentoFuncionario = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefoneFuncionario = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRgFuncionario = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCpfFuncionario = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTituloEleitorFuncionario = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEstadoCivilFuncionario = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCarteiraTrabalhoFuncionario = new javax.swing.JFormattedTextField();
        jButtonSalvarFuncionario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabelNomeFuncionario.setText("Nome do funcionário: *");

        jLabelDataNascimentoFuncionario.setText("Data de nascimento: *");

        jLabelEnderecoFuncionario.setText("Endereço: *");

        jLabelTelefoneFuncionario.setText("Telefone: *");

        jLabelEmailFuncionario.setText("E-mail: ");

        jLabelRgFuncionario.setText("RG: *");

        jLabelCpfFuncionario.setText("CPF: *");

        jLabelTituloEleitorFuncionario.setText("Título de eleitor: *");

        jLabelEstadoCivilFuncionario.setText("Estado civil: *");

        jLabelCarteiraTrabalhoFuncionario.setText("Número da carteira de trabalho: *");

        jFormattedTextFieldDataNascimentoFuncionario.setToolTipText("");

        jFormattedTextFieldRgFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldRgFuncionarioActionPerformed(evt);
            }
        });

        jButtonSalvarFuncionario.setText("Salvar");
        jButtonSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarFuncionarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("* Campos obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNomeFuncionario)
                                            .addComponent(jLabelDataNascimentoFuncionario)
                                            .addComponent(jLabelEnderecoFuncionario)
                                            .addComponent(jLabelTelefoneFuncionario)
                                            .addComponent(jLabelEmailFuncionario)
                                            .addComponent(jLabelRgFuncionario)
                                            .addComponent(jLabelCpfFuncionario)
                                            .addComponent(jLabelTituloEleitorFuncionario)
                                            .addComponent(jLabelEstadoCivilFuncionario))
                                        .addGap(70, 70, 70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelCarteiraTrabalhoFuncionario)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jFormattedTextFieldCarteiraTrabalhoFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFormattedTextFieldEstadoCivilFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFormattedTextFieldTituloEleitorFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFormattedTextFieldCpfFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFormattedTextFieldRgFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldNomeFuncionario)
                                        .addComponent(jTextFieldEnderecoFuncionario)
                                        .addComponent(jTextFieldEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jFormattedTextFieldDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonSalvarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataNascimentoFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEnderecoFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefoneFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmailFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRgFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCpfFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldTituloEleitorFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTituloEleitorFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldEstadoCivilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstadoCivilFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldCarteiraTrabalhoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCarteiraTrabalhoFuncionario)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(43, 43, 43)
                .addComponent(jButtonSalvarFuncionario)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldRgFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldRgFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldRgFuncionarioActionPerformed

    private void jButtonSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarFuncionarioActionPerformed
        // TODO add your handling code here:
        new G_Funcionario().salvaFuncionario(jTextFieldNomeFuncionario.getText(),
                                             jFormattedTextFieldDataNascimentoFuncionario.getText(), 
                                             jTextFieldEnderecoFuncionario.getText(), 
                                             jFormattedTextFieldTelefoneFuncionario.getText(), 
                                             jTextFieldEmailFuncionario.getText(), 
                                             jFormattedTextFieldRgFuncionario.getText(), 
                                             jFormattedTextFieldCpfFuncionario.getText(), 
                                             jFormattedTextFieldTituloEleitorFuncionario.getText(), 
                                             jFormattedTextFieldEstadoCivilFuncionario.getText(), 
                                             jFormattedTextFieldCarteiraTrabalhoFuncionario.getText(),
                                             true);
        JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!","Cadastro de funcionário",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonSalvarFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldCarteiraTrabalhoFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimentoFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldEstadoCivilFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldRgFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldTituloEleitorFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCarteiraTrabalhoFuncionario;
    private javax.swing.JLabel jLabelCpfFuncionario;
    private javax.swing.JLabel jLabelDataNascimentoFuncionario;
    private javax.swing.JLabel jLabelEmailFuncionario;
    private javax.swing.JLabel jLabelEnderecoFuncionario;
    private javax.swing.JLabel jLabelEstadoCivilFuncionario;
    private javax.swing.JLabel jLabelNomeFuncionario;
    private javax.swing.JLabel jLabelRgFuncionario;
    private javax.swing.JLabel jLabelTelefoneFuncionario;
    private javax.swing.JLabel jLabelTituloEleitorFuncionario;
    private javax.swing.JTextField jTextFieldEmailFuncionario;
    private javax.swing.JTextField jTextFieldEnderecoFuncionario;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    // End of variables declaration//GEN-END:variables

}
