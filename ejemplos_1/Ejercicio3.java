package ejemplos_1;

// E003- Pedir la entrada de un String que contenga un nombre, después muestra 
// un mensaje de bienvenida por consola. Por ejemplo: si introduzco «Fernando», 
// me aparezca «Bienvenido Fernando».

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");

        String nombre = entrada.nextLine();

        // proceso 
        String resultado = "Bienvenido " + nombre + " !";

        String b = "Bienvenido ";

        String resultado_1 = b.concat(nombre).concat(" !");

        // salida
        System.out.println(resultado);

        System.out.println(resultado_1);
    }

}
 