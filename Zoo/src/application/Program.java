package application;

import entities.*;
import enums.Genero;

public class Program {
    static void main(String[] args) {
        Cachorro a1 = new Cachorro( "cachorro", Genero.MACHO, "Bob", "Bulldog Inglês");
        Cachorro a2 = new Cachorro( "Cadela", Genero.FEMEA, "Lola", "Chiuaua");
        Gato a3 = new Gato("Gato", Genero.FEMEA, true);
        Tigre a4 = new Tigre("Tigresa", Genero.FEMEA, 50);
        Rinoceronte a5 = new Rinoceronte("Rino", Genero.MACHO, true);
        Rinoceronte a6 = new Rinoceronte("Rino", Genero.MACHO, false);

        a1.fazerSom();
        a1.agradar();
        System.out.println(a1);
        a2.fazerSom();
        a2.agradar();
        System.out.println(a2);
        a3.fazerSom();
        a3.agradar();
        System.out.println(a3);
        a4.fazerSom();
        a4.atacar(a1);
        System.out.println(a4);
        a5.fazerSom();
        a5.atacar(a2);
        System.out.println(a5);
        a6.fazerSom();

        System.out.println("-----------------------PLANTAS-----------------------");




    }
}
