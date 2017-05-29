import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;

public class Dibujo extends JPanel {

	public void paintComponent( Graphics g ) {

		Random aleatorios = new Random();
		int red=0;
		int green=0;
		int blue=0;

		super.paintComponent( g );
		int anchura = getWidth(); 
		int altura = getHeight(); 
		/*g.drawLine( 0, 0, anchura, altura );
		g.drawLine( 0, altura, anchura, 0 );*/
		/*g.drawRect(50,50, anchura-120, altura-120);
		g.drawOval(50,50,anchura-120, altura-120);*/

		

		for(int i=1; i<=10; i++) {
			int x=20+(i*10);
			int y=20+(i*10);
			int ext_x=20+(i*10);
			int ext_y=20+(i*10);
			red=aleatorios.nextInt(256);
			green=aleatorios.nextInt(256);
			blue=aleatorios.nextInt(256);
			Color c = new Color(red,green,blue);
			g.setColor(c);
			g.fillOval(x, y, ext_x, ext_y);

		}




	} 
	
} 