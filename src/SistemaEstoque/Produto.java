package SistemaEstoque;

public class Produto {
    private String nome;
    private double preco;

    // Construtor para definir nome e preço na criação
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos para acessar e alterar os dados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
