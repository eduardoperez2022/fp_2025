package e308;

// E308- Diseñe un programa que permita ingresar por consola, de uno en uno, 

import java.util.Scanner;

// los sueldos de 5 empleados de una empresa y muestre luego la cantidad de 
// sueldos ingresados, el mayor y el menor sueldo ingresado y, el sueldo promedio. 
// Usar un lazo for para repetir el menu de ingreso.



public class E308 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // entrada
        double sumaSueldos=0;
        double sueldox=0;
        double promedio=0;
        double elmenor= 500000000;
        double elmayor=0;
        
        int VUELTAS = 5;
        
        System.out.println("Ingrese 5 valores de sueldo:");
        // proceso
        for (int i =0;  i < VUELTAS; i++ ) {
            // ingreso
            sueldox = sc.nextDouble();
            
            // mayor y menor
            if ( sueldox > elmayor ) {
                elmayor = sueldox;
            }            
            
            if ( sueldox < elmenor ) {
                elmenor = sueldox;
            }
            
            // acumula
            sumaSueldos = sumaSueldos + sueldox;
        }
        
        // calcula promedio
        promedio = sumaSueldos / VUELTAS;
        
        // salida
        System.out.println("Sueldo promedio: " + promedio);
        
        System.out.println("Sueldo mayor: " + elmayor);

        System.out.println("Sueldo menor: " + elmenor);

    }
    
}
