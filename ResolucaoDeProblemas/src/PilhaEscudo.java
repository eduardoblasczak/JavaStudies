
public class PilhaEscudo {

    private int[] dados;
    private int topo;

    public PilhaEscudo(int capacidade) {
        dados = new int[capacidade];
        topo = -1;
    }


    public void push(int ataque) {
        if (topo == dados.length - 1) {
            throw new RuntimeException("Escudo não aguenta mais bloqueios!");
        }
        dados[++topo] = ataque;
    }


    public int pop() {
        if (topo == -1) {
            throw new RuntimeException("Nenhum ataque bloqueado!");
        }
        return dados[topo--];
    }

    public static void main(String[] args) {
        PilhaEscudo pilha = new PilhaEscudo(5);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println("Contra-ataca, remove: " + pilha.pop());
        System.out.println("Contra-ataca, remove: " + pilha.pop());
    }
}
