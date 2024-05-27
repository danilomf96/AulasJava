public class Casa extends Imovel {

    private String sobrado;
    private String quintal;

    public String getSobrado() {
        return sobrado;
    }

    public void setSobrado(String sobrado) {
        this.sobrado = sobrado;
    }

    public String getQuintal() {
        return quintal;
    }

    public void setQuintal(String quintal) {
        this.quintal = quintal;
    }

    public Casa(int id, String proprietario, String local, int valor, String sobrado, String quintal) {
        super(id, proprietario, local, valor);
        this.sobrado = sobrado;
        this.quintal = quintal;
    }

    public Casa() {
    }

    @Override
    public String toString() {
        return "\nCASA\n" + super.toString() + "\nSobrado: " + sobrado + "\nQuintal: " + quintal;
    }
}
