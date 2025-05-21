package ejercicio_e401;

import java.util.Scanner;

public class Ejercicio_e401 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese titular:");
        String tit = sc.nextLine();
        
        System.out.println("Ingrese dinero:");
        double in = sc.nextDouble();
        
        cuenta caja = new cuenta();
        caja.titular = tit;
        
        caja.ingresar(in);
        
        double saldo = caja.ver_saldo();       
        System.out.println("Saldo: " + saldo);
        
        System.out.println("Retirar dinero:");
        double out = sc.nextDouble();
        
        caja.retirar(out);
        
        double saldo2 = caja.ver_saldo();
        System.out.println("Saldo: " + saldo2);
        
        System.out.println(caja.toString());
        
    }
    
}
