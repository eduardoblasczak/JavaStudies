package Cafeteria;

public class Cardapio {

    public static final int TOTAL_BEBIDAS = 4;
    public static final int TOTAL_ADICIONAIS = 5;

    public static void imprimirBebidas() {
        System.out.println("Bebidas:");
        for (int i = 1; i <= TOTAL_BEBIDAS; i++) {
            Bebida b = criarBebida(i);
            System.out.printf("  %d - %-18s R$ %.2f%n", i, b.getDescricao(), b.getPreco());
        }
    }

    public static void imprimirAdicionais() {
        System.out.println("Adicionais:");
        Bebida base = new BebidaVazia();
        for (int i = 1; i <= TOTAL_ADICIONAIS; i++) {
            Adicional a = (Adicional) aplicarAdicional(i, base);
            System.out.printf("  %d - %-18s R$ %.2f%n", i, a.getNomeAdicional(), a.getPrecoAdicional());
        }
        System.out.println("  0 - finalizar bebida");
    }

    public static Bebida criarBebida(int opcao) {
        switch (opcao) {
            case 1:
                return new CafeExpresso();
            case 2:
                return new CafeComLeite();
            case 3:
                return new Cappuccino();
            case 4:
                return new ChocolateQuente();
            default:
                throw new IllegalArgumentException("Bebida inexistente: " + opcao);
        }
    }

    public static Bebida aplicarAdicional(int opcao, Bebida bebida) {
        switch (opcao) {
            case 1:
                return new LeiteExtra(bebida);
            case 2:
                return new DoseExpresso(bebida);
            case 3:
                return new ChocolateExtra(bebida);
            case 4:
                return new Chantilly(bebida);
            case 5:
                return new Canela(bebida);
            default:
                throw new IllegalArgumentException("Adicional inexistente: " + opcao);
        }
    }

    private static class BebidaVazia extends Bebida {

        @Override
        public String getDescricao() {
            return "";
        }

        @Override
        public double getPreco() {
            return 0.0;
        }
    }
}
