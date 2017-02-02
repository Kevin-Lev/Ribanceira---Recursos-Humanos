/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

/**
 *
 * @author Kevin Levrone
 */

import DAO.Funcionario;
import DAO.Ocorrencia;
import controladores.G_Ocorrencia;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
        
public class TesteOcorrencias {
    G_Ocorrencia g_ocorrencia = new G_Ocorrencia();
    Ocorrencia caso[] = new Ocorrencia[8];
    Funcionario funcionario = new Funcionario(/*"João", "02/01/1990", "rua", "2349813", "f@g.com", "1235145", "32125", "342929", "casado", "9845783567", true, Float.parseFloat("400.0")*/);
    Ocorrencia ocorrencia = new Ocorrencia(funcionario, "12/05/2016", "Hora Extra", true, Float.parseFloat("300"), "7.30", "19.30");

    public TesteOcorrencias() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp(){
        
    // TESTE FUNCIONÁRIO == NULL    
        caso[0] = new Ocorrencia();
        caso[0].setDataOcorrencia("12/06/2014");
        caso[0].setFuncionario(null);
        caso[0].setHoraEntra("7.45");
        caso[0].setHoraSai("18.00");
        caso[0].setJustificado(false);
        caso[0].setTipo("Atraso");
        caso[0].setValor(300);
        
    // TESTE DATA OCORRENCIA == NULL   
        caso[1] = new Ocorrencia();
        caso[1].setDataOcorrencia(null);
        caso[1].setFuncionario(funcionario);
        caso[1].setHoraEntra("7.00");
        caso[1].setHoraSai("18.00");
        caso[1].setJustificado(true);
        caso[1].setTipo("Atraso");
        caso[1].setValor(500);
        
    // TESTE TIPO OCORRENCIA == ""
        caso[2] = new Ocorrencia();
        caso[2].setDataOcorrencia("12/08/2014");
        caso[2].setFuncionario(funcionario);
        caso[2].setHoraEntra("7.00");
        caso[2].setHoraSai("18.00");
        caso[2].setJustificado(false);
        caso[2].setTipo("");
        caso[2].setValor(0);
        
    // TESTE HORA ENTRA < 7.00
        caso[3] = new Ocorrencia();
        caso[3].setDataOcorrencia("12/08/2014");
        caso[3].setFuncionario(funcionario);
        caso[3].setHoraEntra("6.59");
        caso[3].setHoraSai("18.00");
        caso[3].setJustificado(false);
        caso[3].setTipo("");
        caso[3].setValor(300);
        
    // TESTE HORA SAI > 23.59
        caso[4] = new Ocorrencia();
        caso[4].setDataOcorrencia("12/08/2014");
        caso[4].setFuncionario(funcionario);
        caso[4].setHoraEntra("6.59");
        caso[4].setHoraSai("24.00");
        caso[4].setJustificado(false);
        caso[4].setTipo("");
        caso[4].setValor(300);
        
    // TESTE SET VALOR < 0    
        caso[5] = new Ocorrencia();
        caso[5].setDataOcorrencia("12/08/2014");
        caso[5].setFuncionario(funcionario);
        caso[5].setHoraEntra("8.00");
        caso[5].setHoraSai("21.00");
        caso[5].setJustificado(true);
        caso[5].setTipo("");
        caso[5].setValor(-5);
    }
    
    @After
    public void tearDown() {
    }
    
public void testePersisteOcorrencia() {   
    System.out.println("Testando Ocorrencia...");
    
    assertFalse(g_ocorrencia.persistOcorrencia(caso[0]));
    System.out.println("Caso 0: OK!");
    assertFalse(g_ocorrencia.persistOcorrencia(caso[1]));
    System.out.println("Caso 1: OK");
    assertFalse(g_ocorrencia.persistOcorrencia(caso[2]));
    System.out.println("Caso 2: OK");
    assertFalse(g_ocorrencia.persistOcorrencia(caso[3]));
    System.out.println("Caso 3: OK");
    assertFalse(g_ocorrencia.persistOcorrencia(caso[4]));
    System.out.println("Caso 4: OK");
    assertFalse(g_ocorrencia.persistOcorrencia(caso[5]));
    System.out.println("Caso 5: OK");
    
  }
}