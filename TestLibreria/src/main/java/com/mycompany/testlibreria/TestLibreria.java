/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testlibreria;

/**
 *
 * @author Administrador
 */
public class TestLibreria {

    public static void main(String[] args) {
       
        Libreria libre = new Libreria();
        Libro libro1 = new Libro(1111111, "La casa de los Espiritus", "Ana Miras", 30, 10, 2);
        libre.insertaLibro(libro1);
        
        Libro libro2 = new Libro(2222222, "La gata azul", "Pepe Lopes", 60, 19, 12);
        libre.insertaLibro(libro2);
        libro1.setPrecioBase(16);
        libro1.setPrecioIva(1.21);
        libro2.setPrecioBase(10);
        libro1.aplicarDescuento(libro1);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
    }
}
