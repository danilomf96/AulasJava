public class Jogo {
    private int codigo;
    private String titulo;
    private String genero;
    
    
    public Jogo(int codigo, String titulo, String genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
    }
    
    public Jogo(){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return codigo + ", " + titulo + ", " + genero;
    }
}