package ListasEncadeadas;

public class Exercicio02FilaDoBanho {

    static class No {
        String nomePet;
        No proximo;

        No(String nomePet) {
            this.nomePet = nomePet;
        }
    }

    static class FilaBanho {
        private No inicio;
        private No fim;

        public void entrarNaFila(String nomePet) {
            No novo = new No(nomePet);
            if (fim == null) {
                inicio = novo;
                fim = novo;
            } else {
                fim.proximo = novo;
                fim = novo;
            }
        }

        public String atenderProximo() {
            if (inicio == null) {
                return null;
            }
            String nome = inicio.nomePet;
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
            return nome;
        }

        public void imprimirFila() {
            if (inicio == null) {
                System.out.println("Fila: vazia");
                return;
            }
            StringBuilder sb = new StringBuilder("Fila: ");
            No atual = inicio;
            while (atual != null) {
                sb.append(atual.nomePet);
                if (atual.proximo != null) {
                    sb.append(" -> ");
                }
                atual = atual.proximo;
            }
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        FilaBanho petshop = new FilaBanho();

        petshop.entrarNaFila("Bolinha");
        petshop.imprimirFila();

        petshop.entrarNaFila("Fuba");
        petshop.imprimirFila();

        petshop.entrarNaFila("Amora");
        petshop.imprimirFila();

        System.out.println("Banho em: " + petshop.atenderProximo());
        petshop.imprimirFila();

        System.out.println("Banho em: " + petshop.atenderProximo());
        petshop.imprimirFila();

        System.out.println("Banho em: " + petshop.atenderProximo());
        petshop.imprimirFila();

        System.out.println("Banho em: " + petshop.atenderProximo());
    }
}
