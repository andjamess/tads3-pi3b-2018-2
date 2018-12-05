/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Banco.FuncionarioDAO;
import Classes.Funcionarios;
import Classes.Imovel;
import Services.ImovelServico;
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
@WebServlet(name = "ServeletConsultaFuncionario", urlPatterns = {"/serveletConsultaFuncionarios"})
public class ServeletConsultaFuncionario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//         
        FuncionarioDAO consulta = new FuncionarioDAO();
        List<Funcionarios> resultado = new ArrayList<>();

      resultado = consulta.consultar(resultado);

// 
//        
//         
//      
//      
//      
        request.setAttribute("funcionarios", resultado);
        request.getRequestDispatcher("/WEB-INF/jsp/consultaFuncionarios.jsp")
                .forward(request, response);

//
    }

}
