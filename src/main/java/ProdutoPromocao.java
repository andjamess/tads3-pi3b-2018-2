

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Date;

public class ProdutoPromocao extends Produtos {

    public ProdutoPromocao() {
        super();
    }

    public ProdutoPromocao(
            int id,
            String nome,
            String descricao,
            double precoCompra,
            double precoVenda,
            int quantidade, Date data, Date dtCadastro, String categoria
    ) {

        super(id, nome, descricao, precoCompra, precoVenda, quantidade);

    }

}
