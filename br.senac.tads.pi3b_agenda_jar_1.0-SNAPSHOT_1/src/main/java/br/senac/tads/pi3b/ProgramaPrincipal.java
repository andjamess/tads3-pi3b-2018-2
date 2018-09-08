package br.senac.tads.pi3b;

import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Lojinha loja = new Lojinha();
        
     ConectaBD conecta =new ConectaBD();
        double pesquisar, inserir, alterar, excluir;
        int opcao=25;

while(opcao!=0){
        System.out.println("Escolha a opção:\n"
                + "1-Alterar\n"
                + "2-Inserir\n"
                + "3-Consultar\n"
                + "4-Excluir\n"
                + "0-Sair");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Alterar");
            conecta.alterar(loja);
                break;
            case 2:
                System.out.println("Inserir");
                conecta.adicionarProduto();
                break;
            case 3:
                System.out.println("Mostrar informaçoes ");
                          conecta.consultar();
                break;
            case 4:
                System.out.println("Excluir");
                      conecta.excluir();
                break;
            case 0:
                break;
        }}

    }

}
