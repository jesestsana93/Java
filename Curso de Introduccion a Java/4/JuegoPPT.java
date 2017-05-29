import java.util.Random;
import java.util.Scanner;

public class JuegoPPT {
	
	String tiradaM;
	
	public void juega() {

		Random aleatorios = new Random();
		Scanner entrada = new Scanner(System.in);
		int tiradaJugador=0;
		
		do {
			int tiradaMaquina=aleatorios.nextInt(3)+1;
	
			if(tiradaMaquina==1) {
				tiradaM="PIEDRA";
			} else if(tiradaMaquina==2) {
				tiradaM="PAPEL";
			} else {
				tiradaM="TIJERAS";
			}
			System.out.println("Bienvenido al juego de piedra, papel o tijeras");
			System.out.println("Elije una opción");
			System.out.println("1. PIEDRA");
			System.out.println("2. PAPEL");
			System.out.println("3. TIJERAS");
			System.out.println("4. Salir");
			tiradaJugador=entrada.nextInt();
			if(tiradaJugador!=4) {
				comparaTiradas(tiradaMaquina, tiradaJugador);
			}
			

		} while(tiradaJugador!=4);
		System.out.println("Hasta pronto gracias por jugar");

	}

	public void comparaTiradas(int tm, int tj) {
		System.out.println("La máquina tiró " + tiradaM );
		if(tm == tj ) {
			System.out.println("EMPATE");
		} else if(tm==1) { //la máquina selecciono piedra
			if(tj==2) {
				System.out.println("GANASTE");
			} 
			if(tj==3) {
				System.out.println("PERDISTE");
			}
		} else if(tm==2) { //la máquina seleccionó papel
			if(tj==1) {
				System.out.println("PERDISTE");
			} 
			if(tj==3) {
				System.out.println("GANASTE");
			}
		} else { //la máquina seleccionó tijeras
			if(tj==1) {
				System.out.println("GANASTE");
			} 
			if(tj==2) {
				System.out.println("PERDISTE");
			}
		}

	}

}
