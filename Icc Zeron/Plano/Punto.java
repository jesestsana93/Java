/**
 * Clase para implementar puntos en plano cartesiano como una pareja de
 * numeros flotantes. Modificacion de la clase Punto Dra. Amparo Lopez   
 * Gaona.
 * @author Carlos Zeron Martinez
 * @version 1.2 Marzo 2012
 */
public class Punto{            
   private double x;      // Coordenada x
   private double y;      // Coordenada y

  /**
   * Constructor de un punto, crea el punto (0,0)
   */
  public Punto(){
    // constructor por omision: para asignar un estado inicial
    // predeterminado
    x = y = 0; 
  }
  /**
   * Constructor de un punto a partir de dos numeros reales que
   * representan las coordenadas del nuevo punto.
   * @param x - coordenada x del nuevo punto.
   * @param y - coordenada y del nuevo punto.
   */
  public Punto(double x, double y) {
    //para distinguir entre parametros formales y las variables
    //de instancia. this hace referencia al mismo objeto
    this.x = x; // la notacion punto permite el acceso a atributos
    // y metodos
    this.y = y; // no se viola el encapsulamiento porque se hace en
    // la misma clase
  }
  /**
   * Constructor de un punto a partir de otro punto.
   * @param p - punto a partir del cual se crea el nuevo.
   */
  public Punto (Punto p) {
   // constructor de copia: con el se crea un nuevo objeto
   // cuyo estado inicial es una copia del estado del objeto
   // que se le pasa como parametro
    x = p.x; // es lo mismo que this.x=p.x
    y = p.y; // es lo mismo que this.y=p.y
  }
  /**
   * Asigna valor a la coordenada x del punto.
   * @param nuevaX - nuevo valor para la coordenada x.
   */
  public void asignarX(double nuevaX) {
    x = nuevaX; 
  }
  /**
   * Asigna valor a la coordenada y del punto.
   * @param nuevaY - nuevo valor para la coordenada y.
   */
  public void asignarY(double nuevaY) {
    y = nuevaY; 
  }
  /**
   * Regresa la coordenada x del punto.
   * @return int - la coordenada x del punto.
   */  
  public double obtenerX(){
    return x;  //a return le sigue una expresion cuyo valor
    // se devuelve
  } 
  /**
   * Regresa la coordenada y del punto.
   * @return int - la coordenada y del punto.
   */  
  public double obtenerY(){
    return y; 
  } 
  
  /**
   *  Determina la distancia entre dos puntos usando la formula
   *  ((x2-x1)^2 + (y2-y1)^2)^1/2
   *  @param p - punto respecto al que se quiere determinar la distancia.
   *  @return double - distancia entre los dos puntos.
   */
  public double distancia (Punto p) {
    return Math.sqrt((this.x-p.x)*(this.x-p.x) +
                              (this.y-p.y)*(this.y-p.y));
  }
  /**
   * Determina si tres puntos estan alineados verificando que se cumpla la
   * igualdad: (y-y1)*(x2-x1) = (y2-y1)*(x -x1)
   * @param p1 - Punto que junto con p2 y el que llama se verifica si estan alineados
   * @param p2 - Punto que junto con p1 y el que llama se verifica si estan alineados
   * se verificara si estan alineados.
   * @return true si estan alineados, false en otro caso.
  */
  public boolean estanAlineados (Punto p1, Punto p2) {
    return (y - p1.y)*(p2.x - p1.x) == (p2.y - p1.y)*(x -p1.x);
  }
  /** 
   * Determina si dos puntos son iguales 
   * @param p - punto contra el cual se va a comparar
   * @return boolean - true si son iguales y false en otro caso
   */
  public boolean equals (Object p) {
    Punto pto = (Punto)p;
    return x == pto.obtenerX() && y == pto.obtenerY();
  }
  /** 
   * Metodo para convertir un Punto a cadena de caracteres
   * @return String -- el punto en formato de cadena
   */
  public String toString() {
    return "(" + x + "," + y + ")";
  }


}
