package e801;

public class Revistas extends ReviLibro{

    public Revistas(String codigo, int AñoPublicacion, String Titulo, int NumeroEntrega) {
        super(codigo, AñoPublicacion, Titulo);
        this.NumeroEntrega = NumeroEntrega;
    }
    
    
    private int NumeroEntrega = 0;

    public int getNumeroEntrega() {
        return NumeroEntrega;
    }

    public void setNumeroEntrega(int NumeroEntrega) {
        this.NumeroEntrega = NumeroEntrega;
    }

    @Override
    public String toString() {
        return super.toString() + "Revistas: " + "Numero Entrega = "  + NumeroEntrega + '}';
    }
    
    
    
}
