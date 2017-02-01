package testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.Contrato;
import DAO.Empresa;
import DAO.Funcionario;
import controladores.G_Contrato;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alessandra
 */
public class TesteContrato {
    G_Contrato g_contrato = new G_Contrato();
    Contrato caso[] = new Contrato[8];
    Empresa empresa = new Empresa("UEM", "UEM", "23141234", "23141234", "23141234", "venda", "rua", "1234124", "e@g.com", true);
    Funcionario funcionario = new Funcionario("João", "02/01/1990", "rua", "2349813", "f@g.com", "1235145", "32125", "342929", "casado", "9845783567", true);
    
    public TesteContrato() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        // TESTE EMPRESA ou FUNCIONARIO IGUAL A null
        caso[0] = new Contrato();
        caso[0].setEmpresa(null);
        caso[0].setFuncionario(funcionario);
        caso[0].setCargaHoraria(Float.parseFloat("10"));
        caso[0].setHorasExtras(Float.parseFloat("10"));
        caso[0].setComissao(Float.parseFloat("10"));
        caso[0].setDuracao(Float.parseFloat("10"));
        caso[0].setFerias(10);
        caso[0].setBaseSalarial(Float.parseFloat("10"));
        caso[0].setImpostos(Float.parseFloat("0.4"));
        
        // CARGA HORÁRIA IGUAL A 0
        caso[1] = new Contrato();
        caso[1].setEmpresa(empresa);
        caso[1].setFuncionario(funcionario);
        caso[1].setCargaHoraria(Float.parseFloat("0"));
        caso[1].setHorasExtras(Float.parseFloat("10"));
        caso[1].setComissao(Float.parseFloat("10"));
        caso[1].setDuracao(Float.parseFloat("10"));
        caso[1].setFerias(10);
        caso[1].setBaseSalarial(Float.parseFloat("10"));
        caso[1].setImpostos(Float.parseFloat("0.4"));
        
        // HORAS EXTRAS IGUAL A 1 
        caso[2] = new Contrato();
        caso[2].setEmpresa(empresa);
        caso[2].setFuncionario(funcionario);
        caso[2].setCargaHoraria(Float.parseFloat("10"));
        caso[2].setHorasExtras(Float.parseFloat("1"));
        caso[2].setComissao(Float.parseFloat("10"));
        caso[2].setDuracao(Float.parseFloat("10"));
        caso[2].setFerias(10);
        caso[2].setBaseSalarial(Float.parseFloat("10"));
        caso[2].setImpostos(Float.parseFloat("0.4"));
        
        // COMISSÃO IGUAL A -1
        caso[3] = new Contrato();
        caso[3].setEmpresa(empresa);
        caso[3].setFuncionario(funcionario);
        caso[3].setCargaHoraria(Float.parseFloat("10"));
        caso[3].setHorasExtras(Float.parseFloat("10"));
        caso[3].setComissao(Float.parseFloat("-1"));
        caso[3].setDuracao(Float.parseFloat("10"));
        caso[3].setFerias(10);
        caso[3].setBaseSalarial(Float.parseFloat("10"));
        caso[3].setImpostos(Float.parseFloat("0.4"));
        
        // DURAÇÃO IGUAL A -1
        caso[4] = new Contrato();
        caso[4].setEmpresa(empresa);
        caso[4].setFuncionario(funcionario);
        caso[4].setCargaHoraria(Float.parseFloat("10"));
        caso[4].setHorasExtras(Float.parseFloat("10"));
        caso[4].setComissao(Float.parseFloat("10"));
        caso[4].setDuracao(Float.parseFloat("-1"));
        caso[4].setFerias(10);
        caso[4].setBaseSalarial(Float.parseFloat("10"));
        caso[4].setImpostos(Float.parseFloat("0.4"));
        
        // FÉRIAS IGUAL A -1
        caso[5] = new Contrato();
        caso[5].setEmpresa(empresa);
        caso[5].setFuncionario(funcionario);
        caso[5].setCargaHoraria(Float.parseFloat("10"));
        caso[5].setHorasExtras(Float.parseFloat("10"));
        caso[5].setComissao(Float.parseFloat("10"));
        caso[5].setDuracao(Float.parseFloat("10"));
        caso[5].setFerias(-1);
        caso[5].setBaseSalarial(Float.parseFloat("10"));
        caso[5].setImpostos(Float.parseFloat("0.4"));
        
        // BASE SALARIAL IGUAL A -1
        caso[6] = new Contrato();
        caso[6].setEmpresa(empresa);
        caso[6].setFuncionario(funcionario);
        caso[6].setCargaHoraria(Float.parseFloat("10"));
        caso[6].setHorasExtras(Float.parseFloat("10"));
        caso[6].setComissao(Float.parseFloat("10"));
        caso[6].setDuracao(Float.parseFloat("10"));
        caso[6].setFerias(10);
        caso[6].setBaseSalarial(Float.parseFloat("-1"));
        caso[6].setImpostos(Float.parseFloat("0.4"));
        
        // IMPOSTOS IGUAL A 1
        caso[7] = new Contrato();
        caso[7].setEmpresa(empresa);
        caso[7].setFuncionario(funcionario);
        caso[7].setCargaHoraria(Float.parseFloat("10"));
        caso[7].setHorasExtras(Float.parseFloat("10"));
        caso[7].setComissao(Float.parseFloat("10"));
        caso[7].setDuracao(Float.parseFloat("10"));
        caso[7].setFerias(10);
        caso[7].setBaseSalarial(Float.parseFloat("10"));
        caso[7].setImpostos(Float.parseFloat("1"));
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of persisteProdPedEstoque method, of class ControlaProdPedEstoque.
     */
    @Test
    public void testePersisteContrato() {
        System.out.println("Testando Contrato...");
        assertFalse(g_contrato.persisteContrato(caso[0])); System.out.println("Caso 0: OK!");
        assertFalse(g_contrato.persisteContrato(caso[1])); System.out.println("Caso 1: OK!");
        assertTrue(g_contrato.persisteContrato(caso[2])); System.out.println("Caso 2: OK!");
        assertFalse(g_contrato.persisteContrato(caso[3])); System.out.println("Caso 3: OK!");
        assertFalse(g_contrato.persisteContrato(caso[4])); System.out.println("Caso 4: OK!");
        assertFalse(g_contrato.persisteContrato(caso[5])); System.out.println("Caso 5: OK!");
        assertFalse(g_contrato.persisteContrato(caso[6])); System.out.println("Caso 6: OK!");
        assertFalse(g_contrato.persisteContrato(caso[7])); System.out.println("Caso 7: OK!");

    }
    
}
