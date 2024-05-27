public class Terreno extends Imovel {

    private int m2;

    public Terreno() {
    }

    public Terreno(int id, String proprietario, String local, int valor, int m2) {
        super(id, proprietario, local, valor);
        this.m2 = m2;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "\nTERRENO\n" + super.toString() + "\nMetros quadrados : " + m2;
    }
}
