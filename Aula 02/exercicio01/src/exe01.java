import java.util.Scanner;

public class exe01 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int menu;
        int valor;
        do {
            System.out.println("Escolha seu exercício da lista : 1, 2, 3, 4 ou 5");
            menu = leitor.nextInt();
        } while (menu < 1 || menu > 5);

        if (menu == 1) {
            System.out.println("Informe um valor inteiro: ");
            valor = leitor.nextInt();
            if (valor > 10) {
                System.out.println("O valor informado é maior que 10");
            } else if (valor < 10) {
                System.out.println("O valor informado é menor que 10");
            } else {
                System.out.println("O valor informado é 10");
            }
        } else if (menu == 2) {
            System.out.println("Digite um Numero inteiro: ");
            int x = leitor.nextInt();
            System.out.println("Digite outro numero inteiro: ");
            int y = leitor.nextInt();
            int soma = x + y;
            System.out.println("A soma dos numeros é : " + soma);
        } else {
            System.out.println("DESENVOLVIMENTO!!!");
        }
    }
}
