package ListasEncadeadas;

public class Exercicio24ClonarLista {

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

    static class ListaAbrigo {
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

        public ListaAbrigo clonarLista() {
            ListaAbrigo copia = new ListaAbrigo();
            No atual = inicio;
            while (atual != null) {
                copia.inserirNoFim(new Animal(atual.animal.nome, atual.animal.idade));
                atual = atual.proximo;
            }
            return copia;
        }

        public boolean compartilhaNoCom(ListaAbrigo outra) {
            No a = inicio;
            while (a != null) {
                No b = outra.inicio;
                while (b != null) {
                    if (a == b) {
                        return true;
                    }
                    b = b.proximo;
                }
                a = a.proximo;
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

        public void renomearPrimeiro(String novoNome) {
            if (inicio != null) {
                inicio.animal.nome = novoNome;
            }
        }
    }

    public static void main(String[] args) {
        ListaAbrigo original = new ListaAbrigo();
        original.inserirNoFim(new Animal("Bolinha", 3));
        original.inserirNoFim(new Animal("Mel", 6));
        original.inserirNoFim(new Animal("Bidu", 9));

        ListaAbrigo backup = original.clonarLista();

        original.renomearPrimeiro("Bolinha Junior");

        System.out.println("Cadastro original:");
        original.imprimirLista();

        System.out.println();
        System.out.println("Backup:");
        backup.imprimirLista();

        System.out.println();
        System.out.println("Backup lido de tras para frente:");
        backup.imprimirDeTras();

        System.out.println();
        System.out.println("As listas compartilham nos? " + original.compartilhaNoCom(backup));
    }
}
