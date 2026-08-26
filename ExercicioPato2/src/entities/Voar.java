package entities;

public class Voar implements ComportamentoVoo {
    @Override
    public void voar() {
        ComportamentoVoo.super.voar();
        System.out.println("Voando");
    }
}
