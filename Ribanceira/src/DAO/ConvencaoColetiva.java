package DAO;
// Generated Jan 25, 2017 8:24:35 PM by Hibernate Tools 4.3.1

/**
 * ConvencaoColetiva generated by hbm2java
 */

public class ConvencaoColetiva  implements java.io.Serializable {

     private String codigo;
     private String categoria;
     private String data;
     private String sindicato;
     private String proporcaoSalMinimo;

    public ConvencaoColetiva() {
    }

    public ConvencaoColetiva(String codigo, String categoria, String data, String sindicato, String proporcaoSalMinimo) {
       this.codigo = codigo;
       this.sindicato = sindicato;
       this.categoria = categoria;
       this.data = data;
       this.proporcaoSalMinimo = proporcaoSalMinimo;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getSindicato() {
        return this.sindicato;
    }
    
    public void setSindicato(String sindicato) {
        this.sindicato = sindicato;
    }
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    public String getPropSalario() {
        return this.proporcaoSalMinimo;
    }
    
    public void setPropSalario (String proporcaoSalMinimo) {
        this.proporcaoSalMinimo = proporcaoSalMinimo;
    }
}


