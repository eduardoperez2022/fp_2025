
package ej803;


public class Gato extends Mamifero {
    
    String pedigri;

    public Gato(String nombre, String tipoAlimentacion, int edad) {
        super(nombre, tipoAlimentacion, edad);
    }

    public String getPedigri() {
        return pedigri;
    }

    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "pedigri=" + pedigri + '}';
    }
    
    
}
