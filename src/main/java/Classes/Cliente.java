/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Anderson Junior
 */
public class Cliente {
    
    
    private String id; 
    
    private String nome;
    private String cpf;
    private String rg;
    
    private String telefone;
public Cliente (){
    
    
    
}
    
public Cliente (String nome,String cpf,String rg,String telefone){
    
    this.nome = nome;
    this.cpf = cpf;
    this.rg = rg;
    this.telefone = telefone;
    
}

public Cliente (String id,String nome,String cpf,String rg,String telefone){
    this.nome = nome;
    this.cpf = cpf;
    this.rg = rg;
    this.telefone = telefone;
    
    
    
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    
    
}
