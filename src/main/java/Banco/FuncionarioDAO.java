/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Classes.BackOffice;
import Classes.Funcionarios;
import Classes.GerenteVendas;
import Classes.Imovel;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;


import java.util.logging.Level;
import java.util.logging.Logger;



public class FuncionarioDAO {
   private Connection obterConexao() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/produtobd";
        String username = "root";
        String password = "";

        Connection conn = null;

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;

    }

   // Trabalhando no metodo 

    public List consultar(List <Funcionarios> listaFuncionarios) {

        ResultSet result;
        String querySql = "SELECT * FROM PRODUTOBD.FUNCIONARIOS";
        
        try (Connection conn = obterConexao(); PreparedStatement stmt = conn.prepareStatement(querySql);) {
            result = stmt.executeQuery();
            while (result.next()) {
                Funcionarios funcionarios = new Funcionarios(result.getString("ID"),result.getString("NOME"),result.getString("RG"),result.getString("CPF"), result.getString("FILIAL"), result.getString("CARGO"));
               listaFuncionarios.add(funcionarios);

            }
          
        } catch (SQLException | ClassNotFoundException ex) {

            Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

  return listaFuncionarios;

    }

   
   
   
   
   
   
   
   
   
   



 public void cadastraFuncionario(GerenteVendas funcionario) {

 
        

  
        
        
        String querySql = "INSERT INTO produtobd.FUNCIONARIOS(NOME,RG,CPF,FILIAL,CARGO) VALUES(?,?,?,?,?)";
      
        try (Connection conn = obterConexao();) {

            try (PreparedStatement stmt = conn.prepareStatement(querySql)) {
                stmt.setString(1,funcionario.getNome());
                stmt.setString(2,funcionario.getRg());
                stmt.setString(3,funcionario.getCpf());
                stmt.setString(4,funcionario.getFilial());
                stmt.setString(5,funcionario.getCargo());
                
                
                stmt.execute();
                             stmt.close();
            }
            System.out.println("Inserido com sucesso!"
                    + "\n");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
 
     public void cadastraFuncionario(BackOffice funcionario) {

 
        

  
        
        
        String querySql = "INSERT INTO PRODUTOBD.FUNCIONARIOS(NOME,RG,CPF,FILIAL,CARGO) VALUES(?,?,?,?,?)";
      
        try (Connection conn = obterConexao();) {

            try (PreparedStatement stmt = conn.prepareStatement(querySql)) {
                stmt.setString(1,funcionario.getNome());
                stmt.setString(2,funcionario.getRg());
                stmt.setString(3,funcionario.getCpf());
                stmt.setString(4,funcionario.getFilial());
                stmt.setString(5,funcionario.getCargo());
                
                
                stmt.execute();
            }
            System.out.println("Inserido com sucesso!"
                    + "\n");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

    
   




  