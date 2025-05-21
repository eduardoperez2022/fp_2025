package e305;

import java.util.Scanner;

// E305- Escribir un programa que pida al usuario un número entero positivo y 
// muestre por pantalla el ingreso. Si se ingresa cero o un numero negativo, 
// debe informar error pero continuar el ingreso. 
// Si el usuario ingresa -99 debe salir del lazo

public class E305 {

    public static void main(String[] args) {

        // entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num1 = sc.nextInt();
        
        while (num1 != -99) {
            
            // chequeo
            if (num1 <= 0) {
                System.out.println("Ingreso con error !");
            }

            System.out.println("Ingrese un numero: ");
            num1 = sc.nextInt();
            
        }

        // proceso
        
        // salida
        System.out.println("Gracias ;) ");

    }
    
}
