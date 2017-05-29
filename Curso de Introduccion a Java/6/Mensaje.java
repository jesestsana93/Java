
public class Mensaje {
	
	String nombreRemitente;
	String cuerpoMensaje;


	public Mensaje(String rem, String mensaje) {
		nombreRemitente=rem;
		cuerpoMensaje=mensaje;
	}


	public void setNombreRemitente(String rem) {
		nombreRemitente=rem;
	}

	public void setCuerpoMensaje(String mensaje) {
		cuerpoMensaje=mensaje;
	}

	public String getNombreRemitente() {
		return nombreRemitente;
	}


	public String getCuerpoMensaje() {
		return cuerpoMensaje;
	}

	public String toString() {
		return "Mensaje de " + nombreRemitente + " : " + cuerpoMensaje;
	}

}