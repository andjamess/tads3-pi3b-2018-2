package Servelets;

import Classes.Funcionarios;

import Services.FuncionariosServico;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "FuncionariosServelet", urlPatterns = {"/serveletFuncionarios"})
public class FuncionarioServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        FuncionariosServico service = new FuncionariosServico();
        List<Funcionarios> resultado = service.listar();

        request.setAttribute("funcionario",resultado);
        request.getRequestDispatcher("/WEB-INF/jsp/relatorioFuncionario.jsp")
                .forward(request, response);

//
    }
}
