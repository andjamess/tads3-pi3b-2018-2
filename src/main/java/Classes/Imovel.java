/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author AnD James
 */
public class Imovel {
   private String id;

    private String cep;
    private String endereco;
    private String complemento;
    private String cidade;
    private String estado;
    private String comodos;
    private String valor;
    private String suites;
    private String dormitorios;

    
    
    
    public Imovel() {

    }

    
    
    public Imovel(String id,String cep, String endereco, String complemento, String cidade, String estado, String comodos, String suites, String dormitorios, String valor) {
        this.id = id;
        this.cep = cep;
        this.endereco = endereco;
        this.complemento = complemento;
        this.suites = suites;
        this.comodos = comodos;
        this.valor = valor;
        this.dormitorios = dormitorios;
        this.cidade = cidade;
        this.estado = estado;
    }
    
 

    
    /**public Imovel(String cep, String endereco, String complemento, String cidade, String estado, String comodos, String suites, String dormitorios, String valor) {
        this.id = id;
        this.cep = cep;
        this.endereco = endereco;
        this.complemento = complemento;
        this.suites = suites;
        this.comodos = comodos;
        this.valor = valor;
        this.dormitorios = dormitorios;
        this.cidade = cidade;
        this.estado = estado;
    }*/

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @return the comodos
     */
    public String getComodos() {
        return comodos;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @return the suites
     */
    public String getSuites() {
        return suites;
    }

    /**
     * @return the dormitorios
     */
    public String getDormitorios() {
        return dormitorios;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @param comodos the comodos to set
     */
    public void setComodos(String comodos) {
        this.comodos = comodos;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @param suites the suites to set
     */
    public void setSuites(String suites) {
        this.suites = suites;
    }

    /**
     * @param dormitorios the dormitorios to set
     */
    public void setDormitorios(String dormitorios) {
        this.dormitorios = dormitorios;
    }

}
