/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kevin
 */
public class JPanelConsultarOcorrencia extends javax.swing.JPanel {


    /**
     * Creates new form JPanelConsultarOcorrencia
     */
    
    CardLayout card;
    private javax.swing.JPanel jPanelRaiz;
    private javax.swing.JFrame jFrameRaiz;
    
    public JPanelConsultarOcorrencia() {
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

        jLabelLista_Oco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela_Oco = new javax.swing.JTable();
        jButtonEditar_Oco = new javax.swing.JButton();
        jButtonVoltar_Oco = new javax.swing.JButton();

        jLabelLista_Oco.setText("Lista de Ocorrências:");

        jTableTabela_Oco.setAutoCreateRowSorter(true);
        jTableTabela_Oco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Funcionário", "Empresa", "Ocorrência", "Data", "Justificada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTabela_Oco);
        if (jTableTabela_Oco.getColumnModel().getColumnCount() > 0) {
            jTableTabela_Oco.getColumnModel().getColumn(0).setHeaderValue("Funcionário");
            jTableTabela_Oco.getColumnModel().getColumn(1).setHeaderValue("Empresa");
            jTableTabela_Oco.getColumnModel().getColumn(2).setHeaderValue("Ocorrência");
            jTableTabela_Oco.getColumnModel().getColumn(3).setHeaderValue("Data");
            jTableTabela_Oco.getColumnModel().getColumn(4).setHeaderValue("Justificada");
        }

        jButtonEditar_Oco.setText("Editar ocorrência");
        jButtonEditar_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditar_OcoActionPerformed(evt);
            }
        });

        jButtonVoltar_Oco.setText("Voltar");
        jButtonVoltar_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltar_OcoActionPerformed(evt);
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
                        .addComponent(jButtonVoltar_Oco, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar_Oco)
                    .addComponent(jButtonVoltar_Oco))
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditar_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditar_OcoActionPerformed
        // TODO add your handling code here:
        JPanel panelEditar_Oco = new JPanelEditar_Oco();
        
         jPanelRaiz.add(panelEditar_Oco);
        
         card.next(jPanelRaiz); 
        
    }//GEN-LAST:event_jButtonEditar_OcoActionPerformed

    private void jButtonVoltar_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltar_OcoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false); 
         
        
    }//GEN-LAST:event_jButtonVoltar_OcoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar_Oco;
    private javax.swing.JButton jButtonVoltar_Oco;
    private javax.swing.JLabel jLabelLista_Oco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabela_Oco;
    // End of variables declaration//GEN-END:variables
}