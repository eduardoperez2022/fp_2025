
package ej803;


public class Mamifero extends Animal {
    
    int periodoGestacion;

    public Mamifero(String nombre, String tipoAlimentacion, int edad) {
        super(nombre, tipoAlimentacion, edad);
    }

    public int getPeriodoGestacion() {
        return periodoGestacion;
    }

    public void setPeriodoGestacion(int periodoGestacion) {
        this.periodoGestacion = periodoGestacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Mamifero{" + "periodoGestacion=" + periodoGestacion + '}';
    }



}
