public class SistemaEstoque {
    public static void main(String[] args) {
        // Inicializa o estoque
        Estoque controleDeEstoque = new Estoque();

        System.out.println(">>> 1. Cadastrando 10 produtos...");
        controleDeEstoque.adicionarProduto(new Produto("Notebook", 4500.00));
        controleDeEstoque.adicionarProduto(new Produto("Mouse", 120.00));
        controleDeEstoque.adicionarProduto(new Produto("Teclado", 250.00));
        controleDeEstoque.adicionarProduto(new Produto("Monitor", 1200.00));

        // Produto "Celular" com preço inicial de 3000,00 (não é o último)
        controleDeEstoque.adicionarProduto(new Produto("Celular", 3000.00));

        controleDeEstoque.adicionarProduto(new Produto("Fone de Ouvido", 300.00));
        controleDeEstoque.adicionarProduto(new Produto("Cadeira Gamer", 1800.00));
        controleDeEstoque.adicionarProduto(new Produto("Mesa", 900.00));
        controleDeEstoque.adicionarProduto(new Produto("Webcam", 450.00));
        controleDeEstoque.adicionarProduto(new Produto("Microfone", 600.00));

        System.out.println("\n>>> 2. Listando todos os produtos iniciais:");
        controleDeEstoque.listarProdutosEmEstoque();

        System.out.println("\n>>> 3. Alterando o preço do 'Celular' para 5000,00...");
        controleDeEstoque.alterarPreco("Celular", 5000.00);

        System.out.println("\n>>> 4. Listando novamente para confirmar a alteração:");
        controleDeEstoque.listarProdutosEmEstoque();

        System.out.println("\n>>> 5. Tentando alterar o preço de um produto inexistente ('Tablet'):");
        controleDeEstoque.alterarPreco("Tablet", 2000.00);
    }
}