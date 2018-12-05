/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Banco.ClienteDAO;
import Classes.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Junior
 */
@WebServlet(name = "ServeletCadastraCliente", urlPatterns = {"/cadastraCliente"})
public class ServeletCadastraCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ClienteDAO conecta = new ClienteDAO();

        //Aqui  pega os valores do html 
        Cliente cliente = new Cliente(request.getParameter("nome"), request.getParameter("rg"),request.getParameter("cpf"),request.getParameter("telefone"));

        //Logica do servelet 
        conecta.adicionar(cliente);
request.getRequestDispatcher("clienteCadastrado.jsp").forward(request,response);
    }

}


