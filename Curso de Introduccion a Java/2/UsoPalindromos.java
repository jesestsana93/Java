public class UsoPalindromos{

  public static void main(String [] args){
    Palindromos p = new Palindromos();
    String c1="oso";
    String c2="oso";
    boolean resultado=p.sonPalindromos(c1,c2);
    if(resultado){
      System.out.println("Las cadenas son palindromas");
    }else{
      System.out.println("Las cadenas NO son palindromas");
    }
  }
  
}