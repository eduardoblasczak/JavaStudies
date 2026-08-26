
public class FilaHerois {

    private static class NoHeroi {
        String nome;
        NoHeroi prox;
        NoHeroi(String nome) { this.nome = nome; }
    }

    private NoHeroi inicio, fim;


    public void enqueue(String nome) {
        NoHeroi novo = new NoHeroi(nome);
        if (fim != null) {
            fim.prox = novo;
        }
        fim = novo;
        if (inicio == null) {
            inicio = novo;
        }
    }


    public String dequeue() {
        if (inicio == null) {
            throw new RuntimeException("Nenhum herói esperando!");
        }
        String nome = inicio.nome;
        inicio = inicio.prox;
        if (inicio == null) {
            fim = null;
        }
        return nome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoHeroi atual = inicio;
        while (atual != null) {
            sb.append(atual.nome).append(" ");
            atual = atual.prox;
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        FilaHerois fila = new FilaHerois();
        fila.enqueue("Flash");
        fila.enqueue("Mulher-Maravilha");
        fila.enqueue("Aquaman");

        System.out.println("Superman chama: " + fila.dequeue());

        fila.enqueue("Lanterna Verde");
        System.out.println("Fila atual: " + fila);
    }
}
