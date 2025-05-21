package e301b;

// E301- Escribir un programa que pida al usuario una palabra y la 
// muestre por pantalla 10 veces.

import java.util.Scanner;

public class E301b {

    public static void main(String[] args) {
        
        // entrada
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        
        String palabra = sc.nextLine();

        // proceso
        for ( int i=0; i < 10; i++) {
            System.out.print(i + " - ");
            System.out.println(palabra);
        }

        // salida
        
    }
    
}
