package ej602;

import java.util.Scanner;


// Número Telefónico: 5256284000            
// Nueva Cadena: (52)-5-6284000

public class ejercicio {
    
    public String numero_crudo="";
    
    public void solucion() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero de 10 digitos:");
        numero_crudo = sc.nextLine();
        
        if (numero_crudo.length() != 10) {
            System.out.println("Ingreso incorrecto !");
            return;
        }
        
        
        
        // formato usando String
        String parte1 = numero_crudo.substring(0,2);
        String parte2 = numero_crudo.substring(2,3);
        String parte3 = numero_crudo.substring(3,10);
        
        String salida1 = "(" + parte1 + ")-" + parte2 + "-" + parte3; 
        
        System.out.println("Salida 1: " + salida1);
        
        String salida2 = "(".concat(parte1).concat(")-").concat(parte2).concat("-").concat(parte3);
        
        System.out.println("Salida 2: " + salida2);
        
        // formato usando StringBuffer
        
        StringBuffer sb = new StringBuffer();
        sb.append("(");
        sb.append(parte1);
        sb.append(")-");
        sb.append(parte2);
        sb.append("-");
        sb.append(parte3);
        
        System.out.println("Salida 3: " + sb.toString());
        
    }
    
    
}
