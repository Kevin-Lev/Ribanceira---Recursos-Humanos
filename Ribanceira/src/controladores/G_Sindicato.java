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
        Session s;
        
        s = HibernateUtil.getSessionFactory().getCurrentSession();
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
    
    public void cadastrarSindicato(String codigo, String nome, String ramoAtividade, String endereco, String telefone){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.save(new Sindicato(codigo, nome, ramoAtividade, endereco, telefone));
      s.getTransaction().commit();
    }
    
    public void EditarSindicato(String codigo, String nome, String ramoAtividade, String endereco, String telefone){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.saveOrUpdate(new Sindicato(codigo, nome, ramoAtividade, endereco, telefone));
      s.getTransaction().commit();
    }
    
    public void ExcluirSindicato(Sindicato sindicato){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.delete(sindicato);
      s.getTransaction().commit();
    }
    
    public void atualizarSindicato (Sindicato sindicato) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.saveOrUpdate(sindicato);
        s.getTransaction().commit();   
    }
}