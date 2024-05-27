package exercicio01;

public class ContaCorrente extends ContaBancaria {

    private float chequeEspecial;

    public ContaCorrente(String nomeCliente, int numeroConta, float saldo, float chequeEspecial) {
        super(nomeCliente, numeroConta, saldo);
        this.chequeEspecial = chequeEspecial;
    }
    public float getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("\nConta Corrente: " + numeroConta);
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("Cheque especial: " + chequeEspecial);
        System.out.println("Total disponivel para saque: " + (saldo + chequeEspecial));
        
    }

    @Override
    public void sacar(float valor) throws Exception {

        if (valor > saldo + chequeEspecial) {
            throw new Exception("O valor o saque é superior ao seu limite disponivel.");
        }
        saldo -= valor;
        System.out.println("O valor R$" + valor + " foi sacado da Conta " + numeroConta);
    }
    
    

}
