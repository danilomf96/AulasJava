public class Funcionario {
    private int matricula;
    private String nome;

    public Funcionario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Funcionario() {

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    };

    @Override
    public String toString() {
        String txt = "\nNome : " + nome + "\nMatrícula: " + matricula;
        return txt;
    }
}
