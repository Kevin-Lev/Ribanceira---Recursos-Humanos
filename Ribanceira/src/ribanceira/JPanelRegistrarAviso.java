/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import DAO.Funcionario;
import controladores.G_Aviso;
import controladores.G_Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author kevin
 */
public class JPanelRegistrarAviso extends javax.swing.JPanel {
    
    ArrayList<Funcionario> listaFuncionarios;
    /**
     * Creates new form JPanelRegistrarAviso
     */
    public JPanelRegistrarAviso() {
        initComponents();
        
        listaFuncionarios = new G_Funcionario().getListaFuncionario();
        for(Funcionario f : listaFuncionarios){
            jComboBoxFunAviso.addItem(f.getNome());
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

        jLabelDataAviso = new javax.swing.JLabel();
        jLabelDataRescisão = new javax.swing.JLabel();
        jLabelMotivo = new javax.swing.JLabel();
        jTextFieldDiaEmissão = new javax.swing.JTextField();
        jTextFieldMesEmissao = new javax.swing.JTextField();
        jTextFieldAnoEmissao = new javax.swing.JTextField();
        jTextFieldDiaRescisão = new javax.swing.JTextField();
        jTextFieldMesRescisao = new javax.swing.JTextField();
        jTextFieldAnoRescisao = new javax.swing.JTextField();
        jButtonSalvarAviso = new javax.swing.JButton();
        jButtonCancelarAviso = new javax.swing.JButton();
        jLabelFunAviso = new javax.swing.JLabel();
        jComboBoxFunAviso = new javax.swing.JComboBox<>();
        jCheckBoxJustAviso = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMotivo = new javax.swing.JTextArea();

        jLabelDataAviso.setText(" Data de emissão do aviso:");

        jLabelDataRescisão.setText(" Data da rescisão:");

        jLabelMotivo.setText("Motivo de aviso:");

        jTextFieldDiaEmissão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiaEmissãoActionPerformed(evt);
            }
        });

        jButtonSalvarAviso.setText("Salvar");
        jButtonSalvarAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAvisoActionPerformed(evt);
            }
        });

        jButtonCancelarAviso.setText("Cancelar");
        jButtonCancelarAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAvisoActionPerformed(evt);
            }
        });

        jLabelFunAviso.setText(" Funcionário :");

        jComboBoxFunAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFunAvisoActionPerformed(evt);
            }
        });

        jCheckBoxJustAviso.setText("Justificado");

        jTextAreaMotivo.setColumns(20);
        jTextAreaMotivo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMotivo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonCancelarAviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalvarAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataAviso)
                            .addComponent(jLabelDataRescisão))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldDiaEmissão, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMesEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldAnoEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldDiaRescisão, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMesRescisao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAnoRescisao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMotivo)
                            .addComponent(jLabelFunAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxJustAviso))
                            .addComponent(jComboBoxFunAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDiaEmissão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMesEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnoEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataRescisão, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDiaRescisão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMesRescisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnoRescisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFunAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFunAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCancelarAviso)
                            .addComponent(jButtonSalvarAviso)))
                    .addComponent(jCheckBoxJustAviso))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAvisoActionPerformed
        // TODO add your handling code here:
        new G_Aviso().SalvaAviso(listaFuncionarios.get(jComboBoxFunAviso.getSelectedIndex()),
                                 jTextFieldDiaEmissão.getText() + "/" + jTextFieldMesEmissao.getText() + "/" + jTextFieldAnoEmissao.getText(),
                                 jTextFieldDiaRescisão.getText() + "/" + jTextFieldMesRescisao.getText() + "/" + jTextFieldAnoRescisao.getText(),
                                 jCheckBoxJustAviso.isSelected(),
                                 jTextAreaMotivo.getText());
        JOptionPane.showMessageDialog(this, "Aviso registrado com sucesso!","Registro de Aviso",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
                                 
        
    }//GEN-LAST:event_jButtonSalvarAvisoActionPerformed

    private void jButtonCancelarAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAvisoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarAvisoActionPerformed

    private void jTextFieldDiaEmissãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiaEmissãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiaEmissãoActionPerformed

    private void jComboBoxFunAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFunAvisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFunAvisoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarAviso;
    private javax.swing.JButton jButtonSalvarAviso;
    private javax.swing.JCheckBox jCheckBoxJustAviso;
    private javax.swing.JComboBox<String> jComboBoxFunAviso;
    private javax.swing.JLabel jLabelDataAviso;
    private javax.swing.JLabel jLabelDataRescisão;
    private javax.swing.JLabel jLabelFunAviso;
    private javax.swing.JLabel jLabelMotivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMotivo;
    private javax.swing.JTextField jTextFieldAnoEmissao;
    private javax.swing.JTextField jTextFieldAnoRescisao;
    private javax.swing.JTextField jTextFieldDiaEmissão;
    private javax.swing.JTextField jTextFieldDiaRescisão;
    private javax.swing.JTextField jTextFieldMesEmissao;
    private javax.swing.JTextField jTextFieldMesRescisao;
    // End of variables declaration//GEN-END:variables
}
