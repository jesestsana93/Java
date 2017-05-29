/**
 * Tarea 4: indicar la salida en pantalla de los siguientes fragmentos
 * No hacer ninguna descripcion de la salida
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 
 */
public class Tarea4{ //Inicio de la clase
    public static void main(String [] args){ //inicio del metodo main

	int n = 45, m = 60; //variables

	if (n >= m * 2 - 20) //No lleva llaves mientras sea una linea de codigo a escribir
	    System.out.println("hola");
	else
	    System.out.println("que tal");   
	System.out.println("ahi nos vemos");
 
	//Imprime que tal
	//ahi nos vemos   
    
	String cad = "Numero ";
	int num = 99;
	cad = cad + num;
	if (cad.length()< 9){
	    System.out.println(cad+" ... ");
	}else{
	    System.out.println(cad);
	    System.out.println(cad+" $ $ ");
	}

	//Imprime numero99
	//numero 99 $$
    } //Fin del metodo main

} //Fin de la clase
