/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import DAO.Empresa;
import controladores.G_Ocorrencia;
import DAO.Funcionario;
import controladores.G_Empresa;
import controladores.G_Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Kevin Levrone
 */
public class JPanelRegistrarOcorrencia extends javax.swing.JPanel {

    /**
     * Creates new form JPanelRegistrarOcorrencia
     */
    Funcionario func;
    
    ArrayList<Funcionario> listaFuncionarios;
    ArrayList<Empresa> listaEmpresas;
    
    public JPanelRegistrarOcorrencia() {
        initComponents();
        
        listaFuncionarios = new G_Funcionario().getListaFuncionario();
        for (Funcionario f : listaFuncionarios) {
            jComboBoxListaFuncionarios.addItem(f.getNome());
        }
        
        listaEmpresas = new G_Empresa().getListaEmpresa();
        for(Empresa e : listaEmpresas){
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

        jLabelNomeFun_Oco = new javax.swing.JLabel();
        jLabelEmpresa_Oco = new javax.swing.JLabel();
        jLabelTipo_Oco = new javax.swing.JLabel();
        jLabelValor_Oco = new javax.swing.JLabel();
        jButtonSalvar_Oco = new javax.swing.JButton();
        jLabelData_Oco = new javax.swing.JLabel();
        jTextFieldDia_Oco = new javax.swing.JTextField();
        jTextFieldAno_Oco = new javax.swing.JTextField();
        jTextFieldMes_Oco = new javax.swing.JTextField();
        jCheckBoxJustificado = new javax.swing.JCheckBox();
        jComboBoxListaFuncionarios = new javax.swing.JComboBox<>();
        jComboBoxListaEmpresas = new javax.swing.JComboBox<>();
        jFormattedTextFieldValorOco = new javax.swing.JFormattedTextField();
        jTextFieldTipoOco = new javax.swing.JTextField();

        jLabelNomeFun_Oco.setText("Nome do funcionário:");

        jLabelEmpresa_Oco.setText("Empresa:");

        jLabelTipo_Oco.setText("Tipo de ocorrência:");

        jLabelValor_Oco.setText("Valor de acréscimo ao salário:");

        jButtonSalvar_Oco.setText("Salvar ocorrência");
        jButtonSalvar_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar_OcoActionPerformed(evt);
            }
        });

        jLabelData_Oco.setText("Data da ocorrência:");

        jTextFieldDia_Oco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDia_Oco.setText("DD");
        jTextFieldDia_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDia_OcoActionPerformed(evt);
            }
        });

        jTextFieldAno_Oco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAno_Oco.setText("AAAA");
        jTextFieldAno_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAno_OcoActionPerformed(evt);
            }
        });

        jTextFieldMes_Oco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMes_Oco.setText("MM");
        jTextFieldMes_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMes_OcoActionPerformed(evt);
            }
        });

        jCheckBoxJustificado.setText("Justificada");

        jComboBoxListaEmpresas.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar_Oco))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeFun_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEmpresa_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldDia_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldMes_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(jTextFieldAno_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jComboBoxListaFuncionarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxListaEmpresas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelTipo_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTipoOco, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxJustificado)
                                .addGap(0, 136, Short.MAX_VALUE)))
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelData_Oco)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelValor_Oco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldValorOco, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFun_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxListaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmpresa_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxListaEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData_Oco)
                    .addComponent(jTextFieldDia_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAno_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMes_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTipoOco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxJustificado))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldValorOco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar_Oco)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvar_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar_OcoActionPerformed
        // TODO add your handling code here:        
      new G_Ocorrencia().SalvaOcorrencia(listaFuncionarios.get(jComboBoxListaFuncionarios.getSelectedIndex()),
                                         jTextFieldDia_Oco.getText() + "/" + jTextFieldMes_Oco.getText() + "/" + jTextFieldAno_Oco.getText(),
                                         jTextFieldTipoOco.getText(),
                                         jCheckBoxJustificado.isSelected(),
                                         Float.parseFloat(jFormattedTextFieldValorOco.getText()));
             JOptionPane.showMessageDialog(this, "Ocorrência cadastrada com sucesso!","Registro de Ocorrência",JOptionPane.INFORMATION_MESSAGE);
             this.setVisible(false);
            
    
                                         
    }//GEN-LAST:event_jButtonSalvar_OcoActionPerformed

    private void jTextFieldDia_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDia_OcoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldDia_OcoActionPerformed

    private void jTextFieldAno_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAno_OcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAno_OcoActionPerformed

    private void jTextFieldMes_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMes_OcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMes_OcoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar_Oco;
    private javax.swing.JCheckBox jCheckBoxJustificado;
    private javax.swing.JComboBox<String> jComboBoxListaEmpresas;
    private javax.swing.JComboBox<String> jComboBoxListaFuncionarios;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorOco;
    private javax.swing.JLabel jLabelData_Oco;
    private javax.swing.JLabel jLabelEmpresa_Oco;
    private javax.swing.JLabel jLabelNomeFun_Oco;
    private javax.swing.JLabel jLabelTipo_Oco;
    private javax.swing.JLabel jLabelValor_Oco;
    private javax.swing.JTextField jTextFieldAno_Oco;
    private javax.swing.JTextField jTextFieldDia_Oco;
    private javax.swing.JTextField jTextFieldMes_Oco;
    private javax.swing.JTextField jTextFieldTipoOco;
    // End of variables declaration//GEN-END:variables
}
