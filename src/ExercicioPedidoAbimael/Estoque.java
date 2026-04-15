import java.util.ArrayList;

public class Estoque {
    ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(String nome, double preco){
        Produto p = new Produto();
        p.setNome(nome);
        p.setPreco(preco);
        produtos.addLast(p);
    }

    public void alterarPrecoProduto(String nome, double novoPreco){
        Produto p = localizarProdutoPorNome(nome);
        if (p!= null) {
            p.setPreco(novoPreco);
        } else {
            // Esta é a solução mais simples mas coloca uma responsabilidade na classe estoque
            // quando virmos exceções, vamos perceber que podemos disparar uma exceção aqui
            System.out.println("Produto não encontrado: "+nome);
        }
    }

    private Produto localizarProdutoPorNome(String nomeProduto){
        boolean encontrou = false;
        Produto p = null;
        int i=0;
        while ((!(encontrou)) & (i<produtos.size())) {
            p = produtos.get(i);
            if (p.getNome() == nomeProduto) {
                encontrou = true;
            } else{
                i++;
            }
        }
        if (encontrou) {
            return p;
        } else {
            return null;
        }
    }

    public void listarProdutosEmEstoque(){
        for( Produto p : produtos){
            String s = "Produto ";
            s+= "nome: ";
            s+= p.getNome();
            s+= " preço R$ ";
            s+= p.getPreco();
            System.out.println(s);
        }
    }


}
