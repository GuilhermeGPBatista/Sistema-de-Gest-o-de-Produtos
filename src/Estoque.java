import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " Adicionado no estoque.");
    }

    public void removerProduto(Produto produto) {
        if (produtos.remove(produto)) {
            System.out.println(produto.getNome() + " Removido do estoque.");
        } else {
            System.out.println(produto.getNome() + " Item n encontrado. ");
        }
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(porcentagem);
            System.out.println(produto.getNome() + " - Preço com desconto: R$" + precoComDesconto);
        }
    }
}

