import java.io.*;
import java.util.Scanner;
/**
 * Clase que prueba el funcionamiento de la clase SimulacionDados 
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 2.0 17-mayo-2012
 */

public class PruebaSimulacionDados{  //Inicia Clase
    public static void main(String[]args){  //Inicia metodo main
	Scanner in = new Scanner(System.in);   //Lee lo que introduzca el usuario
	SimulacionDados simulacion = new SimulacionDados(); 
 
	System.out.println("**Bienvenido al Simulador para el Lanzamiento de Dados**");
	char opc; 

	//Se muestra el menu en pantalla para que el usuario elija una opcion
	System.out.println(" Opciones :");
	System.out.println("(n)ueva simulacion");
	System.out.println("(l)anzamientos adicionales");
        System.out.println("(i)mprimir");
	System.out.println("(s)alir");
        System.out.println(" Teclea la letra entre parentesis correspondiente a la opcion deseada");
	String opcion = in.next();
        opc = opcion.charAt(0);
	  
	switch(opc){ //Abre switch y se realiza la opcion elegida por el usuario

	case 'n':  //Nueva simulacion
	    simulacion.nuevaSimulacion();
	    break;

	case 'l': //Lanzamientos adicionales
	    simulacion.lanzamientoAdicional();
	    break;

	case 'i': //Imprimir resultados de la simulacion
	    System.out.println("RESULTADOS DE LA SIMULACION");
	    System.out.println("Cada \"*\" representa un lanzamiento de los "+ simulacion.Conteo() +" llevados a cabo");
	    simulacion.Contar();
	    break;

	case 's': //Salir
	    System.out.println("Gracias por utilizar el Simulador para el Lanzamiento de Dados.Hasta luego.");
	    break;

	default:
	    System.out.println("OPCION INVALIDA. Intenta de nuevo.");
	} //Fin del switch
	    
    }  //Fin del metodo main
}  //Fin de la clase
