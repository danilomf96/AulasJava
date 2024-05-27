import exercicio01.ContaCorrente;
import exercicio01.ContaPoupanca;
import exercicio02.ProdutoAlimenticio;
import exercicio02.ProdutoEletronico;

public class App {
    public static void main(String[] args) throws Exception {
        exercicio01();
    }

    private static void exercicio01() {
        ContaCorrente cc = new ContaCorrente("danilo", 125, 2500, 500);
        cc.exibirSaldo();
        cc.depositar(300);

        try {
            cc.sacar(600);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        cc.exibirSaldo();

        try {
            cc.sacar(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ContaPoupanca cp = new ContaPoupanca("gedeco", 153, 1000, 2.5f);

        cp.depositar(2000);
        cp.exibirSaldo();
        try {
            cp.sacar(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void exercicio02() {
        ProdutoEletronico pe = new ProdutoEletronico(1, "Iphone 13", 15, "Celular");
        ProdutoAlimenticio pa = new ProdutoAlimenticio(1, "Nescau", 50, "2024-11-12");
        try {
            pe.adicionarItem(15);
            pe.removerItem(31);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            pa.adicionarItem(15);
            pa.removerItem(80);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
