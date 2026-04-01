package Teste_Modificadores;

public class Carro {
    // Modificador public: Acessivel de qualquer lugar
    public String modelo;

    //Modificador private: Acessível apensa dentro da classe carro
    private int ano;

    //Modificador protected: Acessível dentro da classe, subclasses e pacotes
    protected String cor;

    //Modificador default: Acessível apenas dentro do pacote
    int numeroDePortas;

    //Construtor público
    public Carro(String modelo, int ano, String cor, int numeroDePortas){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numeroDePortas = numeroDePortas;
    }

    //Método público
    public void ligar(){
        System.out.println("O carro está ligado");
    }
    
    //Método privado: Só pode ser chamado dentro da própria classe
    private void acelerar(){
        System.out.println("O carro está acelerando...");
    }
    
    //Métodos getters e setters (para o atributo privado 'ano')
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    //Método protegido 
    protected void pintarCarrp(String novaCor){
        this.cor = novaCor;
        System.out.println("O carro foi pintado de " + novaCor);
    }

    //Método default 
    void mostrarNumeroDePortas() {
        System.out.println("O carro tem " + numeroDePortas + "portas.");
    }
}
