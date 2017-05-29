/* Ejercicio de GUI
 * Clase que mediante el uso de cuadros de diálogo, suma dos enteros
 * @author: Cinthia Rodríguez Maya
 */
import javax.swing.JOptionPane;

public class SumaCuadrosDialogo {

	public static void main(String[] args) {

		//Pide al usuario que escriba los valores a sumar
		String valor1 = JOptionPane.showInputDialog("Suma de dos enteros\nEscribe el primer valor a sumar");
			
		String valor2 = JOptionPane.showInputDialog("Escribe el segundo valor a sumar");
					
		//Realizamos la suma
		int a = Integer.parseInt(valor1);
		int b = Integer.parseInt(valor2);
		int suma = a+b;

		//Mostramos la suma por la ventana
		JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + suma);	

		if(suma>10) {
			JOptionPane.showMessageDialog(null,"La suma es mayor que 10" );
		}
		
		int i=1;
		while(i<=5) {
			JOptionPane.showMessageDialog(null,"La variable i tiene el valor: " + i);
			i++;	
		}

	

	}


}

