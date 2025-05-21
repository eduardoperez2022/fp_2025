package ejercicio_e401;

public class cuenta {

    public String titular="";
    public double cantidad=0;
    
    public void ingresar(double ingreso) {
        if (ingreso > 0) {
            this.cantidad = this.cantidad + ingreso;
        }
    }

    public void retirar(double retiro) {
        if (retiro > this.cantidad) {
            this.cantidad = 0;
        }
        else {
            this.cantidad = this.cantidad - retiro;
        }
    }

    public double ver_saldo() {
        return this.cantidad; 
    }

    @Override
    public String toString() {
        return "cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
        
}
