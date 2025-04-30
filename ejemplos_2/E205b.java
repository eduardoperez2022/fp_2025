package ejemplos_2;



import java.util.Scanner;

// E205- Realiza un programa que pida el día de la semana (del 1 al 7) y escriba 
// el día correspondiente. Si introducimos otro número nos da un error.
public class E205b {

    public static void main(String[] args) {

        // entrada
        // domingo es el nro 1
        // entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int num1 = sc.nextInt();

        // proceso
        String salida="";
        switch (num1) {
            case 1:
                salida = "Domingo";
                break;
            case 2:
                salida = "Lunes";
                break;
            case 3:
                salida = "Martes";
                break;
            case 4:
                salida = "Miercoles";
                break;
            case 5:
                salida = "Jueves";
                break;
            case 6:
                salida = "Viernes";
                break;
            case 7:
                salida = "Sabado";
                break;
            default:
                salida = "Numero erroneo, solo vale de 1 a 7";
        }

        // salida
        System.out.println(salida);

    }

}
 