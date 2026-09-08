package Cafeteria;

public class Chantilly extends Adicional {

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNomeAdicional() {
        return "chantilly";
    }

    @Override
    protected double getPrecoAdicional() {
        return 3.00;
    }
}
