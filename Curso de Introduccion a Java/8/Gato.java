import java.util.Scanner;
import java.util.Random;

public class Gato {
	
	String[][] gato = new String[3][3];
	Scanner entrada = new Scanner(System.in);
	Random numerosAleatorios = new Random();
	boolean hayGanador=false;
	String jugador1;
	String jugador2;
	int jugada=0;
	int renglon=0;
	int columna=0;
	int contadorGlobal=0;

	public void jugar() {
		for(int i=0; i<gato.length; i++) {
			for(int j=0; j<gato[i].length; j++) {
				gato[i][j]="- ";
			}
		}
		System.out.println("Escribe el nombre del jugador 1:");
		jugador1=entrada.next();
		System.out.println("Escribe el nombre del jugador 2:");
		jugador2=entrada.next();
		int volado = numerosAleatorios.nextInt(2);
		if(volado==0) {
			System.out.println("Va a comenzar a tirar el jugador " + jugador1);
			jugada=0;
		} else {
			System.out.println("Va a comenzar a tirar el jugador " + jugador2);
			jugada=1;
		}
		do {	
			
			if(jugada%2==0) {
				boolean tiroJugador1=false;
				do {
					System.out.println("Elige una posición donde tirar " + jugador1);
					System.out.println("Renglón [0,1,2]: ");
					renglon=entrada.nextInt();
					System.out.println("Columna [0,1,2]: ");
					columna=entrada.nextInt();

					if(gato[renglon][columna].equals("- ")) {
						gato[renglon][columna]="X";
						contadorGlobal++;
						tiroJugador1=true;
					} else {
						System.out.println("Esa casilla ya estaba ocupada :V, intenta de nuevo");
					}
			}while(tiroJugador1==false);
				
			} else {
				boolean tiroJugador2=false;
				do {
					System.out.println("Elige una posición donde tirar " + jugador2);
					System.out.println("Renglón [0,1,2]: ");
					renglon=entrada.nextInt();
					System.out.println("Columna [0,1,2]: ");
					columna=entrada.nextInt();
					if(gato[renglon][columna].equals("- ")) {
						gato[renglon][columna]="O";
						contadorGlobal++;
						tiroJugador2=true;
					} else {
						System.out.println("Esa casilla ya estaba ocupada :V, intenta de nuevo");
					}
				} while(tiroJugador2==false);
			}
			hayGanador=buscaGanador();
			jugada++;
			if(contadorGlobal==9) {
				System.out.println("NO HAY GANADOR");
				hayGanador=true;
			}
			imprimeTablero();
		}while(!hayGanador);
	}

	public void imprimeTablero() {
		for(int i=0; i<gato.length; i++) {
			for(int j=0; j<gato[i].length; j++) {
				System.out.print(gato[i][j]);
			}
			System.out.println();
		}
	}

	public boolean buscaGanador() {
		boolean ganador=false;
		//Bucamos victoria horizontal con iteraciones
		for(int i=0; i<gato.length; i++) {
			int contador=0;
			int contador2=0;
			for(int j=0; j<gato[i].length; j++) {
				if(gato[i][j].equals("X")) {
					contador++;
				}
				if(gato[i][j].equals("O")) {
					contador2++;
				}
			}
			if(contador==3) {
				System.out.println("Ganó el jugador " + jugador1);
				ganador=true;
				break;
			}
			if(contador2==3) {
				System.out.println("Ganó el jugador " + jugador2);
				ganador=true;
				break;
			}
		}

		//Buscamos victoria horizontal
		/*if(gato[0][0].equals("X") && gato[0][1].equals("X") && gato[0][2].equals("X")) {
			System.out.println("Ganó el jugador " + jugador1);
			ganador=true;
		} else if(gato[1][0].equals("X") && gato[1][1].equals("X") && gato[1][2].equals("X")) {
			System.out.println("Ganó el jugador " + jugador1);
			ganador=true;
		} else if(gato[2][0].equals("X") && gato[2][1].equals("X") && gato[2][2].equals("X")) {
			System.out.println("Ganó el jugador " + jugador1);
			ganador=true;
		} else if(gato[0][0].equals("O") && gato[0][1].equals("O") && gato[0][2].equals("O")) {
			System.out.println("Ganó el jugador " + jugador2);
			ganador=true;
		} else if(gato[1][0].equals("O") && gato[1][1].equals("O") && gato[1][2].equals("O")) {
			System.out.println("Ganó el jugador " + jugador2);
			ganador=true;
		} else if(gato[2][0].equals("O") && gato[2][1].equals("O") && gato[2][2].equals("O")) {
			System.out.println("Ganó el jugador " + jugador2);
			ganador=true;*/
		//Buscamos victoria vertical
		if(gato[0][0].equals("X") && gato[1][0].equals("X") && gato[2][0].equals("X")) {
			System.out.println("Ganó el jugador " + jugador1);
			ganador=true;
		} else if(gato[0][1].equals("X") && gato[1][1].equals("X") && gato[2][1].equals("X")) {
			System.out.println("Ganó el jugador " + jugador1);
			ganador=true;
		} else if(gato[0][2].equals("X") && gato[1][2].equals("X") && gato[2][2].equals("X")) {
			System.out.println("Ganó el jugador " + jugador1);
			ganador=true;
		} else if(gato[0][0].equals("O") && gato[1][0].equals("O") && gato[2][0].equals("O")) {
			System.out.println("Ganó el jugador " + jugador2);
			ganador=true;
		} else if(gato[0][1].equals("O") && gato[1][1].equals("O") && gato[2][1].equals("O")) {
			System.out.println("Ganó el jugador " + jugador2);
			ganador=true;
		} else if(gato[0][2].equals("O") && gato[1][2].equals("O") && gato[2][2].equals("O")) {
			System.out.println("Ganó el jugador " + jugador2);
			ganador=true;
		//Bucamos las victorias cruzadas
		} else if(gato[0][0].equals("X") && gato[1][1].equals("X") && gato[2][2].equals("X")) {
			System.out.println("Ganó el jugador " + jugador1);
			ganador=true;
		} else if(gato[2][0].equals("X") && gato[1][1].equals("X") && gato[0][2].equals("X")) {
			System.out.println("Ganó el jugador " + jugador1);
			ganador=true;
		} else if(gato[0][0].equals("O") && gato[1][1].equals("O") && gato[2][2].equals("O")) {
			System.out.println("Ganó el jugador " + jugador2);
			ganador=true;
		} else if(gato[2][0].equals("O") && gato[1][1].equals("O") && gato[0][2].equals("O")) {
			System.out.println("Ganó el jugador " + jugador2);
			ganador=true;
		}
		return ganador;
	}

}