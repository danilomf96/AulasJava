public class Principal {

    public static void main(String[] args) {
        exPersonagem();
    }

    public static void exPersonagem() {
        Personagem p1 = new Personagem();
        p1.personagemAleatorio();
        p1.mostrarPersonagem();
        Personagem p2 = new Personagem();
        p2.personagemAleatorio();
        p2.mostrarPersonagem();

        p1.compararPersonagem(p2);

    }
}
