/**
 * Subclase SellNumberException heredada de Exception que lanza
 * una excepcion si el el total de compras no es un dato numerico positivo. 
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 24-mayo-2012
 */

public class SellNumberException extends Exception{ //Inicia clase
    public SellNumberException(){
	super();
    }
    public SellNumberException(String s){
	super(s);
    }
}//fin de la clase