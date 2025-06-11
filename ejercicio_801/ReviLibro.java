package e801;

public class ReviLibro {
    
    private String codigo;
    private int AñoPublicacion;
    private String Titulo;

    public ReviLibro(String codigo, int AñoPublicacion, String Titulo) {
        this.codigo = codigo;
        this.AñoPublicacion = AñoPublicacion;
        this.Titulo = Titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(int AñoPublicacion) {
        this.AñoPublicacion = AñoPublicacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "ReviLibro: " + "codigo = " + codigo + ", Anio Publicacion = " + AñoPublicacion + ", Titulo = " + Titulo + '}';
    }
    
    
}
