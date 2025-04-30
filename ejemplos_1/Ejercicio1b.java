package ejemplos_1;

// E001.- Usando la consola, leer dos números, y luego informar si son iguales o no.

import java.util.Scanner;

public class Ejercicio1b {

    public static void main(String[] args) {

        // entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // proceso
        boolean resultado = n1== n2  ;

        //salida
        if(resultado == true) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }


    }

}
 