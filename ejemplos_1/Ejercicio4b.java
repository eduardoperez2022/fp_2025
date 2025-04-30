package ejemplos_1;

// E004- Haz una aplicación que calcule el área de un círculo(pi*R2). 
// El radio se pedirá por teclado. Usa la constante PI y el método pow de Math

import java.util.Scanner;


public class Ejercicio4b {

    public static void main(String[] args) {

        // entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un radio: ");
        double radio = entrada.nextDouble();

        // proceso
        double pi = Math.PI;

        double radio2 = radio * radio;
        radio2 = radio2 * pi;

        double radio2_b = Math.pow(radio, 2);
        radio2_b = radio2_b * pi;

        // salida
        System.out.println("resultado: " + radio2);

        System.out.println("resultado: " + radio2_b);

    }

}
 