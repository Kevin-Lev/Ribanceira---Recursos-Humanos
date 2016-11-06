package DAO;
// Generated 06/11/2016 18:36:40 by Hibernate Tools 4.3.1



/**
 * AvisoPrevio generated by hbm2java
 */
public class AvisoPrevio  implements java.io.Serializable {


     private Integer codigo;
     private Funcionario funcionario;
     private String dataAviso;
     private String dataRescisao;
     private boolean justificado;
     private String motivo;

    public AvisoPrevio() {
    }

    public AvisoPrevio(Funcionario funcionario, String dataAviso, String dataRescisao, boolean justificado, String motivo) {
       this.funcionario = funcionario;
       this.dataAviso = dataAviso;
       this.dataRescisao = dataRescisao;
       this.justificado = justificado;
       this.motivo = motivo;
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
    public String getDataAviso() {
        return this.dataAviso;
    }
    
    public void setDataAviso(String dataAviso) {
        this.dataAviso = dataAviso;
    }
    public String getDataRescisao() {
        return this.dataRescisao;
    }
    
    public void setDataRescisao(String dataRescisao) {
        this.dataRescisao = dataRescisao;
    }
    public boolean isJustificado() {
        return this.justificado;
    }
    
    public void setJustificado(boolean justificado) {
        this.justificado = justificado;
    }
    public String getMotivo() {
        return this.motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }




}


