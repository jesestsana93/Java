
import java.io.Serializable;

public class Contacto implements Serializable {

	protected String nombre;
	protected String apellido;
	
	
	//Constructor
	public Contacto(String n, String ape) {
		nombre=n;
		apellido=ape;
	}

	//Metodo toString
	public String toString() {
		return "Nombre " + nombre  + " Apellido " + apellido;
	}

}
