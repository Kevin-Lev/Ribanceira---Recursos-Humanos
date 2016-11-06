package DAO;
// Generated 06/11/2016 18:36:40 by Hibernate Tools 4.3.1



/**
 * Salario generated by hbm2java
 */
public class Salario  implements java.io.Serializable {


     private Integer codigo;
     private Funcionario funcionario;
     private float baseSalarial;

    public Salario() {
    }

    public Salario(Funcionario funcionario, float baseSalarial) {
       this.funcionario = funcionario;
       this.baseSalarial = baseSalarial;
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
    public float getBaseSalarial() {
        return this.baseSalarial;
    }
    
    public void setBaseSalarial(float baseSalarial) {
        this.baseSalarial = baseSalarial;
    }




}


