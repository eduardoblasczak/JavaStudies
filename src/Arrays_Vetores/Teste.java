package Arrays_Vetores;

import java.util.ArrayList;

public class Teste {
    static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("Teste 1");
        arr1.add("Mais uma string");
        arr1.add("Este é o texto da posição 2");
        arr1.add("Este é o texto da posição 3 ");
        arr1.add("Este é o texto da posição 4 ");


        System.out.println("Comprimento do arr1 " + arr1.size());
        System.out.println("Item da posição 2: "+arr1.get(2));
        System.out.println("Item da posição 2: "+arr1.get(2));
        System.out.println("+------------------------------+");
        System.out.println("Item da posição 1 (antes da alteração): "+arr1.get(1));
        arr1.set(1, "Este é o novo texto da posição 1");
        System.out.println("Item da posição 1 (após a alteração)"+arr1.get(1));
        arr1.set(3, "Novo texto na posição 5");
    }
}
