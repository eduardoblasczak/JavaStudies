package ListasEncadeadas;

public class Exercicio17InserirAoLado {

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

    static class ListaAnimais {
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

        private No buscarNo(String nome) {
            No atual = inicio;
            while (atual != null) {
                if (atual.animal.nome.equalsIgnoreCase(nome)) {
                    return atual;
                }
                atual = atual.proximo;
            }
            return null;
        }

        public boolean inserirDepoisDe(String nomeReferencia, Animal novoAnimal) {
            No referencia = buscarNo(nomeReferencia);
            if (referencia == null) {
                return false;
            }
            No novo = new No(novoAnimal);
            novo.anterior = referencia;
            novo.proximo = referencia.proximo;
            if (referencia.proximo == null) {
                fim = novo;
            } else {
                referencia.proximo.anterior = novo;
            }
            referencia.proximo = novo;
            return true;
        }

        public boolean inserirAntesDe(String nomeReferencia, Animal novoAnimal) {
            No referencia = buscarNo(nomeReferencia);
            if (referencia == null) {
                return false;
            }
            No novo = new No(novoAnimal);
            novo.proximo = referencia;
            novo.anterior = referencia.anterior;
            if (referencia.anterior == null) {
                inicio = novo;
            } else {
                referencia.anterior.proximo = novo;
            }
            referencia.anterior = novo;
            return true;
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
        ListaAnimais abrigo = new ListaAnimais();
        abrigo.inserirNoFim(new Animal("Bolinha", "Cachorro"));
        abrigo.inserirNoFim(new Animal("Mel", "Gato"));

        abrigo.inserirDepoisDe("Bolinha", new Animal("Fofinho", "Gato"));
        abrigo.inserirAntesDe("Bolinha", new Animal("Amora", "Cachorro"));

        System.out.println("Abrigo apos as insercoes:");
        abrigo.imprimirLista();

        System.out.println();
        System.out.println("Inserir ao lado de um animal inexistente: "
                + abrigo.inserirDepoisDe("Rex", new Animal("Toby", "Cachorro")));
    }
}
