/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import DAO.Contrato;
import controladores.G_Contrato;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alessandra
 */
public class JPanelConsultarContrato extends javax.swing.JPanel {

    /**
     * Creates new form JPanelConsultarContrato
     */
    ArrayList<Contrato> listaContrato;

    public JPanelConsultarContrato() {
        initComponents();
        DefaultTableModel tableModel = (DefaultTableModel) jTableContrato.getModel();
        tableModel.setNumRows(0);
        listaContrato = new G_Contrato().getListaContrato();

        for (Contrato c : listaContrato) {
            if(c.isAtivo()){
                tableModel.addRow(new Object[]{c.getCodigo(), c.getFuncionario().getNome(), c.getEmpresa().getNomeEmpresa()});
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContrato = new javax.swing.JTable();
        jButtonSelecionarConsultarContrato = new javax.swing.JButton();

        jTableContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código Contrato", "Funcionario", "Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableContrato.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableContrato);
        if (jTableContrato.getColumnModel().getColumnCount() > 0) {
            jTableContrato.getColumnModel().getColumn(0).setResizable(false);
            jTableContrato.getColumnModel().getColumn(1).setResizable(false);
            jTableContrato.getColumnModel().getColumn(2).setResizable(false);
        }

        jButtonSelecionarConsultarContrato.setText("Selecionar");
        jButtonSelecionarConsultarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarConsultarContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSelecionarConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSelecionarConsultarContrato)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelecionarConsultarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarConsultarContratoActionPerformed
        // TODO add your handling code here:
        if (jTableContrato.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um contrato!", "Consulta de contrato", JOptionPane.INFORMATION_MESSAGE);
        } else {
            new JFrameExibeContrato(listaContrato.get(jTableContrato.getSelectedRow()));
        }
    }//GEN-LAST:event_jButtonSelecionarConsultarContratoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSelecionarConsultarContrato;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContrato;
    // End of variables declaration//GEN-END:variables
}