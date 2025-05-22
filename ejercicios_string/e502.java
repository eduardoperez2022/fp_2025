package ejercicios_string;

// E502 - Crea un programa que pida al usuario ingresar un nombre de persona. En base a la ultima letra ‘a’ u ‘o’,  determinar si se trata de un nombre masculino a femenino. Si no termina en ‘a’ u ‘o’ informar como indeterminado. Usar el método endWith de la clase String para determinar con que letra finaliza

import java.util.Scanner;


public class e502 {
    
    public void solucion() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre: ");
        
        String nombre = sc.nextLine();
        
        if (nombre.endsWith("a")) {
            System.out.println("Calculamos femenino");
        }
        else if (nombre.endsWith("o")) {
            System.out.println("Calculamos masculino");
        }
        else {
            System.out.println("No podemos calcular");
        }
        
    }
    
}
