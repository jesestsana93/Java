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
import java.awt.event.*;


public class Gato extends JFrame   {

	int[][] gato = new int[3][3];
	String valorj1, valorj2, valorj3;
	String valorj4, valorj5, valorj6;
	String valorj7, valorj8, valorj9;
	
   	public Gato() {
 
	    super( "Gato" );
 		JPanel panel = new JPanel(new GridLayout(3,3,5,5));

	    setLayout( new FlowLayout() ); 
		JTextArea j1 = new JTextArea(2,3);
		JTextArea j2 = new JTextArea(2,3);
		JTextArea j3 = new JTextArea(2,3);
		JTextArea j4 = new JTextArea(2,3);
		JTextArea j5 = new JTextArea(2,3);
		JTextArea j6 = new JTextArea(2,3);
		JTextArea j7 = new JTextArea(2,3);
		JTextArea j8 = new JTextArea(2,3);
		JTextArea j9 = new JTextArea(2,3);

		panel.add(j1);
		panel.add(j2);
		panel.add(j3);
		panel.add(j4);
		panel.add(j5);
		panel.add(j6);
		panel.add(j7);
		panel.add(j8);
		panel.add(j9);
		j1.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				System.out.println("activo");			
			}
			public void focusLost(FocusEvent e) {
			   	System.out.println("inactivo");
			   	valorj1 =j1.getText();
			   	
			   	if(valorj1.equals("X")) {
			   		gato[0][0]=1;
			   	} else if(valorj1.equals("O")) {
			   		gato[0][0]=2;
			   	} else {
			   		gato[0][0]=0;
			   	}
			   		
			   	revisaGato();
			}

		});
		j2.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				System.out.println("activo");			
			}
			public void focusLost(FocusEvent e) {
			   System.out.println("inactivo");
			   
			   	valorj2=j2.getText();
		   
			   	if(valorj2.equals("X")) {
			   		gato[0][1]=1;
			   	} else if(valorj2.equals("O")) {
			   		gato[0][1]=2;
			   	} else {
			   		gato[0][1]=0;
			   	}
			   	revisaGato();
			}

		});
		j3.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				System.out.println("activo");			
			}
			public void focusLost(FocusEvent e) {
			   System.out.println("inactivo");
			  
			   	valorj3=j3.getText();
			   
			   
			   	if(valorj3.equals("X")) {
			   		gato[0][2]=1;
			   	} else if(valorj3.equals("O")) {
			   		gato[0][2]=2;
			   	} else {
			   		gato[0][2]=0;
			   	}
			   	revisaGato();
			}

		});
		j4.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				System.out.println("activo");			
			}
			public void focusLost(FocusEvent e) {
			   System.out.println("inactivo");
			   	valorj4=j4.getText();
			   
			   
			   	if(valorj4.equals("X")) {
			   		gato[1][0]=1;
			   	} else if(valorj4.equals("O")) {
			   		gato[1][0]=2;
			   	} else {
			   		gato[1][0]=0;
			   	}
			   	revisaGato();
			}

		});
		j5.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				System.out.println("activo");			
			}
			public void focusLost(FocusEvent e) {
			   System.out.println("inactivo");
			   System.out.println("inactivo");
			   
			   	valorj5=j5.getText();
			   	
			   	if(valorj5.equals("X")) {
			   		gato[1][1]=1;
			   	} else if(valorj5.equals("O")) {
			   		gato[1][1]=2;
			   	} else {
			   		gato[1][1]=0;
			   	}
			   	revisaGato();
			}

		});
		j6.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				System.out.println("activo");			
			}
			public void focusLost(FocusEvent e) {
			   System.out.println("inactivo");
			   System.out.println("inactivo");
			   
			   	valorj6=j6.getText();
			  	
			   	
			   	if(valorj6.equals("X")) {
			   		gato[1][2]=1;
			   	} else if(valorj6.equals("O")) {
			   		gato[1][2]=2;
			   	} else {
			   		gato[1][2]=0;
			   	}
			   	revisaGato(); 	
			  
			}

		});
		j7.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				System.out.println("activo");			
			}
			public void focusLost(FocusEvent e) {
			   System.out.println("inactivo");
			   System.out.println("inactivo");
			   	valorj7=j7.getText();
			  	
			   	
			   	if(valorj7.equals("X")) {
			   		gato[2][0]=1;
			   	} else if(valorj7.equals("O")) {
			   		gato[2][0]=2;
			   	} else {
			   		gato[2][0]=0;
			   	}
			   	revisaGato(); 	
			}

		});
		j8.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				System.out.println("activo");			
			}
			public void focusLost(FocusEvent e) {
			   System.out.println("inactivo");
			   System.out.println("inactivo");
			   
			   	valorj8=j8.getText();
			   
			   	
			   	if(valorj8.equals("X")) {
			   		gato[2][1]=1;
			   	} else if(valorj8.equals("O")) {
			   		gato[2][1]=2;
			   	} else {
			   		gato[2][1]=0;
			   	}
			   	revisaGato(); 
			}

		});
		j9.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				System.out.println("activo");			
			}
			public void focusLost(FocusEvent e) {
			   System.out.println("inactivo");
			   System.out.println("inactivo");
			  
			   	valorj9=j9.getText();
			   
			   	
			   	if(valorj9.equals("X")) {
			   		gato[2][2]=1;
			   	} else if(valorj9.equals("O")) {
			   		gato[2][2]=2;
			   	} else {
			   		gato[2][2]=0;
			   	}
			   	revisaGato(); 
			}

		});


	   

      	add(panel);
		
   	} 

   	public void revisaGato() {
   		
   		boolean ganadorX=false;
   		boolean ganadorO=false;

   		for(int elem[] : gato) {
   			for(int val: elem) {
   				System.out.print(val);
   			}
   			System.out.println();
   		}



   		if(gato[0][0]==1&&gato[0][1]==1&&gato[0][2]==1) {
   			ganadorX=true;
   		} else if(gato[0][0]==2&&gato[0][1]==2&&gato[0][2]==2) {
   			ganadorO=true;
   		}

   		if(gato[1][0]==1&&gato[1][1]==1&&gato[1][2]==1) {
   			ganadorX=true;
   		} else if(gato[1][0]==2&&gato[1][1]==2&&gato[1][2]==2) {
   			ganadorO=true;
   		}

   		if(gato[2][0]==1&&gato[2][1]==1&&gato[2][2]==1) {
   			ganadorX=true;	
   		} else if(gato[2][0]==2&&gato[2][1]==2&&gato[2][2]==2){
   			ganadorO=true;
   		}
   		if(gato[0][0]==1&&gato[1][0]==1&&gato[2][0]==1) {
   			ganadorX=true;
   		} else if(gato[0][0]==2&&gato[1][0]==2&&gato[2][0]==2) {
   			ganadorO=true;
   		}
   		if(gato[0][1]==1&&gato[1][1]==1&&gato[2][1]==1) {
   			ganadorX=true;
   		} else if(gato[0][1]==2&&gato[1][1]==2&&gato[2][1]==2) {
   			ganadorO=true;
   		}
   		if(gato[2][0]==1&&gato[2][1]==1&&gato[2][2]==1) {
   			ganadorX=true;
   		} else if(gato[2][0]==1&&gato[2][1]==1&&gato[2][2]==1){
   			ganadorO=true;
   		}
   		if(gato[0][0]==1&&gato[1][1]==1&&gato[2][2]==1) {
   			ganadorX=true;
   		} else if(gato[0][0]==2&&gato[1][1]==2&&gato[2][2]==2) {
   			ganadorO=true;
   		}

   		if(gato[0][2]==1&&gato[1][1]==1&&gato[2][0]==1) {
   			ganadorX=true;
   		} else if(gato[0][2]==2&&gato[1][1]==2&&gato[2][0]==2){
   			ganadorO=true;
   		}
   		
   		if(ganadorX) {
   			JOptionPane.showMessageDialog(this,"Ganador X");
			System.exit(1);
   		} 

   		if(ganadorO) {
   			JOptionPane.showMessageDialog(this,"Ganador O");
			System.exit(1);
   		} 
   	}

}
