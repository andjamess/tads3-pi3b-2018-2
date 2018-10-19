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
public class Imoveis {

    private String cep;
    private String endereco;
    private String complemento;
    private String cidade;
    private String estado;
    private String comodos;
    private String valor;
    private String suites;
    private String dormitorios;

    public Imoveis(String cep, String endereco, String complemento, String cidade, String estado, String comodos, String suites, String dormitorios, String valor) {
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

}
