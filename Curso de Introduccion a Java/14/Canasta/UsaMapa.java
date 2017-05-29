import javax.swing.JFrame;


public class UsaMapa {
	

	public static void main(String[] args) {

		JFrame ventana = new JFrame("Planisferio");
		Planisferio mapa = new Planisferio();

		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.add(mapa);
		ventana.setSize(700, 550);
		ventana.setVisible(true);

	}


}
