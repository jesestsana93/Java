/**
 * Conocer el manejo de excepciones (examen 3)
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 30-mayo-2012
 */

public class Rectangulo{//Inicia clase
    
    //Atributos
    private final double ancho;
    private final double largo;

    public Rectangulo(double l, double a)throws RuntimeException{
	if(a <= 0 || l <= 0){
	    throw new RuntimeException("Dimensiones invalidas");
	}

	largo = l;
	ancho = a;
    } //Fin del constructor

    public double area(){
	return largo*ancho;
    }//Fin del metodo

    public static void main(String []args){//Inicia metodo main
	for(int i = -2;i<2;i++){
	    try{
		System.out.println("Rectangulo con largo 4 y ancho " + i);
		Rectangulo r = new Rectangulo(4,i); //Creacion del objeto rectangulo
	    } catch(RuntimeException e){
		System.out.println(e);
	    }
	} //Fin del for
    } //Fin del metoo main
}//Fin de la clase
