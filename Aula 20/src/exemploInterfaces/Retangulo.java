package exemploInterfaces;

public class Retangulo implements Forma {

    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
    }

    @Override
    public String desenhar() {
        return "Desenhei um retangulo com " + base + " de base e " + altura + " altura.";
    }

    @Override
    public float calcularArea() {
        return (base * altura);
    }

}
