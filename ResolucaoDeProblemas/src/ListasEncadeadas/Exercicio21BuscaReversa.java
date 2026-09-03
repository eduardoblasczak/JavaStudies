package ListasEncadeadas;

public class Exercicio21BuscaReversa {

    static class Animal {
        String nome;
        String raca;
        boolean vacinado;

        Animal(String nome, String raca, boolean vacinado) {
            this.nome = nome;
            this.raca = raca;
            this.vacinado = vacinado;
        }

        boolean possui(String caracteristica) {
            if (raca.equalsIgnoreCase(caracteristica)) {
                return true;
            }
            return caracteristica.equalsIgnoreCase("vacinado") && vacinado;
        }

        @Override
        public String toString() {
            return nome + " (" + raca + ", " + (vacinado ? "vacinado" : "nao vacinado") + ")";
        }
    }

    static class No {
        Animal animal;
        No anterior;
        No proximo;

        No(Animal animal) {
            this.animal = animal;
        }
    }

    static class ListaAbrigo {
        private No inicio;
        private No fim;

        public void inserirNoFim(Animal a) {
            No novo = new No(a);
            if (fim == null) {
                inicio = novo;
                fim = novo;
                return;
            }
            novo.anterior = fim;
            fim.proximo = novo;
            fim = novo;
        }

        public No buscarUltimoComCaracteristica(String caracteristica) {
            No atual = fim;
            while (atual != null) {
                if (atual.animal.possui(caracteristica)) {
                    return atual;
                }
                atual = atual.anterior;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        ListaAbrigo abrigo = new ListaAbrigo();
        abrigo.inserirNoFim(new Animal("Bolinha", "Vira-lata", true));
        abrigo.inserirNoFim(new Animal("Toby", "Beagle", false));
        abrigo.inserirNoFim(new Animal("Amora", "Poodle", true));
        abrigo.inserirNoFim(new Animal("Bidu", "Vira-lata", false));

        No vacinado = abrigo.buscarUltimoComCaracteristica("vacinado");
        System.out.println("Ultimo vacinado cadastrado: " + (vacinado == null ? "nenhum" : vacinado.animal));

        No viraLata = abrigo.buscarUltimoComCaracteristica("Vira-lata");
        System.out.println("Ultimo vira-lata cadastrado: " + (viraLata == null ? "nenhum" : viraLata.animal));

        No pastor = abrigo.buscarUltimoComCaracteristica("Pastor Alemao");
        System.out.println("Ultimo pastor alemao cadastrado: " + (pastor == null ? "nenhum" : pastor.animal));
    }
}
