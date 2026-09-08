package Cafeteria;

public class LeiteExtra extends Adicional {

    public LeiteExtra(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNomeAdicional() {
        return "leite extra";
    }

    @Override
    protected double getPrecoAdicional() {
        return 2.00;
    }
}
