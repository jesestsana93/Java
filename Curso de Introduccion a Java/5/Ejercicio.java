import java.util.Scanner;
import java.lang.Math;
/**
 * Ejercicio: programa que calcula el volumen de una esfera
 */
public class Ejercicio{
  
  public static void main(String [] args){
    double volumen;
    int radio;
  
    Scanner sc = new Scanner(System.in);    
    System.out.println("Introduce el radio de la esfera: ");
    radio = sc.nextInt();
    
    volumen = (4/3) * (Math.PI) * (radio * radio * radio);

     System.out.println("El volumen de la esfera es de " + volumen);
  }


}