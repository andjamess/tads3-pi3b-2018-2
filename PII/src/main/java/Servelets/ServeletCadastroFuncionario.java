/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Banco.FuncionarioDAO;
import Classes.BackOffice;
import Classes.Funcionarios;
import Classes.GerenteVendas;

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
@WebServlet(name = "ServeletCadastroFuncionario1", urlPatterns = {"/ServeletCadastroFuncionario1"})
public class ServeletCadastroFuncionario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//Pega dados do html 
        FuncionarioDAO conecta = new FuncionarioDAO();

        
        //Aqui  pega os valores do html 
        String nome = request.getParameter("nome");
        String rg = request.getParameter("rg");
        String cpf = request.getParameter("cpf");
        String filial = request.getParameter("filial");
        String cargo = request.getParameter("cargo");

        
        
        
 
        //Logica do servelet
     if(cargo.equals("vendedor")){
                    BackOffice funcionario = new BackOffice (nome,rg,cpf,filial,cargo);
            conecta.cadastraFuncionario(funcionario);
             request.getRequestDispatcher("funcionarioCadastrado.jsp").forward(request, response);
         
        
     }
     
     else {
              GerenteVendas funcionario = new GerenteVendas (nome,rg,cpf,filial,cargo);
         
               
           conecta.cadastraFuncionario(funcionario);
              request.getRequestDispatcher("funcionarioCadastrado.jsp").forward(request, response);
         
     }
        
        
        

//Validaçao Campos
        //Adiciona no bando de dados 
      

//Chama o jsp da pagina 
     

    }
}
