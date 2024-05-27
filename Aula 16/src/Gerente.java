public class Gerente extends Funcionario {

    private String nomeProjeto;

    public Gerente() {
    }

    public Gerente(int matricula, String nome, String nomeProjeto) {
        super(matricula, nome);
        this.nomeProjeto = nomeProjeto;
    }

    public Gerente(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    };

    @Override
    public String toString() {
        return super.toString() + "\nNome do Projeto : " + nomeProjeto;
    }

}
