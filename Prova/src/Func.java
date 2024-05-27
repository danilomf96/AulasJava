public class Func {
    private String nome;
    private int horasT;
    private float valorH;
    private float brut;
    private float liq;

    public Func() {
    }

    public Func(String nome, int horasT, float valorH, float brut, float liq) {
        this.nome = nome;
        this.horasT = horasT;
        this.valorH = valorH;
        this.brut = brut;
        this.liq = liq;
    }

    public float getBrut() {
        return brut;
    }

    public int getHorasT() {
        return horasT;
    }

    public float getLiq() {
        return liq;
    }

    public String getNome() {
        return nome;
    }

    public float getValorH() {
        return valorH;
    }

    public void setBrut(float brut) {
        this.brut = brut;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public void setLiq(float liq) {
        this.liq = liq;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorH(float valorH) {
        this.valorH = valorH;
    }
}
