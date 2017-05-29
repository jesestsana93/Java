import javax.swing.JFrame;

public class PruebaCurva {

	public static void main(String[] args) {

		//Crea un panel que contiene nuestro dibujo
		Curva panel = new Curva();

		//Crea un nuevo marco para contener el papel
		JFrame aplicacion = new JFrame();

		//Establece el marco para salir cuando se cierre
		aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		aplicacion.add(panel);		//agrega el panel al marco
		aplicacion.setSize(200,400);	//establece tamaño del marco
		aplicacion.setVisible(true);

	}

}
