import java.util.Scanner;

public class par_impar{
  static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n, result;
    System.out.print("Digite um número inteiro: ");
    n = sc.nextInt();
    System.out.println("Número digitado: " + n);

    result = (n%2);
    if (result == 0){
      System.out.println("Número par");
    } else {
      System.out.println("Número ímpar");
    }
  }
}