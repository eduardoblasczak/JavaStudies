package Cafeteria;

public class ChocolateExtra extends Adicional {

    public ChocolateExtra(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNomeAdicional() {
        return "chocolate";
    }

    @Override
    protected double getPrecoAdicional() {
        return 2.50;
    }
}
