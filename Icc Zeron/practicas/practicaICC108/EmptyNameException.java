/**
 * Subclase EmptyNameException heredada de Exception que lanza una excepcion si
 * el nombre que debe ser una cadena no es distinta a la cadena
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 24-mayo-2012
 */

public class EmptyNameException extends Exception{ //Inicia clase

    //constructor  
    public EmptyNameException(){
	super();
    }

    public EmptyNameException(String s){
	super(s);
    }
} //Fin de la clase
