package exercicio02;

public abstract class Produto implements Estoque {
    protected int id;
    protected String nomeProduto;
    protected int quant;

    public Produto(int id, String nomeProduto, int quant) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quant = quant;
    }

    @Override
    public void adicionarItem(int quant) throws Exception {
        if (quant < 0) {
            throw new Exception("Quantidade deve ser maior que 0.");
        }
        this.quant += quant;

        System.out.println(quant + " adicionado(s) ao estoque de " + nomeProduto);
    }

    @Override
    public void removerItem(int quant) throws Exception {
        if (quant > this.quant) {
            throw new Exception("Quantidade deve ser maior que " + this.quant);
        }
        this.quant -= quant;
        System.out.println(quant + " removido(s) do estoque de " + nomeProduto);

    }

    public abstract void exibirItem();

}
