/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAO.Ocorrencia;
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
public class G_Ocorrencia{
    
    public ArrayList<Ocorrencia> getListaOcorrencia() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<Ocorrencia> listaOcorrencia = (ArrayList<Ocorrencia>) s.createQuery("From Ocorrencia").list();
        Collections.sort(listaOcorrencia, new Comparator<Ocorrencia>() {
            @Override
            public int compare(Ocorrencia o1, Ocorrencia o2) {
                return o1.getDataOcorrencia().compareTo(o2.getDataOcorrencia());
            }
        });
        s.getTransaction().commit();
        return listaOcorrencia;
    }
    
    public void SalvaOcorrencia(Funcionario nomefun, String dataoco, String tipooco, boolean justificada, float valor){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.save(new Ocorrencia(nomefun, dataoco, tipooco, justificada, valor));
      s.getTransaction().commit();
    }
    
    public void EditarOcorrencia(Funcionario nomefun, String dataoco, String tipooco, boolean justificada, float valor){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.saveOrUpdate(new Ocorrencia(nomefun, dataoco, tipooco, justificada, valor));
      s.getTransaction().commit();
    }
    
    public void ExcluirOcorrencia(Funcionario nomefun, String dataoco, String tipooco, boolean justificada, float valor){
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      s.beginTransaction();
      s.delete(new Ocorrencia(nomefun, dataoco, tipooco, justificada, valor));
      s.getTransaction().commit();
    }
    
}
