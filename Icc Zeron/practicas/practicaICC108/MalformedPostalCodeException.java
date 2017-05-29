/**
 * Subclase MalformedPostalCodeException heredada de Exception que lanza
 * una excepcion si el codigo postal no consta de 5 digitos. 
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 24-mayo-2012
 */

public class MalformedPostalCodeException extends Exception{ //Inicia clase
    public MalformedPostalCodeException(){
	super();
    }

    public MalformedPostalCodeException(String s){
	super(s);
    }
} //Fin de la clase