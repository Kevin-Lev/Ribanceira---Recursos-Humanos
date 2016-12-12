package DAO;
// Generated 12/12/2016 09:15:58 by Hibernate Tools 4.3.1



/**
 * Sindicato generated by hbm2java
 */
public class Sindicato  implements java.io.Serializable {


     private int codigo;
     private String nome;
     private String ramoAtividade;
     private String endereco;
     private String telefone;
     private ConvencaoColetiva convencaoColetiva;

    public Sindicato() {
    }

	
    public Sindicato(int codigo, String nome, String ramoAtividade, String endereco, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.ramoAtividade = ramoAtividade;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public Sindicato(int codigo, String nome, String ramoAtividade, String endereco, String telefone, ConvencaoColetiva convencaoColetiva) {
       this.codigo = codigo;
       this.nome = nome;
       this.ramoAtividade = ramoAtividade;
       this.endereco = endereco;
       this.telefone = telefone;
       this.convencaoColetiva = convencaoColetiva;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRamoAtividade() {
        return this.ramoAtividade;
    }
    
    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public ConvencaoColetiva getConvencaoColetiva() {
        return this.convencaoColetiva;
    }
    
    public void setConvencaoColetiva(ConvencaoColetiva convencaoColetiva) {
        this.convencaoColetiva = convencaoColetiva;
    }




}


