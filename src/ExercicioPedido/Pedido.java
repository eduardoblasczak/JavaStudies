/*package ExercicioPedido;


import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private double valorTotalPedido;
    private ArrayList<Produto>;

    public Pedido(){
        this.cliente = null;
        this.produto = null;
        this.valorTotalPedido = 0.0;
        this.produtos = new ArrayList<>();
    }

    public Pedido(Cliente cliente, Produto produto, int quantidade){
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotalPedido = calcPedido();
    }

    private double calcPedido(){
        double preco = produto.getPreco();
        return preco * quantidade;
    }

    public void resumoPedido(){
        System.out.println("Nome do Cliente: "+ cliente.getNome());
        System.out.println("Email do Cliente: "+ cliente.getEmail());
        System.out.println("Nome do produto: "+ produto.getNome());
        System.out.println("Quantidade do produto: "+ quantidade);
        System.out.println("Valor total do pedido: "+ valorTotalPedido);
    }
}
*/