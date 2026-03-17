public class Exemplo3 {
    String msg;
    
    public Exemplo3(String m){
      msg = m;
  }
  
  public void mostrarMensagem(){
    System.out.println(msg);
  }
  
  public static void main(String[] args) {
    Exemplo3 ex3 = new Exemplo3("Este é o texto da mensagem");
    ex3.mostrarMensagem();
    Exemplo3 ex31 = new Exemplo3("Outra mensagem");
    ex31.mostrarMensagem();
    
    //Exemplo3 ex31 = new Exemplo3();
    //ex31.mostrarMensagem();
  }
}
