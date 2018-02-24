/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.IitemListaDAO;
import DAO.ItemLIstaDAOImpl;
import Modelo.ItemLista;
import Vista.DropdownFrame;

/**
 *
 * @author martin
 */
public  class ListaController {
    
    private DropdownFrame dropdownVista;
    private IitemListaDAO iItemListaDAO;
    
    public static void main( String[] a) {
        ListaController listaController = new ListaController();
    }
    
    
    public ListaController(){
       this.setDropdownVista(new DropdownFrame());
       this.setiItemListaDAO(new ItemLIstaDAOImpl());
       
      for (ItemLista item : this.getiItemListaDAO().buscarItems() ){
          this.getDropdownVista().getDropdown().addItem(item.getNombre());
      }
    
    }
    public DropdownFrame getDropdownVista() {
        return dropdownVista;
    }

    public void setDropdownVista(DropdownFrame dropdownVista) {
        this.dropdownVista = dropdownVista;
    }
    
    public IitemListaDAO getiItemListaDAO() {
        return iItemListaDAO;
    }

    public void setiItemListaDAO(IitemListaDAO iItemListaDAO) {
        this.iItemListaDAO = iItemListaDAO;
    }


    
    
}
