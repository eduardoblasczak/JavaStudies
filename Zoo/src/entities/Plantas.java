package entities;

import enums.Tamanho;

public abstract class Plantas {
    private String especie;
    private String cor;
    private Tamanho tamanho;

    public Plantas(String especie, String cor, Tamanho tamanho) {
        this.especie = especie;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public abstract void fotossintese();
    public abstract void crescer();
}
