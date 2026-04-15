import org.w3c.dom.ls.LSOutput;

public class SistemaEstoque {


    public static void main(String[] args){
        Estoque e = new Estoque();
        e.adicionarProduto("Computador", 5010.00);
        e.adicionarProduto("Televisão LG", 2800.00);
        e.adicionarProduto("Sofá Cama", 2449.90);
        e.adicionarProduto("Celular", 3000.00);
        e.adicionarProduto("Mouse Gamer ", 249.99);
        e.adicionarProduto("Teclado ", 520.10);
        e.adicionarProduto("Colchão de casal ",1220.00);
        e.adicionarProduto("Guarda roupa ",2920.00);
        e.adicionarProduto("Monitor  ",1120.00);
        e.adicionarProduto("Notebook gamer ",8100.00);
        System.out.println("+--------------------------+");
        System.out.println("Lista de produtos");
        e.listarProdutosEmEstoque();
        System.out.println("+--------------------------+");
        String nome_do_produto = "Celular";
        System.out.println("Alteração de preço do produto "+ nome_do_produto);
        e.alterarPrecoProduto(nome_do_produto, 5000.00);
        System.out.println("+--------------------------+");
        System.out.println("Lista de produtos");
        e.listarProdutosEmEstoque();
        System.out.println("+--------------------------+");
        nome_do_produto = "martelo";
        System.out.println("Alteração de preço do produto "+ nome_do_produto);
        e.alterarPrecoProduto(nome_do_produto, 121.99);
        System.out.println("+--------------------------+");
    }
}
