package e801;

public class Libros extends ReviLibro{
    
    public Libros(String codigo, int AñoPublicacion, String Titulo) {
        super(codigo, AñoPublicacion, Titulo);
    }
    
    public int numeroEjemplar;
    public int numeroPrestado;

    public int getNumeroEjemplar() {
        return numeroEjemplar;
    }

    public void setNumeroEjemplar(int numeroEjemplar) {
        this.numeroEjemplar = numeroEjemplar;
    }

    public int getNumeroPrestado() {
        return numeroPrestado;
    }

    public void setNumeroPrestado(int numeroPrestado) {
        this.numeroPrestado = numeroPrestado;
        
    }

    @Override
    public String toString() {
        return super.toString() + "Libros{" + "numero Ejemplar = " + numeroEjemplar + ", numero Prestado = " + numeroPrestado + '}';
    }
    
    
    
}
