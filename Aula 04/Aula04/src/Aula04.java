import java.util.Scanner;

public class Aula04 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("\nExemplo Vetores:");
            System.out.println("1) Exemplo 1");
            System.out.println("2) Exemplo 2");
            System.out.println("3) Exemplo 3");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    exVetor01();

                    break;

                case 2:
                    exVetor02();
                    break;

                case 3:
                    exVetor03();
                    break;

                default:
                    System.out.println("\nOpçao Invalida");
                    break;
            }
        } while (op != 0);

    }

    public static void exVetor01() {
        // ler 5 valores inteiros e armazena-los em um vetor
        System.out.println("\n Exemplo Vetor 01 : ");
        // declaração de vetor
        int[] vetor = new int[5];
        int i;
        for (i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero para a posiçao " + (i + 1) + ": ");
            vetor[i] = leitor.nextInt();
        }
        for (i = 0; i < vetor.length; i++) {

            System.out.print("Numero " + (i + 1) + ": " + vetor[i] + " , ");

        }
    }

    public static void exVetor02() {
        /*
         * leia um valor inteiro entre 2 e 10
         * enquanto for digitdado um valor fora desse intervalo, solicite ao usuario
         * para digitar novamente.
         * Crie um vetor com o mesmo tamanho do valor lido.
         * Leia os valores e depois apresente apenas os valores pares do vetor na tela
         */
        System.out.println("\nExemplo Vetor 02");
        int tamanho;
        do {
            System.out.println("Informe o tamanho do vetor (entre 2 e 10) : ");
            tamanho = leitor.nextInt();
        } while (tamanho < 2 || tamanho > 10);

        int[] vetor = new int[tamanho];

        System.out.println("\nLeitura do vetor de " + (tamanho + 1) + " pos: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Pos " + i + ": ");
            vetor[i] = leitor.nextInt();
        }
        System.out.println("\nValores pares do Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print("Pares: " + vetor[i] + " ");
            }
            if (vetor[i] % 2 != 0) {
                System.out.print("Impares: " + vetor[i] + " ");
            }
        }
    }

    public static void exVetor03() {
        /*
         * Criar um vetor de 5 posiçoes com valores definidos em
         * sua declaraçao. Mostrar na tela apenas os valores que
         * sejam menores que seu indice.
         */

        int[] vet = { 10, 5, 1, 2, 45 };

        System.out.println("\nExemplo Vetor 03:");
        System.out.println("\nValores menores que seus indices");

        for (int i = 0; i < vet.length; i++) {

            if (vet[i] < i) {
                System.out.println("Pos" + i + "- Valor : " + vet[i] + " ");
            }
        }
    }
}
