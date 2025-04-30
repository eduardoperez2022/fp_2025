package ejemplos_2;



import java.util.Scanner;


// E201- Crea un programa que pida al usuario dos números y muestre el resultado 
// de dividir el primero por el segundo. Si el segundo número es 0, debe mostrar un mensaje de error


public class E201b {

    public static void main(String[] args) {

        // entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos numeros: ");

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        int div = 0;

        // proceso
        if ( num2 != 0 ) {
            div = num1 / num2;
        }
        else {
            System.out.println("Num 2 es cero. Verifique !");
            return;
        }

        // salida
        System.out.println("Resultado: " + div);

    }

}
 