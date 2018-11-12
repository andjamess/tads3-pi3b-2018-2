/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Banco.ImovelDAO;
import Classes.Imovel;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dayse
 */
@WebServlet(name = "ServeletUpdate", urlPatterns = {"/ServeletUpdate"})
public class ServeletUpdate extends HttpServlet {

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
     String linha = request.getParameter("id");
    
     
     
     
     

        //Temporario

        String cep = request.getParameter("cep");
   String endereco = request.getParameter("endereco");
      String complemento = request.getParameter("complemento");
      // String cidade = request.getParameter("cidade");
     //  String estado = request.getParameter("estado");
       String valor = request.getParameter("valor");
      // String comodos = request.getParameter("comodos");
       //String dormitorios = request.getParameter("dormitorios");
       //String suites = request.getParameter("suites");
//
     Imovel imovel = new Imovel ();
     imovel.setCep(cep);
     imovel.setComplemento(complemento);
     imovel.setEndereco(endereco);
     imovel.setValor(valor);
//        
             dao.update(imovel,linha);
       // dao.update(imovel,id);    

 
         request.getRequestDispatcher("index.html").forward(request, response);
//           request.getRequestDispatcher("/WEB-INF/jsp/relatorioImoveis.jsp")
//                .forward(request, response);

        
        
        
        

    }



}
