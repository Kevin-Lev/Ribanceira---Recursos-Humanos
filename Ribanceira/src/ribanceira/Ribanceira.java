/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;

import DAO.Funcionario;
import controladores.G_Funcionario;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Ribanceira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Login telaLogin = new Login();
        // ou
        
        new Login();
        /*
        ArrayList<Funcionario> listaFunc = new G_Funcionario().getListaFuncionario();
        
        for(Funcionario f : listaFunc){
            System.out.println("Nome:" + f.getNome());
            System.out.println("CPF:" + f.getCpf());
        }
        */        
    }
    
}
