package demo_agendab;

import java.util.Scanner;

public class menu {
    
    contacto c1;
    contacto c2;
    contacto c3;
    contacto c4;
    
    public void entrada() {
        
        Scanner sc = new Scanner(System.in);
        
        // ingreso contacto 1
        System.out.println("Ingrese nombre y telefono y año nacimiento: ");
        String nombre = sc.next();
        String telefono = sc.next();
        int nacimiento = sc.nextInt();

        System.out.println("Ingrese email y domicilio: ");
        String email = sc.next();
        String domicilio = sc.next();

        c1 = new contacto();
        
        c1.setNombre(nombre);
        c1.setCelular(telefono);
        c1.setEmail(email);
        c1.setDomicilio(domicilio);
        c1.setNacimiento(nacimiento);
        
        System.out.println("C1");
        System.out.println(c1.toString());
        
        // ingreso contacto 2
        System.out.println("Ingrese nombre y telefono y año nacimiento: ");
        nombre = sc.next();
        telefono = sc.next();
        nacimiento = sc.nextInt();

        System.out.println("Ingrese email y domicilio: ");
        email = sc.next();
        domicilio = sc.next();

        c2 = new contacto();
        
        c2.setNombre(nombre);
        c2.setCelular(telefono);
        c2.setEmail(email);
        c2.setDomicilio(domicilio);
        c2.setNacimiento(nacimiento);
        
        System.out.println("C2");
        System.out.println(c2.toString());

        // calculo del mas longebo
        int edad1 = c1.getNacimiento();
        int edad2 = c2.getNacimiento();
        
        if (edad1 < edad2) {
            System.out.println("C1 es mas viejo");
        }
        else if (edad2 < edad1) {
            System.out.println("C2 es mas viejo");
        }
        else {
            System.out.println("Tienen el mismo nacimiento");
        }
        
        // calculo del mas longebo version corta
        
        if (c1.getNacimiento() < c2.getNacimiento()) {
            System.out.println("C1 es mas viejo");
        }
        else if (c2.getNacimiento() < c1.getNacimiento()) {
            System.out.println("C2 es mas viejo");
        }
        else {
            System.out.println("Tienen el mismo nacimiento");
        }
        

    }
    
    
}
