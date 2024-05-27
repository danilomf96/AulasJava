public class Bolsista extends Aluno {
    private String bolsa;

    public Bolsista() {
    }

    public Bolsista(String nome, String email, String rgm, String bolsa) {
        super(nome, email, rgm);
        this.bolsa = bolsa;
    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        String txt = super.toString() + "\nTipo de Bolsa: " + bolsa;
        return txt;
    }

}
