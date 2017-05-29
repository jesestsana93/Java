/**
 * Subclase MalformedRFCException heredada de Exception que lanza
 * una excepcion si el RFC esta mal construido. 
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 24-mayo-2012
 */

public class MalformedRFCException extends Exception{//Inicia clase
    public MalformedRFCException(){
	super();
    }

    public MalformedRFCException(String s){
	super(s);
    }

}//Fin de la clase