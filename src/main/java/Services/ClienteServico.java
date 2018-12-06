
package Services;

import Banco.ClienteDAO;
import Classes.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClienteServico {

    public ClienteServico() {

    }

    public List<Cliente> listar() {
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> ListaDeCliente = new ArrayList <Cliente>();
        return dao.consultar(ListaDeCliente);
     

    }
    public List<Cliente> buscaId(String id,List ListaDeCliente){
        
                ClienteDAO dao = new ClienteDAO();

        return dao.consultaId(id,ListaDeCliente);
        
    }
    
      public Cliente retornaCliente(String id,List ListaDeCliente){
       ClienteDAO dao = new ClienteDAO();
       Cliente cliente =  dao.consultaId2(id,ListaDeCliente);
        
        
        
        return cliente;
    }

}
