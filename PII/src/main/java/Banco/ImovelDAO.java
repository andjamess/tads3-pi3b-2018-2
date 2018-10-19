/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Classes.Imoveis;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.GregorianCalendar;
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
    public void adicionarImovel(Imoveis imovel) {

        String querySql = "INSERT INTO produtobd.IMOVEIS(CEP,ENDERECO,COMPLEMENTO,CIDADE,ESTADO,COMODOS,SUITES,DORMITORIOS,VALOR) VALUES(?,?,?,?,?,?,?,?,?)";

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

}
