
public class PilhaAndares {


    private static class NoAndar {
        int andar;
        NoAndar prox;
        NoAndar(int andar) { this.andar = andar; }
    }

    private NoAndar topo;

    public void subir(int andar) {
        NoAndar novo = new NoAndar(andar);
        novo.prox = topo;
        topo = novo;
    }


    public int descer() {
        if (topo == null) {
            throw new RuntimeException("Homem-Aranha já está no chão!");
        }
        int andar = topo.andar;
        topo = topo.prox;
        return andar;
    }

    public static void main(String[] args) {
        PilhaAndares pilha = new PilhaAndares();
        pilha.subir(1);
        pilha.subir(2);
        pilha.subir(3);

        System.out.println("Descendo do andar: " + pilha.descer());
        System.out.println("Descendo do andar: " + pilha.descer());
    }
}
