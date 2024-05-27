import java.util.Scanner;

public class Ex02 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("MENU JAVA");
            System.out.println("op 1 : exempo for");
            System.out.println("op 2 : exemplo while");
            System.out.println("op 3 : exemplo do while");
            System.out.println("op 4 : sair");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    exemploFor();
                    break;
                case 2:
                    exemploWhile();
                    break;
                case 3:
                    exemploDoWhile();
                    break;
                case 4:
                    System.out.println("\n Programa Finalizado");
                    break;
                default:
                    System.out.println("Opçao Invalida");
                    break;
            }
        } while (op != 4);
    }

    public static void ex04() {

        float n1;
        float n2;

        System.out.println("\nExercicio 04");
        System.out.print("Informe o um numero: ");
        n1 = leitor.nextFloat();
        System.out.print("Informe o segundo numero: ");
        n2 = leitor.nextFloat();
        System.out.println("\nSoma = " + (n1 + n2));
        System.out.println("\nSubtração = " + (n1 - n2));
        System.out.println("\nMultiplicaçao = " + (n1 * n2));
        System.out.println("\nDivisão = " + (n1 / n2));

    }

    public static void exemploFor() {
        // ler um valor inteiro e apresentar a tabuada
        System.out.println(" Informe um Valor inteiro : ");
        int valor = leitor.nextInt();
        int n;
        System.out.println(" \nTabuada do valor digitado : ");
        for (n = 1; n <= 10; n++) {
            System.out.println("X " + n + " = " + (n * valor));
        }
    }

    public static void exemploWhile() {
        // mostre todos os valores entre o valor digitado e 100
        System.out.print(" Informe um Valor inteiro : ");
        int valor = leitor.nextInt();
        while (valor <= 100) {
            System.out.println("valor atual : " + valor);
            valor++;
        }
        if (valor > 100) {
            System.out.println("O VALOR INFORMADO É MAIOR QUE 100!");

        }

    }

    public static void exemploDoWhile() {
        System.out.println("\nExemplo doWhile");
        int valor;
        do {
            System.out.println("Informe um valor inteiro entre um e dez: ");
            valor = leitor.nextInt();
        } while (valor < 1 || valor > 10);

        if (valor % 2 == 0) {
            System.out.println("O valor informado é par");
        } else {
            System.out.println("O valor informado é impar");
        }

    }
}
