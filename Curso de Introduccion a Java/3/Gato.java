import java.util.Random;

public class Gato {
	
	//Atributos
	String nombre;
	String genero;
	String color;
	int edad;
	boolean dormido=false;


	Random aleatorio = new Random();
	int humor=aleatorio.nextInt(5);


	//Método constructor
	public Gato(String nombre, String g, String c, int e) {
		this.nombre=nombre;
		genero=g;
		color=c;
		edad=e;
	}

 //Sin este metodo imprimiria una localidad de memoria (Gato@1db9742)
	public String toString() {
		return "El gato se llama " + nombre + " es " + genero 
+ " y es de color "+ color + " y tiene " + edad + " meses ";
	}

	public void dormir() {
		System.out.println("El gato esta dormido");
		dormido=true;

	}

	public void despertar() {
		System.out.println("El gato se ha despertado");
		dormido=false;
	}

	public void comer() {
		if(dormido==false) {
			System.out.println("El gato come");
		} else {
			System.out.println("El gato esta dormido y no puede comer");
		}	
	}

	public void comportamiento() {
		if(dormido==false) {
			if(humor==0 || humor==1) {
				System.out.println("El gato te araña");
			} else if(humor==2) {
				System.out.println("El gato está indiferente");
			} else {
				System.out.println("El gato está contento, quiere jugar");
			}
		} else {
			System.out.println("El gato está dormido");
		}


	}

	public Gato cruzar(Gato g1, Gato g2) {
		Gato gatito_nuevo=null;
		if((g1.genero).equals(g2.genero)) {
			System.out.println("Los gatos son del mismo género y no se pueden cruzar");
			gatito_nuevo=null;
		} else {
			if(g1.edad>24 && g2.edad>24) {

				System.out.println("Vamos a cruzar a los gatos");
				int genero_gatito_bb=aleatorio.nextInt(2);
				String genero_gatito;
				if(genero_gatito_bb==0) {
					genero_gatito="macho";
				} else {
					genero_gatito="hembra";
				}

				int color_pelo_gatito=aleatorio.nextInt(2);
				String color_pelaje;
				if(color_pelo_gatito==0) {
					color_pelaje=g1.color;
				} else {
					color_pelaje=g2.color;
				}

				gatito_nuevo = new Gato("gatito bebé", genero_gatito, color_pelaje, 0 );
			} else {
				System.out.println("Uno de los gatos es muy joven para cruzarse");
				gatito_nuevo=null;
			}

		}
		return gatito_nuevo;
	}










}

