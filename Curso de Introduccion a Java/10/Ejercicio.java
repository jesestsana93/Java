public class Ejercicio implements FiguraCuadrado{


    public double calculaArea(double lado){
      double area = lado * lado;
      return area;    
    }
  
    public double calculaPerimetro(double lado){
      double perimetro = lado * 4.0;
      return perimetro;    
    }

      public static void main(String []args){
      Ejercicio c = new Ejercicio();
      Ejercicio c2 = new Ejercicio();
           
      System.out.println("El area del cuadrado es " + c.calculaArea(2.5));      
      System.out.println("El perimetro del cuadrado  es " +  c2.calculaPerimetro(2.5));
      }
    
}