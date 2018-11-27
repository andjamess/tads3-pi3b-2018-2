/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LojaConn implements Comandos {

    Scanner sc = new Scanner(System.in);

    private Connection obterConexao() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/produtobd";
        String username = "root";
        String password = "";

        Connection conn = null;

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;

    }

    //Mostra informaçoes
    //Adicionar os produtos 
    public void adicionar(Produtos loja) {

     
           LojaConn c = new LojaConn();


            
            
            String querySql = "INSERT INTO PRODUTOBD.PRODUTO(NOME,DESCRICAO,PRECO_COMPRA,PRECO_VENDA,QUANTIDADE)  VALUES(?,?,?,?,?)";

            try (Connection conn = c.obterConexao();) {

                try (PreparedStatement stmt = conn.prepareStatement(querySql)) {
                    stmt.setString(1, loja.getNome());
                    stmt.setString(2, loja.getDescricao());
                    stmt.setDouble(3, loja.getPrecoCompra());
                    stmt.setDouble(4, loja.getPrecoVenda());
                    stmt.setInt(5, loja.getQuantidade());


                    stmt.execute();
                }
                
                  JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
                System.out.println("Inserido com sucesso!"
                        + "\n");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(LojaConn.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    
    public void adicionar(ProdutoPromocao loja) {


     
           LojaConn c = new LojaConn();


          
 loja.setPrecoVenda(loja.getPrecoVenda(),loja.getDesconto());
           
            
            
            String querySql = "INSERT INTO PRODUTOBD.PRODUTO(NOME,DESCRICAO,PRECO_COMPRA,PRECO_VENDA,QUANTIDADE,DESCONTO)  VALUES(?,?,?,?,?,?)";

            try (Connection conn = c.obterConexao();) {

                try (PreparedStatement stmt = conn.prepareStatement(querySql)) {
                    stmt.setString(1, loja.getNome());
                    stmt.setString(2, loja.getDescricao());
                    stmt.setDouble(3, loja.getPrecoCompra());
                    stmt.setDouble(4, loja.getPrecoVenda());
                    stmt.setInt(5, loja.getQuantidade());
                 stmt.setInt(6, loja.getDesconto());
                    
                    stmt.execute();
                }
                JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
                System.out.println("Inserido com sucesso!"
                        + "\n");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(LojaConn.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


        //Sem desconto 
     //   if (result == 2) {

         
            //LojaConn c = new LojaConn();
//            Scanner sc = new Scanner(System.in);

//            //Seta informaçoes aqui
//            System.out.println("Nome:");
//            loja.setNome(sc.nextLine());
//            System.out.println("Descriçao");
//            loja.setDescricao(sc.nextLine());
//            System.out.println("Preço compra");
//            loja.setPrecoCompra(sc.nextDouble());
//            System.out.println("Preço venda");
//            loja.setPrecoVenda(sc.nextDouble());
//            System.out.println("Quantidade");
//            loja.setQuantidade(sc.nextInt());
//            System.out.println("");
//
//            String querySql = "INSERT INTO PRODUTOBD.PRODUTO(NOME,DESCRICAO,PRECO_COMPRA,PRECO_VENDA,QUANTIDADE)  VALUES(?,?,?,?,?)";
//
//            try (Connection conn = c.obterConexao();) {
//
//                try (PreparedStatement stmt = conn.prepareStatement(querySql)) {
//                    stmt.setString(1, loja.getNome());
//                    stmt.setString(2, loja.getDescricao());
//                    stmt.setDouble(3, loja.getPrecoCompra());
//                    stmt.setDouble(4, loja.getPrecoVenda());
//                    stmt.setInt(5, loja.getQuantidade());
//
//                    stmt.execute();
//                }
//                System.out.println("Inserido com sucesso!"
//                        + "\n");
//            } catch (ClassNotFoundException | SQLException ex) {
//                Logger.getLogger(LojaConn.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//  }

    public void alterar() {
        Produtos loja = new Produtos();
        Scanner op = new Scanner(System.in);
        String nome = "";
        String sql;

        System.out.println("Digite o nome correspondente ao registro que deseja alterar:");
        nome = op.nextLine();

        sql = "UPDATE PRODUTOBD.PRODUTO SET NOME=?,DESCRICAO=?,PRECO_COMPRA=?,PRECO_VENDA=?,QUANTIDADE=? WHERE NOME=" + "'" + nome + "'";

        try (Connection conn = obterConexao()) {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            System.out.println("Novo nome:");
            preparedStatement.setString(1, op.nextLine());
            System.out.println("Nova Descrição:");
            preparedStatement.setString(2, op.nextLine());
            System.out.println("Novo Preco compra:");
            preparedStatement.setDouble(3, op.nextDouble());
            System.out.println("Novo Preco venda:");
            preparedStatement.setDouble(4, op.nextDouble());
            System.out.println("Nova Quantidade:");
            preparedStatement.setInt(5, op.nextInt());
            preparedStatement.executeUpdate();
            System.out.println("Atualizado com sucesso!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LojaConn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void excluir() {
        Produtos loja = new Produtos();
        Scanner op = new Scanner(System.in);
        String nome = "";
        System.out.println("Digite o que deseja deletar.\n"
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LojaConn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void excluirId(int id) {

   
            System.out.println("Escreva o nome desejado:");


           String sql = "DELETE FROM PRODUTOBD.PRODUTO WHERE id="+id;
      
        

        try (Connection conn = obterConexao();) {

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.executeUpdate();
           
            
                  JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
                System.out.println("Deletado com sucesso!"
                        + "\n");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LojaConn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void consultar() {
        Produtos loja = new Produtos();
        String querySql = "SELECT ID,NOME,DESCRICAO,PRECO_COMPRA,PRECO_VENDA,QUANTIDADE,DT_CADASTRO FROM PRODUTOBD.PRODUTO WHERE ";

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

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    public Produtos consultarId(int id) {

        String querySql = "SELECT ID,NOME,DESCRICAO,PRECO_COMPRA,PRECO_VENDA,QUANTIDADE,DT_CADASTRO FROM PRODUTOBD.PRODUTO WHERE ID="+id;

        try (Connection conn = obterConexao()) {

            PreparedStatement stmt = conn.prepareStatement(querySql);
            ResultSet resultados = stmt.executeQuery();

            while (resultados.next()) {

                // Recebe o valor do banco 
            
          
                String nome = resultados.getString("NOME");

                String descricao = resultados.getString("DESCRICAO");

                double preCompra = resultados.getDouble("PRECO_COMPRA");

                double preVenda = resultados.getDouble("PRECO_VENDA");

                int quantidade = resultados.getInt("QUANTIDADE");
                
                

                Date dtCadastro = resultados.getDate("DT_CADASTRO");

                Produtos p = new Produtos (id,nome,descricao,preCompra,preVenda,quantidade); 
                return p;
                 
            
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
}
    
    
}