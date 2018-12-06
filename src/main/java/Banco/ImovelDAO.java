/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Classes.Imovel;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImovelDAO {

    private Connection obterConexao() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/produtobd";
        String username = "root";
        String password = "";

        Connection conn = null;

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;

    }

    public Date getPegaDataAtual() {
        GregorianCalendar calendar = new GregorianCalendar();
        Date data;

        return (Date) calendar.getTime();
    }

    //Mostra informa�oes
    //Adicionar os produtos 
    public void adicionarImovel(Imovel imovel) {

        String querySql = "INSERT INTO produtobd.IMOVEIS(CEP,ENDEREÇO,COMPLEMENTO,CIDADE,ESTADO,COMODOS,SUITES,DORMITORIOS,VALOR) VALUES(?,?,?,?,?,?,?,?,?)";

        try (Connection conn = obterConexao();) {

            try (PreparedStatement stmt = conn.prepareStatement(querySql)) {

                stmt.setString(1, imovel.getCep());
                stmt.setString(2, imovel.getEndereco());
                stmt.setString(3, imovel.getComplemento());
                stmt.setString(4, imovel.getCidade());
                stmt.setString(5, imovel.getEstado());
                stmt.setString(6, imovel.getComodos());
                stmt.setString(7, imovel.getSuites());
                stmt.setString(8, imovel.getDormitorios());
                stmt.setString(9, imovel.getValor());

                stmt.execute();

                stmt.close();

            }
            System.out.println("Inserido com sucesso!"
                    + "\n");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

        public List deleteImovel (String id){
        
       String querySql ="DELET FROM produtobd.IMOVEIS WHERE ID="+"'"+id+"'";
               
        try (Connection conn = obterConexao()) {

            PreparedStatement stmt = conn.prepareStatement(querySql);

            stmt.executeQuery();

            } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } return null;
        
        }

    
    public List consultar(List listaImoveis) {

        ResultSet result;
        String querySql = "SELECT ID,CEP,ENDEREÇO,COMPLEMENTO,CIDADE,ESTADO,COMODOS,SUITES,DORMITORIOS,VALOR,DT_CADASTRO FROM PRODUTOBD.IMOVEIS";
        
        try (Connection conn = obterConexao(); PreparedStatement stmt = conn.prepareStatement(querySql);) {
            result = stmt.executeQuery();
            while (result.next()) {
                Imovel imovel = new Imovel(result.getString("ID"), result.getString("CEP"), result.getString("ENDEREÇO"), result.getString("COMPLEMENTO"), result.getString("CIDADE"), result.getString("ESTADO"), result.getString("COMODOS"), result.getString("SUITES"), result.getString("DORMITORIOS"), result.getString("VALOR"));
               listaImoveis.add(imovel);

            }
            return listaImoveis;
        } catch (SQLException | ClassNotFoundException ex) {

            Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

        return null;

    }

      public Imovel consultaId2(String id,List listaImoveis) {

        ResultSet result;
        String querySql = "SELECT ID,CEP,ENDEREÇO,COMPLEMENTO,CIDADE,ESTADO,COMODOS,SUITES,DORMITORIOS,VALOR,DT_CADASTRO FROM PRODUTOBD.IMOVEIS WHERE ID="+ "'" +id+ "'";
        
        try (Connection conn = obterConexao(); PreparedStatement stmt = conn.prepareStatement(querySql);) {
            result = stmt.executeQuery();
        while (result.next()) {
                Imovel imovel = new Imovel(result.getString("ID"), result.getString("CEP"), result.getString("ENDEREÇO"), result.getString("COMPLEMENTO"), result.getString("CIDADE"), result.getString("ESTADO"), result.getString("COMODOS"), result.getString("SUITES"), result.getString("DORMITORIOS"), result.getString("VALOR"));
              
     return imovel; 
           }
      
        } catch (SQLException | ClassNotFoundException ex) {

            Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

        return null;

    }
    
    
    public List consultaId(String id,List listaImoveis) {

        ResultSet result;
        String querySql = "SELECT ID,CEP,ENDEREÇO,COMPLEMENTO,CIDADE,ESTADO,COMODOS,SUITES,DORMITORIOS,VALOR,DT_CADASTRO FROM PRODUTOBD.IMOVEIS WHERE ID="+ "'" +id+ "'";
        
        try (Connection conn = obterConexao(); PreparedStatement stmt = conn.prepareStatement(querySql);) {
            result = stmt.executeQuery();
        while (result.next()) {
                Imovel imovel = new Imovel(result.getString("ID"), result.getString("CEP"), result.getString("ENDEREÇO"), result.getString("COMPLEMENTO"), result.getString("CIDADE"), result.getString("ESTADO"), result.getString("COMODOS"), result.getString("SUITES"), result.getString("DORMITORIOS"), result.getString("VALOR"));
               listaImoveis.add(imovel);

           }
            return listaImoveis;
        } catch (SQLException | ClassNotFoundException ex) {

            Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

        return null;

    }
    
    
    
public void update (Imovel imovel,String linha){
        
       //String querySql ="UPDATE produtobd.IMOVEIS SET CEP=?,ENDERECO=?,COMPLEMENTO=?,CIDADE=?,ESTADO=?,COMODOS=?,SUITES=?,DORMITORIOS=?,VALOR=? WHERE ID="+"'"+linha+"'";
         
        
       String querySql ="UPDATE produtobd.IMOVEIS SET CEP=?,ENDEREÇO=?,COMPLEMENTO=?,VALOR=? WHERE ID="+"'"+linha+"'";
         
         
        try (Connection conn = obterConexao()) {

        

            PreparedStatement stmt = conn.prepareStatement(querySql);

                stmt.setString(1,imovel.getCep());
                stmt.setString(2,imovel.getEndereco());
                stmt.setString(3,imovel.getComplemento());
              //stmt.setString(4,imovel.getCidade());
              // stmt.setString(5,imovel.getEstado());
               // stmt.setString(6,imovel.getComodos());
              // stmt.setString(7,imovel.getSuites());
              //  stmt.setString(8,imovel.getDormitorios());
                stmt.setString(4,imovel.getValor());

                stmt.executeUpdate();

      

            } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }}

}


        
        
        
    

