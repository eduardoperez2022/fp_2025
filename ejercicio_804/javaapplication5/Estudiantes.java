package javaapplication5;

public class Estudiantes extends registro {

    private int curso;
    
    public Estudiantes(String Nombre, String Apellido, int id, String Civil, int curso) {
        super(Nombre, Apellido, id, Civil);
        this.curso=curso;
    }
    
}
