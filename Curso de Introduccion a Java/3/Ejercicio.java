/**
 * Ejercicio: modelar un numero racional
 */

public class Ejercicio{

  int p;
  int q;

  public Ejercicio(int x, int y){
    p=x;
    q=y;
  }

  public String toString(){
    return "El numero racional creado es " + p + "/" + q;
  }
  
  public static void main(String []args){
    Ejercicio r =new Ejercicio(1,4);
    Ejercicio r2 =new Ejercicio(3,2);
    Ejercicio r3 =new Ejercicio(8,7);
    System.out.println(r);
    System.out.println(r2);
    System.out.println(r3);
  }
  
}