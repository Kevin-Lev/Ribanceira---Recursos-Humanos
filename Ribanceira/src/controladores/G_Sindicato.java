/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAO.Sindicato;
import org.hibernate.Session;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Christian T. Nakata
 */
public class G_Sindicato{
    
    public ArrayList<Sindicato> getListaSindicato() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<Sindicato> listaSindicato = (ArrayList<Sindicato>) s.createQuery("From Sindicato").list();
        Collections.sort(listaSindicato, new Comparator<Sindicato>() {
            @Override
            public int compare(Sindicato o1, Sindicato o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        s.getTransaction().commit();
        return listaSindicato;
    }
    
    public void cadastrarSindicato(int codigo, String nome, String ramoAtividade, String endereco, String telefone){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.save(new Sindicato(codigo, nome, ramoAtividade, endereco, telefone));
      s.getTransaction().commit();
    }
    
    public void EditarSindicato(int codigo, String nome, String ramoAtividade, String endereco, String telefone){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.saveOrUpdate(new Sindicato(codigo, nome, ramoAtividade, endereco, telefone));
      s.getTransaction().commit();
    }
    
    public void ExcluirSindicato(int codigo, String nome, String ramoAtividade, String endereco, String telefone){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.delete(new Sindicato(codigo, nome, ramoAtividade, endereco, telefone));
      s.getTransaction().commit();
    }
    
    public void atualizaSindicato (Sindicato sind) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.saveOrUpdate(sind);
        s.getTransaction().commit();   
    }
}