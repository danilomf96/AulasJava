import java.io.IOException;

public class Sistema {
    private static void exibirMenu() {
        System.out.println("\nSistemas GDC RELOGIOS");
        System.out.println("1-Cadastrar");
        System.out.println("2-Buscar");
        System.out.println("3-Apagar");
        System.out.println("4-Listar Todos");
        System.out.println("5-Atualizar Relogio");
        System.out.println("0-Sair");
    }

    private static void cadastrar() {
        System.out.println("\nCadastro de Relogio: ");
        int codigo = Console.lerInt("Informe o Codigo:");
        String marca = Console.lerString("Marca:");
        String modelo = Console.lerString("Modelo:");
        String tipo = Console.lerString("Tipo:");

        Relogio relogio = new Relogio(codigo, marca, modelo, tipo);
        try {
            GerenciadorRelogio.salvarRelogio(relogio);
            System.out.println("\nRelogio Salvo no ARQUIVO");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void buscar() {
        int codigo = Console.lerInt("Informe o Codigo do Relogio");
        try {
            Relogio relogio = GerenciadorRelogio.buscarRelogio(codigo);
            System.out.println("\nRelogio localizado.");
            System.out.println(relogio.exibirDados());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void apagar() {
        int codigo = Console.lerInt("Informe o Codigo do Relogio");
        try {
            GerenciadorRelogio.apagarRelogio(codigo);
            System.out.println("\nRelogio Excluido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void apagarTodos() {
        try {
            GerenciadorRelogio.apagarTodos();
            System.out.println("\nRelogio Excluido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void atualizarRelogio() {
        int codigo = Console.lerInt("Informe o codigo do Relogio");
        try {
            Relogio tempRelogio = GerenciadorRelogio.buscarRelogio(codigo);
            String marca = Console.lerString("Informe a nova marca:");
            String nome = Console.lerString("Informe o novo nome:");
            String tipo = Console.lerString("Informe o novo tipo");
            tempRelogio.setMarca(marca);
            tempRelogio.setNome(nome);
            tempRelogio.setTipo(tipo);
            GerenciadorRelogio.atualizarRelogio(tempRelogio);
            System.out.println("\nRelogio " + codigo + " atualizado.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void listarTodos() {
        try {
            for (Relogio tempRelogio : GerenciadorRelogio.getListaRelogios()) {
                System.out.println(tempRelogio.exibirDados() + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void executar() {
        while (true) {
            exibirMenu();
            int op = Console.lerInt("Informe uma opção:");
            switch (op) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    apagar();
                    break;
                case 4:
                    listarTodos();
                    break;
                case 5:
                    atualizarRelogio();
                    break;
                case 6:
                    apagarTodos();
                    break;
                case 0:
                    System.out.println("O Sistema foi finalizado....");
                    System.exit(op);
                    break;
                default:
                    System.out.println("Opção Invalida.");
                    break;
            }
        }
    }
}
