package main;

import java.util.Scanner;

public class Tiktok {
	
	
	public static boolean victoria(char [][] matriz, char simbolo) {
		if (matriz[0][0]==simbolo && matriz[0][1]==simbolo && matriz[0][2]==simbolo) {
		 return true;	
		}
		else if (matriz[0][0]==simbolo && matriz[1][1]==simbolo && matriz[0][2]==simbolo) {
		}
		}
	}
	
	
	
	public static boolean comprobarLibre(int fila, int columna, char [][] tablero) {
		
		if (tablero[fila][columna]== '*') {
			boolean libreOno=true;
			return true;
		}
			else {
				return false;
			}
		
	}
	public static void dibujar(char[][] matriz) {
		for (int i = 0; i < 3; i++) {
			System.out.println("");
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]);
				
			}
			
		}
	}
	public static void main(String[] args) {
		char[][] tablero = new char [3][3];
		int contador = 0;
		int fila = 0 , columna = 0;
		Scanner filau = new Scanner(System.in);
		// ?
		//Scanner columnau = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("");
			for (int j = 0; j < 3; j++) {
				tablero[i][j] = '*';
				
				
			}
		}
		dibujar(tablero);
		System.out.println("");
		do {
			System.out.println("Escribe fila de ficha");
			fila = filau.nextInt();
			System.out.println("Escribe columna para ficha ");
			columna = filau.nextInt();
			contador = contador + 1;
			comprobarLibre(fila,columna,tablero);
			if (true) {
				if (contador % 2 != 0) {
					tablero[fila][columna]='X';	
					dibujar(tablero);
					victoria(tablero,'X');
				}
				else {
					tablero[fila][columna]='O';
					dibujar(tablero);
					victoria(tablero,'O');
				}	
				
			}
			}while (contador == 9);
		}
	}
	

