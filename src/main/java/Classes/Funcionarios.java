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
public class Funcionarios {

private String nome;
 private String rg;
 private String cpf;
private String filial;
  private String cargo;
  
  
    public Funcionarios() {
   

    }
    
    public Funcionarios(String nome, String rg, String cpf, String filial, String cargo) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.filial = filial;
        this.cargo = cargo;

    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return the filial
     */
    public String getFilial() {
        return filial;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param filial the filial to set
     */
    public void setFilial(String filial) {
        this.filial = filial;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
