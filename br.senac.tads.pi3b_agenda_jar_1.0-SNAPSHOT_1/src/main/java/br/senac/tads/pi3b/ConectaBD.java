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

/**
 *
 * @author anderson.jscosta
 */
public class ConectaBD {

    private Connection obterConexao() throws ClassNotFoundException, SQLException {

        Connection conn = null;

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/agendabd", "root", "");

        return conn;
    }
    
    //Buscar produtos 
    public void busca() {

        String querySql = "SELECT ID,NOME,DESCRICAO,PRECO_COMPRA,PRECO_VENDA,QUANTIDADE,DT_CADASTRO FROM PRODUTOBD.PRODUTO";

        Lojinha loja = new Lojinha();
        
        
        
        try (Connection conn = obterConexao();
                PreparedStatement stmt = conn.prepareStatement(querySql);
                ResultSet resultados = stmt.executeQuery()) {
            while (resultados.next()) {
       // Recebe o valor do banco 
            long id = resultados.getLong("ID");
               
                String nome = resultados.getString("NOME");
                loja.setNome(nome);            
                String descricao = resultados.getString("DESCRICAO");
                loja.setDescricao(descricao);
                double preCompra = resultados.getDouble("PRECO_COMPRA");
                loja.setPrecoCompra(preCompra);
               double preVenda = resultados.getDouble("PRECO_VENDA");
                loja.setPrecoVenda(preVenda);     
                int quantidade = resultados.getInt("QUANTIDADE");
                 loja.setQuantidade(quantidade);
                 String dtCadastro = resultados.getString("DT_CADASTRO");
                 loja.setDtCadastro(dtCadastro);
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
            // Setar informaçoes aqui 
            System.out.println("Nome:");
            
            System.out.println("Descriçao");
            
            System.out.println("Preço compra");
            
            System.out.println("Preço venda");
            
            System.out.println("Quantidade");
            
            
            
        String querySql = "INSERT INTO PRODUTOBD.PRODUTO(NOME,DESCRICAO,PRECO_COMPRA,PRECO_VENDA,QUANTIDADE,DT_CADASTRO" + "VALUES(?,?,?,?,?,?))";
        

           
              
        try (Connection conn = obterConexao();){
               
            PreparedStatement stmt = conn.prepareStatement(querySql);

            stmt.setString(1, loja.getNome());
            stmt.setString(2, loja.getDescricao());
            stmt.setDouble(3, loja.getPrecoCompra());
            stmt.setDouble(4, loja.getPrecoVenda());
            stmt.setInt(5, loja.getQuantidade());
            stmt.setString(6, loja.getData());
            stmt.execute();
            stmt.close();   
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectaBD.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
                
        
        
                
           }
        
        
        
        
        
        
         
                    
                
           


}
