/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAO.ConvencaoColetiva;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.hibernate.Session;

/**
 *
 * @author Christian T. Nakata
 */

public class G_ConvencaoColetiva {
    
    public void salvaConvencaoColetiva(String sindicato, String categoria, String data, String proporcaoSalMinimo) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(new ConvencaoColetiva(sindicato, categoria, data, proporcaoSalMinimo));
        s.getTransaction().commit();
    }

    public ArrayList<ConvencaoColetiva> getListaConvencaoColetiva() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<ConvencaoColetiva> listaConvencaoColetiva = (ArrayList<ConvencaoColetiva>) s.createQuery("From ConvencaoColetiva").list();
        Collections.sort(listaConvencaoColetiva, new Comparator<ConvencaoColetiva>() {
            @Override
            public int compare(ConvencaoColetiva c1, ConvencaoColetiva c2) {
                return c1.getCodigo().compareTo(c2.getCodigo());
            }
        });
        s.getTransaction().commit();
        return listaConvencaoColetiva;
    }
    
    public void atualizaConvencaoColetiva(ConvencaoColetiva c) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.saveOrUpdate(c);
        s.getTransaction().commit();
    }
}