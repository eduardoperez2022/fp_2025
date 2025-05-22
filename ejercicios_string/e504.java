package ejercicios_string;

// E504 - Crea un programa que pida al usuario ingresar un texto que corresponde 
// a una dirección de email. En base a la existencia del carácter arroba determinar 
// si el ingreso es correcto o no, informando los dos escenarios. 
// Usar el método contains de la clase String para determinar lo solicitado.

import java.util.Scanner;



public class e504 {
    
    public void solucion() {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese campo: ");
        
        String campo = sc.nextLine();
        
        String mensaje="";
        
        if ( campo.contains("@") ) {
            mensaje = "El campo es un email";
        }
        else {
            mensaje = "El campo NO es un email";
        }
        
        System.out.println(mensaje);
        
    }
    
}
