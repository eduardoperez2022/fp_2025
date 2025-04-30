package adivina_numero;

import java.util.Random;
import java.util.Scanner;

public class adivina_numero {

    public static void main(String[] args) {
        
        
    Random random = new Random();
    int numeroSecreto = random.nextInt(101); // Genera un número aleatorio entre 0 y 100
    int intentos = 5;

    Scanner scanner = new Scanner(System.in);
    System.out.println("¡Bienvenido al juego de adivina el numero secreto!");
    System.out.println("He generado un número entre 0 y 100. Tienes 5 intentos para adivinarlo.");

    for (int intento = 1; intento <= intentos; intento++) {
        System.out.print("Intento " + intento + ": Ingresa tu número: ");
        int adivinanza = scanner.nextInt(); //adivinanza es la variable que almacena el numero del usuario

        if (adivinanza < numeroSecreto) {
            System.out.println("El número es mayor.");
        } else if (adivinanza > numeroSecreto) {
            System.out.println("El número es menor.");
        } else {
            System.out.println("¡Felicidades! Adivinaste el número en " + intento + " intentos.");
            break;
        }
    }

    if (intentos == 5) {
        System.out.println("Lo siento, no adivinaste el número. El número era " + numeroSecreto + ".");
    }

    scanner.close();        
        
    }
    
}
