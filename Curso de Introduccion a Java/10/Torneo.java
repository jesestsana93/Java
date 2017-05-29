import java.util.Random;
import java.util.Scanner;

public class Torneo {
	
	Random aleatorios = new Random();
	Scanner entrada = new Scanner(System.in);
	String entrenador1, entrenador2;
	int danio=0;
	int eleccion=0;


	public void pelear() {

		Pikachu p = new Pikachu("Pikachu", "electrico", 100);
		Squirtle s = new Squirtle("Squirtle", "agua", 100);
		Snivy sn = new Snivy("Snivy", "hierba", 100);
		Charmander ch = new Charmander("Charmander", "fuego", 100);

		System.out.println("Escribe el nombre del primer entrenador");
		entrenador1=entrada.next();
		System.out.println("Escribe el nombre del segundo entrenador");
		entrenador2=entrada.next();
		//los entrenadores eligen a sus pokemón
		Pokemon[] pokebolas1 = {p,sn};
		Pokemon[] pokebolas1 = new Pokemon[10];
		/*for(int i=0; i<pokebolas1.length; i++) {
			aleatorios=aleatorio.nextInt(101);
			Pokemon a_poner = new Pokemon();
			a_poner = arregloPokemonesExisten[aleatorios];
			pokebolas1[i]= a_poner;
		}*/
		Pokemon[] pokebolas2 = {s,ch};

		System.out.println("Elige a tu pokemón " + entrenador1);
		for(int i=0; i<pokebolas1.length; i++) {
			System.out.println(i + " " + pokebolas1[i]);
		}
		eleccion=entrada.nextInt();
		Pokemon p1 = new Pokemon();
		p1 = pokebolas1[eleccion];
		/*if(p1.nombre=="Pikachu") {
			p1.hablar("PIKA PIIII");
		} else {
			p1.hablar("Snivy");
		}*/

		System.out.println("Elige a tu pokemón " + entrenador2);
		for(int i=0; i<pokebolas2.length; i++) {
			System.out.println(i + " " + pokebolas2[i]);
		}
		eleccion=entrada.nextInt();
		Pokemon p2 = new Pokemon();
		p2 = pokebolas2[eleccion];
		/*if(p1.nombre=="Squirtle") {
			p1.hablar("SQUIIIIRTLE!!");
		} else {
			p1.hablar("CHAR CHAR");
		}*/

		System.out.println("Se enfrentarán " + p1 + " contra " + p2);


		boolean derrotado=false;
		int volado = aleatorios.nextInt(2);
		int contador;
		if(volado==0) {
			contador=0;
		} else {
			contador=1;
		}

		do {
			int ataque=0;
			if(contador%2==0) {
				System.out.println("Es el turno de " + entrenador1);
				System.out.println("Selecciona el ataque de " + p1.nombre);
				p1.imprimeListaAtaques();
				ataque=entrada.nextInt();
				danio=p1.seleccionaAtaque(ataque, p2);
				p2.energia-=danio;
			} else {

				System.out.println("Es el turno de " + entrenador2);
				System.out.println("Selecciona el ataque de " + p2.nombre);
				p2.imprimeListaAtaques();
				ataque=entrada.nextInt();
				danio=p2.seleccionaAtaque(ataque, p1);
				p1.energia-=danio;
				
			}
			if(p1.energia<=0 || p2.energia<=0) {
				derrotado=true;
			}
			System.out.println(p1);
			System.out.println(p2);
			contador++;
		}while(derrotado==false);
		if(p1.energia>0) {
			System.out.println("Ganó " + p1.nombre);
		}
		if(p2.energia>0) {
			System.out.println("Ganó " + p2.nombre);
		}
	}
}
