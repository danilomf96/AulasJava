public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro("Ka", "asc1256");
        Carro c2 = new Carro("Mobi", "bsc6210");
        Carro c3 = new Carro("Mini Cooper", "cdm7956");

        System.out.println("\nEstacionamento:");

        Estacionamento.estacionarCarro(c1);
        Estacionamento.estacionarCarro(c2);
        Estacionamento.estacionarCarro(c3);

        Estacionamento.mostrarCarros();

        Estacionamento.liberarCarro(c2);

        Estacionamento.mostrarCarros();
    }
}