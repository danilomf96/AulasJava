import java.util.ArrayList;
import java.util.List;

public class ListaJogos {

    private String nomeProprietario;
    private List<Jogo> listaJogos;

    public ListaJogos(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
        listaJogos = new ArrayList<>();
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public void adicionarJogo(Jogo jogo) {
        listaJogos.add(jogo);
        System.out.println("Jogo " + jogo.getTitulo() + " adicionado a coleção " + nomeProprietario);
    }

    public void mostrarTodos() {
        System.out.println("Lista de Jogos de " + nomeProprietario);

        for (Jogo jogo : listaJogos) {
            jogo.mostrarDadosJogo();
        }
    }

}
