package ExercicioPedido;

public class ProdutoPedido {
    private Produto pedido;
    private int Quantidade;

    public ProdutoPedido(Produto pedido, int quantidade) {
        this.pedido = pedido;
        Quantidade = quantidade;
    }

    public Produto getPedido() {
        return pedido;
    }

    public void setPedido(Produto pedido) {
        this.pedido = pedido;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }
}
