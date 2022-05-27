/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testlibreria;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author diurno
 */
public class LibroTest {
    
    public LibroTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   
    
    /**
     * Test of esLibroLargo method, of class Libro.
     */
    @Test
    public void testEsLibroLargo() {
        System.out.println("esLibroLargo");
        Libro libro = new Libro(1111111, "La casa de los Espiritus", "Ana Miras", 60, 10,30, 2);
        boolean expResult = true;
        boolean result = libro.esLibroLargo();
        assertEquals(expResult, result);
      
    }
    
    
    
     @Test
    public void testEsLibroLargo2() {
        System.out.println("¿EsLibroLargo?: ");
        Libro libro = new Libro(1111111, "La casa de los Espiritus", "Ana Miras", 30, 10,30, 2);
        boolean expResult = false;
        boolean result = libro.esLibroLargo();
        assertEquals(expResult, result);
      
    }
    /**
     * Test prestamo con resultado true y luego false
     */
    @Test
    public void testPrestamo() {
        System.out.println("prestamo");
        int prestados = 5;
        Libro libro = new Libro (1111111, "La casa de los Espiritus", "Ana Miras", 30, 10,30, 2) ;
        boolean expResult = true;
        boolean result = libro.prestamo(prestados);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testPrestamo2() {
        System.out.println("prestamo");
        int presta = 15;
        Libro libro = new Libro (1111111, "La casa de los Espiritus", "Ana Miras", 30, 10, 12, 2) ;
        boolean expResult = false;
        boolean result = libro.prestamo(presta);
        assertEquals(expResult, result);
        
    }

    /**
     * Test devolucion con resultado true y luego false
     */
    @Test
    public void testDevolucion() {
        System.out.println("devolucion");
        int devo = 10;
        Libro libro = new Libro (1111111, "La casa de los Espiritus", "Ana Miras", 30, 10, 20, 2);
        boolean expResult = true;
        boolean result = libro.devolucion(devo);
        assertEquals(expResult, result);
        
       
    }
     @Test
    public void testDevolucion2() {
        System.out.println("devolucion");
        int devo = 0;
        Libro libro = new Libro (1111111, "La casa de los Espiritus", "Ana Miras", 30, 10, 10, 2);
        boolean expResult = false;
        boolean result = libro.devolucion(devo);
        assertEquals(expResult, result);
    }

    /**
     *  el testAplicarDescuento  sí se aplica
     */
    @Test
    public void testAplicarDescuento() {
        System.out.println("aplicarDescuento");
        Libro libro = new Libro(1111111, "La casa de los Espiritus", "Ana Miras", 140, 16, 10, 2);
       
        double expResult = 10.5;
        double result = libro.aplicarDescuento(libro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
   // el testAplicarDescuento2 no se aplica
    @Test
    public void testAplicarDescuento2() {
        System.out.println("aplicarDescuento");
        Libro libro = new Libro(1111111, "La casa de los Espiritus", "Ana Miras", 140, 10, 10, 2);
       
        double expResult = 10;
        double result = libro.aplicarDescuento(libro);
        assertEquals(expResult, result);
        
        
    }
   
    
}
