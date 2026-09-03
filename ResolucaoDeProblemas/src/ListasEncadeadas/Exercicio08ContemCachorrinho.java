package ListasEncadeadas;

public class Exercicio08ContemCachorrinho {

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

        public boolean contem(String nome) {
            No atual = inicio;
            while (atual != null) {
                if (atual.nome.equalsIgnoreCase(nome)) {
                    return true;
                }
                atual = atual.proximo;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        ListaAbrigo abrigo = new ListaAbrigo();
        abrigo.inserirNoFim("Bolinha");
        abrigo.inserirNoFim("Fuba");
        abrigo.inserirNoFim("Toby");

        System.out.println("Fuba esta no abrigo? " + abrigo.contem("Fuba"));
        System.out.println("Bidu esta no abrigo? " + abrigo.contem("Bidu"));
    }
}
