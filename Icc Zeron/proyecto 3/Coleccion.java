/**
 * Clase abstacta que permite llevar el control de libros, discos y peliculas que uno posee.
 * @see Articulo
 * @author Jesus Esteban Sanchez Alcantara y Samuel Infante Barrios
 * @version 1.0 8-junio-2012
 */

abstract public class Coleccion{//Inicia clase

    //Atributos
    private String titulo;
    private String genero;

    /**
     * Constructor de una coleccion de discos, peliculas, libros.
     * que recibe dos parametros que tienen en comun dichas colecciones
     * @param tit- titulo del disco, pelicula, libro
     * @param gen- genero del disco, pelicula, libro
     */
    public Coleccion(String tit, String gen){
	titulo=tit;
	genero=gen;

    } //Fin del constructor

    /**
     * Metodos abstracto para obtener el titulo del libro, disco o pelicula.
     */
    public abstract String obtenerTitulo();
 
    //Fin del metodo 

    /**
     * Metodos abstracto para obtener el genero del libro, disco o pelicula.
     */
   public abstract String obtenerGenero();

    //Fin del metodo

}//Fin de la clase