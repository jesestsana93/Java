import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.GridLayout;


public class Leyenda extends JFrame {
	

	Fruta[] f = new Fruta[3];

	public Leyenda() {
		f[0] = new Fruta("pera", "Pyrus", "pera.jpg");
		f[1] = new Fruta("manzana", "Malus doméstica", "manzanaAmarilla.jpg");
	    f[2] = new Fruta("guayaba", "Psidium guajava", "guayaba.jpg");
	  
	}


	public void verLeyenda(int valor) {

		JPanel panel = new JPanel(new GridLayout(2, 1));
		JPanel panel_completo = new JPanel(new GridLayout(1, 2));

		panel.add(new JLabel("Nombre Común: " + f[valor].getNombreComun()));
	    panel.add(new JLabel("Nombre Científico: " + f[valor].getNombreCientifico()));
	    panel_completo.add(panel);
	    panel_completo.add(new JLabel(new ImageIcon(f[valor].getImagen())));
	    add(panel_completo);

	}


	public static void muestraLeyenda(int valor) {

		Leyenda leyenda = new Leyenda();
		leyenda.verLeyenda(valor);
		leyenda.setSize(600, 300);
	    leyenda.setVisible(true);
	    leyenda.setResizable(false);

	}


}
