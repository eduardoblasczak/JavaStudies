import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaPortais {

    private Deque<String> portais = new ArrayDeque<>();

    public void abrirPortal(String local) {
        portais.push(local); // push do Deque insere no início (topo)
    }


    public String fecharPortal() {
        if (portais.isEmpty()) {
            throw new RuntimeException("Nenhum portal aberto!");
        }
        return portais.pop(); // pop remove do início (topo)
    }

    public static void main(String[] args) {
        PilhaPortais pilha = new PilhaPortais();
        pilha.abrirPortal("Nova York");
        pilha.abrirPortal("Hong Kong");
        pilha.abrirPortal("Londres");

        System.out.println("Fecha portal: " + pilha.fecharPortal());
        System.out.println("Fecha portal: " + pilha.fecharPortal());
    }
}
