/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ItemLista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martin
 */
public class ItemLIstaDAOImpl implements IitemListaDAO {
    private  List<ItemLista> lista;
    
    
    public ItemLIstaDAOImpl(){
        this.setLista(new ArrayList<>());
        ItemLista item1 = new ItemLista("Item uno"); 
        ItemLista item2= new ItemLista("Item Dos");
        this.getLista().add(item1);
        this.getLista().add(item2);
    }
    
    @Override
    public List<ItemLista> buscarItems() {
        return this.getLista();
    }
    
    public List<ItemLista> getLista() {
        return lista;
    }

    public void setLista(List<ItemLista> lista) {
        this.lista = lista;
    }

    
}
