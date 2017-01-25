/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAO.Contrato;
import DAO.Empresa;
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
public class G_Contrato {

    public void salvaContrato(Empresa empresa, Funcionario funcionario, float cargaHoraria, String horaEntrada, String horaSaida, float horasExtras, float comissao, float duracao, boolean experiencia, int ferias, boolean valeTransporte, boolean valeRefeicao, float baseSalarial, boolean ativo) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(new Contrato(empresa, funcionario, cargaHoraria, horaEntrada, horaSaida, horasExtras, comissao, duracao, experiencia, ferias, valeTransporte, valeRefeicao, baseSalarial, ativo));
        s.getTransaction().commit();
    }

    public ArrayList<Contrato> getListaContrato() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<Contrato> listaContrato = (ArrayList<Contrato>) s.createQuery("From Contrato").list();
        Collections.sort(listaContrato, new Comparator<Contrato>() {
            @Override
            public int compare(Contrato o1, Contrato o2) {
                return o1.getCodigo().compareTo(o2.getCodigo());
            }
        });
        s.getTransaction().commit();
        return listaContrato;
    }
    
    public Contrato getContrato(Funcionario f) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Contrato c = new Contrato();
        ArrayList<Contrato> listaContrato = (ArrayList<Contrato>) s.createQuery("From Contrato").list();
        for(Contrato c1 : listaContrato) {
            if(c1.getFuncionario().equals(f)) {
                c = c1;
            }
        }
        s.getTransaction().commit();
        return c;
    }
    
    public ArrayList<Contrato> getListaContrato(Empresa e) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        ArrayList<Contrato> listaContrato = (ArrayList<Contrato>) s.createQuery("From Contrato").list();
        ArrayList<Contrato> listaContratoEmpresa = new ArrayList<Contrato>();
        for(Contrato c1 : listaContrato) {
            if(c1.getEmpresa().equals(e)) {
                listaContratoEmpresa.add(c1);
            }
        }
        s.getTransaction().commit();
        return listaContratoEmpresa;
    }
    
    public void atualizaContrato(Contrato c) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.saveOrUpdate(c);
        s.getTransaction().commit();
    }
}
