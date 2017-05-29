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


public class Planisferio extends JPanel {


	private BufferedImage mundo;


	public Planisferio() {

		try {
			mundo = ImageIO.read(new File("cesta.jpg"));
		} catch (IOException e) {
			System.out.println("Error");
		}

	}


	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		UIManager uim = new UIManager();

		g.drawImage(mundo, 0, 0, getWidth(), getHeight(), this);

	
      	uim.put("Panel.background",new ColorUIResource(0, 191, 255));
		JPanel argentina = new JPanel();
		argentina.setLayout(null);
		argentina.setBounds(257, 380, 15, 15);

		argentina.addMouseListener(new MouseAdapter()  {  
        	public void mouseClicked(MouseEvent e) {  
        		int valor = 1;
        		Leyenda.muestraLeyenda(valor);
      		}
      	});

      	this.add(argentina);

      	uim.put("Panel.background", new ColorUIResource(200, 0, 0));
		JPanel espania = new JPanel();
		espania.setLayout(null);
		espania.setBounds(422, 154, 15, 15);

		espania.addMouseListener(new MouseAdapter()  {  
        	public void mouseClicked(MouseEvent e) {  
        		int valor = 3;
        		Leyenda.muestraLeyenda(valor);
      		}
      	});

      	this.add(espania);

     
      	uim.put("Panel.background", new ColorUIResource(Color.GREEN));
		JPanel mexico = new JPanel();
		mexico.setLayout(null);
		mexico.setBounds(157, 225, 15, 15);

		mexico.addMouseListener(new MouseAdapter()  {  
        	public void mouseClicked(MouseEvent e) {  
        		int valor = 6;
        		Leyenda.muestraLeyenda(valor);
      		}
      	});

      	this.add(mexico);

		
		uim.put("Panel.background", new ColorUIResource(Color.WHITE));

	}


}
