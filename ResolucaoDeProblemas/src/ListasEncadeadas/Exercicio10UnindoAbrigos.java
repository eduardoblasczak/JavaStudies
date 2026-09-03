package ListasEncadeadas;

public class Exercicio10UnindoAbrigos {

    static class No {
        String nome;
        No proximo;

        No(String nome) {
            this.nome = nome;
        }
    }

    static class ListaEncadeada {
        private No inicio;

        public void inserirNoFim(String nome) {
            No novo = new No(nome);
            if (inicio == null) {
                inicio = novo;
                return;
            }
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }

        public void concatenar(ListaEncadeada outraLista) {
            if (outraLista == null || outraLista.inicio == null) {
                return;
            }
            if (inicio == null) {
                inicio = outraLista.inicio;
            } else {
                No atual = inicio;
                while (atual.proximo != null) {
                    atual = atual.proximo;
                }
                atual.proximo = outraLista.inicio;
            }
            outraLista.inicio = null;
        }

        public void imprimirLista() {
            No atual = inicio;
            while (atual != null) {
                System.out.println("- " + atual.nome);
                atual = atual.proximo;
            }
        }
    }

    public static void main(String[] args) {
        ListaEncadeada amigos = new ListaEncadeada();
        amigos.inserirNoFim("Bolinha");
        amigos.inserirNoFim("Amora");

        ListaEncadeada patasUnidas = new ListaEncadeada();
        patasUnidas.inserirNoFim("Mel");
        patasUnidas.inserirNoFim("Cafe");
        patasUnidas.inserirNoFim("Bidu");

        amigos.concatenar(patasUnidas);

        System.out.println("Abrigo unificado:");
        amigos.imprimirLista();
    }
}
