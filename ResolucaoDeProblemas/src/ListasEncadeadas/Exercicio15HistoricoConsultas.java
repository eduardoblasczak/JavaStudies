package ListasEncadeadas;

public class Exercicio15HistoricoConsultas {

    static class Consulta {
        String animal;
        String data;
        String motivo;

        Consulta(String animal, String data, String motivo) {
            this.animal = animal;
            this.data = data;
            this.motivo = motivo;
        }

        @Override
        public String toString() {
            return data + " - " + animal + " - " + motivo;
        }
    }

    static class No {
        Consulta consulta;
        No anterior;
        No proximo;

        No(Consulta consulta) {
            this.consulta = consulta;
        }
    }

    static class Historico {
        private No inicio;
        private No fim;

        public void registrar(Consulta c) {
            No novo = new No(c);
            if (fim == null) {
                inicio = novo;
                fim = novo;
                return;
            }
            novo.anterior = fim;
            fim.proximo = novo;
            fim = novo;
        }

        public void imprimirDoInicioParaFim() {
            No atual = inicio;
            while (atual != null) {
                System.out.println("- " + atual.consulta);
                atual = atual.proximo;
            }
        }

        public void imprimirDoFimParaInicio() {
            No atual = fim;
            while (atual != null) {
                System.out.println("- " + atual.consulta);
                atual = atual.anterior;
            }
        }
    }

    public static void main(String[] args) {
        Historico historico = new Historico();
        historico.registrar(new Consulta("Bolinha", "10/01/2025", "Vacinacao"));
        historico.registrar(new Consulta("Mel", "22/02/2025", "Castracao"));
        historico.registrar(new Consulta("Fuba", "05/03/2025", "Consulta de rotina"));
        historico.registrar(new Consulta("Bidu", "18/04/2025", "Exame de sangue"));

        System.out.println("Historico em ordem cronologica:");
        historico.imprimirDoInicioParaFim();

        System.out.println();
        System.out.println("Historico do mais recente para o mais antigo:");
        historico.imprimirDoFimParaInicio();
    }
}
