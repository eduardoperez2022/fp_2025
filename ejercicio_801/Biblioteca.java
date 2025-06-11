package e801;

import java.util.Scanner;

public class Biblioteca {
    
    public void Prueba () {
        
        Scanner sc = new Scanner (System.in);
        
        Libros libs = new Libros("023154", 2015,"LOS PICAPIEDRAS");
        
        libs.setNumeroEjemplar(500);
        libs.setNumeroPrestado(125);
        
        System.out.println("Libro: " + libs.toString());
       
        
        System.out.println("Ingrese el numero de Entrega de la Revistas: ");
        int Numeroentrega = sc.nextInt();
        
        Revistas revs = new Revistas("02154", 2005, "El ejercicio 801", Numeroentrega);
        
        System.out.println("Revistas: " + revs.toString());
        
    }
}
