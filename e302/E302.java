package e302;

// E302- Escribir un programa que pregunte al usuario su edad y muestre por pantalla 
// todos los años que ha cumplido (desde 1 hasta su edad).

import java.util.Scanner;


public class E302 {

    public static void main(String[] args) {
        
        // entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int laedad = sc.nextInt();
        
        // proceso
        for( int i = 1; i <= laedad; i++ ) {
            // System.out.println(i);
            System.out.print(i + " ");
        }
        
        // salida
        
    }
    
}
