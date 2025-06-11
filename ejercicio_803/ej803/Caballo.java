
package ej803;


public class Caballo extends Mamifero {
    
    String comida;
    int dia;

    public Caballo(String nombre, String tipoAlimentacion, int edad) {
        super(nombre, tipoAlimentacion, edad);
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return super.toString() + "Caballo{" + "comida=" + comida + ", dia=" + dia + '}';
    }
    
    
    
}
