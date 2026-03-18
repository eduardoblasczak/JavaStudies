public class Exemplo6 {
  String msg;
  
  public Exemplo6(){
    msg = ""; 
  }
  
  public void mostrarMsg(){
    System.out.println(msg);
  }
  
  public static void main(String[] args){
    System.out.println("Teste de argumentos no windows");
    System.out.println("Argumento 1: " + args[0]); //um vetor em Java inicia com índice 0
    System.out.println("Comprimento de vetor args "+args.length);
    
    String s = args[0];
    System.out.println("Valor de s: " +s);
    
    for (int i = 0; i < args.length;i++){
      System.out.println("Argumento " + i + ": " + args[i]);
      }
      
    Exemplo6 ex = new Exemplo6();
    Exemplo6 ex1 = new Exemplo6();
    ex.msg = args[0];
    ex.mostrarMsg();
    
    System.out.println("Instância da classe Exemplo6");
    System.out.println(ex);
    System.out.println(ex1);
    }
  }
