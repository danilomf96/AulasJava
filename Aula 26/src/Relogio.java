public class Relogio {

    private int codigo;
    private String marca;
    private String nome;
    private String tipo;

    public Relogio(int codigo, String marca, String nome, String tipo) {
        this.codigo = codigo;
        this.marca = marca;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Relogio() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Codigo=" + codigo + ", Marca=" + marca + ", Nome=" + nome + ", Tipo=" + tipo;
    }

    public String exibirDados() {
        return "Relogios: \nCodigo: " + codigo +
                "\nMarca: " + marca +
                "\nNome: " + nome +
                "\nTipo: " + tipo;
    }

    public void fromString(String linha) {
        String[] dados = linha.split(", ");
        codigo = Integer.parseInt(dados[0].split("=")[1]);
        marca = dados[1].split("=")[1];
        nome = dados[1].split("=")[1];
        tipo = dados[1].split("=")[1];
    }

}
