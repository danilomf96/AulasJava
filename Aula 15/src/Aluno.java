public class Aluno extends Pessoa {

    private String rgm;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String email, String rgm) {
        super(nome, email);
        this.rgm = rgm;
    }

    @Override
    public String toString() {
        String txt = super.toString() + "\nRGM: " + rgm;
        return txt;
    }
}
