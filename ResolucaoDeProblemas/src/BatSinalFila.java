
    public void enqueue(int valor) {
        if (tamanho == dados.length) {
            throw new RuntimeException("Bat-Sinal cheio! Batman precisa atender um chamado antigo.");
        }
        dados[fim] = valor;
        fim = (fim + 1) % dados.length;
        tamanho++;
    }


    public int dequeue() {
        if (tamanho == 0) {
            throw new RuntimeException("Nenhum Bat-Sinal ativo!");
        }
        int valor = dados[inicio];
        inicio = (inicio + 1) % dados.length;
        tamanho--;
        return valor;
    }

    public void mostrarPedidos() {
        System.out.print("Chamados ativos: ");
        for (int i = 0, idx = inicio; i < tamanho; i++, idx = (idx + 1) % dados.length) {
            System.out.print(dados[idx] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BatSinalFila fila = new BatSinalFila(3);
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        try {
            fila.enqueue(4); // fila cheia, deve estourar
        } catch (RuntimeException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        System.out.println("Batman atende sinal: " + fila.dequeue());
        fila.enqueue(4); // agora cabe, espaço foi reaproveitado
        fila.mostrarPedidos();
    }

