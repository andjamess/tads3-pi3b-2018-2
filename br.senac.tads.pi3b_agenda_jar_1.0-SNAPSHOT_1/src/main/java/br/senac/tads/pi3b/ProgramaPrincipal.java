/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3b;

import java.util.Scanner;

/**
 *
 * @author anderson.jscosta
 */
public class ProgramaPrincipal {

    public static void main(String[] args) {
        System.out.println("Entrou ");
        // Conecta banco de dados 
        ConectaBD conecta = new ConectaBD();
        
        System.out.println("Entrou !!");
        // Declara objeto loja 
        Lojinha loja = new Lojinha();
        //Entrada do usuario 
        int entrada = 0;
        Scanner sc = new Scanner(System.in);
        while (entrada == 0) {

            System.out.println("Digite a opção"
                    + "1.Mostrar informaçoes dos produtos"
                    + "2.Adicionar produto"
                    + "");
            //Recebe valor do usuario 
            entrada = sc.nextInt();
            if (entrada == 1) {
                conecta.executar();
                
                //Mostra informaçoes dos produtos 
                System.out.println("Nome:" + loja.getNome());
                System.out.println("Descriçao:" + loja.getDescricao());
                System.out.println("Preço Compra:" + loja.getPrecoCompra());
                System.out.println("Preço Venda :" + loja.getPrecoVenda());
                System.out.println("Quantidade:" + loja.getQuantidade());
                                        
            }

            conecta.executar();
        }
    }

}
