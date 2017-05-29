public class Fruta {


	private String nombreComun;
	private String nombreCientifico;
	private String imagen;


	public Fruta(String nombreCom, String nombreCien, String im) {
		nombreComun=nombreCom;
		nombreCientifico=nombreCien;
		imagen=im;
	
	}


	public String getNombreComun() {
		return nombreComun;

	}

	public String getNombreCientifico() {
		return nombreCientifico;

	}

	public String getImagen() {
		return imagen;

	}


}
