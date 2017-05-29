/**
 * Programa que maneja la informacion de clientes de una tienda.
 * Cada cliente esta conformado por:nombre completo,RFC,calle
 * codigo Postal,email y monto total de compras.
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 24-mayo-2012
 */

public class DatosCliente{//Inicia clase

    //Atributos
    private String nombre, RFC, calle, email;
    private int codpostal;
    private double monto, pro=0;
   
    /**
     * Constructor que recibe los datos del cliente
     * @param nom- nombre del cliente
     * @param rfc- rfc del cliente
     * @param ccl-  calle del cliente
     * @param cp- codigo postal del ciente
     * @param ml- email del cliente
     * @param mon- monto total de compras
     * @throws EmptyNameException - Si el nombre es una cadena vacia
     * @throws MalformedRFCException - Si el RFC esta mal construido
     * @throws EmptyStreetException - Si la calle es una cadena vacia
     * @throws MalformedPostalCodeException - Si el código postal no tiene 5 digitos
     * @throws MalformedEmailException - Si el email no tiene un '@' y despues un '.' por ejemplo  correo@hotmail.com
     * @throws SellNumberException - Si el total de compras no es mayor a cero
     */

    public DatosCliente(String nom,String rfc, String ccl, int cp, String ml, double mon) throws EmptyNameException, MalformedRFCException,EmptyStreetException, MalformedPostalCodeException, MalformedEmailException, SellNumberException {

	if(nom.equals("")){
	    throw new EmptyNameException("Debe escribir el nombre");
	}
	if(validarRfc(rfc)==false){
	    throw new MalformedRFCException("RFC incorrecto, el formato es: \n LLLLNNNNNN \nDonde 'L' es una Letra y 'N' es un numero");
	}
	if(ccl.equals("")){
	    throw new EmptyStreetException("Debe escribir la calle");
	}
	if(digitos(cp) != 5){
	    throw new MalformedPostalCodeException("El codigo postal esta mal construido, debe constar de 5 digitos");
	}
	if(ml.indexOf("@")==-1){
	    if(ml.indexOf(".")==-1){
	    throw new MalformedEmailException("E-mail incorrecto, debe llevar un '@' y un punto despues de la secuencia: \n\t correo@hotmail.com");
	    }
	}
	if(mon<0){
	    throw new SellNumberException("El monto total de compras debe ser mayor a cero");
	}

	nombre = nom;
	RFC = rfc;
	calle = ccl;
	codpostal = cp;
	email = ml;
	monto = mon;
    } //Fin constructor 

    /**
     * Metodo que devuelve el nombre del cliente
     * @return String- nombre del usuario
     */
    public String obtenerNombre(){
	return nombre;
    } //Fin del metodo

    /**
     * Metodo que devuelve el RFC del cliente
     * @return String- RFC del cliente
     */
    public String obtenerRFC(){
	return RFC;
    } //Fin del metodo 

    /**
     * Metodo que devuelve la calle del cliente
     * @return String- calle del cliente
     */
    public String obtenerCalle(){
	return calle;
    } //Fin del metodo

    /**
     * Metodo que devuelve el codigo postal del cliente
     * @return int- codigo postal
     */
    public int obtenerCodigoPostal(){
	return codpostal;
    } //Fin del metodo

    /**
     * Metodo que devuelve el e-mail del usuario
     * @return String- e-mail del usuario
     */
    public String obtenerEmail(){
	return email;
    } //Fin del metodo

    /**
     * Metodo que devuelve el monto total de las compras
     * @return double- monto total de las compras
     */
    public double obtenermontoTotal(){
	return monto;
    } //Fin del metodo
	
    /**
     * Metodo que asigna el nombre del cliente
     * @param nom- Nombre del Cliente
     * @throws EmptyNameException - Si el nombre es una cadena vacia
     */
    public void asignarNombre(String nom) throws EmptyNameException{
	if(nom.equals("")){
	    throw new EmptyNameException("Debe escribir el nombre");
	}
	nombre=nom;
    }//Fin del metodo

    /**
     * Metodo que asigna el RFC del cliente
     * @param rfc - RFC del cliente
     * @throws MalformedRFCException - Si el RFC esta mal construido
     */
    public void asignarRFC(String rfc) throws MalformedRFCException{
	if(validarRfc(rfc)==false){
	    throw new MalformedRFCException("RFC incorrecto, se escribe: \n LLLLNNNNNN \nDonde 'L' es una letra y 'N' es un numero");
	}
	RFC=rfc;
    } //Fin del metodo

    /**
     * Metodo que asigna la calle del cliente
     * @param ccl - calle del cliente
     * @throws EmptyStreetException - Si la Calle es una cadena vacia
     */
    public void asignarCalle(String ccl) throws EmptyStreetException{
	if(ccl.equals("")){
	    throw new EmptyStreetException("Debe escribir la calle");
	}
	calle=ccl;
    } //fin del metodo

    /**
     * Metodo que asigna el e-mail del cliente
     * @param ml - e-mail del cliente
     * @throws MalformedEmailException - Si el email no tiene un '@' y despues un '.'
     */
    public void asignarEmail(String ml) throws MalformedEmailException{
	if(ml.indexOf("@")==-1){
	    throw new MalformedEmailException("El 'email' esta mal formado, debe llevar un '@' y un punto despues de la secuencia: \n\t ejemplo@hotmail.com");

	}
	email=ml;
    }//Fin del metodo

    /**
     * Metodo que asigna el codigo postal del cliente
     * @param cp - codigo postal del cliente
     * @throws MalformedPostalCodeException - Si el código postal no tiene 5 digitos
     */
    public void asignarCP(int cp) throws MalformedPostalCodeException{
	if(digitos(cp)!= 5){
	    throw new MalformedPostalCodeException("El Codigo Postal esta mal construido, debe constar de 5 Digitos");
	}
	codpostal=cp;
    }//Fin del metodo

    /**
     * Metodo que asigna el monto total de compras del cliente
     * @param mon - monto total de compras del cliente
     * @throws SellNumberException - Si el total de compras no es un dato positivo
     */
    public void asignarMonto(double mon) throws SellNumberException{
	if(mon<0){
	    throw new SellNumberException("El total de compras debe ser mayor a cero");
	}
	monto=mon;
    }//Fin del metodo

    /**
     * Metodo booleano que compara 2 cadenas
     * @return 'true' si las cadenas son iguales o 'false' si son diferentes
     */
    public boolean equals(String nombre){
	return toString().equals(nombre.toString());
    }//Fin del metodo

    /**
     * Metodo booleano que valida el RFC del cliente en cuestion
     * @param rfc - RFC del cliente
     * @return 'true' si el RFC es correcto o 'false' si el RFC es incorrecto
     */
    public boolean validarRfc(String rfc){
	rfc=rfc.toUpperCase().trim();
	return rfc.toUpperCase().matches("[A-Z]{4}[0-9]{6}[A-Z0-9]{3}");
    }//Fin del metodo

    /**
     * Metodo que cuenta los digitos del codigo postal
     */
    public int digitos(int codpostal){
	int j=0, div=10,res=0;
	do{
	    res=codpostal/div;
	    j++;
	}while(res>=0);
	return j;
    }

    /**
     * Metodo toString que representa en cadena los datos del cliente
     * @return datos del cliente- devuelve en cadena los datos del cliente
     */
    public String toString(){
	return "\n***Datos del cliente*** \nNombre: "+nombre.toUpperCase()+"\nRFC: "+RFC.toUpperCase()+"\nCalle: "+calle+"\nCodigo postal: "+codpostal+"\nMonto total de compras"+monto;
    }//Fin del metodo

}//Fin de la clase
