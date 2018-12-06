/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Classes.Imovel;

import Services.ImovelServico;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AnD James
 */
@WebServlet(name = "ImovelServelet", urlPatterns = {"/serveletImovel"})
public class ImovelServelet extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ImovelServico service = new ImovelServico();
        List<Imovel> resultado = service.listar();

        request.setAttribute("imovel",resultado);
        request.getRequestDispatcher("/WEB-INF/jsp/relatorioImoveis.jsp")
                .forward(request, response);

//
    }
}
