/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ribanceira;


/**
 *
 * @author admin
 */
public class Ribanceira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        // OBSERVER
        Funcionario f = new G_Funcionario().getListaIdFuncionario().get(3);
        Ocorrencia o = new Ocorrencia();
        RegistroAtividades r = new RegistroAtividades();
        r.addObserver(o);
        r.setFuncionario(f);
        r.setData("23/12/2016");
        r.setHoraEntrada("09.00");
        r.setHoraSaida("18.00");
        */
        
        /*
        // SINGLETON
        Singleton conexaoSingleton = Singleton.getInstancia();
        Connection conexao = conexaoSingleton.getConexao();
        */
        
        new Login();
        /*
        ArrayList<Funcionario> listaFunc = new G_Funcionario().getListaFuncionario();
        
        for(Funcionario f : listaFunc){
            System.out.println("Nome:" + f.getNome());
            System.out.println("CPF:" + f.getCpf());
        }
          
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
        for(Contrato c : listaContrato) {
            System.out.println(c.getCodigo());
            System.out.println(c.getFuncionario().getNome());
        }*/
    
    }
    
}
