package ejercicios_string;

// E501 - Crea un programa que pida al usuario ingresar el nombre de un país. 
// Luego el programa debe dar la salida “Yo vivo en <pais_ingresado>”, 
// donde <pais ingresado> es el nombre ingresado al inicio. Usar el método 
// concat para formar la variable de salida.

import java.util.Scanner;


public class e501 {
    
    public void solucion() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese pais: ");
        
        String pais = sc.nextLine();
        
        String mensaje = "Yo vivo en ".concat(pais);
        
        System.out.println(mensaje);
        
    }
    
}
