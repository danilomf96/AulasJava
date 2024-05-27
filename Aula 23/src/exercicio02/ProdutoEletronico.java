package exercicio02;

public class ProdutoEletronico extends Produto {
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ProdutoEletronico(int id, String nomeProduto, int quant, String categoria) {
        super(id, nomeProduto, quant);
        this.categoria = categoria;
    }

    @Override
    public void exibirItem() {
        System.out.println("Categoria do eletronico : " + categoria);
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade em estoque: " + quant);
        System.out.println("Produto id: " + id);
    }

}
