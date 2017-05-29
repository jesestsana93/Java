/**
 * Clase para actualizar la informacion de peliculas que posee el usuario.
 * @see Coleccion
 * @author Jesus Esteban Sanchez Alcantara y Samuel Infante Barrios
 * @version 1.0 8-junio-2012
 */

public class Peliculas extends Coleccion{ //Inicia clase

    //Atributos

    private String actPrincipal;
    private int año; 
   
   /**
    * Constructor que recibe dos parametros
    * @param ap- actriz o actor principal de la pelicula
    * @param a-año de la pelicula
    */
    public Peliculas(String tit,String gen,String ap,int a){
	super(tit,gen);
	actPrincipal=ap;
	año=a;
    }//Fin del constructor

    /**
     * Metodo para obtener el titulo de la pelicula
     * @return String-- titulo de la pelicula
     */
      public String obtenerTitulo(){
	  return titulo;	    
      }//Fin del metodo
 	    
    /**
     * Metodo para asignar el titulo de la pelicula
     * @param tit- titulo de la pelicula
     */      
      public void asignarTitulo(String tit){
	  titulo=tit;;
      } //Fin del metodo

    /**
     * Metodo para obtener el genero de la pelicula
     * @return String-- genero de la pelicula
     */
      public String obtenerGenero(){
	  return genero;	    
      }//Fin del metodo
 	    
    /**
     * Metodo para asignar el genero de la pelicula
     * @param gen- genero de la pelicula
     */      
      public void asignarGenero(String gen){
	  genero=gen;;
    } //Fin del metodo

    /**
     * Metodo para obtener a la actriz o el actor principal
     * @return String--actriz o actor principal
     */	
    public String obtenerActPrincipal(){
	return actPrincipal;	    
    } //Fin del metodo 

    /**
     * Metodo para asignar a la actriz o el actor principal
     * @param ap -- Actriz o actor principal de la pelicula
     */
    public void asignarActPrincipal(String ap){
	actPrincipal=ap;
    }//Fin del metodo 

    /**
     * Metodo para obtener el año de la pelicula
     * @return int--año de la pelicula
     */	
    public int obtenerAño(){
	return año;	    
    } //Fin del metodo 

    /**
     * Metodo para asignar el año de la pelicula
     * @param a -- año de la pelicula
     */
    public void asignarAño(int a){
	año=a;
    }//Fin del metodo 
   
    

     /**
      * Metodos para obtener y asignar valor a cada atributo
      * Se llama al metodo de la superclase toString 
      */	
      public String toString(){
	return super.toString() + "\t" +titulo + "\t" +genero + "\t" +actPrincipal + "\t" +año;
      } //Fin del metodo toString

   }  //Fin de la clase
