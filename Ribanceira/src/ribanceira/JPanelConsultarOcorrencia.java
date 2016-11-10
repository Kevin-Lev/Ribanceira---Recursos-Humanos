/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import DAO.Ocorrencia;
import controladores.G_Ocorrencia;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Levrone
 */
public class JPanelConsultarOcorrencia extends javax.swing.JPanel {

    ArrayList<Ocorrencia> listaOcorrencias;
    /**
     * Creates new form JPanelConsultarOcorrencia
     */
    
    CardLayout card;
   // private javax.swing.JPanel jPanelRaiz;
    //private javax.swing.JFrame jFrameRaiz;
    //private javax.swing.JPanel jPanelRoot;
 
    public JPanelConsultarOcorrencia() {
        initComponents();
        DefaultTableModel tableModel = (DefaultTableModel) jTableTabelaOco.getModel();
        tableModel.setNumRows(0);
        listaOcorrencias = new G_Ocorrencia().getListaOcorrencia();
        for (Ocorrencia o : listaOcorrencias) {
            tableModel.addRow(new Object[]{o.getFuncionario().getNome(), o.getTipo(), o.getDataOcorrencia(), o.isJustificado()});
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

        jLabelLista_Oco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaOco = new javax.swing.JTable();
        jButtonEditar_Oco = new javax.swing.JButton();

        jLabelLista_Oco.setText("Lista de Ocorrências:");

        jTableTabelaOco.setAutoCreateRowSorter(true);
        jTableTabelaOco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Funcionário", "Ocorrência", "Data", "Justificada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTabelaOco);

        jButtonEditar_Oco.setText("Editar ocorrência");
        jButtonEditar_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditar_OcoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEditar_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLista_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLista_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditar_Oco)
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditar_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditar_OcoActionPerformed
        // TODO add your handling code here:
        if (jTableTabelaOco.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma ocorrência!");
        } else {
            new JFrameEditarOcorrencia(listaOcorrencias.get(jTableTabelaOco.getSelectedRow()));
                

        }
        
    }//GEN-LAST:event_jButtonEditar_OcoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar_Oco;
    private javax.swing.JLabel jLabelLista_Oco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaOco;
    // End of variables declaration//GEN-END:variables
}
