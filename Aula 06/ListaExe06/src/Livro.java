import java.util.ArrayList;

public class Livro {
    static ArrayList<Livro> biblioteca = new ArrayList<>();
    String autor;
    String titulo;
    int ano;

    public Livro() {

    }

    public Livro(String autor, String titulo, int ano) {
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
    }

    public static void cadastrarLivros() {

        System.out.println("Quantos livros voce quer cadastrar? ");
        int quantidade = Console.letInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o titulo : ");
            String titulo = Console.lerString();
            System.out.println("Digite o Autor : ");
            String autor = Console.lerString();
            System.out.println("Digite o ano : ");
            int ano = Console.letInt();
            biblioteca.add(new Livro(autor, titulo, ano));
        }
        System.out.println("Livros cadastrados com sucesso ! ");
    }

    public static void listarLivros() {
        for (Livro livro : biblioteca) {
            System.out.println("Livro : " + livro.titulo);
            System.out.println("Autor : " + livro.autor);
            System.out.println("Ano : " + livro.ano);
            System.out.println("///////////////////////////////////");
        }
    }
}
