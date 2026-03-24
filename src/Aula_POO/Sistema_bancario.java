package Aula_POO;
//conta bancaria tem o saldo, cliente pode sacar e depositar
public class Sistema_bancario {
    private double saldo;

    public Sistema_bancario(){
        saldo = 0.0;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void exibir(){
        System.out.println("O saldo é: " + saldo);
    }

    static void main(String[] args) {
        Sistema_bancario s1 = new Sistema_bancario();
        Sistema_bancario s2 = new Sistema_bancario();
        s1.exibir();
        s2.exibir();
        s1.sacar(300);
        s1.depositar(200);
        s1.exibir();
        s2.sacar(10);
        s2.depositar(300);
        s2.exibir();
    }
}
