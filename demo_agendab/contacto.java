package demo_agendab;

public class contacto {
    
    private String nombre;
    private String celular;
    private String email;
    private String domicilio;
    private int nacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "contacto{" + "nombre=" + nombre + ", celular=" + celular + ", email=" + email + ", domicilio=" + domicilio + ", nacimiento=" + nacimiento + '}';
    }

    
}
