package Teste_Modificadores;

public class Motor {
    private boolean ligado;
    private int numeroCilindros;
    private int rpm;

    public Motor() {
        this.numeroCilindros = 0;
        this.ligado = false;
        this.rpm = 0;
    }

    public void setNumCilindros(int numCilindros){
        this.numeroCilindros = numCilindros;
        System.out.println("Novo número de cilindros: " + numeroCilindros);
    }
    public int getNumCilindros(){
        return numeroCilindros;
    }

    public void ligar(){
        if(ligado){
            System.out.println("O motor já está ligado");
        } else{
            ligado = true;
            rpm = 1000;
            System.out.println("Motor ligado");
        }

    }

    public void desligar(){
        if (!ligado){
            System.out.println("Motor já está desligado.");
        } else{
            ligado = false;
            rpm = 0;
            System.out.println("Motor desligado.");
        }

    }

    public void acelerar(int nivelAceleracao){
        if(!ligado){
            System.out.println("Você deve ligar o motor para poder acelerar!");
            return;
        }

        rpm = rpm + (nivelAceleracao * 1000);

        if(rpm >= 8000){
            rpm = 8000;
        }
        if (rpm <= 0){
            desligar();
            return;
        }
        System.out.println("RPM atual: " + rpm);
    }
    public int getRpm(){
        return rpm;
    }

    public boolean isLigado(){
        return ligado;
    }
}
