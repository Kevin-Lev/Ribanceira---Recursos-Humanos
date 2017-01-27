/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import java.io.File;
import controladores.G_ConvencaoColetiva;
import controladores.G_Sindicato;
import java.util.ArrayList;
import DAO.ConvencaoColetiva;
import DAO.Sindicato;
import controladores.G_ConvencaoColetiva;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Christian T. Nakata
 */
public class JPanelConvencaoColetiva extends javax.swing.JPanel {

    /**
     * Creates new form ConvencaoColetivaSindicato
     */
    ArrayList<ConvencaoColetiva> listaConvencao;
    ArrayList<Sindicato> listaSindicato;
    Sindicato sindicato;
        
    JButton b = new JButton(); 
    //b.setIcon(new ImageIcon("Imagens/pdf.png"));
    
    public JPanelConvencaoColetiva() {
        initComponents();

        DefaultTableModel tableModel = (DefaultTableModel) jTableBuscaSindicato.getModel();
        tableModel.setNumRows(0);
        listaSindicato = new G_Sindicato().getListaSindicato();
        for (Sindicato s : listaSindicato) {
            tableModel.addRow(new Object[]{s.getNome(), s.getCodigo(), s.getRamoAtividade()});
        }
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTextField1 = new javax.swing.JTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuscaSindicato = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonSalvarConv = new javax.swing.JButton();
        jTextFieldDataDeAtualizacao = new javax.swing.JTextField();
        jTextFieldProporcaoSalMinimo = new javax.swing.JTextField();
        jTextFieldDescontoDia = new javax.swing.JTextField();
        jButtonRelatorio = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jTableBuscaSindicato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, ""},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sindicato", "Código", "Ramo de atividade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBuscaSindicato.setName(""); // NOI18N
        jScrollPane1.setViewportView(jTableBuscaSindicato);

        jLabel2.setText("Data (última data de atualização):");

        jLabel3.setText("Proporção do salário mínimo:");

        jLabel4.setText("Desconto por dia:");

        jButtonSalvarConv.setText("Salvar");
        jButtonSalvarConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarConvActionPerformed(evt);
            }
        });

        jTextFieldDataDeAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDeAtualizacaoActionPerformed(evt);
            }
        });

        jTextFieldProporcaoSalMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProporcaoSalMinimoActionPerformed(evt);
            }
        });

        jTextFieldDescontoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescontoDiaActionPerformed(evt);
            }
        });

        jButtonRelatorio.setText("Relatório");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDescontoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldProporcaoSalMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDataDeAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarConv, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataDeAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProporcaoSalMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDescontoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSalvarConv, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButtonRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarConvActionPerformed
        try{
            
            sindicato = listaSindicato.get(jTableBuscaSindicato.getSelectedRow());
            
            new G_ConvencaoColetiva().salvaConvencaoColetiva(sindicato.getCodigo(),
                                                             "categoria",
                                                             jTextFieldDataDeAtualizacao.getText(),
                                                             jTextFieldProporcaoSalMinimo.getText());

            JOptionPane.showMessageDialog(this, "Convenção adicionada com sucesso!","Adição de Convenção",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
        
        catch (HeadlessException e) {
            
            JOptionPane.showMessageDialog(this, "Error - Falta de dados à inserir","Erro ao alterar",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            
        }

    }//GEN-LAST:event_jButtonSalvarConvActionPerformed

    private void jTextFieldDataDeAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDeAtualizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataDeAtualizacaoActionPerformed

    private void jTextFieldProporcaoSalMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProporcaoSalMinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProporcaoSalMinimoActionPerformed

    private void jTextFieldDescontoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescontoDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescontoDiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButtonRelatorio;
    private javax.swing.JButton jButtonSalvarConv;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableBuscaSindicato;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldDataDeAtualizacao;
    private javax.swing.JTextField jTextFieldDescontoDia;
    private javax.swing.JTextField jTextFieldProporcaoSalMinimo;
    // End of variables declaration//GEN-END:variables
}
