public class Programador extends Funcionario {

    private String linguagem;

    public Programador() {
    }

    public Programador(int matricula, String nome, String linguagem) {
        super(matricula, nome);
        this.linguagem = linguagem;
    }

    public String getLinguagens() {
        return linguagem;
    }

    public void setLinguagens(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLinguagens : " + linguagem;
    }
}
