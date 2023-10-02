package loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main (String[] args) {
		/*
		 * While. E, ciclo ehile ejecuta continuamnte un bloque de codigo hasta que se cumpla
		 * While (expresion){
		 *   //Bloque de codigo a ejecutar
		 *   (contador - iterador)
		 *   }
		 * */
		
		int cuenta = 0;
		while (cuenta < 10) {
			cuenta ++;
			System.out.println("La cuenta es de  " + cuenta);
		}
		
		/*Crear un programa que solicite al usuario un numero, dicho numero sera tomado como el numero final de una cuenta. Dicha cuenta inciia en 1. Debe mostrar en consola la cuenta del 1 hasta el numero proporcionado. 
		 1.- Importa un scanner e implementarlo
		 2.- Un mensaje para darle contxto al suario
		 3.- Almacenar el numero del usuario en una variable
		 4.- Guardar en variable el numero que inicia la cuenta (1)
		 5.- Implementar un ciclo while
		 6.- Mostrar por consola el resultado
		 * */
		
		// 1.- Crear e importar el scanner
		Scanner scanner = new Scanner(System.in);
		// 2.-
		System.out.println("Escribe un numero que servira como numero final de una cuenta ");
		// 3.-
		int numFinal = scanner.nextInt();
		// 4.-
		int  numInicial = 1;
		// 5.-
		while (numInicial <= numFinal) {
			System.out.println("La cuenta va en " + numInicial);
			numInicial++;
		}
		
		scanner.close();
		
		
		
	}
}
