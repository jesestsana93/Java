public class UsoCalculadora{

  public static void main(String [] args){
    CalculadoraBasica cb= new CalculadoraBasica();
    cb.multiplicacion(4,7);
    
    int s = cb.suma(2,2);
    System.out.println("La suma es " + s);
    
  }

}