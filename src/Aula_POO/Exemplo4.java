public class Exemplo4 {
    String msg;
    
    public Exemplo4(){
      msg = "";
  }
  
  
  public static void main(String[] args) {
    Exemplo4 e1 = new Exemplo4();
    Exemplo4 e2 = new Exemplo4();
    e1.msg = "Valor do msg";
    e2.msg = "Valor do msg";
    
    System.out.println("Comparando " );
    System.out.println(e1=e1);
  }
}
