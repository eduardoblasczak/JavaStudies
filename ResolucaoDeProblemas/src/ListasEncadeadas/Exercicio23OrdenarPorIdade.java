package ListasEncadeadas;

public class Exercicio23OrdenarPorIdade {

    static class Animal {
        String nome;
        int idade;

        Animal(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return nome + " - " + idade + " anos";
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

    static class ListaOrdenada {
        private No inicio;
        private No fim;

        public void inserirOrdenadoPorIdade(Animal a) {
            No novo = new No(a);
            if (inicio == null) {
                inicio = novo;
                fim = novo;
                return;
            }
            No atual = inicio;
            while (atual != null && atual.animal.idade <= a.idade) {
                atual = atual.proximo;
            }
            if (atual == null) {
                novo.anterior = fim;
                fim.proximo = novo;
                fim = novo;
            } else if (atual.anterior == null) {
                novo.proximo = inicio;
                inicio.anterior = novo;
                inicio = novo;
            } else {
                novo.anterior = atual.anterior;
                novo.proximo = atual;
                atual.anterior.proximo = novo;
                atual.anterior = novo;
            }
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
        ListaOrdenada abrigo = new ListaOrdenada();
        abrigo.inserirOrdenadoPorIdade(new Animal("Bidu", 9));
        abrigo.inserirOrdenadoPorIdade(new Animal("Bolinha", 3));
        abrigo.inserirOrdenadoPorIdade(new Animal("Mel", 6));
        abrigo.inserirOrdenadoPorIdade(new Animal("Fuba", 1));
        abrigo.inserirOrdenadoPorIdade(new Animal("Amora", 6));

        System.out.println("Animais ordenados por idade:");
        abrigo.imprimirLista();
    }
}
