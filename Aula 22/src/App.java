public class App {
    public static void main(String[] args) throws Exception {
        // exemplo01();
        // exemplo02();
        exemplo03();
    }

    private static void exemplo01() {
        System.out.println("\nInforme um valor inteiro: ");
        int valor = Console.lerInt();

        System.out.println("Informe um valor inteiro: ");
        int valor2 = Console.lerInt();

        try {
            int result = Calculadora.somarPositivos(valor, valor2);
            System.out.println("Soma dos valores inteiros: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("O Programa foi finalizado.");
        }

    }

    private static void exemplo02() {
        Pessoa p1 = new Pessoa();
        p1.setNome("Joao");

        try {
            Pessoa p2 = null;
            p2.setNome("Maria");
        } catch (NullPointerException e) {
            System.out.println("Não é possivel editar o nome do objeto p2, pois ele é nulo.");
        }
    }

    private static void exemplo03() {

        Funcionario f = new Funcionario();

        System.out.println("\nNome do Funcionario: ");

        String nome = Console.lerString();

        f.setNome(nome);

        float valorHora = 0;
        while (true) {
            try {
                System.out.println("Valor da Hora: ");
                valorHora = Console.lerFloat();
                f.setValorHora(valorHora);
                break;
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
        float horasTrab = 0;
        while (true) {
            try {
                System.out.println("Horas trabalhadas: ");
                horasTrab = Console.lerFloat();
                f.setHorasTrab(horasTrab);
                break;
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
        f.calcularSalario();
        System.out.println("O salario do " + f.getNome() + " é R$: " + f.getSalarioBruto());
    }
}
