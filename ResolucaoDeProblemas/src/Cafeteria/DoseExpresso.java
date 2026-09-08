package Cafeteria;

public class DoseExpresso extends Adicional {

    public DoseExpresso(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNomeAdicional() {
        return "dose de expresso";
    }

    @Override
    protected double getPrecoAdicional() {
        return 3.50;
    }
}
