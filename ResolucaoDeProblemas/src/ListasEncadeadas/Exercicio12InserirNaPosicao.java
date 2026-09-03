package ListasEncadeadas;

public class Exercicio12InserirNaPosicao {

    static class Cachorrinho {
        String nome;
        boolean doente;

        Cachorrinho(String nome, boolean doente) {
            this.nome = nome;
            this.doente = doente;
        }

        @Override
        public String toString() {
            return nome + (doente ? " (precisa de cuidados)" : "");
        }
    }

    static class No {
        Cachorrinho cachorrinho;
        No proximo;

        No(Cachorrinho cachorrinho) {
            this.cachorrinho = cachorrinho;
        }
    }

    static class FilaAtendimento {
        private No inicio;
        private int tamanho;

        public void inserirNoFim(Cachorrinho c) {
            inserirNaPosicao(c, tamanho);
        }

        public void inserirNaPosicao(Cachorrinho c, int posicao) {
            if (posicao < 0 || posicao > tamanho) {
                throw new IndexOutOfBoundsException("Posicao invalida: " + posicao);
            }
            No novo = new No(c);
            if (posicao == 0) {
                novo.proximo = inicio;
                inicio = novo;
            } else {
                No anterior = inicio;
                for (int i = 1; i < posicao; i++) {
                    anterior = anterior.proximo;
                }
                novo.proximo = anterior.proximo;
                anterior.proximo = novo;
            }
            tamanho++;
        }

        public void imprimirLista() {
            int i = 0;
            No atual = inicio;
            while (atual != null) {
                System.out.println(i + ": " + atual.cachorrinho);
                i++;
                atual = atual.proximo;
            }
        }
    }

    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();
        fila.inserirNoFim(new Cachorrinho("Bolinha", false));
        fila.inserirNoFim(new Cachorrinho("Toby", false));
        fila.inserirNoFim(new Cachorrinho("Amora", false));

        System.out.println("Fila de atendimento:");
        fila.imprimirLista();

        fila.inserirNaPosicao(new Cachorrinho("Fuba", true), 0);
        fila.inserirNaPosicao(new Cachorrinho("Bidu", true), 2);

        System.out.println();
        System.out.println("Fila apos priorizar filhotes doentes:");
        fila.imprimirLista();
    }
}
