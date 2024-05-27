## criando a classe console e colocando metodo de leituras fora do main
>public class Console {

    static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {
        int valor = leitor.nextInt();
        return valor;
    }

}

