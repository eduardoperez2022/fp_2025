package ejemplos_2;


// E203- Escribir un programa que pregunte al usuario su edad y muestre por pantalla 
// si está habilitado para votar en elecciones.

import java.util.Scanner;

public class E203 {

    public static void main(String[] args) {

        // entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");

        int edad = sc.nextInt();
        int EDAD_MINIMA = 16;

        // proceso
        boolean habil = false;

        if (edad < EDAD_MINIMA) {
            habil = false;
        }
        else {
            habil = true;
        }

        // salida
        if (habil == true) {
            System.out.println("Ud si esta habilitado");
        }
        else {
            System.out.println("Ud NO esta habilitado");
        }

    }

}
 