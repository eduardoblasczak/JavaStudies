
public class ArenaVingadores {

    private static class NoVingador {
        String nome;
        NoVingador prox, ant;
        NoVingador(String nome) { this.nome = nome; }
    }

    private NoVingador inicio, fim;

    public void addFrente(String nome) {
        NoVingador novo = new NoVingador(nome);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.prox = inicio;
            inicio.ant = novo;
            inicio = novo;
        }
    }

    public void addFinal(String nome) {
        NoVingador novo = new NoVingador(nome);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.prox = novo;
            novo.ant = fim;
            fim = novo;
        }
    }
    public String removeFrente() {
        if (inicio == null) {
            throw new RuntimeException("Arena vazia!");
        }
        String nome = inicio.nome;
        inicio = inicio.prox;
        if (inicio != null) {
            inicio.ant = null;
        } else {
            fim = null;
        }
        return nome;
    }

    public String removeFinal() {
        if (fim == null) {
            throw new RuntimeException("Arena vazia!");
        }
        String nome = fim.nome;
        fim = fim.ant;
        if (fim != null) {
            fim.prox = null;
        } else {
            inicio = null;
        }
        return nome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoVingador atual = inicio;
        while (atual != null) {
            sb.append(atual.nome).append(" ");
            atual = atual.prox;
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        ArenaVingadores arena = new ArenaVingadores();
        arena.addFrente("Thor");
        arena.addFinal("Homem de Ferro");
        arena.addFrente("Viúva Negra");

        System.out.println("Arena: " + arena);
        System.out.println("Sai pela frente: " + arena.removeFrente());
        System.out.println("Sai pelo final: " + arena.removeFinal());
        System.out.println("Arena: " + arena);
    }
}
