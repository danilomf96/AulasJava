public class Principal {
    public static void main(String[] args) {
        Jogo j1 = new Jogo("CSGO", "PC");
        Jogo j2 = new Jogo("LOL", "PC");
        Jogo j3 = new Jogo("FIFA23", "XBOX");
        Jogo j4 = new Jogo("DEVIL MAY CRY 4", "XBOX");

        ListaJogos lista1 = new ListaJogos("Danilo");
        lista1.adicionarJogo(j1);
        lista1.adicionarJogo(j2);
        lista1.adicionarJogo(j3);
        lista1.adicionarJogo(j4);
    }
}