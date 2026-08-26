package entities;

import enums.Genero;

public abstract class Animais {
    private String especie;
    private Genero genero;


    public Animais(String especie, Genero genero) {
        this.especie = especie;
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public abstract void fazerSom();

    @Override
    public String toString(){
        return "Animal da espécie: " + getEspecie() + " e é " + getGenero();
    }
}
