/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

/**
 *
 * @author Kevin Levrone
 */
public class JPanelRegistrarOcorrencia extends javax.swing.JPanel {

    /**
     * Creates new form JPanelRegistrarOcorrencia
     */
    public JPanelRegistrarOcorrencia() {
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

        jLabelNomeFun_Oco = new javax.swing.JLabel();
        jLabelEmpresa_Oco = new javax.swing.JLabel();
        jLabelTipo_Oco = new javax.swing.JLabel();
        jLabelValor_Oco = new javax.swing.JLabel();
        jButtonSalvar_Oco = new javax.swing.JButton();
        jButtonCancelar_Oco = new javax.swing.JButton();
        jTextFieldValor_Oco = new javax.swing.JTextField();
        jTextFieldNomeFun_Oco = new javax.swing.JTextField();
        jTextFieldEmpresa_Oco = new javax.swing.JTextField();
        jButtonSelectFun_Oco = new javax.swing.JButton();
        jLabelData_Oco = new javax.swing.JLabel();
        jTextFieldDia_Oco = new javax.swing.JTextField();
        jTextFieldAno_Oco = new javax.swing.JTextField();
        jTextFieldMes_Oco = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();

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

        jButtonCancelar_Oco.setText("Cancelar");
        jButtonCancelar_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar_OcoActionPerformed(evt);
            }
        });

        jTextFieldValor_Oco.setText("0");

        jButtonSelectFun_Oco.setText("...");
        jButtonSelectFun_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectFun_OcoActionPerformed(evt);
            }
        });

        jLabelData_Oco.setText("Data da ocorrência:");

        jTextFieldDia_Oco.setText("     DD");
        jTextFieldDia_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDia_OcoActionPerformed(evt);
            }
        });

        jTextFieldAno_Oco.setText("  AAAA");
        jTextFieldAno_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAno_OcoActionPerformed(evt);
            }
        });

        jTextFieldMes_Oco.setText("    MM");
        jTextFieldMes_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMes_OcoActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Falta");

        jRadioButton2.setText("Hora extra");

        jCheckBox1.setText("Justificada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar_Oco)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar_Oco))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeFun_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEmpresa_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNomeFun_Oco, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmpresa_Oco)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldDia_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldMes_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(jTextFieldAno_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelTipo_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jRadioButton1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSelectFun_Oco)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelValor_Oco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValor_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelData_Oco))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFun_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeFun_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelectFun_Oco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmpresa_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmpresa_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData_Oco)
                    .addComponent(jTextFieldDia_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAno_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMes_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValor_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar_Oco)
                    .addComponent(jButtonCancelar_Oco))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvar_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar_OcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvar_OcoActionPerformed

    private void jButtonCancelar_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar_OcoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelar_OcoActionPerformed

    private void jButtonSelectFun_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectFun_OcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSelectFun_OcoActionPerformed

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
    private javax.swing.JButton jButtonCancelar_Oco;
    private javax.swing.JButton jButtonSalvar_Oco;
    private javax.swing.JButton jButtonSelectFun_Oco;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabelData_Oco;
    private javax.swing.JLabel jLabelEmpresa_Oco;
    private javax.swing.JLabel jLabelNomeFun_Oco;
    private javax.swing.JLabel jLabelTipo_Oco;
    private javax.swing.JLabel jLabelValor_Oco;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextFieldAno_Oco;
    private javax.swing.JTextField jTextFieldDia_Oco;
    private javax.swing.JTextField jTextFieldEmpresa_Oco;
    private javax.swing.JTextField jTextFieldMes_Oco;
    private javax.swing.JTextField jTextFieldNomeFun_Oco;
    private javax.swing.JTextField jTextFieldValor_Oco;
    // End of variables declaration//GEN-END:variables
}
