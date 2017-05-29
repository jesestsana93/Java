import java.awt.Color;
import javax.swing.JOptionPane; 
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField; 
import javax.swing.JPasswordField; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class ComboBoxMejorado extends JFrame   {

	private JComboBox imagenesJComboBox; 
	private JLabel etiqueta; // etiqueta para mostrar el icono seleccionado
	private String nombres[] = { "Alemania", "Argentina", "Canadá", "España", "Francia", "Japón", "México" };
	private Icon iconos[] = { 
	new ImageIcon("alemania.jpg"),
	new ImageIcon("argentina.jpg"), 
	new ImageIcon("canada.jpg"),
	new ImageIcon("espania.jpg"),
	new ImageIcon("francia.jpg"),
	new ImageIcon("japon.jpg"),
	new ImageIcon("mexico.jpg")};

	int valor=0;


   	public ComboBoxMejorado() {
 
	    super( "Consulta de países" );

	    JButton detalles = new JButton("ENVIAR!!!");
	    setLayout( new FlowLayout() ); 

	    JPanel panel1 = new JPanel(new GridLayout(1,2));
	    JPanel panel_1 = new JPanel(new GridLayout(2,1,0,20));

      	imagenesJComboBox = new JComboBox( nombres ); // establece JComboBox
 		imagenesJComboBox.setMaximumRowCount( 3 ); // muestra tres filas

 		etiqueta = new JLabel( iconos[ 0 ] ); // muestra el primer icono
 		
 		panel_1.add(imagenesJComboBox);
 		panel_1.add(detalles);
 		panel1.add(panel_1);
 		panel1.add(etiqueta);

 		imagenesJComboBox.addItemListener(
	 	new ItemListener() {
	 	// maneja evento de JComboBox
		public void itemStateChanged( ItemEvent evento) {
	 	// determina si está seleccionada la casilla de verificación
	 	if ( evento.getStateChange() == ItemEvent.SELECTED )
	  		etiqueta.setIcon( iconos[ 
	  		imagenesJComboBox.getSelectedIndex() ] );
	  		valor=imagenesJComboBox.getSelectedIndex();
	  	} // fin del método itemStateChanged
	 	} // fin de la clase interna anónima
	  	); // fin de la llamada a addItemListener
	 
		
		add(panel1); 


		detalles.addActionListener(new ActionListener() {             
        public void actionPerformed(ActionEvent evento) {                                   
            InfoPaises.muestraDetalles(valor);
         }                       
      });    
		
   	} 

}
