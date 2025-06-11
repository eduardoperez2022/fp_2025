package javaapplication5;

public class registro {

    public registro(String Nombre, String Apellido, int id, String Civil) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.id = id;
        this.Civil = Civil;
    }
    
    private String Nombre;
    private String Apellido;
    private int id;
    private String Civil;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCivil(String Civil) {
        this.Civil = Civil;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getId() {
        return id;
    }

    public String getCivil() {
        return Civil;
    }

    @Override
    public String toString() {
        return "registro{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", id=" + id + ", Civil=" + Civil + '}';
    }
    

}
