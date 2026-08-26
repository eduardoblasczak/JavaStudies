package entities;

import enums.Genero;

public class Cachorro extends Animais implements AnimaisDomesticos{
    private String raça;
    private String nome;

    public Cachorro(String especie, Genero genero, String nome, String raça) {
        super(especie, genero);
        this.nome = nome;
        this.raça = raça;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void agradar() {
        if (getGenero() == Genero.MACHO) {
            System.out.println("Trepando na perna");
        }
        else {
            System.out.println("Dando patinha");
        }
    }

    @Override
    public void fazerSom() {
        System.out.println("au au");
    }
}
