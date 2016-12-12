package DAO;
// Generated 12/12/2016 09:15:58 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * RegistroAtividades generated by hbm2java
 */
public class RegistroAtividades  implements java.io.Serializable {


     private Integer codigo;
     private Funcionario funcionario;
     private Date data;
     private Date horaEntrada;
     private Date horaSaida;

    public RegistroAtividades() {
    }

	
    public RegistroAtividades(Funcionario funcionario, Date data) {
        this.funcionario = funcionario;
        this.data = data;
    }
    public RegistroAtividades(Funcionario funcionario, Date data, Date horaEntrada, Date horaSaida) {
       this.funcionario = funcionario;
       this.data = data;
       this.horaEntrada = horaEntrada;
       this.horaSaida = horaSaida;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public Date getHoraEntrada() {
        return this.horaEntrada;
    }
    
    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public Date getHoraSaida() {
        return this.horaSaida;
    }
    
    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }




}

