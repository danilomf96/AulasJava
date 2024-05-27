public class Principal {

    public static void main(String[] args) {
        int op;
        String nome;
        String data;
        String local;

        do {
            System.out.println("\nAgenda de Eventos");
            System.out.println("\n----------Menu----------");
            System.out.println("1->Adicionar Evento");
            System.out.println("2->Listar Eventos");
            System.out.println("3->Excluir Eventos");
            System.out.println("------------------------");
            System.out.println("\n\nINFORME UMA OPÇÃO");
            op = Console.lerInt();
            switch (op) {
                case 1:
                    System.out.println("\nNome do Evento : ");
                    nome = Console.lerString();
                    System.out.println("Data do Evento : ");
                    data = Console.lerString();
                    System.out.println("Local do Evento : ");
                    local = Console.lerString();

                    Evento evento = new Evento(nome, data, local);
                    ListaDeEventos.AdicionarEvento(evento);

                    break;
                case 2:
                    ListaDeEventos.mostrarEventos();
                    break;
                case 3:
                    System.out.println("\nDigite o nome do evento para exluir : ");
                    nome = Console.lerString();
                    ListaDeEventos.excluirEventos(nome);
                    break;

                case 0:
                    System.out.println("~~~~~ Programa Finalizado ;-) ~~~~~");
                default:
                    System.out.println("Opção invalida. Digite novamente amigão.");
                    break;
            }
        } while (op != 0);
    }
}