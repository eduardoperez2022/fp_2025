package e304;
// E304- Escribir un programa que pida al usuario un número entero positivo 
// y muestre por pantalla la cuenta atrás desde ese número hasta cero separados 
// por comas.

import java.util.Scanner;


public class E304 {

    public static void main(String[] args) {
        
        // entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo: ");
        int num1 = sc.nextInt();
        
        // proceso
        for ( int i = num1; num1 >= 0 ; i-- ) {
            System.out.print(i + ",");
        }
        
        // salida
        
        
    }
    
}
