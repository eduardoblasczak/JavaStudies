package ListasEncadeadas;

public class Exercicio09AnimalMaisVelho {

    static class Animal {
        String nome;
        int idade;

        Animal(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return nome + " com " + idade + " anos";
        }
    }

    static class No {
        Animal animal;
        No proximo;

        No(Animal animal) {
            this.animal = animal;
        }
    }

    static class ListaAbrigo {
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

        public No buscarMaisVelho() {
            if (inicio == null) {
                return null;
            }
            No maisVelho = inicio;
            No atual = inicio.proximo;
            while (atual != null) {
                if (atual.animal.idade > maisVelho.animal.idade) {
                    maisVelho = atual;
                }
                atual = atual.proximo;
            }
            return maisVelho;
        }
    }

    public static void main(String[] args) {
        ListaAbrigo abrigo = new ListaAbrigo();

        No vazio = abrigo.buscarMaisVelho();
        System.out.println("Abrigo vazio: " + (vazio == null ? "nenhum animal cadastrado" : vazio.animal));

        abrigo.inserirNoFim(new Animal("Bolinha", 3));
        abrigo.inserirNoFim(new Animal("Bidu", 9));
        abrigo.inserirNoFim(new Animal("Mel", 6));

        No maisVelho = abrigo.buscarMaisVelho();
        System.out.println("Animal mais velho: " + maisVelho.animal);
    }
}
