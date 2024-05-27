import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {

        // declarar "variavel" especial para entrada de dados
        Scanner leitor = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        String curso;
        int periodo;
        String turno;

        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.println("\nDigite seu Curso: ");
        curso = leitor.nextLine();
        do {
            System.out.println("\nDigite seu periodo (1 a 4): ");
            periodo = leitor.nextInt(); // Lê o período

            if (periodo < 1 || periodo > 4) {
                System.out.println("\nPeríodo inválido! Digite um valor entre 1 e 4.");
            }
        } while (periodo < 1 || periodo > 4);

        leitor.nextLine(); // Limpa o buffer do scanner

        System.out.println("\nDigite seu turno: ");
        turno = leitor.nextLine();

        System.out.println("\nNome: " + nome + "\nCurso: " + curso + "\nPeriodo: " + periodo + "\nTurno: " + turno);

        leitor.close();
    }
}
