package entities;

import enums.Genero;

public class Tigre extends Animais implements AnimaisSelvagens {
    private int numeroListras;

    public Tigre(String especie, Genero genero, int numeroListras) {
        super(especie, genero);
        this.numeroListras = numeroListras;
    }

    public int getNumeroListras() {
        return numeroListras;
    }

    public void setNumeroListras(int numeroListras) {
        this.numeroListras = numeroListras;
    }

    @Override
    public void fazerSom() {
        System.out.println("RRUAARARUARUAUURAARARRR");
    }

    @Override
    public void atacar(Animais animais) {
        System.out.println(this.getEspecie() + " Atacou " + animais.getEspecie());
    }
}
