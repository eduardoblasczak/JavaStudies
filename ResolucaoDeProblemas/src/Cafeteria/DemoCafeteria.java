package Cafeteria;

public class DemoCafeteria {

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Eduardo");

        Bebida expressoComChocolate = new ChocolateExtra(new CafeExpresso());
        mostrarMontagem("Cafe expresso com chocolate quente", expressoComChocolate);
        pedido.adicionarItem(expressoComChocolate);

        Bebida leiteDuplo = new LeiteExtra(new CafeComLeite());
        mostrarMontagem("Cafe com leite com dupla quantidade de leite", leiteDuplo);
        pedido.adicionarItem(leiteDuplo);

        Bebida cappuccinoReforcado = new DoseExpresso(new LeiteExtra(new Cappuccino()));
        mostrarMontagem("Cappuccino com leite extra e uma dose de expresso", cappuccinoReforcado);
        pedido.adicionarItem(cappuccinoReforcado);

        Bebida chocolateCompleto = new Canela(new Chantilly(new ChocolateQuente()));
        mostrarMontagem("Chocolate quente com chantilly e canela", chocolateCompleto);
        pedido.adicionarItem(chocolateCompleto);

        Bebida expressoPuro = new CafeExpresso();
        mostrarMontagem("Cafe expresso sem adicionais", expressoPuro);
        pedido.adicionarItem(expressoPuro);

        System.out.println();
        pedido.imprimirComprovante();
    }

    private static void mostrarMontagem(String titulo, Bebida bebida) {
        System.out.println(titulo);
        System.out.println("  " + bebida.getDescricao());
        System.out.printf("  Valor: R$ %.2f%n", bebida.getPreco());
        System.out.println();
    }
}
