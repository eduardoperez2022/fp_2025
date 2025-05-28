package ej601b;

import java.util.Scanner;

public class ejercicio {
    
    public void solucion() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un texto: ");
        
        String ingreso = sc.nextLine();
        
        // 1 – Calcular el largo del texto ingresado. Informarlo.
        int ellargo = ingreso.length();
        System.out.println("Largo: " + ellargo);
        
        // 2 - Verificar que al menos tiene un asterisco. Informarlo
        boolean contiene = ingreso.contains("*");
        if (contiene) {
            System.out.println("Contiene asterisco");
        }
        else {
            System.out.println("No contiene asterisco");
        }
        
        // 3 – Verificar si el texto comienza y/o termina con un espacio. Informarlo.
        boolean empieza = ingreso.startsWith(" ");
        if (empieza) {
            System.out.println("Empieza con espacio");
        }
        else {
            System.out.println("No empieza con espacio");
        }
        
        boolean termina = ingreso.endsWith(" ");
        if (termina) {
            System.out.println("Termina con espacio");
        }
        else {
            System.out.println("No termina con espacio");
        }
        
        // 4 – Crear un nuevo String, habiendo reemplazado las letras ‘a’ 
        // por un signo ‘$’. Imprimir a consola.
        String reemplazo1 = ingreso.replace("a", "$");
        System.out.println("Reemplazo1: " + reemplazo1);
        
        // 5 -  Crear un nuevo String, habiendo quitado los espacios del inicio 
        // y del final. Imprimir a consola.
        String reemplazo2 = ingreso.trim();
        System.out.println("Reemplazo2: " + reemplazo2);

        // 6 -  Buscar la posición donde aparece el primer asterisco. Informarlo.
        int posicion = ingreso.indexOf("*");
        System.out.println("Posicion: " + posicion);
        
    }
    
}
