import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private static List<Carro> listaCarros = new ArrayList<>();

    public static void estacionarCarro(Carro carro) {
        listaCarros.add(carro);
        System.out.println("Carro " + carro.getModelo() + " " + carro.getPlaca() + " foi estacionado");
    }

    public static void mostrarCarros() {

        if (listaCarros.size() == 0) {
            System.out.println("--Nao ha carros estacionados--");
            return;
        }

        System.out.println("\nCarros Estacionados:");

        for (Carro carroTemp : listaCarros) {
            carroTemp.mostrarDadosCarro();
        }
    }

    public static void liberarCarro(Carro carro) {
        listaCarros.remove(carro);
        System.out.println("\nCarro " + carro.getModelo() + " " + carro.getPlaca() + " foi liberado");
    }

}
