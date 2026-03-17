package primeiroprograma01;

import java.util.Locale;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.13231321312;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.8f%n", x);//define n° de casas após a virgula
        Locale.setDefault(Locale.US); //define o local
        System.out.printf("%.8f%n", x);
        //CONCATENAÇÃO
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        //Concatenar vários elementos em um mesmo comando de escrita:
        String nome = "Lara";
        int idade = 17;
        double renda = 50000.00;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }
}
