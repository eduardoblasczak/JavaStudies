package ListasEncadeadas;

public class Exercicio19RodizioAlimentacao {

    static class No {
        String nomeGatinho;
        No anterior;
        No proximo;

        No(String nomeGatinho) {
            this.nomeGatinho = nomeGatinho;
        }
    }

    static class ListaCircularDupla {
        private No inicio;
        private No atual;

        public void inserirNoFim(String nomeGatinho) {
            No novo = new No(nomeGatinho);
            if (inicio == null) {
                novo.anterior = novo;
                novo.proximo = novo;
                inicio = novo;
                atual = novo;
                return;
            }
            No ultimo = inicio.anterior;
            novo.anterior = ultimo;
            novo.proximo = inicio;
            ultimo.proximo = novo;
            inicio.anterior = novo;
        }

        public String proximoNaAlimentacao() {
            if (atual == null) {
                return null;
            }
            String nome = atual.nomeGatinho;
            atual = atual.proximo;
            return nome;
        }

        public String anteriorNaAlimentacao() {
            if (atual == null) {
                return null;
            }
            atual = atual.anterior;
            return atual.nomeGatinho;
        }
    }

    public static void main(String[] args) {
        ListaCircularDupla abrigo = new ListaCircularDupla();
        abrigo.inserirNoFim("Mel");
        abrigo.inserirNoFim("Cafe");
        abrigo.inserirNoFim("Fofinho");

        for (int i = 1; i <= 7; i++) {
            System.out.println("Refeicao " + i + ": " + abrigo.proximoNaAlimentacao());
        }

        System.out.println();
        System.out.println("Voltando um na fila: " + abrigo.anteriorNaAlimentacao());
    }
}
