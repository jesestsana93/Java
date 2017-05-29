/** 
 * Programa que muestra mediante una ventana unas líneas que forman una curva
 * @author: Cinthia Rodríguez Maya
 */

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;

public class Curva extends JPanel {

	//Dibuja una x desde las esquinas del panel
	public void paintComponent(Graphics g) {
		//Llama a paintComponent para asegurar que el panel se muestre correctamente
		super.paintComponent( g );

		//Color col = new Color(255,0,0);
		//g.setColor(col);

		Random aleatorios = new Random();

		int anchura = getWidth();
		int altura = getHeight();
		/*Las variables num1 y num2, trazan rectas desde el origen, hasta cubrir el 
		panel delimitado, por la esquina inferior izquierda a la esquina superior derecha
		*/
		int num1 = 0;
		int num2 = 1;
		

		while( num1<=29 & num2<=30 ) {
			int red=aleatorios.nextInt(256);
			int green=aleatorios.nextInt(256);
			int blue=aleatorios.nextInt(256);
			Color col = new Color(red,green,blue);
			g.setColor(col);
			g.drawLine( 0, (altura*num1/30), (anchura*num2/30), altura );
			num1+=1;
			num2+=1;
		}
		/*Color col2 = new Color(0,0,0);
		g.setColor(col2);
		g.drawLine(0,0,50,50);*/

		
		
	}

}
			 
