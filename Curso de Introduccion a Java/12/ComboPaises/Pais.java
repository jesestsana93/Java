

public class Pais {
	
	String nombre;
	String capital;
	String idioma;
	String moneda;
	int extensionTerritorial;
	String ubicacion;


	public Pais(String n, String c, String i, String m, int ext, String u) {
		nombre=n;
		capital=c;
		idioma=i;
		moneda=m;
		extensionTerritorial=ext;
		ubicacion=u;
	}

	public void setNombre(String n) {
		nombre=n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setCapital(String c) {
		capital=c;
	}

	public String getCapital() {
		return capital;
	}

	public void setIdioma(String i) {
		idioma=i;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setMoneda(String m) {
		moneda=m;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setExtension(int ext) {
		extensionTerritorial=ext;
	}

	public int getExtension() {
		return extensionTerritorial;
	}

	public void setUbicacion(String u) {
		ubicacion=u;
	}

	public String getUbicacion() {
		return ubicacion;
	}

}