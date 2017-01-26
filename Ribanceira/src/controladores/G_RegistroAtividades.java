/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAO.RegistroAtividades;
import Util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
/**
 *
 * @author Kevin Levrone
 */
public class G_RegistroAtividades {
    
    public ArrayList<RegistroAtividades> getRegistroAtividades(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<RegistroAtividades> listaRegistro = (ArrayList<RegistroAtividades>) s.createQuery("From RegistroAtividades").list();
        s.getTransaction().commit();
        return listaRegistro;
    }
}
