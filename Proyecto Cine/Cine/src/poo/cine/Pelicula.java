/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

import java.util.ArrayList;

/**
 *
 * @author Candelaria
 */
public class Pelicula {
    private ArrayList<Comentario> comentarios;
    
    public ArrayList<Comentario> getComentarios(){
        return this.comentarios;
    }
    public void setComentarios(ArrayList<Comentario> comentarios){
        this.comentarios = comentarios;
    }
}
