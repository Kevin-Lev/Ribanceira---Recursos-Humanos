package DAO;
// Generated 12/12/2016 09:15:58 by Hibernate Tools 4.3.1



/**
 * Informe generated by hbm2java
 */
public class Informe  implements java.io.Serializable {


     private int codigo;
     private Empresa empresa;
     private String tipo;
     private float valor;
     private String mesReferencia;
     private String vencimento;

    public Informe() {
    }

    public Informe(int codigo, Empresa empresa, String tipo, float valor, String mesReferencia, String vencimento) {
       this.codigo = codigo;
       this.empresa = empresa;
       this.tipo = tipo;
       this.valor = valor;
       this.mesReferencia = mesReferencia;
       this.vencimento = vencimento;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float getValor() {
        return this.valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getMesReferencia() {
        return this.mesReferencia;
    }
    
    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }
    public String getVencimento() {
        return this.vencimento;
    }
    
    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }




}


