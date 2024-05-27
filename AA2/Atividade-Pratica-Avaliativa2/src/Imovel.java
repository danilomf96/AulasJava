public class Imovel {

    private int id;
    private String proprietario;
    private String local;
    private int valor;

    public Imovel(int id, String proprietario, String local, int valor) {
        this.id = id;
        this.proprietario = proprietario;
        this.local = local;
        this.valor = valor;
    }

    public Imovel() {
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        String txt = "\nProprietario: " + proprietario + "\nLocal: " + local + "\nValor: " + valor + "\nID: " + id;
        return txt;
    }
}
