/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Banco.FuncionarioDAO;
import Classes.Funcionarios;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServeletUpdateFuncionario", urlPatterns = {"/ServeletUpdateFuncionario"})
public class ServeletUpdateFuncionario extends HttpServlet {

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
 
        FuncionarioDAO dao = new FuncionarioDAO();
     String linha = request.getParameter("id");

        String nome = request.getParameter("nome");
        String rg = request.getParameter("rg");
        String cpf = request.getParameter("cpf");
        String filial = request.getParameter("filial");
        String cargo = request.getParameter("cargo");

     Funcionarios funcionario = new Funcionarios ();
     funcionario.setNome(nome);
     funcionario.setRg(rg);
     funcionario.setCpf(cpf);
     funcionario.setFilial(filial);
     funcionario.setCargo(cargo);
   
      dao.update(funcionario,linha);

      request.getRequestDispatcher("index.html").forward(request, response);
//           request.getRequestDispatcher("/WEB-INF/jsp/relatorioImoveis.jsp")
//                .forward(request, response);

        
        
        
        

    }



}
