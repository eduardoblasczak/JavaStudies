package ListasEncadeadas;

public class Exercicio11RemoverDuplicados {

    static class No {
        String nome;
        No proximo;

        No(String nome) {
            this.nome = nome;
        }
    }

    static class ListaAbrigo {
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

        public void removerDuplicados() {
            No referencia = inicio;
            while (referencia != null) {
                No anterior = referencia;
                No atual = referencia.proximo;
                while (atual != null) {
                    if (atual.nome.equalsIgnoreCase(referencia.nome)) {
                        anterior.proximo = atual.proximo;
                    } else {
                        anterior = atual;
                    }
                    atual = atual.proximo;
                }
                referencia = referencia.proximo;
            }
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
        ListaAbrigo abrigo = new ListaAbrigo();
        abrigo.inserirNoFim("Cafe");
        abrigo.inserirNoFim("Bolinha");
        abrigo.inserirNoFim("Cafe");
        abrigo.inserirNoFim("Mel");
        abrigo.inserirNoFim("Bolinha");
        abrigo.inserirNoFim("Cafe");

        System.out.println("Cadastro com duplicatas:");
        abrigo.imprimirLista();

        abrigo.removerDuplicados();

        System.out.println();
        System.out.println("Cadastro corrigido:");
        abrigo.imprimirLista();
    }
}
