package Arrays_Vetores;

public class Teste_vetor {
    public static void main(String[] args) {
        int numerospares[] = new int[6]; //vetor não inicializado

        int numerosparesInicializado[] = {0,2,4,6,8,10}; //vetor inicializado

        System.out.println("Números pares não inicializado");
        System.out.println(numerospares[2]);
        System.out.println("Números pares inicializado");
        System.out.println(numerosparesInicializado[2]);
        //fazendo um for para mostrar todos os elementos
        System.out.println("Mostrando os elementos do vetor inicializado");
        for (int i=0; i < numerosparesInicializado.length; i++){
            System.out.println("elemento índice "+i+" "+numerosparesInicializado[i]);
        }
        System.out.println("Mostrando os elementos do vetor não inicializado");
        for (int i=0; i < numerospares.length; i++){
            System.out.println("elemento índice "+i+" "+numerospares[i]);
        }


    }
}
