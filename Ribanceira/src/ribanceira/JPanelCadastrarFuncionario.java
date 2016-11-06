/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import DAO.Funcionario;
import Util.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
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
        jButtonCancelarFuncionario = new javax.swing.JButton();
        jButtonSalvarFuncionario = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 550));

        jLabelNomeFuncionario.setText("Nome do funcionário: ");

        jLabelDataNascimentoFuncionario.setText("Data de nascimento:");

        jLabelEnderecoFuncionario.setText("Endereço:");

        jLabelTelefoneFuncionario.setText("Telefone:");

        jLabelEmailFuncionario.setText("E-mail:");

        jLabelRgFuncionario.setText("RG:");

        jLabelCpfFuncionario.setText("CPF:");

        jLabelTituloEleitorFuncionario.setText("Título de eleitor:");

        jLabelEstadoCivilFuncionario.setText("Estado civil:");

        jLabelCarteiraTrabalhoFuncionario.setText("Número da carteira de trabalho:");

        jFormattedTextFieldDataNascimentoFuncionario.setToolTipText("");

        jFormattedTextFieldRgFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldRgFuncionarioActionPerformed(evt);
            }
        });

        jButtonCancelarFuncionario.setText("Cancelar");
        jButtonCancelarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarFuncionarioActionPerformed(evt);
            }
        });

        jButtonSalvarFuncionario.setText("Salvar");
        jButtonSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCarteiraTrabalhoFuncionario)
                    .addComponent(jLabelNomeFuncionario)
                    .addComponent(jLabelDataNascimentoFuncionario)
                    .addComponent(jLabelEnderecoFuncionario)
                    .addComponent(jLabelTelefoneFuncionario)
                    .addComponent(jLabelEmailFuncionario)
                    .addComponent(jLabelRgFuncionario)
                    .addComponent(jLabelCpfFuncionario)
                    .addComponent(jLabelTituloEleitorFuncionario)
                    .addComponent(jLabelEstadoCivilFuncionario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addComponent(jTextFieldEnderecoFuncionario)
                        .addComponent(jTextFieldEmailFuncionario))
                    .addComponent(jFormattedTextFieldDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jFormattedTextFieldCarteiraTrabalhoFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldEstadoCivilFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFormattedTextFieldTituloEleitorFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFormattedTextFieldCpfFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFormattedTextFieldRgFuncionario, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelarFuncionario)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFuncionario)
                    .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNascimentoFuncionario)
                    .addComponent(jFormattedTextFieldDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnderecoFuncionario)
                    .addComponent(jTextFieldEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefoneFuncionario)
                    .addComponent(jFormattedTextFieldTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmailFuncionario)
                    .addComponent(jTextFieldEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRgFuncionario)
                    .addComponent(jFormattedTextFieldRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpfFuncionario)
                    .addComponent(jFormattedTextFieldCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloEleitorFuncionario)
                    .addComponent(jFormattedTextFieldTituloEleitorFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstadoCivilFuncionario)
                    .addComponent(jFormattedTextFieldEstadoCivilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCarteiraTrabalhoFuncionario)
                    .addComponent(jFormattedTextFieldCarteiraTrabalhoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarFuncionario)
                    .addComponent(jButtonSalvarFuncionario))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldRgFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldRgFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldRgFuncionarioActionPerformed

    private void jButtonCancelarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarFuncionarioActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButtonCancelarFuncionarioActionPerformed

    private void jButtonSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarFuncionarioActionPerformed
        // TODO add your handling code here:
        Funcionario f = new Funcionario();
        f.setNome(jTextFieldNomeFuncionario.getText());
        f.setDataNascimento(jFormattedTextFieldDataNascimentoFuncionario.getText());
        f.setEndereco(jTextFieldEnderecoFuncionario.getText());
        f.setTelefone(jFormattedTextFieldTelefoneFuncionario.getText());
        f.setEmail(jTextFieldEmailFuncionario.getText());
        f.setRg(jFormattedTextFieldRgFuncionario.getText());
        f.setCpf(jFormattedTextFieldCpfFuncionario.getText());
        f.setTituloEleitor(jFormattedTextFieldTituloEleitorFuncionario.getText());
        f.setEstadoCivil(jFormattedTextFieldEstadoCivilFuncionario.getText());
        f.setNumeroCarteiraTrabalho(jFormattedTextFieldCarteiraTrabalhoFuncionario.getText());
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(f);
        s.getTransaction().commit();
        this.hide();
    }//GEN-LAST:event_jButtonSalvarFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarFuncionario;
    private javax.swing.JButton jButtonSalvarFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldCarteiraTrabalhoFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimentoFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldEstadoCivilFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldRgFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldTituloEleitorFuncionario;
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