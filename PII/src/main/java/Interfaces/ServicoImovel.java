/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Imovel;
import java.util.List;

/**
 *
 * @author AnD James
 */
public interface ServicoImovel {
     public List<Imovel> listar(int offset, int quantidade);
    
    public Imovel obter(long id);
}
