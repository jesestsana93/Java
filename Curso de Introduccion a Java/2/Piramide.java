public class Piramide{

  public static void main(String []args){
    int n=11;
    int renglones=1;
    int columnas=1;
    while(columnas<=n){
      renglones=1;
      while(renglones<=columnas){
	System.out.print("*");
	renglones++;
      }
      System.out.println();
      columnas++;
    }
  }
  
}