/**
 * ContaBancaria
 */
public class ContaBancaria {

    private int numeroConta;
    private String titularConta;
    private float saldo;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public String getTitularConta() {
        return titularConta;
    }
}