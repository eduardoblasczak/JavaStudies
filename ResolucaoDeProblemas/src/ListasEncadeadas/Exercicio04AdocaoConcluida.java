package ListasEncadeadas;

public class Exercicio04AdocaoConcluida {

    static class Animal {
        String nome;
        String tipo;

        Animal(String nome, String tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return nome + " (" + tipo + ")";
        }
    }

    static class No {
        Animal animal;
        No proximo;

        No(Animal animal) {
            this.animal = animal;
        }
    }

    static class ListaAdocao {
        private No inicio;

        public void inserirNoFim(Animal a) {
            No novo = new No(a);
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

        public boolean removerPorNome(String nome) {
            if (inicio == null) {
                return false;
            }
            if (inicio.animal.nome.equalsIgnoreCase(nome)) {
                inicio = inicio.proximo;
                return true;
            }
            No anterior = inicio;
            No atual = inicio.proximo;
            while (atual != null) {
                if (atual.animal.nome.equalsIgnoreCase(nome)) {
                    anterior.proximo = atual.proximo;
                    atual.proximo = null;
                    return true;
                }
                anterior = atual;
                atual = atual.proximo;
            }
            return false;
        }

        public void imprimirLista() {
            No atual = inicio;
            while (atual != null) {
                System.out.println("- " + atual.animal);
                atual = atual.proximo;
            }
        }
    }

    public static void main(String[] args) {
        ListaAdocao disponiveis = new ListaAdocao();
        disponiveis.inserirNoFim(new Animal("Bolinha", "Cachorro"));
        disponiveis.inserirNoFim(new Animal("Toby", "Cachorro"));
        disponiveis.inserirNoFim(new Animal("Mel", "Gato"));

        System.out.println("Disponiveis para adocao:");
        disponiveis.imprimirLista();

        System.out.println();
        System.out.println("Toby foi adotado: " + disponiveis.removerPorNome("Toby"));
        System.out.println("Bidu foi adotado: " + disponiveis.removerPorNome("Bidu"));

        System.out.println();
        System.out.println("Disponiveis para adocao:");
        disponiveis.imprimirLista();
    }
}
