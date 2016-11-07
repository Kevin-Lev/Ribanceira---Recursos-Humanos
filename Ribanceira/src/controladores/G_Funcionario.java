/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAO.Funcionario;
import Util.HibernateUtil;
import org.hibernate.Session;
/**
 *
 * @author Alessandra
 */
public class G_Funcionario {
    
    public void salvaFuncionario(String nome, String dataNascimento, String endereco, String telefone, String email, String rg, String cpf, String tituloEleitor, String estadoCivil, String numeroCarteiraTrabalho) {
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(new Funcionario(nome, dataNascimento, endereco, telefone, email, rg, cpf, tituloEleitor, estadoCivil, numeroCarteiraTrabalho));
        s.getTransaction().commit();
        
    }
    
}
