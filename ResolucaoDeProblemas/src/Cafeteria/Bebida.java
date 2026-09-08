package Cafeteria;

public abstract class Bebida {

    public abstract String getDescricao();

    public abstract double getPreco();

    @Override
    public String toString() {
        return String.format("%s - R$ %.2f", getDescricao(), getPreco());
    }
}
