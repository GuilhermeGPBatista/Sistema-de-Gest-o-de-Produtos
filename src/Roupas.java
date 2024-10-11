public class Roupas extends Produto{
    public Roupas(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        if (porcentagem > 15) {
            porcentagem = 15;
        }
        return preco - (preco * (porcentagem / 100));
    }
}

