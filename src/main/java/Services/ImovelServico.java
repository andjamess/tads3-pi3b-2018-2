/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Banco.ImovelDAO;
import Classes.Imovel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author AnD James
 */
public class ImovelServico {

//    private  List <Imovel> imovel = new ArrayList<Imovel>();
    public ImovelServico() {

    }

    public List<Imovel> listar() {
        ImovelDAO dao = new ImovelDAO();
        List<Imovel> ListaDeImoveis = new ArrayList <Imovel>();
        return dao.consultar(ListaDeImoveis);
     

    }
    public List<Imovel> buscaId(String id,List ListaDeImoveis){
        
                ImovelDAO dao = new ImovelDAO();

        return dao.consultaId(id,ListaDeImoveis);
        
    }
    
      public Imovel retornaImovel(String id,List ListaDeImoveis){
       ImovelDAO dao = new ImovelDAO();
       Imovel imovel =  dao.consultaId2(id,ListaDeImoveis);
        
        
        
        return imovel;
    }

}
