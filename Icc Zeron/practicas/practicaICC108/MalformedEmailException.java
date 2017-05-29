/**
 * Subclase  MalformedEmailException heredada de Exception que lanza
 * una excepcion si email no contiene el caracter @ intermedio, al
 * menos 1 punto despues de la @ . Por ejemplo despues del @ debe escribir
 * hotmail, gmail, yahoo, etc segun la cuenta que tenga.
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 24-mayo-2012
 */

public class MalformedEmailException extends Exception{ //Inicia clase
    public MalformedEmailException(){
	super();
    }
    public MalformedEmailException(String s){
	super(s);
    }
} //Fin de la clase
