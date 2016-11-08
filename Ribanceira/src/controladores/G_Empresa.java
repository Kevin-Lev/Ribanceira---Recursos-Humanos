/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAO.Empresa;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.hibernate.Session;

/**
 *
 * @author Alessandra
 */
public class G_Empresa {
    public ArrayList<Empresa> getListaEmpresa() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<Empresa> listaEmpresa = (ArrayList<Empresa>) s.createQuery("From Empresa").list();
        Collections.sort(listaEmpresa, new Comparator<Empresa>() {
            @Override
            public int compare(Empresa o1, Empresa o2) {
                return o1.getNomeEmpresa().compareTo(o2.getNomeEmpresa());
            }
        });
        s.getTransaction().commit();
        return listaEmpresa;
    }
}
