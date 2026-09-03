package ListasEncadeadas;

public class Exercicio06ViveiroOrdemAlfabetica {

    static class No {
        String nomePassarinho;
        No proximo;

        No(String nomePassarinho) {
            this.nomePassarinho = nomePassarinho;
        }
    }

    static class Viveiro {
        private No inicio;

        public void inserirOrdenado(String nomePassarinho) {
            No novo = new No(nomePassarinho);
            if (inicio == null || inicio.nomePassarinho.compareToIgnoreCase(nomePassarinho) > 0) {
                novo.proximo = inicio;
                inicio = novo;
                return;
            }
            No atual = inicio;
            while (atual.proximo != null
                    && atual.proximo.nomePassarinho.compareToIgnoreCase(nomePassarinho) <= 0) {
                atual = atual.proximo;
            }
            novo.proximo = atual.proximo;
            atual.proximo = novo;
        }

        public void imprimirLista() {
            No atual = inicio;
            while (atual != null) {
                System.out.println("- " + atual.nomePassarinho);
                atual = atual.proximo;
            }
        }
    }

    public static void main(String[] args) {
        Viveiro viveiro = new Viveiro();
        viveiro.inserirOrdenado("Piu");
        viveiro.inserirOrdenado("Canario");
        viveiro.inserirOrdenado("Bem-te-vi");
        viveiro.inserirOrdenado("Zeca");
        viveiro.inserirOrdenado("Aurora");

        System.out.println("Passarinhos do viveiro em ordem alfabetica:");
        viveiro.imprimirLista();
    }
}
