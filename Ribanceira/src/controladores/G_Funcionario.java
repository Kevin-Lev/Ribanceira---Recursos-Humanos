/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAO.Funcionario;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.hibernate.Session;
/**
 *
 * @author Alessandra
 */
public class G_Funcionario {
    
    public void salvaFuncionario(String nome, String dataNascimento, String endereco, String telefone, String email, String rg, String cpf, String tituloEleitor, String estadoCivil, String numeroCarteiraTrabalho, boolean ativo) {
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(new Funcionario(nome, dataNascimento, endereco, telefone, email, rg, cpf, tituloEleitor, estadoCivil, numeroCarteiraTrabalho, ativo));
        s.getTransaction().commit();
        
    }
    
    public ArrayList<Funcionario> getListaFuncionario() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<Funcionario> listaFuncionario = (ArrayList<Funcionario>) s.createQuery("From Funcionario").list();
        Collections.sort(listaFuncionario, new Comparator<Funcionario>() {
            @Override
            public int compare(Funcionario o1, Funcionario o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        s.getTransaction().commit();
        return listaFuncionario;
    }
    
    public ArrayList<Funcionario> getListaIdFuncionario() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<Funcionario> listaFuncionario = (ArrayList<Funcionario>) s.createQuery("From Funcionario").list();
        Collections.sort(listaFuncionario, new Comparator<Funcionario>() {
            @Override
            public int compare(Funcionario o1, Funcionario o2) {
                return o1.getCodigo().compareTo(o2.getCodigo());
            }
        });
        s.getTransaction().commit();
        return listaFuncionario;
    }
    
    
    public void atualizaFuncionario(Funcionario f) {
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.saveOrUpdate(f);
        s.getTransaction().commit();
        
    }
    
}
