import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOP(op);
        } while (op != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n------Agenda------");
        System.out.println("1-Salvar Contatos");
        System.out.println("2-Buscar Contatos");
        System.out.println("3-Listar Contatos");
        System.out.println("0-Sair");
        System.out.println("Selecione a Opção:");
    }

    private static void verificarOP(int op) {
        switch (op) {
            case 1:
                int codigo;
                String nome;
                String email;
                System.out.println("Digite o codigo do contato:");
                codigo = Console.lerInt();
                System.out.println("Digite o nome do contato:");
                nome = Console.lerString();
                System.out.println("Digite o email do contato");
                email = Console.lerString();
                Contato c = new Contato(codigo, nome, email);
                try {
                    Agenda.salvarContato(c);
                    System.out.println("\nContato salvo com sucesso.");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

                break;
            case 2:

                System.out.println("Buscar Contato");
                System.out.println("Digite o Codigo:");
                int codigo2 = Console.lerInt();

                try {
                    Contato c2 = Agenda.buscarContato(codigo2);
                    System.out.println("Contato localizado: " + c2);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                break;
            case 3:
                System.out.println("\nContatos salvos:");
                try {
                    for (Contato contato : Agenda.lerAgenda()) {
                        System.out.println(contato);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                break;
            case 0:
                System.out.println("Programa finalizado.");
                break;

            default:
                System.out.println("Opção invalida, digite novamente.");
                break;
        }
    }
}
