package javaapplication5;

public class JavaApplication5 {

    public static void main(String[] args) {

        Empleados emp = new Empleados("Carlos", "Jimenez", 34, "Soltero", 15, 43);
        System.out.println("Empleado: " + emp.toString());

        Profesores pro = new Profesores ("Juan", "Perez", 24, "Casado", "Matematica");
        System.out.println("Profesor: " + pro.toString());
        
        Estudiantes est = new Estudiantes ("Julian", "Messi", 32, "Soltero", 5);
        System.out.println("Estudiante: " + est.toString());

    }

}
