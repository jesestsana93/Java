public class ImplementacionCuadrado implements FiguraCuadrado {


   public double calculaArea(Cuadrado c) {
      double area=c.lado*c.lado;
      return area;
   }



   public double calculaPerimetro(Cuadrado c) {
      double perimetro=c.lado*4;
      return perimetro;
   }


}
