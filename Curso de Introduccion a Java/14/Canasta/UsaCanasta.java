import javax.swing.JFrame;


public class UsaCanasta {
	

	public static void main(String[] args) {

		JFrame ventana = new JFrame("Cesta de frutas");
		Canasta c = new Canasta();

		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.add(c);
		ventana.setSize(700, 550);
		ventana.setVisible(true);

	}


}
