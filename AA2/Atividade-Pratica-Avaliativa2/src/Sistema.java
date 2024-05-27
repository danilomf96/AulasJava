public class Sistema {

    public static void menu() {

        System.out.println("\n----------Imoveis GDC----------");
        System.out.println("Selecione a opção:");
        System.out.println("1-Cadastrar casa.");
        System.out.println("2-Cadastrar apartamento.");
        System.out.println("3-Cadastrar terreno.");
        System.out.println("4-Listar Imoveis.");
        System.out.println("5-Excluir Imovel.");
        System.out.println("0-Sair");
        System.out.println("----INFORME A OPÇÃO----");
    }

    private static void verificarOP(int op) {
        switch (op) {
            case 1:
                cadastrarCasa();
                break;
            case 2:
                cadastrarAp();
                break;
            case 3:
                cadastrarTerreno();
                break;
            case 4:
                listarImovel();
                break;
            case 5:
                excluirImovel();
                break;
            case 0:
                System.out.println("----Programa finalizado----");
                break;
            default:
                System.out.println("Opção Invalida... \nTecle novamente.");
                break;
        }
    }

    public static void executar() {
        int op;
        do {
            menu();
            op = Console.lerInt();
            verificarOP(op);
        } while (op != -0);
    }

    private static void cadastrarCasa() {
        System.out.println("\nNova Casa:");

        System.out.println("ID: ");
        int id = Console.lerInt();

        System.out.println("Proprietario: ");
        String proprietario = Console.lerString();

        System.out.println("Local: ");
        String local = Console.lerString();

        System.out.println("Valor: ");
        int valor = Console.lerInt();

        System.out.println("Tem dois andares ou mais?");
        String sobrado = Console.lerString();

        System.out.println("Tem Quintal?");
        String quintal = Console.lerString();

        Casa casa = new Casa(id, proprietario, local, valor, sobrado, quintal);
        Cadastro.cadastrar(casa);

        System.out.println("Casa cadastrada com sucesso");
        System.out.println("\n" + casa.toString());
    }

    private static void cadastrarAp() {

        System.out.println("\nNovo Apartamento:");

        System.out.println("ID: ");
        int id = Console.lerInt();

        System.out.println("Proprietario: ");
        String proprietario = Console.lerString();

        System.out.println("Local: ");
        String local = Console.lerString();

        System.out.println("Valor: ");
        int valor = Console.lerInt();

        System.out.println("Andar: ");
        int andar = Console.lerInt();

        System.out.println("Qual a face(norte/sul...) do Apartamento?");
        String face = Console.lerString();

        System.out.println("Tem churrasqueira?");
        String churrasqueira = Console.lerString();

        Apartamento apartamento = new Apartamento(id, proprietario, local, valor, andar, face, churrasqueira);
        Cadastro.cadastrar(apartamento);
    }

    private static void cadastrarTerreno() {
        System.out.println("\nNovo Terreno:");

        System.out.println("ID: ");
        int id = Console.lerInt();

        System.out.println("Proprietario: ");
        String proprietario = Console.lerString();

        System.out.println("Local: ");
        String local = Console.lerString();

        System.out.println("Valor: ");
        int valor = Console.lerInt();

        System.out.println("Quantos metros quadrados o terreno tem? ");
        int m2 = Console.lerInt();

        Terreno terreno = new Terreno(id, proprietario, local, valor, m2);
        Cadastro.cadastrar(terreno);
    }

    private static void listarImovel() {
        System.out.println("\nTodos os Imoveis Cadastrados : ");
        if (Cadastro.getListaImovel().size() == 0) {
            System.out.println("Nao há Imóveis cadastrados.");
            return;
        }
        for (Imovel imovel : Cadastro.getListaImovel()) {
            System.out.println("\n" + imovel.toString());
        }
    }

    private static void excluirImovel() {
        System.out.println("\nInforme o ID do Imovel que deseja excluir: ");
        int id = Console.lerInt();

        Imovel imovel = Cadastro.buscar(id);
        if (imovel == null) {
            System.out.println("\nImovel " + id + " nao foi encontrado. ");
            return;
        }
        imovel.toString();
        Cadastro.excluir(imovel);
        System.out.println("\nImovel removido com sucesso.");
    }
}
