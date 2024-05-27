public class Principal {
    public static void main(String[] args) {
        int op;
        do {
            System.out.println("Digite a opçao : ");
            System.out.println("|||||Opção 1 : Cadastrar Livros|||||");
            System.out.println("|||||Opção 2 : Listar Livros|||||");
            op = Console.letInt();
            switch (op) {
                case 1:
                    Livro.cadastrarLivros();
                    break;
                case 2:
                    Livro.listarLivros();
                    break;
                default:
                    break;
            }
        } while (op != 0);
    }
}
