package e307;

import java.util.Scanner;


// E307- Escribir un programa que pida al usuario un número entero positivo y vaya 
// acumulando la suma de lo ingresado. Si se ingresa un numero negativo, debe también 
// sumar como negativo. Debe salir del lazo cuando la suma sea mayor a 1000. 
// Por cada ingreso informar el valor de la suma actual.

public class E307 {

    public static void main(String[] args) {
        
        int lasuma=0;
        int MAXIMO = 1000;
        int num2 = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numeros: ");
        
        do {
            
            num2 = sc.nextInt();
            lasuma = lasuma + num2;
            
            System.out.println("parcial: " + lasuma);
            
        } while( lasuma <= MAXIMO );
        
        System.out.println("La suma supera " + MAXIMO);
    }
    
}
