package main;

import java.util.Random;
import java.util.Scanner;

import claseMain.Arquero;
import claseMain.Paladin;
import claseMain.Clases;

/*
 * IMPORTAR LAS CLASES:
 * 
 * 
 * 
 * 
 */


public class mainJuego {

	public static void main(String[] args) {
		// creación de objetos.
		//
		Scanner ScannerInt1 = new Scanner(System.in);
		Arquero arquero = new Arquero();
		arquero.arqueroStats();
		Paladin paladin = new Paladin();
		paladin.paladinStats();
		
		System.out.println("BIENVENIDO A UN JUEGO  DE UBISOFT");
		
		System.out.println("###################################");
		System.out.println("##     SELECCIÓN PERSONAJE 1     ##");
		System.out.println("###################################");
		int opcionPersonaje = 0;
		int opcionPersonaje2 = 0;
		// Menú de selección para el jugador 1:
		
		while(opcionPersonaje > 4 || opcionPersonaje <= 0 ) {
		System.out.println("1. Paladín");
		System.out.println("2. Asesino");
		System.out.println("3. Arquero");
		System.out.println("4. Mago");
		// String userName = myObj.nextLine();
		opcionPersonaje = ScannerInt1.nextInt();
		
		
		switch (opcionPersonaje) {
		case 1: 
			Paladin paladin1 = new Paladin();
			paladin1.paladinStats();
			System.out.println(paladin1.toString());
			Paladin paladinJugador1 = new Paladin();
			// Se llama al paladin
			// Se crea el objeto.
			
			break;
		case 2:
			// Se llama al asesino
			// Se crea al objeto.
			break;
		case 3:
			Arquero arquero1 = new Arquero();
			arquero1.arqueroStats();
			System.out.println(arquero1.toString());
			Arquero arqueroJugador1 = new Arquero();
			// Se llama al asesino
			// Se crea el objeto.
			break;
		case 4:
			// Se llama al mago
			// Se crea el objeto.
			System.out.println("Esta clase no está disponible");
			break;
		default:
			System.out.println("Esa opcíon no existe, pero existirá :)");
			break;
		
			}
		
		}
		
		System.out.println("###################################");
		System.out.println("##     SELECCIÓN PERSONAJE 2     ##");
		System.out.println("###################################");
		
		// Menú de selección para el jugador 2:
		
		do {
			System.out.println("1. Paladín");
			System.out.println("2. Asesino");
			System.out.println("3. Arquero");
			System.out.println("4. Mago");
			// String userName = myObj.nextLine();
			do {
				opcionPersonaje2 = ScannerInt1.nextInt();
				if (opcionPersonaje == opcionPersonaje2) {
					System.out.println("No se puede repetir! Lo sentimos está fuera de nuestras capacidades :(");
					System.out.println("1. Paladín");
					System.out.println("2. Asesino");
					System.out.println("3. Arquero");
					System.out.println("4. Mago");
				}
				
			}while(opcionPersonaje2 == opcionPersonaje);
			
			
			
			switch (opcionPersonaje2) {
			case 1:
				System.out.println(paladin.toString());
				// Se llama a paladín 
				// Se crea el objeto.
				break;
			case 2:
				// Se llama al asesino
				// Se crea al objeto.
				break;
			case 3:
				System.out.println(arquero.toString());
				
				break;
			case 4:
				// Se llama al mago
				// Se crea el objeto.
				break;
			default:
				System.out.println("Esa opcíon no existe, pero existirá :)");
				break;
			
				}
			
			}while(opcionPersonaje2 > 4 || opcionPersonaje2 <= 0 );
		
		// Se viene la cumbia.
		
		// Combate, PALADIN VS ARQUERO
		if (opcionPersonaje == 1 && opcionPersonaje2 == 3 || (opcionPersonaje == 3 && opcionPersonaje2 == 1  )) {
			
			int turno = 0;
			int a = 0;
			int b = 0;
			int opcionMenuPersonaje1 = 0;
			 boolean finPartida = false;
			do { a = 0; b = 0;
			System.out.println("-------------");
			System.out.println("-- Paladin --");
			System.out.println("-------------");
			//System.out.println("");
			System.out.println(paladin.statsPaladin());
			System.out.println("############");
			System.out.println("-------------");
			System.out.println("-- Arquero --");
			System.out.println("-------------");
			//System.out.println("");
			System.out.println(arquero.statsArquero());
			System.out.println("");
	            if(turno%2 == 0) {
	                do {
	                	System.out.println("TURNO DEL JUGADOR 1");
	                	System.out.println("-------ESCOGE-------");
	                	System.out.println("-- 1. Atacar -------");
	                	System.out.println("-- 2. Defender -----");
	                	System.out.println("-- 3. Habilidades --");
	                	System.out.println("--------------------");
	                	opcionMenuPersonaje1 = ScannerInt1.nextInt();
	                	
	                	switch (opcionMenuPersonaje1) {
						case 1:
							a = 1;
							System.out.println("¡Levantas tu arma y golpeas!");
							if (paladin.paladinDado()){
								Random r = new Random();
								int Low = 1;
								int High = paladin.getDaño();
								int Result = r.nextInt(High-Low) + Low;
								Result = 26 - Result;
								arquero.setVida( arquero.getVida() - Result);
								if (Result <= 0) {
									System.err.println("No le has hecho daño.");
								}else {
								System.err.println("Has hecho: " + Result + " puntos de daño!");
									  }
							}else {
								System.err.println("Tu golpe ha fallado!");
								
							}
							break;
						case 2:
							a = 1;
							// Faltan sus getters y setters ojo.
							paladin.setDefensa( paladin.getDefensa() + 5);
							System.err.println("Aumentas tu defensa, se queda en: " + paladin.getDefensa());
							break;	
							
						case 3:
							a = 1;
							System.out.println(" -- 3. Habilidades ------");
							System.out.println("  	- 1. Cura       pm: 50  ");
							System.out.println("    - 2. Juicio     pm: 40 ");
							System.out.println("    - 3. Iron skin  pm: 50 ");
							System.out.println("    - 4. Veredicto  pm: 200");
							System.out.println(" -- ----------------- ---");
							int seleccHabilidad = ScannerInt1.nextInt();
							
							switch (seleccHabilidad) {
							case 1:
								if (paladin.getEnergia() - 50 < 0) {
									System.out.println("No te quedan PM!");
								}else
								paladin.paladinCura();
								System.err.println("Te curas, ahora tienes " + paladin.getVida() + " puntos de vida");
								a = 1;
								break;	
							case 2:
								int variable1 = paladin.paladinJuicio();
								System.err.println(" Juzgas a tu enemigo (mañana hay juicio) " + (variable1 - 26) +" puntos de daño." );
								arquero.setVida( arquero.getVida()-(paladin.paladinJuicio()-26));
								a = 1;
								break;
							case 3:
								System.err.println(" Tu piel se recubre de una luz reconfortante" );
								paladin.paladinIronSkin();
								System.err.println(" Tu defensa ahora es de: " + paladin.getDefensa());
								a = 1;
								break;
							case 4:	
								System.err.println(" La espada se ilumina, y golpea, causa: " + (paladin.paladinVeredicto() - 26) + " puntos de daño.");
								int variable2 = paladin.paladinVeredicto();
								arquero.setVida( arquero.getVida()-(variable2 -26));
								a = 1;
								
							default:
								break;
							}
						break;	

					default:
						System.out.println("Introduce una opción correcta");
						break;	
							
						}              	
	                	//contador que acaba el turno
	                }while(a != 1);
	                
	            }else {
	                do {
	                    // cosas jugador 2
	                	System.out.println("TURNO DEL JUGADOR 2");
	                	System.out.println("-------ESCOGE-------");
	                	System.out.println("-- 1. Atacar -------");
	                	System.out.println("-- 2. Defender -----");
	                	System.out.println("-- 3. Habilidades --");
	                	System.out.println("--------------------");
	                	opcionMenuPersonaje1 = ScannerInt1.nextInt();
	                	
	                	switch (opcionMenuPersonaje1) {
						case 1:
							b = 1;
							if (arquero.arqueroDado()){
								System.out.println("Apuntas con tu arco y disparas!!");
								Random r = new Random();
								int Low = 1;
								int High = arquero.getDaño();
								int Result = r.nextInt(High-Low) + Low;
								Result = 40 - Result;
								//paladin.setVida( paladin.getVida() - Result);
								if (Result <= 0) {
									System.err.println("No le has hecho daño.");
								}else {
									paladin.setVida( paladin.getVida() - Result);
								System.err.println("Has hecho: " + Result + " puntos de daño!");
								  }	
												
	                	}else {
	                		System.err.println("Has fallado tu golpe!");
	                	}
							break;
						case 2:
							b = 1;
							// Faltan sus getters y setters ojo.
							
							arquero.setDefensa( arquero.getDefensa() + 3);
							System.err.println("Aumentas tu defensa, se queda en: " + arquero.getDefensa());
							break;	
							
						case 3:
							b = 1;
							System.out.println(" -- 3. Habilidades -----");
							System.out.println("    - 1. Tiro doble   --");
							System.out.println("    - 2. PowerShot    --");
							System.out.println("    - 3. Aumenta Daño --");
							System.out.println("    - 4. Salto        --");
							System.out.println(" -- ----------------- --");
							int seleccHabilidad = ScannerInt1.nextInt();
							
							switch (seleccHabilidad) {
							case 1:
								b = 1;
								int daño;
								daño = arquero.arqueroDoubleShot();
								
								
								
								
								if ( daño <44) {
									System.err.println("Se te caen las flechas! No has sabido usar tiro doble y realizas la mitad del daño: " + daño);
									paladin.setVida(paladin.getVida() - daño );
								}else {
									int variable3 = arquero.arqueroDoubleShot();
									System.err.println("BUEN DISPARO! estás hecho un maestro, disparas tus dos flechas causando " + variable3 + " daño" );
									paladin.setVida(paladin.getVida() - daño );
								}
								break;	
							case 2:
								b = 1;
								arquero.arqueroPowerShot();
								System.err.println("Disparas un potente disparo realizando " + (arquero.arqueroDoubleShot() - paladin.getDefensa()) + " daño");
								arquero.setVida( arquero.getVida()-(paladin.paladinJuicio()-26));
								break;
							case 3:
								b = 1;
								arquero.arqueroLetal();
								System.err.println("Tu daño se incrementa en 5!");
								break;
							case 4:
								b = 1;
								if (!arquero.arqueroSalto()) {
									System.err.println("No has conseguido llegar suficientemente lejos!");
								}else {
									System.err.println("VAYA SALTO!! CONSIGUES ALEJARTE DE EL Y TENER OTRO TURNO");
									turno = turno + 1;
									
								}
							default:
								break;
							}

					default:
						System.out.println("Introduce una opción correcta");
						break;	
							
						}  
	          
	                	b = 1;
	                }while(b != 1);
	            }//fin else
	            turno = turno + 1;
				}while(arquero.arqueroMuerte() != true && (paladin.paladinMuerte() != true));// bucle main
				if (paladin.paladinMuerte() != false) {
					System.err.println("Arquero gana! enhorabuena!");
				}else {
					System.err.println("El paladin gana! enhorabuena!");
				}
			
			
		} // el if de combate paladin vs arquero.
		
		
		
		
		// PASTEADA DEL MENU HABILIDADES ARQUERO.
		/*
		 * System.out.println(" -- 3. Habilidades -----");
							System.out.println("  - 1. Disparo Potente -");
							System.out.println("  - 2. Tiro Doble      -");
							System.out.println(" -----------------------");
							int seleccHabilidad = ScannerInt1.nextInt();
							
							switch (seleccHabilidad) {
							case 1:
								System.out.println("¡Tensas el arco a máxima a potencia y...");
								arquero.arqueroShot();
								
								break;

							default:
								break;
							}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	} // el main ojo cuidao
}	// la clase.
