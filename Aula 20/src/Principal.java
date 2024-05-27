import java.util.ArrayList;

import exemploAbstrata.Carro;
import exemploAbstrata.Moto;
import exemploInterfaces.Circulo;
import exemploInterfaces.Forma;
import exemploInterfaces.Quadrado;
import exemploInterfaces.Retangulo;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("ABV5676");
        Moto minhaMoto = new Moto("ACM9071");

        System.out.println("\n" + minhaMoto.acelerar());
        System.out.println(minhaMoto.parar());
        System.out.println(minhaMoto.toString());

        System.out.println("\n" + meuCarro.acelerar());
        System.out.println(meuCarro.parar());
        System.out.println(meuCarro.toString());

        // ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        // nao é possivel fazer arraylist de formas abstratas
        System.out.println("\n---------------------");

        // Quadrado quadrado = new Quadrado(3.5f);
        // Circulo circulo = new Circulo(1.7f);
        // Retangulo retangulo = new Retangulo(3, 5);
        Forma quadrado = new Quadrado(3.5f);
        Forma circulo = new Circulo(1.7f);
        Forma retangulo = new Retangulo(3, 5);
        // posso declarar meu objeto pela interface.

        System.out.println("\nÁrea do Quadrado : " + quadrado.calcularArea());
        System.out.println("\nÁrea do Circulo : " + circulo.calcularArea());
        System.out.println("\nArea do retangulo : " + retangulo.calcularArea());

        ArrayList<Forma> listaforma = new ArrayList<>();
        listaforma.add(circulo);
        listaforma.add(quadrado);
        listaforma.add(retangulo);

        System.out.println("\nDesenhando formas: ");
        for (Forma forma : listaforma) {
            System.out.println(forma.desenhar());
        }
    }
}
