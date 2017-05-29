/**
 * Programa que tiene como objetivo ilustrar las estructuras de datos dinamicas. 
 * @autor Jesus Esteban Sanchez Alcantara
 */
public class Nodo{

	private String elemento;
	private Nodo siguiente;

	/**
	 * Constructor que crea un nodo y se le asignan esos valores
	 * @param elemen - elemento del nodo
	 */
    	public Nodo(String elemen){
		elemento = elemen;
		siguiente = null;    //Esta instruccion puede omitirse
    	}//fin del constructor

	/**
	 * Metodo que da el elemento de la lista
	 * @return String - elemento de la lista
	 */
    	public String daElemento(){
		return elemento;
    	}//fin del metodo

	/**
	 * Metodo que pone el elemento en la lista
	 * @param elemen - elemento de la lista
	 */
    	public void ponElemento(String elem){
		elemento = elem;
	}//fin del metodo

	/**
         * Metodo que da el siguiente nodo
	 * @return 
	 */
    	public Nodo daSiguiente(){
		return siguiente;
    	}//fin del metodo

	/**
	 * Metodo que pone el siguiente nodo
	 * @param sig - nodo siguiente
	 */
    	public void ponSiguiente(Nodo sig){
		siguiente = sig;
    	}//fin del metodo


	public static void main(String[]args){
	
	   
	}//fin del metodo main

}//fin de la clase

