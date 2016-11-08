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
import org.hibernate.Session;

/**
 *
 * @author Alessandra
 */
public class G_Contrato {
    public void salvaContrato(Empresa empresa, Funcionario funcionario, float cargaHoraria, float horasExtras, float comissao, float duracao, boolean experiencia, int ferias, boolean abonoPecuniario, boolean valeTransporte, boolean valeRefeicao) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(new Contrato(empresa, funcionario, cargaHoraria, horasExtras, comissao, duracao, experiencia, ferias, abonoPecuniario, valeTransporte, valeRefeicao));
        s.getTransaction().commit();
    }
}
