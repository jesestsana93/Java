public class ParesImpares{

  public static void main(String [] args){
    //Programa que calcula los numeros del 1 al 1000
   
    int i=1;
    while(i<=1000){
      if(i%2==0){
	     System.out.println("El " + i + " es par");
      }
      i++;//Si no estuviera se crearia un ciclo infinito
    }

  }
}