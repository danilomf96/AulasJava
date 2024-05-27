package exemploAbstrata;

public class Carro extends Veiculo {

    @Override
    public String acelerar() {
        return "vrummmmm!";
    }

    @Override
    public String parar() {
        return "Parou";
    }
    
    @Override
    public String toString() {
        return getClass() + super.toString();
    }

    public Carro(String placa){
        super(placa);
    }
    public Carro(){

    }
}
