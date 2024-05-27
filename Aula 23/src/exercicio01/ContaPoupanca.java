package exercicio01;

public class ContaPoupanca extends ContaBancaria {

    private float taxaJuros;

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public ContaPoupanca(String nomeCliente, int numeroConta, float saldo, float taxaJuros) {
        super(nomeCliente, numeroConta, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(float valor) throws Exception {
        if (valor > saldo) {
            throw new Exception("\nOvalor do saque nao pode ser superior ao saldo: " + saldo);
        }
        saldo -= valor;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("\nConta Corrente: " + numeroConta);
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("Taxa de Juros: " + taxaJuros);
        System.out.println("Rendimento previsto para o mês R$" + (saldo * (taxaJuros / 100)));
    }

}
