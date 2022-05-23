package testlibros;

public class TestLibros {

    public static void main(String[] args) {
        
        
        Libreria libre = new Libreria();
        Libro libro1 = new Libro(1111111, "La casa de los Espiritus", "Ana Miras", 30, 10, 2);
        libre.insertaLibro(libro1);
        
        Libro libro2 = new Libro(2222222, "La gata azul", "Pepe Lopes", 60, 19, 12);
        libre.insertaLibro(libro2);
        libro1.setPrecioBase(16);
        libro1.setPrecioIva(1.21);
        libro2.setPrecioBase(10);
        libro2.setAutor("Jose Lopez");
        
        libro1.aplicarDescuento(libro1);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
//
//        System.out.println("¿el libro 2  largo?: " + libro2.esLibroLargo());
//        System.out.println("precio de libre 1: " + libro1.getPrecioBase() * libro1.getPrecioIva());
//        System.out.println("¿Algun  libro es caro? " + "El primer libro: " + libro1.esMasCaro() + " .El segundo libro: " + libro2.esMasCaro());
//        libro1.prestamo(10);
//        libro2.prestamo(10);
//        System.out.println(libro1.toString());
//        System.out.println(libro2.toString());
//        libro1.devolucion(5);
//        libro2.devolucion(5);
//        System.out.println(libro1.toString());
//        System.out.println(libro2.toString());
        
       
    }

}
