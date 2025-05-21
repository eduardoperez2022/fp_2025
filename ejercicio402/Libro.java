package ejercicio402;

public class Libro {

    public String titulo;
    public String autor;
    public int numero_ejemplares;
    public int numero_prestados;

    public Libro(String titulo, String autor, int numero_ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_ejemplares = numero_ejemplares;
        this.numero_prestados = 0;
    }
    
    // prestamo
    public boolean prestamo() {
        
        boolean retval=false;
        
        if (this.numero_ejemplares - this.numero_prestados > 0) {
            this.numero_prestados++;
            retval = true;
        }
        return retval;
    }
    
    // devolucion
    public boolean devolucion() {
        
        boolean retval=false;
        
        if (this.numero_prestados > 0) {
            this.numero_prestados--;
            retval = true;
        }
        return retval;
    }
    
    // toString

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numero_ejemplares=" + numero_ejemplares + ", numero_prestados=" + numero_prestados + '}';
    }
    

}
