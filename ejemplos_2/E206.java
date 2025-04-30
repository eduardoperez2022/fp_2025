package ejemplos_2;


import java.util.Scanner;

// E206- Realiza un programa que calcule la aceptación de una solicitud en base 
// a los siguientes parámetros: edad, nota y sexo.
// a) Mínimo: Nota (5), edad (18), sexo M -> PENDIENTE
// b) Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
// c) Otros casos -> NO ACEPTADA

public class E206 {

    public static void main(String[] args) {

        // entrada
        Scanner sc = new Scanner(System.in);

        int NOTA = 5;
        int EDAD = 18;
        String SEXO_MASCULINO = "M";
        String SEXO_FEMENINO = "F";

        System.out.println("Nota (1-10), edad, y sexo (F/M) :");

        System.out.println("Sexo: ");
        String sexo = sc.nextLine();

        System.out.println("Nota: ");
        int nota = sc.nextInt();

        System.out.println("Edad: ");
        int edad = sc.nextInt();

        // proceso
        String resultado="NO ACEPTADA";

        if (nota >= NOTA) {
            if (edad >= EDAD) {
                if (sexo.equals(SEXO_MASCULINO)) {
                    resultado = "PENDIENTE";
                }
            }
        }

        if (nota >= NOTA) {
            if (edad >= EDAD) {
                if (sexo.equals(SEXO_FEMENINO)) {
                    resultado = "ACEPTADA";
                }
            }
        }

        // salida
        System.out.println(resultado);

    }

}
 