package exemploAbstrata;

public class Moto extends Veiculo {
    @Override
    public String acelerar() {
        return "RANDANDAN";
    }

    @Override
    public String parar() {

        return "Moto parou!";
    }

    @Override
    public String toString() {

        return getClass() + super.toString();
    }

    public Moto(String placa) {
        super(placa);
    }

    public Moto() {

    }
}
