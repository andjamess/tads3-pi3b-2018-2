package Servelets;
import Banco.FuncionarioDAO;
import Classes.Funcionarios;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServeletCadastroFuncionario1", urlPatterns = {"/ServeletCadastroFuncionario1"})
public class ServeletCadastroFuncionario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        FuncionarioDAO conecta = new FuncionarioDAO();
        
        String id = "";
        String nome = request.getParameter("nome");
        String rg = request.getParameter("rg");
        String cpf = request.getParameter("cpf");
        String filial = request.getParameter("filial");
        String cargo = request.getParameter("cargo");
 
        Funcionarios funcionario = new Funcionarios (id,nome,rg,cpf,filial,cargo);
                        
         conecta.cadastraFuncionario(funcionario);
         request.getRequestDispatcher("funcionarioCadastrado.jsp").forward(request, response);

    }
}
