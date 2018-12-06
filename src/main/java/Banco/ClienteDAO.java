package Banco;

import Classes.Cliente;

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

public class ClienteDAO {

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

    public void adicionarCliente(Cliente cliente) {

        String querySql = "INSERT INTO produtobd.CLIENTE(NOME,RG,CPF,TELEFONE) VALUES(?,?,?,?)";

        try (Connection conn = obterConexao();) {

            try (PreparedStatement stmt = conn.prepareStatement(querySql)) {

                stmt.setString(1, cliente.getNome());
                stmt.setString(2, cliente.getRg());
                stmt.setString(3, cliente.getCpf());
                stmt.setString(4, cliente.getTelefone());

                stmt.execute();

                stmt.close();

            }
            System.out.println("Inserido com sucesso!"
                    + "\n");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List consultar(List listaCliente) {

        ResultSet result;
        String querySql = "SELECT ID,NOME,RG,CPF,TELEFONE,DT_CADASTRO FROM PRODUTOBD.CLIENTE";
        
        try (Connection conn = obterConexao(); PreparedStatement stmt = conn.prepareStatement(querySql);) {
            result = stmt.executeQuery();
            while (result.next()) {
                Cliente cliente = new Cliente(result.getString("ID"), result.getString("NOME"), result.getString("RG"), result.getString("CPF"), result.getString("TELEFONE"));
               listaCliente.add(cliente);

            }
            return listaCliente;
        } catch (SQLException | ClassNotFoundException ex) {

            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

        return null;

    }

    public Cliente consultaId2(String id,List listaCliente) {

        ResultSet result;
        String querySql = "SELECT ID,NOME,RG,CPF,TELEFONE FROM PRODUTOBD.CLIENTE WHERE ID="+ "'" +id+ "'";
        
        try (Connection conn = obterConexao(); PreparedStatement stmt = conn.prepareStatement(querySql);) {
            result = stmt.executeQuery();
        while (result.next()) {
                Cliente cliente = new Cliente(result.getString("ID"), result.getString("NOME"), result.getString("RG"), result.getString("CPF"), result.getString("TELEFONE"));
              
     return cliente; 
           }
      
        } catch (SQLException | ClassNotFoundException ex) {

            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

        return null;

    }
    
    public List consultaId(String id,List listaCliente) {

        ResultSet result;
        String querySql = "SELECT ID,NOME,RG,CPF,TELEFONE,DT_CADASTRO FROM PRODUTOBD.CLIENTE WHERE ID="+ "'" +id+ "'";
        
        try (Connection conn = obterConexao(); PreparedStatement stmt = conn.prepareStatement(querySql);) {
            result = stmt.executeQuery();
        while (result.next()) {
                Cliente cliente = new Cliente(result.getString("ID"), result.getString("NOME"), result.getString("RG"), result.getString("CPF"), result.getString("TELEFONE"));
               listaCliente.add(cliente);

           }
            return listaCliente;
        } catch (SQLException | ClassNotFoundException ex) {

            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

        return null;

    }
       
    public void update (Cliente cliente,String linha){
        
       String querySql ="UPDATE produtobd.CLIENTE SET NOME=?,RG=?,CPF=?,TELEFONE=? WHERE ID="+"'"+linha+"'";
         
         
        try (Connection conn = obterConexao()) {

            PreparedStatement stmt = conn.prepareStatement(querySql);

                stmt.setString(1,cliente.getNome());
                stmt.setString(2,cliente.getRg());
                stmt.setString(3,cliente.getCpf());
                stmt.setString(4,cliente.getTelefone());

                stmt.executeUpdate();

      

            } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }}}


//public void deletar (){
//        
//       
//
//   String querySql = "DELETE FROM PRODUTOBD.IMOVEIS WHERE ID >= "+"'0'"+"";
//         
//         
//        try (Connection conn = obterConexao();
//                PreparedStatement stmt = conn.prepareStatement(querySql)) {
////
//
//                stmt.executeUpdate();
//
//           
//
//            }
//   
//catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//}