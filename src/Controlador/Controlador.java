/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import controlador.Persistencia;
import java.util.List;
import modulo.*;

public class Controlador {
    private final Persistencia Persistencia;
       
    public Controlador(Persistencia p){
        this.Persistencia = p;
    }
    
     public List listarProductores(){
        //
        return Persistencia.buscarTodos(Productor.class) ;
    }
   
}
