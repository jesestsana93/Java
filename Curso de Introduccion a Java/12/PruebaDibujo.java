import javax.swing.JFrame;

public class PruebaDibujo {
	
	public static void main( String args[] ) {

		Dibujo panel = new Dibujo();
		JFrame aplicacion = new JFrame();

		aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		aplicacion.add( panel );
		aplicacion.setSize( 300, 400 ); 
		aplicacion.setVisible( true ); 
	} 
} 