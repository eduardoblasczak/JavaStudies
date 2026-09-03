package ListasEncadeadas;

public class Exercicio22DequeEscovacao {

    static class No {
        String nomeAnimal;
        No anterior;
        No proximo;

        No(String nomeAnimal) {
            this.nomeAnimal = nomeAnimal;
        }
    }

    static class DequeEscovacao {
        private No inicio;
        private No fim;
        private int tamanho;

        public void inserirInicio(String nomeAnimal) {
            No novo = new No(nomeAnimal);
            if (inicio == null) {
                inicio = novo;
                fim = novo;
            } else {
                novo.proximo = inicio;
                inicio.anterior = novo;
                inicio = novo;
            }
            tamanho++;
        }

        public void inserirFim(String nomeAnimal) {
            No novo = new No(nomeAnimal);
            if (fim == null) {
                inicio = novo;
                fim = novo;
            } else {
                novo.anterior = fim;
                fim.proximo = novo;
                fim = novo;
            }
            tamanho++;
        }

        public String removerInicio() {
            if (inicio == null) {
                return null;
            }
            String nome = inicio.nomeAnimal;
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            } else {
                inicio.anterior = null;
            }
            tamanho--;
            return nome;
        }

        public String removerFim() {
            if (fim == null) {
                return null;
            }
            String nome = fim.nomeAnimal;
            fim = fim.anterior;
            if (fim == null) {
                inicio = null;
            } else {
                fim.proximo = null;
            }
            tamanho--;
            return nome;
        }

        public int tamanho() {
            return tamanho;
        }

        public void imprimirFila() {
            StringBuilder sb = new StringBuilder("Fila de escovacao: ");
            No atual = inicio;
            while (atual != null) {
                sb.append(atual.nomeAnimal);
                if (atual.proximo != null) {
                    sb.append(" <-> ");
                }
                atual = atual.proximo;
            }
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        DequeEscovacao deque = new DequeEscovacao();
        deque.inserirFim("Bolinha");
        deque.inserirFim("Mel");
        deque.inserirInicio("Fuba");
        deque.inserirInicio("Amora");
        deque.imprimirFila();

        System.out.println("Escovando o primeiro: " + deque.removerInicio());
        System.out.println("Escovando o ultimo: " + deque.removerFim());
        deque.imprimirFila();

        System.out.println("Animais restantes: " + deque.tamanho());
    }
}
