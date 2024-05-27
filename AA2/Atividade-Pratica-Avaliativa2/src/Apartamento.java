public class Apartamento extends Imovel {

    private int andar;
    private String face;
    private String churrasqueira;

    public Apartamento() {
    }

    public Apartamento(int id, String proprietario, String local, int valor, int andar, String face,
            String churrasqueira) {
        super(id, proprietario, local, valor);
        this.andar = andar;
        this.face = face;
        this.churrasqueira = churrasqueira;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getChurrasqueira() {
        return churrasqueira;
    }

    public void setChurrasqueira(String churrasqueira) {
        this.churrasqueira = churrasqueira;
    }

    @Override
    public String toString() {
        return "\nAPARTAMENTO\n" + super.toString() + "\nAndar: " + andar + "\nFace: " + face + "\nChurrasqueira: "
                + churrasqueira;
    }
}
