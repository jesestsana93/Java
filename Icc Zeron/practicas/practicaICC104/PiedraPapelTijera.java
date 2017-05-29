import java.util.Random;
import java.util.Scanner;
/**
 * Programa para que el usuario juegue piedra,papel o tijera con la computadora.
 * El usuario hará su elección utilizando el teclado y la computadora hara su
 * eleccion en forma pseudoaleatoria.
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 12-febrero-2012
 */

public class PiedraPapelTijera {    //Inicio de la clase
    public static void main(String []args){    //Inicio del metodo main

	Random r = new Random();
	Scanner sc = new Scanner(System.in);
        int maq =r.nextInt(3); 

	//Declaracion de variables 

        int piedra = 0;
	int papel = 1;
	int tijera = 2;	 
        int opcion;
 

	//Se le da a escoger al jugador una opcion y se imprimen los resultados

	System.out.println(" *** JUEGO DE PIEDRA, PAPEL O TIJERA *** ");
        System.out.println("(1) Piedra");
	System.out.println("(2) Papel");
	System.out.println("(3) Tijera");
	System.out.print("Elije una opcion: ");
        opcion = sc.nextInt();

	/**
	 * Casos para el juego
         * Si la computadora elige la misma opcion que el jugador, hay empate.
	 */
	if(maq == opcion){
	    System.out.println("Empate");
	}else{
	
	    /**
	     * La computadora maquina escogio tijera, el jugador escogio piedra, el jugador gana.
             * La computadora escogio tijera , el jugador escogio papel, el jugador pierde.
	     */
	    if(maq == tijera){
		if(opcion == piedra)
		    System.out.println("Tu elegiste piedra , la computadora escogio tijera,ganaste!!!");
		else{
		    System.out.println("Tu elegiste papel, la computadora escogio tijera, perdiste!!!");
		}
	    }

	    /**
	     * La computadora escogio piedra, el jugador escogio papel, el jugador gana. 
             * La computadora escogio piedra , el jugador escogio tijera , el jugador pierde.
	     */
	    if(maq == piedra){
		if(opcion == papel)
		    System.out.println("Tu elegiste papel, la computadora escogio piedra, ganaste!!!");
		else{
		    System.out.println("Tu elegiste tijera , la computadora escogio piedra , perdiste!!!");
		}
	    }

	    /**
	     * La computadora escogio papel , el jugador escogio tijera, el jugador gana.
	     * La computadora escogio papel , el jugador escogio piedra, el jugador pierde.
	     */
	    if(maq == papel){
		if(opcion == tijera)
		    System.out.println("Tu elegiste tijera ,la computadora escogio papel , ganaste !!! ");
		else{
		    System.out.println("Tu elegiste piedra, la computadora escogio papel , perdiste!!!");
		}
	    }
	}  //Fin de los casos

    } //Fin del metodo min
} //Fin de la clase
