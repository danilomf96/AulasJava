public class Professor extends Pessoa {

    private String disciplinas;

    public Professor() {
    }

    public Professor(String nome, String email, String disciplinas) {
        super(nome, email);
        this.disciplinas = disciplinas;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nDisciplinas: " + disciplinas;
    }

    @Override
    public String falar() {
        return "Professor " + getNome() + " esta lecionando";
    }

    @Override
    public String estudar() {
        return "Professor " + getNome() + " está preparando a aula.";
    }
}
