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
    
    
     public boolean esLibroLargo (){
        int paginas=50;
        if(numPaginas> paginas){
            return true;
            
        }else{
            return false;
        }
    }
    public boolean esMasCaro (){
       
        for (int i = 0; i < precioBase; i++) {
            if(precioBase> 5){
                return true;
            }
            
        }return false;
    }
    public boolean prestamo (int presta){
        if (presta>nEjemplares){
            return false;
    }else{
        nEjemplares-=presta;
        nEjemplaresPrestados+=presta;
}
        return true;
}
    public boolean devolucion (int devo){
        if(devo==0){
            return false;
        }else{
            nEjemplares+=devo;
            nEjemplaresPrestados-=devo;
        }
        return true;
    }

    public double aplicarDescuento (Libro libro){
         double descuento= 5.5;
        
        while (libro.getNumPaginas() > 100 && libro.getPrecioBase() > 10){
            
                 

        }
       return precioBase-=descuento;
} 
}
