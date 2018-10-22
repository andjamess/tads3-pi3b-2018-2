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



/**
 *
 * @author AnD James
 */
public class ImovelServicoFakeImpl  implements Interfaces.ServicoImovel {

    private  List <Imovel> imovel = new ArrayList<Imovel>();

    public ImovelServicoFakeImpl() {
       ImovelDAO conecta = new ImovelDAO();
   this.imovel = conecta.consultar(imovel);
//
// for (long  i = 0; i < imoveis.size(); i++) {
//
// imovel.put(i, imoveis.get((int) i));
//
//   
//}
//        
    }

    @Override
    public List<Imovel> listar(int offset, int quantidade) {
        return new ArrayList<>(imovel);
    }

    @Override
    public Imovel obter(long id) {
        return imovel.get((int) id);
    }

}
    

