package ListasEncadeadas;

public class Exercicio20TrocarPosicao {

    static class No {
        String nome;
        No anterior;
        No proximo;

        No(String nome) {
            this.nome = nome;
        }
    }

    static class ListaAtendimento {
        private No inicio;
        private No fim;

        public void inserirNoFim(String nome) {
            No novo = new No(nome);
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
                if (atual.nome.equalsIgnoreCase(nome)) {
                    return atual;
                }
                atual = atual.proximo;
            }
            return null;
        }

        public boolean trocarPosicao(String nome1, String nome2) {
            No a = buscarNo(nome1);
            No b = buscarNo(nome2);
            if (a == null || b == null || a == b) {
                return false;
            }
            if (a.proximo == b) {
                deslocarVizinhos(a, b);
            } else if (b.proximo == a) {
                deslocarVizinhos(b, a);
            } else {
                No anteriorA = a.anterior;
                No proximoA = a.proximo;
                No anteriorB = b.anterior;
                No proximoB = b.proximo;

                a.anterior = anteriorB;
                a.proximo = proximoB;
                b.anterior = anteriorA;
                b.proximo = proximoA;

                if (anteriorB != null) {
                    anteriorB.proximo = a;
                } else {
                    inicio = a;
                }
                if (proximoB != null) {
                    proximoB.anterior = a;
                } else {
                    fim = a;
                }
                if (anteriorA != null) {
                    anteriorA.proximo = b;
                } else {
                    inicio = b;
                }
                if (proximoA != null) {
                    proximoA.anterior = b;
                } else {
                    fim = b;
                }
            }
            return true;
        }

        private void deslocarVizinhos(No primeiro, No segundo) {
            No antes = primeiro.anterior;
            No depois = segundo.proximo;

            segundo.anterior = antes;
            segundo.proximo = primeiro;
            primeiro.anterior = segundo;
            primeiro.proximo = depois;

            if (antes != null) {
                antes.proximo = segundo;
            } else {
                inicio = segundo;
            }
            if (depois != null) {
                depois.anterior = primeiro;
            } else {
                fim = primeiro;
            }
        }

        public void imprimirLista() {
            StringBuilder sb = new StringBuilder();
            No atual = inicio;
            while (atual != null) {
                sb.append(atual.nome);
                if (atual.proximo != null) {
                    sb.append(" <-> ");
                }
                atual = atual.proximo;
            }
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        ListaAtendimento fila = new ListaAtendimento();
        fila.inserirNoFim("Bolinha");
        fila.inserirNoFim("Mel");
        fila.inserirNoFim("Fuba");
        fila.inserirNoFim("Amora");
        fila.inserirNoFim("Bidu");

        System.out.println("Ordem original:");
        fila.imprimirLista();

        fila.trocarPosicao("Mel", "Amora");
        System.out.println("Apos trocar Mel e Amora:");
        fila.imprimirLista();

        fila.trocarPosicao("Bolinha", "Amora");
        System.out.println("Apos trocar Bolinha e Amora (vizinhos):");
        fila.imprimirLista();
    }
}
