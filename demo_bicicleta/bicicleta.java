package demo_bicicleta;

public class bicicleta {
    
    public int velocidadActual=0;
    public int platoActual=0;
    public int pinonActual=0;
    
    public void acelerar() {
        this.velocidadActual = this.velocidadActual * 2; 
    }
    
    public void frenar() {
        this.velocidadActual = this.velocidadActual / 2;
    }
    
    public void cambiarPlato(int nuevoPlato ) {
        this.platoActual = nuevoPlato;
    }
    
    public void cambiarPinon(int nuevoPinon) {
        this.pinonActual = nuevoPinon;
    }

    @Override
    public String toString() {
        return "bicicleta{" + "velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", pinonActual=" + pinonActual + '}';
    }

}
