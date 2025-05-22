package ejercicios_string;

// E503 - Crea un programa que pida al usuario ingresar un texto que corresponde a un formato numérico. En base a la primera letra determinar si se trata de un numero o no, informando los dos escenarios. Usar el método startWith de la clase String para determinar con que caracter empieza.

import java.util.Scanner;


public class e503 {
    
    public void solucion() {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese palabra: ");
        
        String palabra = sc.nextLine();
        
        String mensaje="";
        
        if (palabra.startsWith("0") ||
              palabra.startsWith("1") ||
              palabra.startsWith("2") ||
              palabra.startsWith("3") ||
              palabra.startsWith("4") ||
              palabra.startsWith("5") ||
              palabra.startsWith("6") ||
              palabra.startsWith("7") ||
              palabra.startsWith("8") ||
              palabra.startsWith("9") ) {
            
            mensaje = "Es numero";
        }
        else {
            mensaje = "No es numero";
        }
        
        System.out.println(mensaje);
    }

}
