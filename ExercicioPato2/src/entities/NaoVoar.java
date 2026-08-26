package entities;

public class NaoVoar implements ComportamentoVoo{
    @Override
    public void voar() {
        ComportamentoVoo.super.voar();
        System.out.println("Não está voando");
    }
}
