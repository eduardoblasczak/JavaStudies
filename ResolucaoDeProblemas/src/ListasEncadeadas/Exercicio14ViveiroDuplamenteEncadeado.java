package ListasEncadeadas;

public class Exercicio14ViveiroDuplamenteEncadeado {

    static class Passarinho {
        String nome;
        String especie;

        Passarinho(String nome, String especie) {
            this.nome = nome;
            this.especie = especie;
        }

        @Override
        public String toString() {
            return nome + " (" + especie + ")";
        }
    }

    static class No {
        Passarinho passarinho;
        No anterior;
        No proximo;

        No(Passarinho passarinho) {
            this.passarinho = passarinho;
        }
    }

    static class ListaDuplamenteEncadeada {
        private No inicio;
        private No fim;

        public void inserirNoInicio(Passarinho p) {
            No novo = new No(p);
            if (inicio == null) {
                inicio = novo;
                fim = novo;
                return;
            }
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }

        public void inserirNoFim(Passarinho p) {
            No novo = new No(p);
            if (fim == null) {
                inicio = novo;
                fim = novo;
                return;
            }
            novo.anterior = fim;
            fim.proximo = novo;
            fim = novo;
        }

        public void imprimirLista() {
            No atual = inicio;
            while (atual != null) {
                System.out.println("- " + atual.passarinho);
                atual = atual.proximo;
            }
        }
    }

    public static void main(String[] args) {
        ListaDuplamenteEncadeada viveiro = new ListaDuplamenteEncadeada();
        viveiro.inserirNoFim(new Passarinho("Piu", "Canario"));
        viveiro.inserirNoFim(new Passarinho("Bem-te-vi", "Bem-te-vi"));
        viveiro.inserirNoInicio(new Passarinho("Aurora", "Calopsita"));

        System.out.println("Passarinhos do viveiro:");
        viveiro.imprimirLista();
    }
}
