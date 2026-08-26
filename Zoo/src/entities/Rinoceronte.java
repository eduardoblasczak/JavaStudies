package entities;

import enums.Genero;

public class Rinoceronte extends Animais implements AnimaisSelvagens {
    private boolean temChifre;

    public void chfrar(){
        if (temChifre == true){
            System.out.println("Chifrando tudo");
        } else{
            System.out.println("Não chifro sem chifre");
        }
    };

    public Rinoceronte(String especie, Genero genero, boolean temChifre) {
        super(especie, genero);
        this.temChifre = temChifre;
    }

    public boolean isTemChifre() {
        return temChifre;
    }

    public void setTemChifre(boolean temChifre) {
        this.temChifre = temChifre;
    }

    @Override
    public void fazerSom() {
        System.out.println("OHHHOOUHHHOHHOHOOOHOHO");
    }

    @Override
    public void atacar(Animais animais) {
        System.out.println(this.getEspecie() + " BATEU EM " + animais.getEspecie());
    }
}
