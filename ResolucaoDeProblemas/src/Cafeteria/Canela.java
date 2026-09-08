package Cafeteria;

public class Canela extends Adicional {

    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNomeAdicional() {
        return "canela";
    }

    @Override
    protected double getPrecoAdicional() {
        return 1.00;
    }
}
