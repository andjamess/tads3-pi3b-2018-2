/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author AnD James
 */
public interface Comandos {

    //Mostra informaçoes
    void consultar();

    //Adicionar os produtos 
    void adicionar(Produtos p);
    
    
    void adicionar(ProdutoPromocao p);
    
    void alterar();

    void excluir();

}
