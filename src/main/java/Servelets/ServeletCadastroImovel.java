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
 * @author AnD James
 */
@WebServlet(name = "ServeletCadastroImovel1", urlPatterns = {"/ServeletCadastroImovel1"})
public class ServeletCadastroImovel extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//Pega dados do html 

////Validaçao Campos
        ImovelDAO conecta = new ImovelDAO();
  



      String id = "";
        String cep = request.getParameter("cep");
        String endereco = request.getParameter("endereco");
        String complemento = request.getParameter("complemento");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String valor = request.getParameter("valor");
        String comodos = request.getParameter("comodos");
        String dormitorios = request.getParameter("dormitorios");
        String suites = request.getParameter("suites");

//
      Imovel imovel = new Imovel(id,cep, endereco, complemento, cidade, estado, comodos, suites, dormitorios, valor);

        conecta.adicionarImovel(imovel);
//Chama o jsp da pagina 
request.setAttribute( "imovel", imovel);
        request.getRequestDispatcher("cadastroImovel.jsp").forward(request, response);

    }
}
