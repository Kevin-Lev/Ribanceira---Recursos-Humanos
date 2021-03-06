/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import DAO.Funcionario;
import controladores.G_Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class JPanelEditar_Oco extends javax.swing.JPanel {

    /**
     * Creates new form JPanelEditar_Oco
     */
    
    ArrayList<Funcionario> listaFuncionarios;
    
    public JPanelEditar_Oco() {

        initComponents();
        
         listaFuncionarios = new G_Funcionario().getListaFuncionario();
        for(Funcionario f : listaFuncionarios){
            jComboBoxFunEdoco.addItem(f.getNome());
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

        jPanel1 = new javax.swing.JPanel();
        jLabelNomeFun_Oco = new javax.swing.JLabel();
        jLabelTipo_Oco = new javax.swing.JLabel();
        jLabelValor_Oco = new javax.swing.JLabel();
        jButtonSalvar_Oco = new javax.swing.JButton();
        jButtonCancelar_Oco = new javax.swing.JButton();
        jTextFieldValor_Oco = new javax.swing.JTextField();
        jLabelData_Oco = new javax.swing.JLabel();
        jTextFieldDia_Oco = new javax.swing.JTextField();
        jTextFieldAno_Oco = new javax.swing.JTextField();
        jTextFieldMes_Oco = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jComboBoxFunEdoco = new javax.swing.JComboBox<>();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNomeFun_Oco.setText("Nome do funcionário:");
        jPanel1.add(jLabelNomeFun_Oco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 153, 50));

        jLabelTipo_Oco.setText("Tipo de ocorrência:");
        jPanel1.add(jLabelTipo_Oco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, 153, 39));

        jLabelValor_Oco.setText("Valor de acréscimo ao salário:");
        jPanel1.add(jLabelValor_Oco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, -1, 40));

        jButtonSalvar_Oco.setText("Salvar ocorrência");
        jButtonSalvar_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar_OcoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar_Oco, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 311, -1, -1));

        jButtonCancelar_Oco.setText("Cancelar");
        jButtonCancelar_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar_OcoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar_Oco, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 311, -1, -1));

        jTextFieldValor_Oco.setText("0");
        jPanel1.add(jTextFieldValor_Oco, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 66, -1));

        jLabelData_Oco.setText("Data da ocorrência:");
        jPanel1.add(jLabelData_Oco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, -1, 30));

        jTextFieldDia_Oco.setText("     DD");
        jTextFieldDia_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDia_OcoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldDia_Oco, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 65, -1));

        jTextFieldAno_Oco.setText("  AAAA");
        jTextFieldAno_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAno_OcoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldAno_Oco, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 65, -1));

        jTextFieldMes_Oco.setText("    MM");
        jTextFieldMes_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMes_OcoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldMes_Oco, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 65, -1));

        jRadioButton1.setText("Falta");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 174, -1, -1));

        jRadioButton2.setText("Hora extra");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 174, -1, -1));

        jCheckBox1.setText("Justificada");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 207, -1, -1));

        jButton1.setText("Excluir Ocorrência");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 311, -1, -1));

        jComboBoxFunEdoco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBoxFunEdoco, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvar_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar_OcoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonSalvar_OcoActionPerformed

    private void jButtonCancelar_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar_OcoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelar_OcoActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar_Oco;
    private javax.swing.JButton jButtonSalvar_Oco;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBoxFunEdoco;
    private javax.swing.JLabel jLabelData_Oco;
    private javax.swing.JLabel jLabelNomeFun_Oco;
    private javax.swing.JLabel jLabelTipo_Oco;
    private javax.swing.JLabel jLabelValor_Oco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextFieldAno_Oco;
    private javax.swing.JTextField jTextFieldDia_Oco;
    private javax.swing.JTextField jTextFieldMes_Oco;
    private javax.swing.JTextField jTextFieldValor_Oco;
    // End of variables declaration//GEN-END:variables
}
