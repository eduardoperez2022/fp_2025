package javaapplication5;

public class Empleados extends registro {

    private int nro_despacho;
    private int ingreso;
    
    public Empleados(String Nombre, String Apellido, int id, String Civil, int ingreso, int nro_despacho) {
        super(Nombre, Apellido, id, Civil);
        this.ingreso = ingreso;
        this.nro_despacho=nro_despacho;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleados{" + "nro_despacho=" + nro_despacho + ", ingreso=" + ingreso + '}';
    }
    
}
