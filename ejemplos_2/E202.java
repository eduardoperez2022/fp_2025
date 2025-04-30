package ejemplos_2;



// E202- Hacer un programa que pida dos números, y luego los muestre ordenados 
// de mayor a menor

import java.util.Scanner;

public class E202 {

    public static void main(String[] args) {

        // entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos numeros: ");

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        // proceso
        String mensaje="";
        if ( num1 > num2 ) {
            // System.out.println("Ordenados: " + num1 + ", " + num2);
            mensaje = "Ordenados: " + num1 + ", " + num2;
        }
        else if ( num2 > num1 ) {
            // System.out.println("Ordenados: " + num2 + ", " + num1);
            mensaje = "Ordenados: " + num2 + ", " + num1;
        }
        else {
            // System.out.println("Ordenados: " + num1 + " es igual a " + num2);
            mensaje = "Ordenados: " + num1 + " es igual a " + num2;
        }

        // salida
        System.out.println(mensaje);

    }

}
 