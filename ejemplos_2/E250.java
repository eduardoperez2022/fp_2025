package ejemplos_2;



// E250- Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene

import java.util.Scanner;


public class E250 {

    public static void main(String[] args) {

        System.out.println("Ingrese un numero (1 - 9999) :");

        // entrada
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // proceso
        int cifras=0;
        if (num < 10) {
            cifras = 1;
        }
        else if (num < 100) {
            cifras = 2;
        }
        else if (num < 1000) {
            cifras = 3;
        }
        else if (num < 10000) {
            cifras = 4;
        }
        else {
            cifras = -1;
        }

        // salida
        System.out.println("Tiene " + cifras + " cifras");

    }

}
 