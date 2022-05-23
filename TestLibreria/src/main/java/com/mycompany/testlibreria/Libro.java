/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testlibreria;

/**
 *
 * @author diurno
 */
public class Libro {
    
    private int isbn; //atributos de libro
    private String titulo;
    private String autor;
    private int numPaginas;
    private double precioBase;
    private double precioIva;
    private int nEjemplares;
    private int nEjemplaresPrestados;
    
    public Libro (int pIsbn, String pTitulo, String pAutor, int pNumPaginas, int nEjemplares, int nEjemplaresPrestados){ 
        
       isbn=pIsbn;
       titulo=pTitulo;
       autor=pAutor;
       numPaginas=pNumPaginas;
       this.setPrecioBase(precioBase);
       this.setPrecioIva(precioIva);
       this.nEjemplares=nEjemplares;
       this.nEjemplaresPrestados=nEjemplaresPrestados;
         
    
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioIva() {
        return precioIva;
    }

    public void setPrecioIva(double precioIva) {
        this.precioIva = precioIva;
    }
    

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public int getnEjemplaresPrestados() {
        return nEjemplaresPrestados;
    }

    public void setnEjemplaresPrestados(int nEjemplaresPrestados) {
        this.nEjemplaresPrestados = nEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + ", precioBase=" + precioBase + ", precioIva=" + precioIva + ", nEjemplares=" + nEjemplares + ", nEjemplaresPrestados=" + nEjemplaresPrestados + '}';
    }
    
    
    
}
