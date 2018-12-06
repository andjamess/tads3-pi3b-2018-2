package Servelets;
import Banco.ClienteDAO;
import Classes.Cliente;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServeletCadastroCliente1", urlPatterns = {"/ServeletCadastroCliente1"})
public class ServeletCadastroCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ClienteDAO conecta = new ClienteDAO();
  
        String id = "";
        String nome = request.getParameter("nome");
        String rg = request.getParameter("rg");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");

      Cliente cliente = new Cliente(id,nome,rg,cpf,telefone);

        conecta.adicionarCliente(cliente);

		request.setAttribute( "cliente", cliente);
        request.getRequestDispatcher("cadastroCliente.jsp").forward(request, response);

    }
}
