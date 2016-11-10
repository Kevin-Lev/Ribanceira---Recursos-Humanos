/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import DAO.Empresa;
import DAO.Funcionario;
import controladores.G_Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ribanceira.JPanelCadastrarContrato;

/**
 *
 * @author Alessandra
 */
public class JPanelConsultarFuncionario extends javax.swing.JPanel {

    /**
     * Creates new form JPanelConsultarFuncionario
     */
    ArrayList<Funcionario> listaFuncionario;
    ArrayList<Empresa> listaEmpresa;

    public JPanelConsultarFuncionario() {
        initComponents();
        DefaultTableModel tableModel = (DefaultTableModel) jTableFuncionario.getModel();
        tableModel.setNumRows(0);
        listaFuncionario = new G_Funcionario().getListaFuncionario();
        for (Funcionario f : listaFuncionario) {
            tableModel.addRow(new Object[]{f.getNome(), f.getRg()});
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
        jTableFuncionario = new javax.swing.JTable();
        jButtonSelecionarConsultaFuncionario = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome Funcionário", "RG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableFuncionario);
        jTableFuncionario.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableFuncionario.getColumnModel().getColumnCount() > 0) {
            jTableFuncionario.getColumnModel().getColumn(0).setResizable(false);
            jTableFuncionario.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 663, 364));

        jButtonSelecionarConsultaFuncionario.setText("Selecionar");
        jButtonSelecionarConsultaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarConsultaFuncionarioActionPerformed(evt);
            }
        });
        add(jButtonSelecionarConsultaFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelecionarConsultaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarConsultaFuncionarioActionPerformed
        // TODO add your handling code here:

        if (jTableFuncionario.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um funcionario!");
        } else {
            new JFrameExibeFuncionario(listaFuncionario.get(jTableFuncionario.getSelectedRow()));
        }


    }//GEN-LAST:event_jButtonSelecionarConsultaFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSelecionarConsultaFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionario;
    // End of variables declaration//GEN-END:variables
}
