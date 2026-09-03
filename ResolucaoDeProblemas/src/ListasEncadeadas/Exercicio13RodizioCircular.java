package ListasEncadeadas;

public class Exercicio13RodizioCircular {

    static class No {
        String nomeGatinho;
        No proximo;

        No(String nomeGatinho) {
            this.nomeGatinho = nomeGatinho;
        }
    }

    static class ListaCircular {
        private No ultimo;
        private int tamanho;

        public void inserirNoFim(String nomeGatinho) {
            No novo = new No(nomeGatinho);
            if (ultimo == null) {
                novo.proximo = novo;
                ultimo = novo;
            } else {
                novo.proximo = ultimo.proximo;
                ultimo.proximo = novo;
                ultimo = novo;
            }
            tamanho++;
        }

        public void simularRodizio(int voltas) {
            if (ultimo == null) {
                System.out.println("Nenhum gatinho no parque.");
                return;
            }
            No atual = ultimo.proximo;
            for (int volta = 1; volta <= voltas; volta++) {
                System.out.println("Volta " + volta + ":");
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("  " + atual.nomeGatinho + " esta brincando");
                    atual = atual.proximo;
                }
            }
        }
    }

    public static void main(String[] args) {
        ListaCircular parque = new ListaCircular();
        parque.inserirNoFim("Mel");
        parque.inserirNoFim("Cafe");
        parque.inserirNoFim("Fofinho");

        parque.simularRodizio(3);
    }
}
