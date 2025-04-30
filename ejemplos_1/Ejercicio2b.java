package ejemplos_1;

// E002- Lee un número por teclado que pida el precio de un producto (puede tener decimales) 
// y calcule el precio final con IVA. El IVA sera una constante que sera del 21%. 
// El programa debe mostrar a la salida el precio sin IVA y el precio con IVA

import java.util.Scanner;

public class Ejercicio2b {

    public static void main(String[] args) {

        double IVA = 21;

        // entrada
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un precio: ");

        double precio_siniva = entrada.nextDouble();

        // proceso
        double precio_coniva = precio_siniva + ((precio_siniva * IVA) / 100);

        // salida
        System.out.println("Precio sin IVA: " + precio_siniva);

        System.out.println("Precio con IVA: " + precio_coniva);

    }

}

 