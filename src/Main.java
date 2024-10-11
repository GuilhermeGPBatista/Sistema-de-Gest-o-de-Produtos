public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto kitNike = new Roupas("Kit Nike", 450);
        Produto cama = new Mobilario("Cama", 3500);
        Produto estante = new Mobilario("Estante", 400);
        Produto blusa = new Roupas("Blusa", 200);
        Produto camisa = new Roupas("Camisa", 50);
        Produto sofa = new Mobilario("Sofá", 1500);

        estoque.adicionarProduto(kitNike);
        estoque.adicionarProduto(cama);
        estoque.adicionarProduto(estante);
        estoque.adicionarProduto(blusa);
        estoque.adicionarProduto(camisa);
        estoque.adicionarProduto(sofa);

        estoque.removerProduto(camisa);
        System.out.println("-------------------------------------------");

        System.out.println("Preços com desconto de 20%:");
        estoque.exibirPrecosComDesconto(20);
    }
}

