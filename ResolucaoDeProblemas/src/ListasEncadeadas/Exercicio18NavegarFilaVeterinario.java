package ListasEncadeadas;

public class Exercicio18NavegarFilaVeterinario {

    static class No {
        String nomeAnimal;
        No anterior;
        No proximo;

        No(String nomeAnimal) {
            this.nomeAnimal = nomeAnimal;
        }
    }

    static class FilaVeterinario {
        private No inicio;
        private No fim;
        private No atual;

        public void inserirNoFim(String nomeAnimal) {
            No novo = new No(nomeAnimal);
            if (fim == null) {
                inicio = novo;
                fim = novo;
                atual = novo;
                return;
            }
            novo.anterior = fim;
            fim.proximo = novo;
            fim = novo;
        }

        public String atendimentoAtual() {
            return atual == null ? null : atual.nomeAnimal;
        }

        public String proximoAtendimento() {
            if (atual == null || atual.proximo == null) {
                return null;
            }
            atual = atual.proximo;
            return atual.nomeAnimal;
        }

        public String atendimentoAnterior() {
            if (atual == null || atual.anterior == null) {
                return null;
            }
            atual = atual.anterior;
            return atual.nomeAnimal;
        }
    }

    public static void main(String[] args) {
        FilaVeterinario fila = new FilaVeterinario();
        fila.inserirNoFim("Bolinha");
        fila.inserirNoFim("Mel");
        fila.inserirNoFim("Fuba");
        fila.inserirNoFim("Bidu");

        System.out.println("Atendendo: " + fila.atendimentoAtual());
        System.out.println("Proximo: " + fila.proximoAtendimento());
        System.out.println("Proximo: " + fila.proximoAtendimento());
        System.out.println("Anterior: " + fila.atendimentoAnterior());
        System.out.println("Proximo: " + fila.proximoAtendimento());
        System.out.println("Proximo: " + fila.proximoAtendimento());
        System.out.println("Proximo: " + fila.proximoAtendimento());
        System.out.println("Atendendo: " + fila.atendimentoAtual());
    }
}
