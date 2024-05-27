public class Jogo {
    private String titulo;
    private String plataforma;

    public Jogo(String titulo, String plataforma) {
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    public Jogo() {
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarDadosJogo() {
        System.out.println("\nTitulo do Jogo : " + titulo);
        System.out.println("Plataforma : " + plataforma);
    }
}
