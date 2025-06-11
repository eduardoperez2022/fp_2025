package javaapplication5;

public class Profesores extends registro {

    private String materia;
    
    public Profesores(String Nombre, String Apellido, int id, String Civil, String materia) {
        super(Nombre, Apellido, id, Civil);
        this.materia=materia;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesores{" + "materia=" + materia + '}';
    }
    
}
