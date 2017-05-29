import javax.swing.JFrame;

public class UsoGato {

   public static void main( String args[] ) { 

      Gato g = new Gato();  
      g.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      g.setSize( 300, 150 ); 
      g.setVisible( true ); 
   }
}
