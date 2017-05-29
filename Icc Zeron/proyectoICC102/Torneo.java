import java.util.Scanner;
/**
 * Clase que mostrara el torneo dependiendo del deporte que quiera el
 * usuario simular si y solo si declara en consola 's' para Soccer o 'b' para Basquetbol.
 * @author Jesus Esteban Sanchez Alcantara
 */
public class Torneo{ //Inicia Clase
    public static void main(String[] args){ //Inicia metodo main
	Scanner stdin = new Scanner(System.in);  //Objeto Scanner para leer lo que introduce el usuario
	
	//Declaracion de Variables

	int rondas, partidos, id1, id2, ganador1, ganador2,	perdedor1, perdedor2, empate1, empate2;
	int ganados, perdidos, empatados, total;
	String nomEquipo1, nomEquipo2, nomEquipo, nomEquipoDado;
	int opcion, opcion2;
	int anotacionesEquipo1 = 0;
	int anotacionesEquipo2 = 0;
	int conta = 1;
	
	//Condicional para los parametros en consola y ejecutar si los cumplen
	if(args.length >= 1){
	    System.out.println("Bienvenido al simulador de torneo \nRound-Robin");
	    if(args[0].equals("s")){ //Abre condicional Para Soccer
		    System.out.println("\n***Futbol soccer*** \n Ingresa el numero de equipos:");
		    int numEquiposFut = stdin.nextInt();
		    Liga soccer = new Liga('s',numEquiposFut);
		    int gol1 , gol2;
		    int goles = 0;
		    int goles2 = 0;
		    CalendarioSoccer calendarioFucho = new CalendarioSoccer(0, 0, "", "", 0, 0,
									    0, 0, 0, 0, 0, 0);
		    calendarioFucho.ponRondas(numEquiposFut);
		    calendarioFucho.ponPartidos(numEquiposFut);
		    rondas = calendarioFucho.daRondas();
		    partidos = calendarioFucho.daPartidos();
		    CalendarioSoccer[][] torneoSoccer = new CalendarioSoccer[partidos][rondas];
		    for(int j = 0; j < torneoSoccer.length ; j++){
			System.out.println("\nPartido: " + (j+1));
			for(int k = 0; k < torneoSoccer[j].length; k++){
			    System.out.println("Ronda " + k);
			    if(numEquiposFut % 2 != 0){
				calendarioFucho.ponIdEquipo1(numEquiposFut, k, j+1);
				calendarioFucho.ponIdEquipo2(numEquiposFut, k, j+1);
				id1 = calendarioFucho.daIdEquipo1();
				id2 = calendarioFucho.daIdEquipo2();
				System.out.println("Descansa " + ((Soccer)soccer.daEquipos(k)).daNombreEquipo());
			    }else{
				if(partidos > j+1){	
				    calendarioFucho.ponIdEquipo1(numEquiposFut, k, j+1);
				    calendarioFucho.ponIdEquipo2(numEquiposFut, k, j+1);
				    id1 = calendarioFucho.daIdEquipo1();
				    id2 = calendarioFucho.daIdEquipo2();			    
				}else{
				    id1 = k;
				    id2 = rondas;
				}
			    }
			    //Asignar los goles de cada equipo segun el identificador.
			    ((Soccer)soccer.daEquipos(id1)).ponPuntosGol();
			    ((Soccer)soccer.daEquipos(id2)).ponPuntosGol();

			    //Se da el nombre de cada equipo.
			    nomEquipo1 = ((Soccer)soccer.daEquipos(id1)).daNombreEquipo();
			    nomEquipo2 = ((Soccer)soccer.daEquipos(id2)).daNombreEquipo();
			    
			    //Se da el numero de goles cada equipo. 
			    anotacionesEquipo1 = anotacionesEquipo2 = 0;
			    gol1 = ((Soccer)soccer.daEquipos(id1)).daPuntosGol();
			    anotacionesEquipo1 = gol1;
			    gol2 = ((Soccer)soccer.daEquipos(id2)).daPuntosGol();
			    anotacionesEquipo2 = gol2;
			    
			    //Se asigna el numero de anotaciones a cada equipo.
			    ((Soccer)soccer.daEquipos(id1)).ponAnotaciones(anotacionesEquipo1);
			    ((Soccer)soccer.daEquipos(id2)).ponAnotaciones(anotacionesEquipo2);
			    
			    //Se da el numero de ganados, perdidos y empatados por cada equipo.
			    ganador1 = calendarioFucho.daGanador1(gol1, gol2);
			    ((Soccer)soccer.daEquipos(id1)).ponGanados(ganador1);
			    
			    ganador2 = calendarioFucho.daGanador2(gol2, gol1);
			    ((Soccer)soccer.daEquipos(id2)).ponGanados(ganador2);
			    
			    perdedor1 = calendarioFucho.daPerdedor1(gol1, gol2);
			    ((Soccer)soccer.daEquipos(id1)).ponPerdidos(perdedor1);
			    
			    perdedor2 = calendarioFucho.daPerdedor2(gol2, gol1);
			    ((Soccer)soccer.daEquipos(id2)).ponPerdidos(perdedor2);
			    
			    empate1 = calendarioFucho.daEmpate1(gol1, gol2);
			    ((Soccer)soccer.daEquipos(id1)).ponEmpatados(empate1);
			    
			    empate2 = calendarioFucho.daEmpate2(gol2, gol1);
			    ((Soccer)soccer.daEquipos(id2)).ponEmpatados(empate2);
			    
			    System.out.println("El equipo " + nomEquipo1 + " tuvo un total de " + gol1 + " goles.");
			    System.out.println("El equipo " + nomEquipo2 + " tuvo un total de " + gol2 + " goles.");
			    torneoSoccer[j][k] = new CalendarioSoccer(id1, id2, nomEquipo1, nomEquipo2, gol1, gol2,
								      ganador1, ganador2, perdedor1, perdedor2, 
								      empate1, empate2);
			}
			
		    }		    
		    do{    
			System.out.println("\nIngresa una opcion: \n 1) Imprimir un equipo en particular. \n 2) Tabla de Posiciones. \n 3) Salir");
			opcion2 = stdin.nextInt();
			switch(opcion2){
			case 1:
			    System.out.println("\nIngresa el equipo: ");
			    stdin.skip("\n");
			    nomEquipo = stdin.nextLine();
			    for(int j = 0; j < numEquiposFut; j++){
				nomEquipoDado = ((Soccer)soccer.daEquipos(j)).daNombreEquipo();
				goles = ((Soccer)soccer.daEquipos(j)).daAnotaciones();
				ganados = ((Soccer)soccer.daEquipos(j)).daGanados();
				empatados = ((Soccer)soccer.daEquipos(j)).daEmpatados();
				perdidos = ((Soccer)soccer.daEquipos(j)).daPerdidos();
				total = ganados+empatados+(perdidos*0);
				if(nomEquipo.equals(nomEquipoDado)){
				    System.out.println("El equipo " + nomEquipo + " tuvo un total de " +
						       goles + " anotaciones, " + (ganados/3) + " partidos ganados, " +
						       empatados + " partidos empatados, " + perdidos + " partidos perdidos." +
						       "\nEn total obutvo un total de " + total + " puntos en el torneo.");
				}
			    }
			    break;			
			case 2: 
			    int cont=1;
			    String c="";
			    Equipos[] ordena = new Equipos[numEquiposFut];
			    for(int a = 0;  a < ordena.length; a++) {   
				ordena[a] = (Soccer)soccer.daEquipos(a);
			    }    
			    for(int k = 0; k < ordena.length; k++){
				for(int l = k; l < ordena.length; l++){
				    if(ordena[k].daPuntuacion() < ordena[l].daPuntuacion()){
					Equipos aux = ordena[k];
					ordena[k]= ordena[l];
					ordena[l]= aux;					
				    }
				}
			    }			    
			    for (int k = 0; k < ordena.length; k++) {
				c =cont+".- "+ ordena[k].daNombreEquipo() + "\tPuntos "+ordena[k].daPuntuacion();
				System.out.println(c);	
				cont++;		    
			    }			
			    break;			
			case 3:			
			    System.out.println("Fue un placer atenderle");
			    break;			
			default:
			    System.out.println("Opcion incorrecta");
			    break;
			    
			}//switch
		    }while(opcion2 != 3);
		    //Cierra condicional para Soccer
		}else{		
		if(args[0].equals("b"))
		    {   //Abre condicional para Basquetbol			
			System.out.println("\n***Basquetbol*** \n Ingresa el numero de equipos:");
			int numEquiposBasquet = stdin.nextInt();
			Liga basquet = new Liga('b', numEquiposBasquet);
			int canasta1, canasta2, tiroTres1, tiroTres2, tiroLibre1, tiroLibre2;
			int canastas;
			CalendarioBasquet calendarioBas = new CalendarioBasquet(0, 0, "", "", 0, 0, 0, 0, 0, 0,
										0, 0, 0, 0, 0, 0);
			calendarioBas.ponRondas(numEquiposBasquet);
			calendarioBas.ponPartidos(numEquiposBasquet);
			rondas = calendarioBas.daRondas();
			partidos = calendarioBas.daPartidos();
			CalendarioBasquet[][] torneoBasquet = new CalendarioBasquet[partidos][rondas];
			for(int j = 0; j < torneoBasquet.length ; j++){
			    System.out.println("\nPartido: " + (j+1));
			    for(int k = 0; k < torneoBasquet[j].length; k++){
				System.out.println("Ronda " + k);
				if(numEquiposBasquet % 2 != 0){
				    calendarioBas.ponIdEquipo1(numEquiposBasquet, k, j+1);
				    calendarioBas.ponIdEquipo2(numEquiposBasquet, k, j+1);
				    id1 = calendarioBas.daIdEquipo1();
				    id2 = calendarioBas.daIdEquipo2();
				    System.out.println("Descansa " + ((Basquet)basquet.daEquipos(k)).daNombreEquipo());
				}else{
				    if(partidos > j+1){	
					calendarioBas.ponIdEquipo1(numEquiposBasquet, k, j+1);
					calendarioBas.ponIdEquipo2(numEquiposBasquet, k, j+1);
					id1 = calendarioBas.daIdEquipo1();
					id2 = calendarioBas.daIdEquipo2();			    
				    }else{
					id1 = k;
					id2 = rondas;
				    }
				}
				//Se dan los tiros de cada equipo
				((Basquet)basquet.daEquipos(id1)).ponPuntosCanasta();
				((Basquet)basquet.daEquipos(id1)).ponPuntosTiroLibre();
				((Basquet)basquet.daEquipos(id1)).ponPuntosTiroTres();
				
				((Basquet)basquet.daEquipos(id2)).ponPuntosCanasta();
				((Basquet)basquet.daEquipos(id2)).ponPuntosTiroLibre();
				((Basquet)basquet.daEquipos(id2)).ponPuntosTiroTres();
				
				//Se dan los nombres
				nomEquipo1 = ((Basquet)basquet.daEquipos(id1)).daNombreEquipo();
				nomEquipo2 = ((Basquet)basquet.daEquipos(id2)).daNombreEquipo();
				
				//Se asignan las anotaciones
				anotacionesEquipo1 = anotacionesEquipo2 = 0;
				canasta1 = ((Basquet)basquet.daEquipos(id1)).daPuntosCanasta();
				
				tiroTres1 = ((Basquet)basquet.daEquipos(id2)).daPuntosTiroTres();
				tiroLibre1 = ((Basquet)basquet.daEquipos(id2)).daPuntosTiroLibre();
				
				anotacionesEquipo1 = (canasta1+tiroTres1+tiroLibre1);
				canasta2 = ((Basquet)basquet.daEquipos(id2)).daPuntosCanasta();
				
				tiroTres2 = ((Basquet)basquet.daEquipos(id2)).daPuntosTiroTres();
				tiroLibre2 = ((Basquet)basquet.daEquipos(id2)).daPuntosTiroLibre();
				anotacionesEquipo2 = (canasta2+tiroTres2+tiroLibre2);
				
				//Se asigna el numero de anotaciones de cada equipo
				((Basquet)basquet.daEquipos(id1)).ponAnotaciones(anotacionesEquipo1);
				((Basquet)basquet.daEquipos(id2)).ponAnotaciones(anotacionesEquipo2);
				
				//Se da el numero de veces ganadas, perididas y empatadas de cada equipo.
				ganador1 = calendarioBas.daGanador1(anotacionesEquipo1, anotacionesEquipo2);
				((Basquet)basquet.daEquipos(id1)).ponGanados(ganador1);
				
				ganador2 = calendarioBas.daGanador2(anotacionesEquipo1, anotacionesEquipo2);
				((Basquet)basquet.daEquipos(id1)).ponGanados(ganador2);
				
				perdedor1 = calendarioBas.daPerdedor1(anotacionesEquipo1, anotacionesEquipo2);
				((Basquet)basquet.daEquipos(id1)).ponPerdidos(perdedor1);
				
				perdedor2 = calendarioBas.daPerdedor2(anotacionesEquipo1, anotacionesEquipo2);
				((Basquet)basquet.daEquipos(id1)).ponPerdidos(perdedor2);
				
				empate1 = calendarioBas.daEmpate1(anotacionesEquipo1, anotacionesEquipo2);
				((Basquet)basquet.daEquipos(id1)).ponEmpatados(empate1);
				
				empate2 = calendarioBas.daEmpate2(anotacionesEquipo1, anotacionesEquipo2);
				((Basquet)basquet.daEquipos(id2)).ponEmpatados(empate2);
				
				System.out.println("El equipo " + nomEquipo1 + " tuvo un total de " + canasta1 + " canastas, "
						   + tiroTres1 + " tiros de tres puntos " + tiroLibre1 + " tiros libres.");
				System.out.println("El equipo " + nomEquipo2 + " tuvo un total de " + canasta2 + " canastas, "
						   + tiroTres2 + " tiro de tres puntos " + tiroLibre2 + " tiros libres.");
				torneoBasquet[j][k] = new CalendarioBasquet(id1, id2, nomEquipo1, nomEquipo2, canasta1, canasta2,
									    tiroTres1, tiroTres2, tiroLibre1, tiroLibre2,
									    ganador1, ganador2, perdedor1, perdedor2, 
									    empate1, empate2);
			    }
			}
			do{
			    System.out.println("\nIngresa una opcion: \n 1) Imprimir un equipo en particular.\n 2) Tabla de Posiciones.\n 3) Salir");
			    opcion2 = stdin.nextInt();			    
			    switch(opcion2){				
			    case 1:
				System.out.println("\nIngresa el equipo: ");
				stdin.skip("\n");
				nomEquipo = stdin.nextLine();
				for(int j = 0; j < numEquiposBasquet; j++){
				    nomEquipoDado = ((Basquet)basquet.daEquipos(j)).daNombreEquipo();
				    canastas = ((Basquet)basquet.daEquipos(j)).daAnotaciones();
				    ganados = ((Basquet)basquet.daEquipos(j)).daGanados();
				    empatados = ((Basquet)basquet.daEquipos(j)).daEmpatados();
				    perdidos = ((Basquet)basquet.daEquipos(j)).daPerdidos();
				    total = ganados+empatados+(perdidos*0);				    
				    if(nomEquipo.equals(nomEquipoDado)){
					System.out.println("El equipo " + nomEquipo + " tuvo un total de " +
							   canastas + " anotaciones, " + (ganados/3) + " partidos ganados, " +
							   empatados + " partidos empatados, " + perdidos + " partidos perdidos." +
							   "\nEn total obutvo un total de " + total + " puntos en el torneo.");
				    }
				}
				break;				
			    case 2: 
				int cont=1;
				String c="";
				Equipos[] ordena = new Equipos[numEquiposBasquet];
				for(int a = 0;  a < ordena.length; a++) {
				    ordena[a] = (Basquet)basquet.daEquipos(a);
				}
				for(int k = 0; k < ordena.length; k++){
				    for(int l = k; l < ordena.length;  l++){
					if( ordena[k].daPuntuacion() < ordena[l].daPuntuacion()){
					    Equipos aux = ordena[k];
					    ordena[k]= ordena[l];
					    ordena[l]= aux;
					}
				    }				    
				}
				for (int k = 0; k < ordena.length; k++) {
				    c =cont+".- "+ ordena[k].daNombreEquipo() + "\tPuntos "+ordena[k].daPuntuacion();
				    System.out.println(c);	
				    cont++;		    
				}				
				break;				
			    case 3:			
				System.out.println("Fue un gusto servirle, vuelva pronto.");
				break;				
			    default:
				System.out.println("Opcion Incorrecta");
				break;
			    } //switch opcion2
			}while(opcion2 != 3);			
			//Cierra condicional para Basquetbol
		    }else{
		    System.out.println("Numero de argumentos invalido, la escritura es: \n java Torneo -opcion donde opcion es s para futbol soccer, o b para basquetbol \n\tEs decir \nSoccer :  javac Torneo s \nBasquetbol  :  javac b");
		} //else anidado		
	    }//else	    
	}else{ //Cierra condicional para los parametros en Consola 
	    System.out.println("Numero de argumentos invalido, la escritura es: \n java Torneo -opcion donde opcion es s para futbol soccer, o b para basquetbol \n\tEs decir \nSoccer :  java Torneo s \nBasquetbol  :  java Torneo b");
	}
    } //fin main
} //Fin Clase
