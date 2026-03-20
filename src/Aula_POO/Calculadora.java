import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //definir . como separador de ponto flutuante (questão de costume)
        Scanner sc = new Scanner(System.in);

        Double x1, x2;

        System.out.println("Digite o primeiro número: ");
        x1 = sc.nextDouble();
        System.out.println("Você digitou: " + x1);

        System.out.println("\nDigite o segundo número: ");
        x2 = sc.nextDouble();
        System.out.println("Você digitou: " + x2);

        int opcao;
        System.out.println("Digite o número da operação desejada: \n1: Soma;\n2: Subtração;");
        opcao = sc.nextInt();

        Double result;
        if (opcao == 1) {
            result = (x1 + x2);
            System.out.println("\nResultado: " + result);
        } else if (opcao == 2) {
            result = (x1 - x2);
            System.out.println("Resultado: " + result);
        }else {
            System.out.println("Opção inexistente");
        }
        sc.close();
    }
}