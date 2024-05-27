import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static int readInt() {
        int valor = leitor.nextInt();
        return valor;
    }

    public static float readFloat() {
        float valor = leitor.nextFloat();
        return valor;
    }

    public static String readString() {
        String valor = leitor.nextLine();
        return valor;
    }

}
