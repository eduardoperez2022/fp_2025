package e306;

import java.util.Random;
import java.util.Scanner;



// E306- Escribir un programa que calcule un numero incógnita aleatorio entre
// 1 y 100, y ofrecer adivinarlo al usuario. El jugador solo tendrá cinco oportunidades 
// para adivinar. Para obtener un aleatorio entre 1 y 100, se puede usar lo siguiente:
// Random rd = new Random();
// numeroAleatorio = rd.nextInt(100) + 1;

public class E306 {

    public static void main(String[] args) {
        
        // Necesito: numero incognita, dato de ingreso del usuario
        // contador de vueltas
        //
        // Pasos a realizar:
        // 1- calculo la incognita
        // 2- evaluo la cantidad de intentos, si supera 5 salgo
        // 3- pido un valor al usuario
        // 4- comparo valor ingresado con la incognita
        // 5- si son iguales termino
        // 6- voy al punto 2
        
        // 1
        
        Scanner sc = new Scanner(System.in);
        
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(100) + 1;
        
        int VUELTAS = 5;
        boolean exito = false;
        
        // 2
        for (int i = 0; i < VUELTAS; i++) {
            
            // 3
            System.out.println("Ingrese un numero de 1 a 100: ");
            int entrada = sc.nextInt();
            
            // 4
            if (entrada == numeroAleatorio) {
                // 5
                exito = true;
                break;
            }
            
            // 6
        }

        // salida
        if (exito) {
            System.out.println("Adivinaste, sos un crack !");        
        }
        else {
            System.out.println("Fallaste, mas suerte la proxima :)");        
            System.out.println("Incognita: " + numeroAleatorio);        
        }
    }    
}
