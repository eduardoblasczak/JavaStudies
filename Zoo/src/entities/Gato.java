package entities;

import enums.Genero;

public class Gato extends Animais implements AnimaisDomesticos{

    private boolean temPelo;

    public Gato(String especie, Genero genero, boolean temPelo) {
        super(especie, genero);
        this.temPelo = temPelo;
    }

    public boolean isTemPelo() {
        return temPelo;
    }

    public void setTemPelo(boolean temPelo) {
        this.temPelo = temPelo;
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau miau miau");
    }

    @Override
    public void agradar() {
        System.out.println("Roçando");
    }
}
