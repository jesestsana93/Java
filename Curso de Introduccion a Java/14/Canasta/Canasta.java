import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.imageio.ImageIO;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;


public class Canasta extends JPanel {


	private BufferedImage canasta;


	public Canasta() {

		try {
			canasta = ImageIO.read(new File("cesta.jpg"));
		} catch (IOException e) {
			System.out.println("Error");
		}

	}


	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		UIManager uim = new UIManager();

		g.drawImage(canasta, 0, 0, getWidth(), getHeight(), this);


		uim.put("Panel.background", new ColorUIResource(Color.GREEN));
		JPanel pera = new JPanel();
		pera.setLayout(null);
		pera.setBounds(157, 225, 15, 15);

		pera.addMouseListener(new MouseAdapter()  {  
        	public void mouseClicked(MouseEvent e) {  
        		int valor = 0;
        		Leyenda.muestraLeyenda(valor);
      		}
      	});

      	this.add(pera);

	
      	uim.put("Panel.background",new ColorUIResource(0, 191, 255));
		JPanel manzana = new JPanel();
		manzana.setLayout(null);
		manzana.setBounds(257, 380, 15, 15);

		manzana.addMouseListener(new MouseAdapter()  {  
        	public void mouseClicked(MouseEvent e) {  
        		int valor = 1;
        		Leyenda.muestraLeyenda(valor);
      		}
      	});

      	this.add(manzana);

      	uim.put("Panel.background", new ColorUIResource(200, 0, 0));
		JPanel guayaba = new JPanel();
		guayaba.setLayout(null);
		guayaba.setBounds(422, 154, 15, 15);

		guayaba.addMouseListener(new MouseAdapter()  {  
        	public void mouseClicked(MouseEvent e) {  
        		int valor = 2;
        		Leyenda.muestraLeyenda(valor);
      		}
      	});

      	this.add(guayaba);

     
      	

	}


}
