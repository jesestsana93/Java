/**
 * Subclase EmptyStreetException heredada de Exception que lanza 
 * una excepcion si la calle no es distinta a la cadena.
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 24-mayo-2012
 */

public class EmptyStreetException extends Exception{ //Inicia clase

    public EmptyStreetException(){
	super();
    }

    public EmptyStreetException(String s){
	super(s);
    }
} //fin de la clase