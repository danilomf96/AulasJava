public class Principal {
    public static void main(String[] args) {
        int op;
        Func funcionario = new Func();
        Folha folha = new Folha();
        do {
            System.out.println("-----MENU FOLHA DE PAGAMENTO----");
            System.out.println(" 1 --> Calcular Folha ");
            System.out.println(" 2 --> Sair");
            op = Console.readInt();
            switch (op) {
                case 1:
                    folha.EntradaDados(funcionario);
                    folha.calcularBruto(funcionario);
                    folha.IR(funcionario);
                    folha.INSS(funcionario);
                    System.out.println("Salario Liquido : " + funcionario.getLiq());
                    break;
                case 2:
                    System.out.println("Programa Finalizado...");
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        } while (op != 2);
    }
}