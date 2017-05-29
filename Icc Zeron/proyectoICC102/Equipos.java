import java.util.Scanner;
/**
 * Clase  que se encargara de crear un equipo, almacenara el nombre
 * del equipo, numero de puntos (segun gane, pierda o empate).
 * Ademas creara un arreglo de equipos,dependiendo del deporte que quiera el usuario.
 * @author : Jesus Esteban Sanchez Alcantara
 */

public class Equipos{ //Inicia clase

    //Atributos

    protected String nombre;
    protected int empate;
    protected int ganados;
    protected int perdidos;
    protected Scanner stdin = new Scanner(System.in);
    protected int anotaciones;

    /**
      * Constructor de los equipos, donde se ingresara
      * el nombre del equipo que teclee el usuario.
      * Empate, ganados y perdidos tienen un valor incial de 0.
      */  
      public Equipos(){
	nombre = stdin.nextLine();
	empate = 0;
	ganados = 0;
	perdidos = 0;	
    } //Fin del constructor

    /**
     * Metodo de asignacion donde se pondra el nombre del equipo.
     * @param nom - Nombre del equipo.
     */
    public void ponNombreEquipo(String nom){
	nombre = nom;
    } //Fin del metodo
    
    /**
     * Metodo que regresa el nombre del equipo.
     * @return String - nombre del equipo.
     */
    public String daNombreEquipo(){
	return nombre;
    }//Fin del metodo

    /**
     * Metodo de asignacion donde se pondra el numero
     * de veces ganadas.
     * @param gana - numero de veces ganadas.
     */
    public void ponGanados(int gana){
	ganados += gana;
    }//Fin del metodo    

    /**
     * Metodo que regresa el numero de veces ganadas, multiplicado
     * por 3 dadas las reglas del torneo.
     * @return int - numero de veces ganadas.
     */

    public int daGanados(){
	return ganados;
    }//Fin del metodo

    /**
     * Metodo de asignacion donde se pondra el numero
     * de veces perdidas.
     * @param perdido - numero de veces perdidas.
     */
    public void ponPerdidos(int perdido){
	perdidos += perdido;
    }//Fin del metodo

    /**
     * Metodo que regresa el numero de veces perdidas, multiplicado
     * por 0 dadas las reglas del torneo.
     * @return int - numero de veces perdidas.
     */
    public int daPerdidos(){
	return perdidos;
    }//Fin del metodo

    /**
     * Metodo de asignacion donde se pondra el numero de veces empatadas.
     * @param empata - numero de veces empatadas.
     */
    public void ponEmpatados(int empata){
	empate += empata;
    }//Fin del metodo

    /**
     * Metodo que regresa el numero de veces empatadas.
     * @return int - numero de veces empatadas.
     */
    public int daEmpatados(){
	return empate;
    }//Fin del metodo

    /**
     * Metodo que asignara el numero de anotacioes de 
     * cada equipo.
     * @param anotacion - numero de anotaciones del equipo.
     */
    public void ponAnotaciones(int anotacion){
	anotaciones += anotacion;
    }//Fin del metodo

    /**
     * Metodo que regresara el numero de anotaciones de cada
     * equipo.
     * @return int - numero de anotaciones del equipo.
     */
    public int daAnotaciones(){
	return anotaciones;
    }//Fin del metodo

    /**
     * Metodo que asigna el numero de anotaciones.
     * @param anotaciones - numero de anotaciones del equipo.
     */
    public void ponAnotaciones2(int anotacion){
	anotaciones = anotacion;
    }
    
    public String daMarcador(){
	return null;
    }
    public String Marcador(){
	return null;
    }//Fin del metodo

    /**
     *Metodo que da la puntuacion del equipo en cuestion
     *@return int - Puntuacion del Equipo
     */
    public int daPuntuacion(){
	return (daGanados())+ daEmpatados();
    }//Fin del metodo

   
}//fin clase Equipos
