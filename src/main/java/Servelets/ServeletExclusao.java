/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Banco.ImovelDAO;
import Classes.Imovel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dayse
 */
@WebServlet(name = "ServeletExclusao", urlPatterns = {"/ServeletExclusao"})
public class ServeletExclusao extends HttpServlet {

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
        ImovelDAO dao = new ImovelDAO();
        
        
        
     String linha = request.getParameter("linha");
        String cep = request.getParameter("cep");
        String endereco = request.getParameter("endereco");
        String complemento = request.getParameter("complemento");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String valor = request.getParameter("valor");
        String comodos = request.getParameter("comodos");
        String dormitorios = request.getParameter("dormitorios");
        String suites = request.getParameter("suites");

        Imovel imovel = new Imovel (cep,endereco,complemento,cidade,estado,valor,comodos,dormitorios,suites);
    
         
           request.getRequestDispatcher("/WEB-INF/jsp/relatorioImoveis.jsp")
                .forward(request, response);
    }}

