import java.util.Scanner;
/**
 * Programa que reciba 3 enteros y diga si la suma de dos de ellos es igual al otro
 * 2 ,10 , 12
 */
public class Ejercicio{

  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    Ejercicio es = new Ejercicio();
    
    System.out.println("Introduce el primer numero: ");
    int a = sc.nextInt();
    System.out.println("Introduce el segundo numero: ");
    int b = sc.nextInt();
    System.out.println("Introduce el tercer numero: ");
    int c = sc.nextInt();
    
    es.sumaEnteros(a,b,c);
    //es.sumaEnteros(2,11,12);
    //es.sumaEnteros(2,10,12);
  }

  public int sumaEnteros(int x, int y, int z){
    int sumaDos= x + y;
    if(sumaDos == z){
      System.out.println("La suma de " + x +  "+" + y + " es equivalente al numero " + z);
      //System.out.println("Se cumple que la suma de dos de ellos son la suma del otro");
    }else{
      System.out.println("La suma de " + x +  "+" + y + " es distinta al numero " + z);
    }
    return sumaDos;
  }

  
  /**
  public boolean compara(int x, int y, int z){
    boolean cumple = false;
    
    if(a==b+c || b==a+c || c==a+b){
      cumple = true;
    }
    return cumple;      
  } 
  */
  
  
}