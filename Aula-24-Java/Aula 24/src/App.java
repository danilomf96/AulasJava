public class App {
    public static void main(String[] args) throws Exception {
        salvarJogos();
        lerJogosArquivo();
        lerJogosDoArrayList();        
    }
    
    private static void salvarJogos(){
        Jogo jogo1 = new Jogo(1, "WarHammer40k", "FPS");
        Jogo jogo2 = new Jogo(2, "Elden Ring", "Souls");
        Jogo jogo3 = new Jogo(3, "Hollow Knight", "Plataforma");
        Jogo jogo4 = new Jogo(4, "Medal of Honor", "FPS");
        GerenciadorJogo.salvarJogo(jogo1);
        GerenciadorJogo.salvarJogo(jogo2);
        GerenciadorJogo.salvarJogo(jogo3);
        GerenciadorJogo.salvarJogo(jogo4);
        System.out.println("\n4 jogos foram salvos no arquivo : arquivo.txt");
    }
    private static void lerJogosArquivo(){
        System.out.println("Jogos cadastrados no arquivo : arquivo.txt");
        try {
            GerenciadorJogo.lerJogos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static void lerJogosDoArrayList(){
        System.out.println("\nJogos cadastrados: ");
        try {
            for (Jogo tempJogo : GerenciadorJogo.getListaJogos()) {
                System.out.println(tempJogo);
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
