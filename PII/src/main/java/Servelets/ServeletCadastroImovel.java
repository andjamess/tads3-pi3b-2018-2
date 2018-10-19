/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Banco.FuncionarioDAO;
import Banco.ImovelDAO;
import Classes.Imoveis;
import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AnD James
 */
@WebServlet(name = "ServeletCadastroImove1", urlPatterns = {"/ServeletCadastroImove1"})
public class ServeletCadastroImovel extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//Pega dados do html 
        ImovelDAO conecta = new ImovelDAO();

        String cep = request.getParameter("cep");
        String endereco = request.getParameter("endereco");
        String complemento = request.getParameter("complemento");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String comodos = request.getParameter("comodos");
        String valor = request.getParameter("valor");
        String suites = request.getParameter("suites");
        String dormitorios = request.getParameter("dormitorios");

//Validaçao Campos
        Imoveis imovel = new Imoveis(cep,endereco,complemento,cidade,estado,comodos,suites,dormitorios,valor);

        conecta.adicionarImovel(imovel);
//Chama o jsp da pagina 
        request.getRequestDispatcher("cadastroImovel.jsp").forward(request, response);

    }
}
