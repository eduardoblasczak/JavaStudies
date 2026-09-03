package ListasEncadeadas;

public class Exercicio05ContarAnimais {

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

        public int contarAnimais() {
            int total = 0;
            No atual = inicio;
            while (atual != null) {
                total++;
                atual = atual.proximo;
            }
            return total;
        }
    }

    public static void main(String[] args) {
        ListaAbrigo cantinhoPeludo = new ListaAbrigo();
        System.out.println("Animais no abrigo: " + cantinhoPeludo.contarAnimais());

        cantinhoPeludo.inserirNoFim("Bolinha");
        cantinhoPeludo.inserirNoFim("Amora");
        cantinhoPeludo.inserirNoFim("Mel");
        cantinhoPeludo.inserirNoFim("Fuba");
        cantinhoPeludo.inserirNoFim("Bidu");

        System.out.println("Animais no abrigo: " + cantinhoPeludo.contarAnimais());
    }
}
