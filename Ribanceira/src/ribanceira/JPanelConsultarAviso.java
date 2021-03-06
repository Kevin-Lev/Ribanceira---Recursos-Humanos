/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import DAO.AvisoPrevio;
import DAO.Funcionario;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import controladores.G_Aviso;
import controladores.G_Funcionario;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


/**
 *
 * @author Kevin Levrone
 */

 
public class JPanelConsultarAviso extends javax.swing.JPanel {
    
    /**
     * Creates new form JPanelConsultarAviso
     */
    ArrayList<AvisoPrevio> listaAvisos;
    
    private String getDateTime() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
    }
    
    public JPanelConsultarAviso() {
        initComponents();
        DefaultTableModel tableModel = (DefaultTableModel) jTableAvisosRegistrados.getModel();
        tableModel.setNumRows(0);
        listaAvisos = new G_Aviso().getListaAvisos();
        for (AvisoPrevio a : listaAvisos) {
            tableModel.addRow(new Object[]{a.getDataAviso(), a.getDataRescisao(), a.getMotivo(), a.isJustificado(), a.getFuncionario().getNome()});
            
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

        jLabelAvisosRegistrados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAvisosRegistrados = new javax.swing.JTable();
        jButtonEditarAviso = new javax.swing.JButton();
        jButtonGerarArquivo = new javax.swing.JButton();
        jButtonAjuda = new javax.swing.JButton();

        jLabelAvisosRegistrados.setText("Avisos registrados:");

        jTableAvisosRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data de emissão", "Data da Rescisão", "Motivo", "Justificado", "Funcionário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAvisosRegistrados);

        jButtonEditarAviso.setText("Editar Aviso");
        jButtonEditarAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarAvisoActionPerformed(evt);
            }
        });

        jButtonGerarArquivo.setText("Gerar Arquivo");
        jButtonGerarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarArquivoActionPerformed(evt);
            }
        });

        jButtonAjuda.setText("Ajuda");
        jButtonAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjudaActionPerformed(evt);
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
                        .addComponent(jLabelAvisosRegistrados)
                        .addGap(0, 462, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAjuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGerarArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditarAviso)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAvisosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarAviso)
                    .addComponent(jButtonGerarArquivo)
                    .addComponent(jButtonAjuda))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarAvisoActionPerformed
        // TODO add your handling code here:
         if (jTableAvisosRegistrados.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um aviso!");
         }   
         else {
            new JFrameEditarAviso(listaAvisos.get(jTableAvisosRegistrados.getSelectedRow()));
               
         }
        
    }//GEN-LAST:event_jButtonEditarAvisoActionPerformed

    private void jButtonGerarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarArquivoActionPerformed
        
        Funcionario f = listaAvisos.get(jTableAvisosRegistrados.getSelectedRow()).getFuncionario(); 
        
        
        if (jTableAvisosRegistrados.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um aviso!");
        }
        else{
            JOptionPane.showMessageDialog(null, "O aviso prévio foi gerado com sucesso!");
        
            Document aviso = new Document();
            try {
                Font font1 = new Font(Font.FontFamily.TIMES_ROMAN, 8);
                Font font2 = new Font(Font.FontFamily.TIMES_ROMAN, 14);
                Font font3 = new Font(Font.FontFamily.TIMES_ROMAN, 20);
                Font font4 = new Font(Font.FontFamily.TIMES_ROMAN, 11);
                PdfWriter.getInstance(aviso, new FileOutputStream("Aviso Prévio.pdf"));
            
                aviso.open();
                Paragraph p = new Paragraph();
                Paragraph q = new Paragraph();
                aviso.add(new Paragraph("AVISO PRÉVIO DO EMPREGADOR", font3));
                aviso.add(new Paragraph(" "));
                aviso.add(new Paragraph("Sr.(a): " + f.getNome() ,font2));
                aviso.add(new Paragraph(" "));
                aviso.add(new Paragraph("Comunicamos que a partir de 30"
                +" dias após o recebimento deste comunicado de Aviso Prévio, "
                + "não será mais necessário os seus serviços em nossa empresa, " 
                + "ficando V.Sa. desde já comunicada nos termos do Art. 487, Item,Cap.VI,"
                + "Título IV do Decreto Nº5.452 de 1º de Maio de 1943, em cumprimento da legislação vigente", font2));
            
                aviso.add(new Paragraph("Comunicamos ainda que, neste período, V.Sa.,"
                + "terá o seu horário de trabalho reduzido em 2 horas diárias, em cumprimento a legislação", font2));
                aviso.add(new Paragraph (" "));
                aviso.add(new Paragraph("                                                                                   Atenciosamente,", font2));
                aviso.add(new Paragraph (" "));
                aviso.add(new Paragraph (" "));
                aviso.add(new Paragraph ("                                                                                  ....................................................................."));
                aviso.add(new Paragraph ("                                                                                                                                                                     Assinatura do empregador", font1));
                aviso.add(new Paragraph(" "));
                aviso.add(new Paragraph(" Ciente:                                                                                                Local e data do recebimento.", font4));
                aviso.add(new Paragraph (" "));
                aviso.add(new Paragraph (" "));
                aviso.add(new Paragraph(".....................................................................                                        " + getDateTime() , font4));
                aviso.add(new Paragraph("                     Assinatura do empregado ou responsável", font1));
                
            } catch (DocumentException | FileNotFoundException ex) {
                System.out.println("Error:"+ex);
            }finally{
                aviso.close();
            }
       }
    }//GEN-LAST:event_jButtonGerarArquivoActionPerformed

    private void jButtonAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "1.Selecione o aviso prévio referente ao funcionário desejado.\n\n2.Para editar os dados do aviso prévio selecionado, clique no botão [Editar Aviso].\n\n3.Clique no botão [Gerar Arquivo] para emitir um documento PDF de aviso prévio para o funcionário.\n\n4.Vá para o diretório do sistema Ribanceira para encontrar o PDF do aviso prévio","Ajuda - Gerar Aviso Prévio",JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_jButtonAjudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjuda;
    private javax.swing.JButton jButtonEditarAviso;
    private javax.swing.JButton jButtonGerarArquivo;
    private javax.swing.JLabel jLabelAvisosRegistrados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAvisosRegistrados;
    // End of variables declaration//GEN-END:variables
}
