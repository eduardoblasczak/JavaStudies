import Teste_Modificadores.Motor;

public class TesteCarro {
    public static void main(String[] args) {
        Motor m = new Motor();

        // Estado inicial
        System.out.println("Número de cilindros: " + m.getNumCilindros());
        m.setNumCilindros(4);

        // Teste 1: tentar acelerar desligado
        m.acelerar(2);

        // Teste 2: ligar motor
        m.ligar();

        // Teste 3: acelerar
        m.acelerar(3); // esperado: 1000 + 3000 = 4000

        // Teste 4: acelerar mais
        m.acelerar(2); // esperado: 6000

        // Teste 5: ultrapassar limite
        m.acelerar(5); // esperado: travar em 8000

        // Teste 6: desacelerar
        m.acelerar(-3); // esperado: 5000

        // Teste 7: desacelerar até desligar
        m.acelerar(-6); // esperado: rpm <= 0 → desliga

        // Teste 8: tentar acelerar desligado de novo
        m.acelerar(1);
    }
}