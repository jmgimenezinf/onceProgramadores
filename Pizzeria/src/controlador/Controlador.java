/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import pizzeria.Pizzeria;
import vista.Vista;

/**
 *
 * @author martin
 */
public class Controlador {
    
    private Pizzeria pizzeria;
    private Vista vista;
    
    public Controlador(){
        this.setPizzeria(new Pizzeria());
        this.setVista(new Vista(this));
    }

    public Pizzeria getPizzeria() {
        return pizzeria;
    }

    public void setPizzeria(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    

    
}
