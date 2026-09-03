package ListasEncadeadas;

public class Exercicio25ComparacaoListas {

    static class NoSimples {
        String nome;
        NoSimples proximo;

        NoSimples(String nome) {
            this.nome = nome;
        }
    }

    static class ListaSimples {
        private NoSimples inicio;
        private NoSimples fim;

        public void inserirNoFim(String nome) {
            NoSimples novo = new NoSimples(nome);
            if (fim == null) {
                inicio = novo;
                fim = novo;
                return;
            }
            fim.proximo = novo;
            fim = novo;
        }

        public int buscarPorNome(String nome) {
            int indice = 0;
            int passos = 0;
            NoSimples atual = inicio;
            while (atual != null) {
                passos++;
                if (atual.nome.equalsIgnoreCase(nome)) {
                    System.out.println("  lista simples: " + passos + " comparacoes");
                    return indice;
                }
                indice++;
                atual = atual.proximo;
            }
            System.out.println("  lista simples: " + passos + " comparacoes");
            return -1;
        }
    }

    static class NoDuplo {
        String nome;
        NoDuplo anterior;
        NoDuplo proximo;

        NoDuplo(String nome) {
            this.nome = nome;
        }
    }

    static class ListaDupla {
        private NoDuplo inicio;
        private NoDuplo fim;

        public void inserirNoFim(String nome) {
            NoDuplo novo = new NoDuplo(nome);
            if (fim == null) {
                inicio = novo;
                fim = novo;
                return;
            }
            novo.anterior = fim;
            fim.proximo = novo;
            fim = novo;
        }

        public int buscarPorNome(String nome) {
            int indice = 0;
            int passos = 0;
            NoDuplo atual = inicio;
            while (atual != null) {
                passos++;
                if (atual.nome.equalsIgnoreCase(nome)) {
                    System.out.println("  lista dupla: " + passos + " comparacoes");
                    return indice;
                }
                indice++;
                atual = atual.proximo;
            }
            System.out.println("  lista dupla: " + passos + " comparacoes");
            return -1;
        }

        public int buscarPorNomeDeTras(String nome) {
            int indice = tamanho() - 1;
            int passos = 0;
            NoDuplo atual = fim;
            while (atual != null) {
                passos++;
                if (atual.nome.equalsIgnoreCase(nome)) {
                    System.out.println("  lista dupla (reversa): " + passos + " comparacoes");
                    return indice;
                }
                indice--;
                atual = atual.anterior;
            }
            System.out.println("  lista dupla (reversa): " + passos + " comparacoes");
            return -1;
        }

        private int tamanho() {
            int total = 0;
            NoDuplo atual = inicio;
            while (atual != null) {
                total++;
                atual = atual.proximo;
            }
            return total;
        }
    }

    private static void imprimirRelatorio() {
        System.out.println("RELATORIO COMPARATIVO");
        System.out.println();
        System.out.println("Implementacao:");
        System.out.println("  A lista simples guarda apenas a referencia proximo, entao a insercao e a");
        System.out.println("  remocao precisam sempre do no anterior, obtido percorrendo a lista.");
        System.out.println("  A lista duplamente encadeada guarda anterior e proximo, o que permite");
        System.out.println("  reconectar vizinhos direto a partir do no encontrado.");
        System.out.println();
        System.out.println("Memoria por no:");
        System.out.println("  O no simples usa uma referencia (4 ou 8 bytes conforme a JVM).");
        System.out.println("  O no duplo usa duas referencias, ou seja, cerca do dobro de espaco de");
        System.out.println("  ponteiros por animal cadastrado.");
        System.out.println();
        System.out.println("Busca:");
        System.out.println("  Nas duas estruturas a busca por nome e O(n), pois nao ha indice.");
        System.out.println("  A lista dupla permite comecar pelo fim, o que ajuda quando o animal");
        System.out.println("  procurado foi cadastrado recentemente.");
        System.out.println();
        System.out.println("Quando usar no abrigo:");
        System.out.println("  Lista simples para cadastros que so crescem e sao lidos do inicio ao fim,");
        System.out.println("  como a fila do banho, gastando menos memoria.");
        System.out.println("  Lista dupla quando o cuidador precisa navegar nos dois sentidos ou remover");
        System.out.println("  animais com frequencia, como no historico do veterinario e no deque de");
        System.out.println("  escovacao.");
    }

    public static void main(String[] args) {
        String[] animais = {"Bolinha", "Amora", "Mel", "Toby", "Fuba", "Fofinho", "Cafe", "Bidu"};

        ListaSimples simples = new ListaSimples();
        ListaDupla dupla = new ListaDupla();
        for (String nome : animais) {
            simples.inserirNoFim(nome);
            dupla.inserirNoFim(nome);
        }

        System.out.println("Buscando Fofinho:");
        System.out.println("  posicao na lista simples: " + simples.buscarPorNome("Fofinho"));
        System.out.println("  posicao na lista dupla: " + dupla.buscarPorNome("Fofinho"));
        System.out.println("  posicao na lista dupla partindo do fim: " + dupla.buscarPorNomeDeTras("Fofinho"));

        System.out.println();
        System.out.println("Buscando Rex:");
        System.out.println("  posicao na lista simples: " + simples.buscarPorNome("Rex"));
        System.out.println("  posicao na lista dupla: " + dupla.buscarPorNome("Rex"));

        System.out.println();
        imprimirRelatorio();
    }
}
