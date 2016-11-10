/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAO.AvisoPrevio;
import org.hibernate.Session;
import Util.HibernateUtil;
import DAO.Funcionario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Kevin Levrone
 */
public class G_Aviso {
    
    public ArrayList<AvisoPrevio> getListaAvisos() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<AvisoPrevio> listaAvisos = (ArrayList<AvisoPrevio>) s.createQuery("From AvisoPrevio").list();
        Collections.sort(listaAvisos, new Comparator<AvisoPrevio>() {
            @Override
            public int compare(AvisoPrevio o1, AvisoPrevio o2) {
                return o1.getDataAviso().compareTo(o2.getDataAviso());
            }
        });
        s.getTransaction().commit();
        return listaAvisos;
    }
    
    public void SalvaAviso(Funcionario funcionario, String dataAviso, String dataRescisao, boolean justificado, String motivo){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.save(new AvisoPrevio(funcionario, dataAviso, dataRescisao, justificado, motivo));
      s.getTransaction().commit();
    }
    
    public void EditarAviso(Funcionario funcionario, String dataAviso, String dataRescisao, boolean justificado, String motivo){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.saveOrUpdate(new AvisoPrevio(funcionario, dataAviso, dataRescisao, justificado, motivo));
      s.getTransaction().commit();
    }
    
    public void ExcluirAviso(Funcionario funcionario, String dataAviso, String dataRescisao, boolean justificado, String motivo){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.delete(new AvisoPrevio(funcionario, dataAviso, dataRescisao, justificado, motivo));
      s.getTransaction().commit();
    }
}
