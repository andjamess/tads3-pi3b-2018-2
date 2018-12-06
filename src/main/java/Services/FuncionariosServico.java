/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Banco.FuncionarioDAO;
import Classes.Funcionarios;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class FuncionariosServico {


    public FuncionariosServico() {

    }

    public List<Funcionarios> listar() {
        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionarios> ListaDeFuncionario = new ArrayList <Funcionarios>();
        return dao.consultar(ListaDeFuncionario);
     

    }
    public List<Funcionarios> buscaId(String id,List ListaDeFuncionario){
        
                FuncionarioDAO dao = new FuncionarioDAO();

        return dao.consultaId(id,ListaDeFuncionario);
        
    }
    
      public Funcionarios retornaFuncionario(String id,List ListaDeFuncionario){
       FuncionarioDAO dao = new FuncionarioDAO();
       Funcionarios funcionario =  dao.consultaId2(id,ListaDeFuncionario);
        
        
        
        return funcionario;
    }


}
