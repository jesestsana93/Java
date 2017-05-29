/**
 * Programa que apoya a un cajero bancario a realizar sus operaciones.
 * En el programa se utilizaran cuentas bancarias de débito. 
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 21-marzo-2012
 */

public class Cuenta{ //Inicio de la clase

    //Atributos

    private String nombre;
    private double saldo;
    private int numCuenta;

    /**
     * Constructor que crea una Cuenta vacia con dichos atributos
     */
    public Cuenta(){
	nombre = " ";
	saldo = 0;
	numCuenta = 0;
    } //Fin del constructor

    /**
     * Constructor que creara una o varias cuentas a partir de dichos parametros.
     * @param nombre - Nombre del dueño de la cuenta
     * @param saldo - Saldo de la cuenta
     * @param numCuenta - Numero de Cuenta
     */
    public Cuenta(String nombre,double saldo,int numCuenta){
	this.nombre = nombre;
	this.saldo = saldo;
	this.numCuenta = numCuenta;
    } //Fin del constructor

    /**
     * Metodo para retirar dinero del saldo de dicha cuenta.
     * @param retiro - cantidad a retirar del saldo de dicha cuenta
     */
    public void retirarDinero(double retiro){
	saldo-=retiro;
    } //Fin del metodo

    /**
     * Metodo para depositar dinero en el saldo de dicha cuenta
     * @param deposito - cantidad a depositar en el saldo de dicha Cuenta
     */
    public void depositarDinero(double deposito){
	saldo+=deposito;
    }//Fin del metodo

    /**
     * Metodo  que obtiene el saldo de dicha cuenta
     * @return saldo- regresa el saldo de dicha cuenta
     */
    public double obtenerSaldo(){
	return saldo;
    }//Fin del metodo

    /**
     * Metodo que obtiene el nombre del propietario de dicha cuenta
     * @return nom- regresa el nombre del propietario de dicha cuenta
     */
    public String propietarioCuenta(){
	String nom = nombre;
	return nom;
    }//Fin del metodo

    /**
     * Metodo que obtiene el numero de cuenta
     * @return numCuenta- regresa el numero de cuenta
     */
    public int obtenerNumCuenta(){
	return numCuenta;
    }//Fin del metodo

    /**
     * Metodo toString para dar el dueño, saldo y numero de cuenta.
     * @return String - Representacion en cadena de la infomacion
     */
    public String toString(){
	return "\nDueño: "+ nombre.toUpperCase()+"\nSaldo de: $"+saldo+"\nNumero de Cuenta: "+numCuenta;
    }//Fin del metodo
}//Fin de la clase