/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author martin
 */
public class Pedido {
    private ArrayList<ItemPedido> detallePedido;
    private int numero;
    private Date fechaHora;
    private String cliente;


    
    public Pedido(){
        this.setDetallePedido(new ArrayList<ItemPedido>());
    
    }
    
    public void agregarItem(ItemPedido item){
        this.getDetallePedido().add(item);
    }
    
    public String hora(){
        return this.getFechaHora().getHours() + ":" + getFechaHora().getMinutes();
    }
    
    public String fecha(){
        return this.getFechaHora().getDay() + "/" + getFechaHora().getMonth() + "/" + getFechaHora().getYear();
    }
    

    public ArrayList<ItemPedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(ArrayList<ItemPedido> detallePedido) {
        this.detallePedido = detallePedido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
  
    
    
}
