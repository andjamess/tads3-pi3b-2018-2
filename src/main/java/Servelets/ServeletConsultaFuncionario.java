/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Classes.Funcionarios;
import Services.FuncionariosServico;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dayse
 */
@WebServlet(name = "ServeletConsultaFuncionario", urlPatterns = {"/PesquisarFuncionario"})
public class ServeletConsultaFuncionario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//         
   String id = request.getParameter("id");
         FuncionariosServico service = new FuncionariosServico();
              List<Funcionarios> resultado = new ArrayList <Funcionarios>();
           resultado = service.buscaId(id,resultado);


      request.setAttribute("funcionario",resultado);
        request.getRequestDispatcher("/WEB-INF/jsp/atualizaFuncionario.jsp")
                .forward(request, response);

//
    }
        
        
        
    }




