package br.senac.tads.pi3b;

import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        double pesquisar, inserir, alterar, excluir;
        int opcao;

        System.out.println("Escolha a opção:\n"
                + "1-Pesquisar\n"
                + "2-Inserir\n"
                + "3-Alterar\n"
                + "4-Excluir");

        opcao = op.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Pesquisar");
                break;
            case 2:
                System.out.println("Inserir");
                break;
            case 3:
                System.out.println("Consultar");
                break;
            case 4:
                System.out.println("Excluir");
                break;

        }

    }

}
