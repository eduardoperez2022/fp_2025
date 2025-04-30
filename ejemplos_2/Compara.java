package ejemplos_2;



import java.util.Scanner;

public class Compara {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");

        String ent = sc.nextLine();

        if (!ent.equals("S") && !ent.equals("N")) {
            System.out.println("Error");
        }
        else {
            System.out.println("Gracias");
        }



//        if (ent.equals("S") || ent.equals("N")) {
//            System.out.println("Gracias");
//        }
//        else {
//            System.out.println("Error");
//        }


//        if (ent.equals("S") == true) {
//            System.out.println("Gracias");
//        }
//        else if (ent.equals("N")) {
//            System.out.println("Gracias");
//        }
//        else {
//            System.out.println("Error");
//        }

    }

}
 