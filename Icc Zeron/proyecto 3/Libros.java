/**
 * Clase para actualizar la informacion de libros que posee el usuario.
 * @see Coleccion
 * @author Jesus Esteban Sanchez Alcantara y Samuel Infante Barrios
 * @version 1.0 8-junio-2012
 */
public class Libros extends Coleccion{ //Inicia clase
    
    //Atributos
    private String autor;
    private String tema;

    /**
     * Constructor que recibe dos parametros
     * @param aut- autor del libro
     * @param tem-tema del libro
     */
    public Libros(String tit, String aut, String tem, String gen){
	super(tit,gen);
	autor=aut;
	tema=tem;
    } //Fin del constructor

    /**
     * Metodo para obtener el titulo del libro
     * @return String-- titulo del libro
     */
      public String obtenerTitulo(){
	  return titulo;	    
      }//Fin del metodo
 	    
    /**
     * Metodo para asignar el titulo del libro
     * @param tit- titulo del libro
     */      
      public void asignarTitulo(String tit){
	  titulo=tit;;
      } //Fin del metodo

    /**
     * Metodo para obtener el genero del libro
     * @return String-- genero del libro
     */
      public String obtenerGenero(){
	  return genero;	    
      }//Fin del metodo
 	    
    /**
     * Metodo para asignar el genero del libro
     * @param gen- genero del libro
     */      
      public void asignarGenero(String gen){
	  genero=gen;;
      } //Fin del metodo

    /**
     * Metodo para obtener el autor del libro
     * @return String-autor del libro
     */
    public String obtenerAutor(){
	return autor;	    
    } //Fin del metodo

    /**
     * Metodo para asignar el autor del libro
     * @param aut -autor del libro
     */
    public void asignarAutor(String aut){
	autor=aut;
    } //Fin del metodo

    /**
     * Metodo para obtener el tema del libro
     * @return String-tema del libro
     */
    public String obtenerTema(){
	return tema;	    
    } //Fin del metodo

    /**
     * Metodo para asignar el tema del libro
     * @param tem -tema del libro
     */
    public void asignarTema(String tem){
	tema=tem;
    } //Fin del metodo




     public String toString(){
      return super.toString() + "\t" +titulo + "\t" +autor + "\t" +tema + "\t" +genero;

     }//Fin del metodo toString

   
 } //fin de la clase
