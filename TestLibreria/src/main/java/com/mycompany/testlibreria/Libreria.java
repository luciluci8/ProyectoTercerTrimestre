/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testlibreria;

import java.util.ArrayList;

/**
 *
 * @author diurno
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
