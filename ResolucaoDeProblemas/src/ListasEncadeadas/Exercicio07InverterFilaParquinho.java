package ListasEncadeadas;

public class Exercicio07InverterFilaParquinho {

    static class No {
        String nomeGatinho;
        No proximo;

        No(String nomeGatinho) {
            this.nomeGatinho = nomeGatinho;
        }
    }

    static class FilaParquinho {
        private No inicio;

        public void inserirNoFim(String nomeGatinho) {
            No novo = new No(nomeGatinho);
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

        public void inverterLista() {
            No anterior = null;
            No atual = inicio;
            while (atual != null) {
                No proximo = atual.proximo;
                atual.proximo = anterior;
                anterior = atual;
                atual = proximo;
            }
            inicio = anterior;
        }

        public void imprimirLista() {
            StringBuilder sb = new StringBuilder();
            No atual = inicio;
            while (atual != null) {
                sb.append(atual.nomeGatinho);
                if (atual.proximo != null) {
                    sb.append(" -> ");
                }
                atual = atual.proximo;
            }
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        FilaParquinho fila = new FilaParquinho();
        fila.inserirNoFim("Mel");
        fila.inserirNoFim("Amora");
        fila.inserirNoFim("Cafe");
        fila.inserirNoFim("Fofinho");

        System.out.println("Ordem original:");
        fila.imprimirLista();

        fila.inverterLista();

        System.out.println("Ordem invertida:");
        fila.imprimirLista();
    }
}
