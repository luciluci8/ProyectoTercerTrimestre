/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlibros;

import java.util.ArrayList;

/**
 *
 * @author Lucía
 */
public class Libreria {
    
    ArrayList <Libro> Libreria; 

    public Libreria() {
        
       Libreria = new ArrayList <Libro>(); 
         
    }

    @Override
    public String toString() {
        
        String salida= "";
        for(Libro libro : Libreria){
            salida+=libro;
        }
        return salida;
    }
    
    public  boolean insertaLibro (Libro l){
        
        if(Libreria.contains(l)){
            return false;
        }else{
           Libreria.add(l);
            return true;
        }
    }
    
    
}
