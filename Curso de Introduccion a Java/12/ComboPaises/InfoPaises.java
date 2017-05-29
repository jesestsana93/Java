
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


public class InfoPaises extends JFrame {

  Pais[] arreglo_paises = new Pais[7];

  public InfoPaises() {

    super("Países");
    Pais alemania= new Pais("Alemania", "Berlin", "aleman", "euro", 357168, "alemaniaMundo.jpg");
    Pais argentina = new Pais("Argentina", "Buenos Aires", "español", "peso", 2780400, "argentinaMundo.png");
    Pais canada = new Pais("Canadá", "Ottawa", "inglés y francés", "dólar canadiense", 9984670, "canadaMundo.png");
    Pais espania = new Pais("España", "Madrid", "español", "euro", 504645, "espaniaMundo.jpg");
    Pais francia = new Pais("Francia", "París", "francés", "euro",  675417,"franciaMundo.jpg");
    Pais japon = new Pais("Japón", "Tokio", "japonés", "yen", 377835, "japonMundo.jpg");
    Pais mexico = new Pais("México", "CDMX", "español", "peso", 1964375, "mexicoMundo.jpg");
    arreglo_paises[0]=alemania;
    arreglo_paises[1]=argentina;
    arreglo_paises[2]=canada;
    arreglo_paises[3]=espania;
    arreglo_paises[4]=francia;
    arreglo_paises[5]=japon;
    arreglo_paises[6]=mexico;

  }

  public void verDetalle(int v) {
    JPanel panel = new JPanel(new GridLayout(1,2));
    JPanel panel_1 = new JPanel(new GridLayout(6,1));

    JLabel info1 = new JLabel("Nombre: " + arreglo_paises[v].getNombre());
    JLabel info2 = new JLabel("Capital: " + arreglo_paises[v].getCapital());
    JLabel info3 = new JLabel("Idioma: " + arreglo_paises[v].getIdioma());
    JLabel info4 = new JLabel("Moneda: " + arreglo_paises[v].getMoneda());
    JLabel info5 = new JLabel("Extensión territorial: " + Integer.toString(arreglo_paises[v].getExtension()));
    JLabel info6 = new JLabel("Ubicación geográfica: ");
    
    //Creamos imagen con la imagen de la ubicación
    Icon img = new ImageIcon(arreglo_paises[v].getUbicacion());
    JLabel estampa = new JLabel(img);

    panel_1.add(info1);
    panel_1.add(info2);
    panel_1.add(info3);
    panel_1.add(info4);
    panel_1.add(info5);
    panel_1.add(info6);
      
    panel.add(panel_1);
    panel.add(estampa);

    add(panel);

  }




  public static void muestraDetalles(int valor) {
      InfoPaises ip = new InfoPaises();
      ip.verDetalle(valor);
      //ip.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      ip.setSize( 800, 300 );
      ip.setVisible( true );
      ip.setResizable(false);
  }

}















   