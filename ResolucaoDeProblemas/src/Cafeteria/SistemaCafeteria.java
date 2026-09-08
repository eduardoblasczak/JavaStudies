package Cafeteria;

import java.util.Scanner;

public class SistemaCafeteria {

    private final Scanner entrada;

    public SistemaCafeteria(Scanner entrada) {
        this.entrada = entrada;
    }

    public void executar() {
        System.out.println("Bem-vindo a Cafeteria!");
        System.out.print("Informe seu nome: ");
        String cliente = entrada.nextLine().trim();
        if (cliente.isEmpty()) {
            cliente = "Cliente";
        }

        Pedido pedido = new Pedido(cliente);
        boolean continuar = true;

        while (continuar) {
            System.out.println();
            Cardapio.imprimirBebidas();
            System.out.println("  0 - encerrar pedido");
            int opcaoBebida = lerOpcao("Escolha a bebida: ", 0, Cardapio.TOTAL_BEBIDAS);

            if (opcaoBebida == 0) {
                continuar = false;
                continue;
            }

            Bebida bebida = Cardapio.criarBebida(opcaoBebida);
            bebida = montarAdicionais(bebida);
            pedido.adicionarItem(bebida);

            System.out.println();
            System.out.println("Item adicionado: " + bebida.getDescricao());
            System.out.printf("Valor do item: R$ %.2f%n", bebida.getPreco());
            System.out.printf("Total parcial do pedido: R$ %.2f%n", pedido.getTotal());
        }

        System.out.println();
        pedido.imprimirComprovante();
    }

    private Bebida montarAdicionais(Bebida bebida) {
        while (true) {
            System.out.println();
            System.out.println("Bebida atual: " + bebida.getDescricao());
            System.out.printf("Valor atual: R$ %.2f%n", bebida.getPreco());
            Cardapio.imprimirAdicionais();

            int opcao = lerOpcao("Escolha o adicional: ", 0, Cardapio.TOTAL_ADICIONAIS);
            if (opcao == 0) {
                return bebida;
            }
            bebida = Cardapio.aplicarAdicional(opcao, bebida);
        }
    }

    private int lerOpcao(String rotulo, int minimo, int maximo) {
        while (true) {
            System.out.print(rotulo);
            if (!entrada.hasNextLine()) {
                return 0;
            }
            String linha = entrada.nextLine().trim();
            try {
                int valor = Integer.parseInt(linha);
                if (valor >= minimo && valor <= maximo) {
                    return valor;
                }
            } catch (NumberFormatException ignorado) {

            }
            System.out.println("Opcao invalida. Digite um numero entre " + minimo + " e " + maximo + ".");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new SistemaCafeteria(scanner).executar();
        scanner.close();
    }
}
