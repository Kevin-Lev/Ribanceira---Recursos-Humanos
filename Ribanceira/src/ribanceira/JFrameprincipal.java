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
 * @author Alessandra, Christian, Kevin
 */
public class JFrameprincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrameprincipal
     */
    CardLayout card;

    public JFrameprincipal() {
        initComponents();

        JPanel panelFundo = new JPanelFundo();
        card = (CardLayout) jPanelRoot.getLayout();
        jPanelRoot.add(panelFundo);
        card.show(jPanelRoot, "panelFundo");

        this.setTitle("Ribanceira - Menu Principal");
        this.setSize(800, 600);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRoot = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuEmpresa = new javax.swing.JMenu();
        jMenuItemCadastrar_Emp = new javax.swing.JMenuItem();
        jMenuConsultar_Emp = new javax.swing.JMenuItem();
        jMenuRemover_Emp = new javax.swing.JMenuItem();
        jMenuFuncionario = new javax.swing.JMenu();
        jMenuCadastrar_Fun = new javax.swing.JMenuItem();
        jMenuConsultar_Fun = new javax.swing.JMenuItem();
        jMenuOcorrências = new javax.swing.JMenu();
        jMenuInsere_Oco = new javax.swing.JMenuItem();
        jMenuConsulta_Oco = new javax.swing.JMenuItem();
        jMenuAvisos = new javax.swing.JMenu();
        jMenuGerar_Alerta = new javax.swing.JMenuItem();
        jMenuConsultar_Alerta = new javax.swing.JMenuItem();
        jMenuConvencaoColetiva = new javax.swing.JMenu();
        jMenuItemBuscarConvencaoColetiva = new javax.swing.JMenuItem();
        jMenuItemImportarConvencaoColetiva = new javax.swing.JMenuItem();
        jMenuItemExportarConvencaoColetiva = new javax.swing.JMenuItem();
        jMenuSindicato = new javax.swing.JMenu();
        jMenuItemManterSindicato = new javax.swing.JMenuItem();
        jMenuContrato = new javax.swing.JMenu();
        jMenuItemCadastrarContrato = new javax.swing.JMenuItem();
        jMenuItemConsultarContrato = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelatoriosGerais = new javax.swing.JMenuItem();
        jMenuItemInformesRendimento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelRoot.setLayout(new java.awt.CardLayout());

        jMenuEmpresa.setText("Empresa");
        jMenuEmpresa.setEnabled(false);

        jMenuItemCadastrar_Emp.setText("Cadastrar");
        jMenuItemCadastrar_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrar_EmpActionPerformed(evt);
            }
        });
        jMenuEmpresa.add(jMenuItemCadastrar_Emp);

        jMenuConsultar_Emp.setText("Consultar");
        jMenuConsultar_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultar_EmpActionPerformed(evt);
            }
        });
        jMenuEmpresa.add(jMenuConsultar_Emp);

        jMenuRemover_Emp.setText("Remover");
        jMenuRemover_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRemover_EmpActionPerformed(evt);
            }
        });
        jMenuEmpresa.add(jMenuRemover_Emp);

        jMenuBar1.add(jMenuEmpresa);

        jMenuFuncionario.setText("Funcionário");

        jMenuCadastrar_Fun.setText("Cadastrar");
        jMenuCadastrar_Fun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrar_FunActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(jMenuCadastrar_Fun);

        jMenuConsultar_Fun.setText("Consultar");
        jMenuConsultar_Fun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultar_FunActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(jMenuConsultar_Fun);

        jMenuBar1.add(jMenuFuncionario);

        jMenuOcorrências.setText("Ocorrência");

        jMenuInsere_Oco.setText("Registrar");
        jMenuInsere_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInsere_OcoActionPerformed(evt);
            }
        });
        jMenuOcorrências.add(jMenuInsere_Oco);

        jMenuConsulta_Oco.setText("Consultar");
        jMenuConsulta_Oco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsulta_OcoActionPerformed(evt);
            }
        });
        jMenuOcorrências.add(jMenuConsulta_Oco);

        jMenuBar1.add(jMenuOcorrências);

        jMenuAvisos.setText("Aviso Prévio");

        jMenuGerar_Alerta.setText("Registrar");
        jMenuGerar_Alerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerar_AlertaActionPerformed(evt);
            }
        });
        jMenuAvisos.add(jMenuGerar_Alerta);

        jMenuConsultar_Alerta.setText("Consultar");
        jMenuConsultar_Alerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultar_AlertaActionPerformed(evt);
            }
        });
        jMenuAvisos.add(jMenuConsultar_Alerta);

        jMenuBar1.add(jMenuAvisos);

        jMenuConvencaoColetiva.setText("Convenção Coletiva");

        jMenuItemBuscarConvencaoColetiva.setText("Buscar");
        jMenuItemBuscarConvencaoColetiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarConvencaoColetivaActionPerformed(evt);
            }
        });
        jMenuConvencaoColetiva.add(jMenuItemBuscarConvencaoColetiva);

        jMenuItemImportarConvencaoColetiva.setText("Importar");
        jMenuConvencaoColetiva.add(jMenuItemImportarConvencaoColetiva);

        jMenuItemExportarConvencaoColetiva.setText("Exportar");
        jMenuConvencaoColetiva.add(jMenuItemExportarConvencaoColetiva);

        jMenuBar1.add(jMenuConvencaoColetiva);

        jMenuSindicato.setText("Sindicato");

        jMenuItemManterSindicato.setText("Manter");
        jMenuItemManterSindicato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManterSindicatoActionPerformed(evt);
            }
        });
        jMenuSindicato.add(jMenuItemManterSindicato);

        jMenuBar1.add(jMenuSindicato);

        jMenuContrato.setText("Contrato");

        jMenuItemCadastrarContrato.setText("Cadastrar");
        jMenuItemCadastrarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarContratoActionPerformed(evt);
            }
        });
        jMenuContrato.add(jMenuItemCadastrarContrato);

        jMenuItemConsultarContrato.setText("Consultar");
        jMenuItemConsultarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarContratoActionPerformed(evt);
            }
        });
        jMenuContrato.add(jMenuItemConsultarContrato);

        jMenuBar1.add(jMenuContrato);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemRelatoriosGerais.setText("Gerais");
        jMenuItemRelatoriosGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatoriosGeraisActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelatoriosGerais);

        jMenuItemInformesRendimento.setText("Informes Rendimento");
        jMenuItemInformesRendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInformesRendimentoActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemInformesRendimento);

        jMenuBar1.add(jMenuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastrar_EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrar_EmpActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Cadastrar Empresa");
        JPanel panelCadastrarEmpresa = new JPanelCadastrarEmpresa();
        jPanelRoot.add(panelCadastrarEmpresa);
        card.next(jPanelRoot);

    }//GEN-LAST:event_jMenuItemCadastrar_EmpActionPerformed

    private void jMenuConsultar_FunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultar_FunActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Consultar Funcionário");
        JPanel panelConsultarFuncionario = new JPanelConsultarFuncionario();
        jPanelRoot.add(panelConsultarFuncionario);
        card.next(jPanelRoot);
    }//GEN-LAST:event_jMenuConsultar_FunActionPerformed

    private void jMenuInsere_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInsere_OcoActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Registrar Ocorrência");
        JPanel panelRegistrarOcorrencia = new JPanelRegistrarOcorrencia();
        jPanelRoot.add(panelRegistrarOcorrencia);
        card.next(jPanelRoot);
    }//GEN-LAST:event_jMenuInsere_OcoActionPerformed

    private void jMenuGerar_AlertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerar_AlertaActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Registrar Aviso prévio");
        JPanel panelRegistrarAviso = new JPanelRegistrarAviso();
        jPanelRoot.add(panelRegistrarAviso);
        card.next(jPanelRoot);
    }//GEN-LAST:event_jMenuGerar_AlertaActionPerformed

    private void jMenuConsultar_EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultar_EmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuConsultar_EmpActionPerformed

    private void jMenuRemover_EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRemover_EmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuRemover_EmpActionPerformed

    private void jMenuCadastrar_FunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrar_FunActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Cadastrar Funcionário");
        JPanel panelCadastrarFuncionario = new JPanelCadastrarFuncionario();
        jPanelRoot.add(panelCadastrarFuncionario);
        card.next(jPanelRoot);
    }//GEN-LAST:event_jMenuCadastrar_FunActionPerformed

    private void jMenuConsulta_OcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsulta_OcoActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Consulta de ocorrências");
        JPanel panelConsultar_Oco = new JPanelConsultarOcorrencia();
        jPanelRoot.add(panelConsultar_Oco);
        card.next(jPanelRoot);
    }//GEN-LAST:event_jMenuConsulta_OcoActionPerformed

    private void jMenuConsultar_AlertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultar_AlertaActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Consultar Aviso prévio");
        JPanel panelConsultarAviso = new JPanelConsultarAviso();
        jPanelRoot.add(panelConsultarAviso);
        card.next(jPanelRoot);
    }//GEN-LAST:event_jMenuConsultar_AlertaActionPerformed
    /*
    private void jMenuBuscarConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscarConvActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Buscar Convenção Coletiva");
        JPanel panelConvencaoColetiva = new JPanelConvencaoColetivaSindicato();
        jPanelRoot.add(panelConvencaoColetiva);
        card.next(jPanelRoot);
        
    }//GEN-LAST:event_jMenuBuscarConvActionPerformed

    private void jMenuImportarConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuImportarConvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuImportarConvActionPerformed

    private void jMenuManterSindicatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuManterSindicatoActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Buscar Sindicato");
        
        JPanel panelBuscarSindicato = new JPanelManterSindicatos();
        
        jPanelRoot.add(panelBuscarSindicato);
        
        card.next(jPanelRoot);
        
    }//GEN-LAST:event_jMenuManterSindicatoActionPerformed
*/
    private void jMenuItemManterSindicatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManterSindicatoActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Manter Sindicato");
        //JPanel panelManterSindicato = new JPanelManterSindicatos();
        //jPanelRoot.add(panelManterSindicato);
        card.next(jPanelRoot);
    }//GEN-LAST:event_jMenuItemManterSindicatoActionPerformed

    private void jMenuItemBuscarConvencaoColetivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarConvencaoColetivaActionPerformed
        // TODO add your handling code here
        this.setTitle("Ribanceira RH - Buscar Convenção Coletiva");
        JPanel panelConvencaoColetiva = new JPanelConvencaoColetivaSindicato();
        jPanelRoot.add(panelConvencaoColetiva);
        card.next(jPanelRoot);
    }//GEN-LAST:event_jMenuItemBuscarConvencaoColetivaActionPerformed

    private void jMenuItemCadastrarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarContratoActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Cadastrar Contrato");
        JPanel panelCadastrarContrato = new JPanelCadastrarContrato();
        jPanelRoot.add(panelCadastrarContrato);
        card.next(jPanelRoot);
    }//GEN-LAST:event_jMenuItemCadastrarContratoActionPerformed

    private void jMenuItemConsultarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarContratoActionPerformed
        // TODO add your handling code here:
        this.setTitle("Ribanceira RH - Consultar Contrato");
        JPanel panelConsultarContrato = new JPanelConsultarContrato();
        jPanelRoot.add(panelConsultarContrato);
        card.next(jPanelRoot);
    }//GEN-LAST:event_jMenuItemConsultarContratoActionPerformed

    private void jMenuItemRelatoriosGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatoriosGeraisActionPerformed
        // TODO add your handling code here:
        new JFrameRelatoriosGerais();
    }//GEN-LAST:event_jMenuItemRelatoriosGeraisActionPerformed

    private void jMenuItemInformesRendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInformesRendimentoActionPerformed
        // TODO add your handling code here:
        new JFrameInformesRendimento();
    }//GEN-LAST:event_jMenuItemInformesRendimentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAvisos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastrar_Fun;
    private javax.swing.JMenuItem jMenuConsulta_Oco;
    private javax.swing.JMenuItem jMenuConsultar_Alerta;
    private javax.swing.JMenuItem jMenuConsultar_Emp;
    private javax.swing.JMenuItem jMenuConsultar_Fun;
    private javax.swing.JMenu jMenuContrato;
    private javax.swing.JMenu jMenuConvencaoColetiva;
    private javax.swing.JMenu jMenuEmpresa;
    private javax.swing.JMenu jMenuFuncionario;
    private javax.swing.JMenuItem jMenuGerar_Alerta;
    private javax.swing.JMenuItem jMenuInsere_Oco;
    private javax.swing.JMenuItem jMenuItemBuscarConvencaoColetiva;
    private javax.swing.JMenuItem jMenuItemCadastrarContrato;
    private javax.swing.JMenuItem jMenuItemCadastrar_Emp;
    private javax.swing.JMenuItem jMenuItemConsultarContrato;
    private javax.swing.JMenuItem jMenuItemExportarConvencaoColetiva;
    private javax.swing.JMenuItem jMenuItemImportarConvencaoColetiva;
    private javax.swing.JMenuItem jMenuItemInformesRendimento;
    private javax.swing.JMenuItem jMenuItemManterSindicato;
    private javax.swing.JMenuItem jMenuItemRelatoriosGerais;
    private javax.swing.JMenu jMenuOcorrências;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenuItem jMenuRemover_Emp;
    private javax.swing.JMenu jMenuSindicato;
    private javax.swing.JPanel jPanelRoot;
    // End of variables declaration//GEN-END:variables
}
