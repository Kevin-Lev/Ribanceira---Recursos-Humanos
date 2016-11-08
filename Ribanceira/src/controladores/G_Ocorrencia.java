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

/**
 *
 * @author kevin
 */
public class G_Ocorrencia{
    
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
