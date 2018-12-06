package Servelets;

import Classes.Cliente;
import Services.ClienteServico;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "RelatorioServelet", urlPatterns = {"/serveletRelatorio"})
public class RelatorioServelet extends HttpServlet {

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
        ClienteServico service = new ClienteServico();
        List<Cliente> resultado = service.listar();

        /**REVEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEER*/
        request.setAttribute("cliente",resultado);
        request.getRequestDispatcher("/WEB-INF/jsp/relatorioVendas.jsp")
                .forward(request, response);

    }
}
