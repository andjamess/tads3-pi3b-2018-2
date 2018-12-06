
package Classes;


public class Cliente {
    private String id;
    private String nome;
    private String rg;
    private String cpf;
    private String telefone;

    public Cliente() {

    }

    public Cliente(String id,String nome, String rg, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    

    public String getNome() {
        return nome;
    }


    public String getRg() {
        return rg;
    }

    /**
     * @return the complemento
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return the comodos
     */
    public String getTelefone() {
        return telefone;
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
     * @param nome the cep to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param rg the endereco to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @param cpf the complemento to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param telefone the cidade to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
