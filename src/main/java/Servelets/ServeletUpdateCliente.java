/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Banco.ClienteDAO;
import Classes.Cliente;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServeletUpdateCliente", urlPatterns = {"/ServeletUpdateCliente"})
public class ServeletUpdateCliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        ClienteDAO dao = new ClienteDAO();
     String linha = request.getParameter("id");

        String nome = request.getParameter("nome");
        String rg = request.getParameter("rg");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");

     Cliente cliente = new Cliente ();
     cliente.setNome(nome);
     cliente.setRg(rg);
     cliente.setCpf(cpf);
     cliente.setTelefone(telefone);
   
      dao.update(cliente,linha);

      request.getRequestDispatcher("index.html").forward(request, response);
//           request.getRequestDispatcher("/WEB-INF/jsp/relatorioImoveis.jsp")
//                .forward(request, response);

        
        
        
        

    }



}
