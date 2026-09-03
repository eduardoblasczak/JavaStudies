package ListasEncadeadas;

public class Exercicio03BuscarGatinha {

    static class Gatinho {
        String nome;
        String corDoPelo;

        Gatinho(String nome, String corDoPelo) {
            this.nome = nome;
            this.corDoPelo = corDoPelo;
        }
    }

    static class No {
        Gatinho gatinho;
        No proximo;

        No(Gatinho gatinho) {
            this.gatinho = gatinho;
        }
    }

    static class ListaGatinhos {
        private No inicio;

        public void inserirNoFim(Gatinho g) {
            No novo = new No(g);
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

        public int buscarPorNome(String nome) {
            int indice = 0;
            No atual = inicio;
            while (atual != null) {
                if (atual.gatinho.nome.equalsIgnoreCase(nome)) {
                    return indice;
                }
                indice++;
                atual = atual.proximo;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        ListaGatinhos abrigo = new ListaGatinhos();
        abrigo.inserirNoFim(new Gatinho("Mel", "Caramelo"));
        abrigo.inserirNoFim(new Gatinho("Mimosa", "Branca"));
        abrigo.inserirNoFim(new Gatinho("Cafe", "Preto"));

        System.out.println("Mimosa esta na posicao: " + abrigo.buscarPorNome("Mimosa"));
        System.out.println("Fofinho esta na posicao: " + abrigo.buscarPorNome("Fofinho"));
    }
}
