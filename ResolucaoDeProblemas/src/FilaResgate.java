
public class FilaResgate {

    private int[] pedidos;
    private int inicio, fim, tamanho;

    public FilaResgate(int capacidade) {
        pedidos = new int[capacidade];
        inicio = fim = tamanho = 0;
    }
    public void inserirPedido(int numeroPedido) {
        if (tamanho == pedidos.length) {
            throw new RuntimeException("Fila de resgate cheia!");
        }
        pedidos[fim++] = numeroPedido;
        tamanho++;
    }

    public int atenderProximo() {
        if (tamanho == 0) {
            throw new RuntimeException("Nenhum pedido na fila!");
        }
        int pedido = pedidos[inicio++];
        tamanho--;
        return pedido;
    }

    public void mostrarPedidos() {
        System.out.print("Pedidos na fila: ");
        for (int i = inicio; i < fim; i++) {
            System.out.print(pedidos[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FilaResgate fila = new FilaResgate(5);
        fila.inserirPedido(101);
        fila.inserirPedido(102);
        fila.inserirPedido(103);
        fila.mostrarPedidos();

        System.out.println("Atendendo: " + fila.atenderProximo());
        fila.mostrarPedidos();
    }
}
