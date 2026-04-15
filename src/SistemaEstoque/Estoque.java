/*import java.util.ArrayList;
import SistemaEstoque.Produto;

public class Estoque {
    private ArrayList<SistemaEstoque.Produto> listaDeProdutos;

    public Estoque() {
        this.listaDeProdutos = new ArrayList<>();
    }

    // Método para adicionar o produto ao estoque
    public void adicionarProduto(Produto produto) {
        listaDeProdutos.add(produto);
    }

    // Método para alterar o preço de um produto localizado pelo nome
    public void alterarPreco(String nomeDoProduto, double novoPreco) {
        boolean encontrado = false;

        for (Produto produto : listaDeProdutos) {
            if (produto.getNome().equalsIgnoreCase(nomeDoProduto)) {
                produto.setPreco(novoPreco);
                encontrado = true;
                break; // Sai do laço assim que encontrar
            }
        }

        // Regra de teste: mostrar mensagem se não existir
        if (!encontrado) {
            System.out.println("Produto não encontrado");
        }
    }

    // Método exato conforme requisito: listarProdutosEmEstoque
    public void listarProdutosEmEstoque() {
        System.out.println("--- Produtos no Estoque ---");
        // Laço de repetição para mostrar os produtos
        for (Produto produto : listaDeProdutos) {
            System.out.printf("Nome: %s | Preço: R$ %.2f\n", produto.getNome(), produto.getPreco());
        }
        System.out.println("---------------------------");
    }
}
*/