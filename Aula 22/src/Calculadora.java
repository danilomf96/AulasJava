public class Calculadora {
    public static int somarPositivos(int n1, int n2) throws Exception {

        if (n1 < 0 || n2 < 0) {
            throw new Exception("Os valores devem ser positivos.");
        }
        return n1 + n2;

    }
}
