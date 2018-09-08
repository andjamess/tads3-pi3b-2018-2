/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3b;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.senac.tads.pi3b.Lojinha;

public class ConectaBD {

    private Connection obterConexao() throws ClassNotFoundException, SQLException {

        Connection conn = null;

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PRODUTOBD", "root", "");

        return conn;
    }

    //Mostra informaçoes
    public void consultar() {

        String querySql = "SELECT ID,NOME,DESCRICAO,PRECO_COMPRA,PRECO_VENDA,QUANTIDADE,DT_CADASTRO FROM PRODUTOBD.PRODUTO";

        Lojinha loja = new Lojinha();

        try (Connection conn = obterConexao()) {

            PreparedStatement stmt = conn.prepareStatement(querySql);
            ResultSet resultados = stmt.executeQuery();

            while (resultados.next()) {

                // Recebe o valor do banco 
                int id = resultados.getInt("ID");
                loja.setId(id);

                String nome = resultados.getString("NOME");

                String descricao = resultados.getString("DESCRICAO");

                double preCompra = resultados.getDouble("PRECO_COMPRA");

                double preVenda = resultados.getDouble("PRECO_VENDA");

                int quantidade = resultados.getInt("QUANTIDADE");

                Date dtCadastro = resultados.getDate("DT_CADASTRO");

                //Printa as informaçoes na tela         
                System.out.println(""
                        + ""
                        + ":"
                        + ""
                        + " Nome:" + nome + "|" + " Descrição:" + descricao + "|" + " Preco compra:" + preCompra + "\n"
                        + " Preco venda:" + preVenda + "|" + "Quantidade:" + quantidade + "|" + "\n" + "Data:" + dtCadastro
                        + "\n"
                );
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lojinha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lojinha.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Adicionar os produtos 
    public void adicionarProduto() {

        Scanner sc = new Scanner(System.in);
        Lojinha loja = new Lojinha();

        //Seta informaçoes aqui
        System.out.println("Nome:");
        loja.setNome(sc.nextLine());
        System.out.println("Descriçao");
        loja.setDescricao(sc.nextLine());
        System.out.println("Preço compra");
        loja.setPrecoCompra(sc.nextDouble());
        System.out.println("Preço venda");
        loja.setPrecoVenda(sc.nextDouble());
        System.out.println("Quantidade");
        loja.setQuantidade(sc.nextInt());
        System.out.println("");
        loja.setDtCadastro(new Date(System.currentTimeMillis()));

        String querySql = "INSERT INTO PRODUTOBD.PRODUTO(NOME,DESCRICAO,PRECO_COMPRA,PRECO_VENDA,QUANTIDADE,DT_CADASTRO)  VALUES(?,?,?,?,?,?)";

        try (Connection conn = obterConexao();) {

            PreparedStatement stmt = conn.prepareStatement(querySql);

            stmt.setString(1, loja.getNome());
            stmt.setString(2, loja.getDescricao());
            stmt.setDouble(3, loja.getPrecoCompra());
            stmt.setDouble(4, loja.getPrecoVenda());
            stmt.setInt(5, loja.getQuantidade());
            stmt.setDate(6, loja.getData());
            stmt.execute();
            stmt.close();
            System.out.println("Inserido com sucesso!"
                    + "\n");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectaBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void alterar(Lojinha loja) {

        Scanner op = new Scanner(System.in);
        String nome = "";
        String sql;

        System.out.println("Digite o nome correspondente ao registro q deseja alterar:");
        nome = op.nextLine();

        sql = "UPDATE PRODUTOBD.PRODUTO SET NOME=?,DESCRICAO=?,PRECO_COMPRA=?,PRECO_VENDA=?,QUANTIDADE=? WHERE NOME=" + "'" + nome + "'";

        try (Connection conn = obterConexao()) {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            System.out.println("Novo nome:");
            preparedStatement.setString(1, op.nextLine());
            System.out.println("Nova Descriçao:");
            preparedStatement.setString(2, op.nextLine());
            System.out.println("Novo Preco compra:");
            preparedStatement.setDouble(3, op.nextDouble());
            System.out.println("Novo Preco venda:");
            preparedStatement.setDouble(4, op.nextDouble());
            System.out.println("Nova Quantidade:");
            preparedStatement.setInt(5, op.nextInt());
            preparedStatement.executeUpdate();
            System.out.println("Atualizado com sucesso!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectaBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void excluir() {
        Lojinha loja = new Lojinha();
        Scanner op = new Scanner(System.in);
        String nome = "";
        System.out.println("Digite oque deseja deletar.\n"
                + "1. TUDO"
                + "\n"
                + "2. Registro especificado por nome"
                + "");

        String sql = "DELETE FROM  PRODUTOBD.PRODUTO ";
        int opcao = op.nextInt();

        if (opcao == 2) {
            System.out.println("Escreva o nome desejado:");

            nome = op.nextLine();
            nome = op.nextLine();

            sql = "DELETE FROM  PRODUTOBD.PRODUTO WHERE NOME='" + nome + "'";
            System.out.println(sql);
        }

        try (Connection conn = obterConexao();) {

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.executeUpdate();
            System.out.println("Deletado com sucesso!"
                    + "\n");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectaBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
