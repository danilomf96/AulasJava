public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nFuncionario System");
        System.out.println("1) Cadastrar Programador");
        System.out.println("2) Cadastro Gerente");
        System.out.println("3) Procurar Funcionario");
        System.out.println("4) Listar Todos");
        System.out.println("5)Excluir Funcionario");
        System.out.println("0) Sair");
        System.out.println("Informe uma opção: ");

    }

    private static void excluirFuncionario() {
        System.out.println("\nInforme a matricula do funcionario que deseja excluir: ");
        int matricula = Console.lerInt();
        Funcionario f2 = Cadastro.buscar(matricula);
        if (f2 == null) {
            System.out.println("\nFuncionario " + matricula + "nao foi encontrado. ");
            return;
        }
        Cadastro.excluir(f2);
        System.out.println("\nFuncionario excluido com sucesso.");
    }

    private static void verificarOp(int op) {

        int matricula;
        String nome;
        String linguagem;
        String nomeP;
        switch (op) {

            case 1:
                System.out.println("\nNovo Programador:");
                System.out.println("Matricula");
                matricula = Console.lerInt();

                System.out.println("Nome: ");
                nome = Console.lerString();

                System.out.println("Linguagens que domina:");
                linguagem = Console.lerString();

                Programador p = new Programador(matricula, nome, linguagem);
                Cadastro.cadastrar(p);

                System.out.println("Programador Cadastrado com sucesso");
                System.out.println("\n" + p.toString());
                break;
            case 2:
                System.out.println("\nNovo Gerente:");
                System.out.println("Matricula");
                matricula = Console.lerInt();
                System.out.println("Nome : ");
                nome = Console.lerString();
                System.out.println("Projetos: ");
                nomeP = Console.lerString();

                Gerente g = new Gerente(matricula, nome, nomeP);
                Cadastro.cadastrar(g);
                System.out.println("Novo Gerente cadastrado com sucesso");
                System.out.println("\n" + g.toString());

                break;
            case 3:
                System.out.println("\nDigite a matricula do funcionario ");
                matricula = Console.lerInt();

                Funcionario f = Cadastro.buscar(matricula);

                if (f != null) {
                    System.out.println("\nFuncionario localizado:");
                    System.out.println(f.toString());
                } else {
                    System.out.println("\nFuncionario " + matricula + " não foi econtrado.");
                } // else sem return early

                break;
            case 4:
                System.out.println("\nTodos os funcionarios cadastrados : ");
                if (Cadastro.getListaFuncionarios().size() == 0) {
                    System.out.println("Nao há funcinarios cadastrados.");
                    return; // return early
                }
                for (Funcionario temp : Cadastro.getListaFuncionarios()) {
                    System.out.println("\n" + temp.toString());
                }
                break;
            case 5:
                excluirFuncionario();
                break;
            case 0:
                System.out.println("\n\nPrograma finalizado...");
                break;
            default:
                System.out.println("\nOpçao Invalida.");
                break;
        }
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOp(op);
        } while (op != 0);
    }
}
