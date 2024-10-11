public class Mobilario extends Produto {
    public Mobilario(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        if (porcentagem > 12) {
            porcentagem = 12;
        }
        return preco - (preco * (porcentagem / 100));
    }
}
