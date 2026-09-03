package ListasEncadeadas;

public class Exercicio16AdocaoBidu {

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
        No anterior;
        No proximo;

        No(Animal animal) {
            this.animal = animal;
        }
    }

    static class ListaAdocao {
        private No inicio;
        private No fim;

        public void inserirNoFim(Animal a) {
            No novo = new No(a);
            if (fim == null) {
                inicio = novo;
                fim = novo;
                return;
            }
            novo.anterior = fim;
            fim.proximo = novo;
            fim = novo;
        }

        public boolean removerPorNome(String nome) {
            No atual = inicio;
            while (atual != null) {
                if (atual.animal.nome.equalsIgnoreCase(nome)) {
                    if (atual.anterior == null) {
                        inicio = atual.proximo;
                    } else {
                        atual.anterior.proximo = atual.proximo;
                    }
                    if (atual.proximo == null) {
                        fim = atual.anterior;
                    } else {
                        atual.proximo.anterior = atual.anterior;
                    }
                    atual.anterior = null;
                    atual.proximo = null;
                    return true;
                }
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

        public void imprimirDeTras() {
            No atual = fim;
            while (atual != null) {
                System.out.println("- " + atual.animal);
                atual = atual.anterior;
            }
        }
    }

    public static void main(String[] args) {
        ListaAdocao lista = new ListaAdocao();
        lista.inserirNoFim(new Animal("Bolinha", "Cachorro"));
        lista.inserirNoFim(new Animal("Bidu", "Cachorro"));
        lista.inserirNoFim(new Animal("Mel", "Gato"));

        System.out.println("Antes da adocao:");
        lista.imprimirLista();

        System.out.println();
        System.out.println("Bidu foi adotado: " + lista.removerPorNome("Bidu"));

        System.out.println();
        System.out.println("Depois da adocao (inicio ao fim):");
        lista.imprimirLista();

        System.out.println();
        System.out.println("Depois da adocao (fim ao inicio):");
        lista.imprimirDeTras();
    }
}
