

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Date;

public class ProdutoPromocao extends Produtos {

    private int desconto;

    public ProdutoPromocao() {
        super();
    }

    public ProdutoPromocao(
            int id,
            String nome,
            String descricao,
            double precoCompra,
            double precoVenda,
            int quantidade, Date data, Date dtCadastro, String categoria, int desconto
    ) {

        super(id, nome, descricao, precoCompra, precoVenda, quantidade);
        this.desconto = desconto;
    }

    /**
     * @return the desconto
     */
    public int getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    
    
    
    
          public double setPrecoVenda(int desconto) {
        return getPrecoVenda()-desconto;
    } }


