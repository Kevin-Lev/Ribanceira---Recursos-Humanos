package DAO;
// Generated 26/01/2017 15:06:14 by Hibernate Tools 4.3.1



/**
 * RegistroAtividades generated by hbm2java
 */
public class RegistroAtividades  implements java.io.Serializable {


     private Integer codigo;
     private Funcionario funcionario;
     private String data;
     private String horaEntrada;
     private String horaSaida;
     private boolean processado;
     public boolean isProcessado;

    public RegistroAtividades() {
    }

	
    public RegistroAtividades(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public RegistroAtividades(Funcionario funcionario, String data, String horaEntrada, String horaSaida, boolean processado){
       this.funcionario = funcionario;
       this.data = data;
       this.horaEntrada = horaEntrada;
       this.horaSaida = horaSaida;
       this.processado = processado;
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
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    public String getHoraEntrada() {
        return this.horaEntrada;
    }
    
    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public String getHoraSaida() {
        return this.horaSaida;
    }
    
    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public boolean isIsProcessado() {
        return isProcessado;
    }

    public void setIsProcessado(boolean isProcessado) {
        this.isProcessado = isProcessado;
    }
    
    
        
    public boolean isProcessado() {
        return this.processado;
    }

}

