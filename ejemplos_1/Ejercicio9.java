package ejemplos_1;

// E009- Pedir tres números por teclado y luego mostrarlos ordenados de mayor a menor

import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {


        // entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese tres numeros: ");

        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();

        // proceso
        int mayor=0;
        int segundo=0;
        int tercero=0;

        if(n1 > n2 && n1 > n3) {
            mayor = n1;
        }
        else if (n2 > n1 && n2 > n3) {
            mayor = n2;
        }
        else {
            mayor = n3;
        }

        if ( n1 == mayor ) {
            if (n2 > n3) {
                segundo=n2;
                tercero = n3;
            }
            else {
                segundo = n3;
                tercero = n2;
            }
        }

        else if ( n2 == mayor ) {
            if (n1 > n3) {
                segundo = n1;
                tercero = n3;
            }
            else {
                segundo = n3;
                tercero = n1;
            }
        }
        else {
            // n3 es el mayor
            if (n1 > n2) {
                segundo = n1;
                tercero = n2;
            }
            else {
                segundo = n2;
                tercero = n1;
            }
        }


        // salida
        System.out.println("Ordenados de mayor a mnor :"  );
        System.out.println(mayor);
        System.out.println(segundo);
        System.out.println(tercero);

    }

}
 