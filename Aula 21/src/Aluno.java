public class Aluno extends Pessoa {
    private int periodo;
    private String turno;

    public Aluno() {
    }

    public Aluno(String nome, String email, int periodo, String turno) {
        super(nome, email);
        this.periodo = periodo;
        this.turno = turno;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPeriodo: " + periodo +
                "\nTurno: " + turno;
    }

    @Override
    public String falar() {
        return "Aluno esta " + getNome() + " conversando...";
    }

    @Override
    public String estudar() {
        return "Aluno " + getNome() + " está estudando para a prova.";
    }
}
