/**
 * Clase para crear lineas rectas en el plano Cartesiano
 * (Modificacion clase Linea de la Dra. Amparo Lopez Gaona)
 * @author Carlos Zeron Martinez       
 * @see Punto porque la linea es una agregacion de puntos
 * @version 1.2 2012
 */
public class Linea{
 // una linea esta constituida por dos puntos
  private Punto p;
  private Punto q;

  /**
   * Constructor por omision de una linea
   * cuyos extremos son el (0,0) y el (1,1)
   */
  public Linea(){
    p = new Punto(0,0);
    q = new Punto(1,1);
  }

  /**
   * Constructor de una linea a partir de dos puntos
   * @param p - punto de origen
   * @param q - segundo punto
   */
  public Linea(Punto p, Punto q){
    this.p = p;
    this.q = q;
  }

  /**
   * Constructor de copia
   * @param linea - Linea que se toma para crear una nueva   
   */
  public Linea(Linea linea){
    p = linea.p;
    q = linea.q;
  }

  /**
   * Modifica el primer punto de esta linea
   * @param p1 - el punto nuevo
   */
  public void asignarPrimerPunto(Punto p1) {
    p = p1;
  }

  /**
   * Modifica el segundo punto de esta linea
   * @param p2 - el punto nuevo
   */
  public void asignarSegundoPunto(Punto p2) {
    q = p2;
  }

  /**
   * Regresa el primer punto de esta linea
   * @return Punto - El primer punto
   */
  public Punto obtenerPrimerPunto(){
    return p;
  }

  /**
   * Regresa el segundo punto de esta linea
   * @return Punto - El segundo punto
   */
  public Punto obtenerSegundoPunto(){
    return q;
  }

  /**
 * Devuelve la pendiente de una recta.
 * @return double - La pendiente de la recta.
 */
  public double pendiente() {
    double divisor = q.obtenerX() - p.obtenerX();
    return (divisor != 0) ? (q.obtenerY() - p.obtenerY())/divisor
	: Double.POSITIVE_INFINITY;  //si la recta paralela al eje Y se devuelve infinito
  }

/**
 * Devuelve la ordenada al origen
 * @return double - La ordenada
 */
  public double ordenada() {
      return (p.obtenerX() == q.obtenerX())? Double.POSITIVE_INFINITY
	     : p.obtenerY() - pendiente()*p.obtenerX();
  }

  /**
   * Determina la ecuacion de una recta que pasa por 2 puntos
   * @return String - La ecuacion de la recta
   */
  public String ecuacion() {
    if (p.obtenerX() == q.obtenerX()){
      return "x = " + p.obtenerX();  //Recta paralela al eje y.
    }
    double m = pendiente();
    double b = ordenada();
    String ecuacion;
    if(b>0)
        ecuacion="y = "+ m +"x + "+b;
    else if(b==0)
        ecuacion="y = "+ m +"x";
    else
        ecuacion="y = "+ m +"x "+b; // asi no concatena el - a un +
    return ecuacion;
  }

/**
 * Determina si dos lineas son paralelas
 * @param line -- Linea con la que sera comparada la linea original
 * @return boolean true si ambas lineas son paralelas y false en otro caso
 */
  public boolean esParalelaA(Linea line) {
    return pendiente() == line.pendiente();
  }

  /**
   * Determina el punto de interseccion entre dos lineas
   * @param line - la segunda linea
   * @return Punto - punto de inteserccion
   */
  public Punto interseccion(Linea line) {
      double nuevaX, nuevaY;
      if (esParalelaA(line)) {
	  nuevaX = nuevaY = Double.POSITIVE_INFINITY;
      }
      else{
	  nuevaX = (ordenada()- line.ordenada())/(line.pendiente() - pendiente());
	  nuevaY = pendiente()*nuevaX + ordenada();
      }
      return new Punto(nuevaX, nuevaY);
  }

  /**
   * Representacion en cadena de caracteres de esta linea
   * @return String - la representacion en cadena
   */
  public String toString(){
      return "L["+p+","+q+"]";
  }

  /**
   * Metodo principal de ejecucion
   * @param args los argumentos en la linea de comandos
   */
  public static void main(String[] args){
      Linea linea1=new Linea();//creamos una linea usando el constructor por omision
      Punto inicial=new Punto(3,0);
      Punto fin=new Punto(4,5);
      Linea linea2=new Linea(inicial,fin);
      System.out.println("La primera linea es "+linea1);
      System.out.println("La segunda linea es "+linea2);
      System.out.println("La pendiente de la primera linea es "+linea1.pendiente());
      System.out.println("La ordenada al origen de la primera linea es "+linea1.ordenada());
      System.out.println("La ecuacion de la primera linea es "+linea1.ecuacion());
      System.out.println("La pendiente de la segunda linea es "+linea2.pendiente());
      System.out.println("La ordenada al origen de la segunda linea es "+linea2.ordenada());
      System.out.println("La ecuacion de la segunda linea es "+linea2.ecuacion()); 
      System.out.println("La interseccion entre ambas es "+linea1.interseccion(linea2));
      System.out.println(Double.POSITIVE_INFINITY);


  }
}
