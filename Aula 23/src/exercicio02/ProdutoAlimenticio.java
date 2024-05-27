package exercicio02;

public class ProdutoAlimenticio extends Produto {
    private String dataExpiracao;

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public ProdutoAlimenticio(int id, String nomeProduto, int quant, String dataExpiracao) {
        super(id, nomeProduto, quant);
        this.dataExpiracao = dataExpiracao;
    }

    @Override
    public void exibirItem() {

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Data de expiração : " + dataExpiracao);
        System.out.println("Produto id: " + id);
        System.out.println("Quantidade em estoque: " + quant);
    }
}
