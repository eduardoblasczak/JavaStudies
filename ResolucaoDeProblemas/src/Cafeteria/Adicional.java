package Cafeteria;

public abstract class Adicional extends Bebida {

    protected final Bebida bebida;

    protected Adicional(Bebida bebida) {
        this.bebida = bebida;
    }

    protected abstract String getNomeAdicional();

    protected abstract double getPrecoAdicional();

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + " + getNomeAdicional();
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + getPrecoAdicional();
    }
}
