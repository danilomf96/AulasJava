import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt(String msg) {
        int valor = 0;
        while (true) {
            try {
                System.out.print(msg + " ");
                valor = leitor.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("O valor digitado nao é do tipo 'int'.");
            } finally {
                leitor.nextLine();
            }
        }
        return valor;
    }

    public static float lerFloat(String msg) {
        float valor = 0;
        while (true) {
            try {
                System.out.print(msg + " ");
                valor = leitor.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("O valor digitado nao é do tipo 'Float'.");

            } finally {
                leitor.nextLine();
            }
        }
        return valor;
    }

    public static double lerDouble(String msg) {
        double valor = 0;
        while (true) {
            try {
                System.out.print(msg + " ");
                valor = leitor.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("O valor digitado nao é do tipo 'Double'.");

            } finally {
                leitor.nextLine();
            }
        }
        return valor;
    }

    public static String lerString(String msg) {
        System.out.print(msg + " ");
        return leitor.nextLine();
    }
}