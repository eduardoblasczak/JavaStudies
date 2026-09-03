package ListasEncadeadas;

public class Exercicio01CadastroCachorrinhos {

    static class Cachorrinho {
        String nome;
        String raca;
        int idade;

        Cachorrinho(String nome, String raca, int idade) {
            this.nome = nome;
            this.raca = raca;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return nome + " (" + raca + ", " + idade + " anos)";
        }
    }

    static class No {
        Cachorrinho cachorrinho;
        No proximo;

        No(Cachorrinho cachorrinho) {
            this.cachorrinho = cachorrinho;
        }
    }

    static class ListaEncadeada {
        private No inicio;

        public void inserirNoInicio(Cachorrinho c) {
            No novo = new No(c);
            novo.proximo = inicio;
            inicio = novo;
        }

        public void inserirNoFim(Cachorrinho c) {
            No novo = new No(c);
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

        public void imprimirLista() {
            if (inicio == null) {
                System.out.println("Nenhum cachorrinho cadastrado.");
                return;
            }
            No atual = inicio;
            while (atual != null) {
                System.out.println("- " + atual.cachorrinho);
                atual = atual.proximo;
            }
        }
    }

    public static void main(String[] args) {
        ListaEncadeada ong = new ListaEncadeada();
        ong.inserirNoFim(new Cachorrinho("Bolinha", "Vira-lata", 3));
        ong.inserirNoFim(new Cachorrinho("Toby", "Beagle", 5));
        ong.inserirNoInicio(new Cachorrinho("Amora", "Poodle", 2));
        ong.inserirNoFim(new Cachorrinho("Fuba", "Pinscher", 1));

        System.out.println("Cachorrinhos da ONG Patinha Feliz:");
        ong.imprimirLista();
    }
}
