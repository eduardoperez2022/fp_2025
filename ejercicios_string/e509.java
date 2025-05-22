package ejercicios_string;

// E509. Escriba un programa que lea un texto, que debería ser un formato de fecha, 
// de la formadd/mm/yyyy. Extraer el mes (parte mm), luego informar su valor, 
// y también informar si es un número de mes válido (valores del 1 al 12 son válidos). 
// Usar el metodo substring para la extracción.

import java.util.Scanner;

public class e509 {
    
    public void solucion() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una fecha (ej 15/04/2025) : ");
        
        String fechax = sc.nextLine();
        
        // 15/04/2025
        String mes = fechax.substring(3, 5);
        
        if ("01".equals(mes) ||
                "02".equals(mes) ||
                "03".equals(mes) ||
                "04".equals(mes) ||
                "05".equals(mes) ||
                "06".equals(mes) ||
                "07".equals(mes) ||
                "08".equals(mes) ||
                "08".equals(mes) ||
                "10".equals(mes) ||
                "11".equals(mes) ||
                "12".equals(mes)  ) 
        {
            System.out.println("Mes correcto");
        }
        else {
            System.out.println("Mes incorrecto");
        }
        
        System.out.println("Mes: " + mes);
        
    }
    
}
