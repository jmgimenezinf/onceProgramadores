/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.awt.event.ItemEvent;
import java.util.ArrayList;

/**
 *
 * @author martin
 */
public class Pizzeria {

    private ArrayList<Pedido> pedidos;
    
    public Pizzeria(){
        
        Pedido pedido = new Pedido();
        
        ItemPedido item = new ItemPedido();
        
        item.setCantidad(2);
        item.setPizza("Napolitana");
        item.setPrecio(140);
        item.setTamaño("4x4");
        item.setTipo("Al horno");
        item.setVariedad("sin aceituna");
        
        pedido.agregarItem(item);
        
    }
    

}
