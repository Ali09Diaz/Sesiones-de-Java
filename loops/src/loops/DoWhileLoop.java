package loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main (String [] args) {
		/*
		 * Do While. Evaluan su expresion en la parte inferior del ciclo, por lo tanto las declaraciones dentro del bloque "do" siempre se ejecutan por lo menos una vez
		 * */
		
		//Cuenta del 1 al 10 
		int cuenta = 1;
		do {
			System.out.println(cuenta);
			cuenta ++;
		} while (cuenta < 0); //output:1 (ya que se ejecuto al menos una vez)
		
		/*
		 * Crear un programa para un cajero bancario
		 * - El prpgrama me mostrara 4 opciones
		 * 1.- Consultar saldo
		 * 2.- Ingresar dinero
		 * 3.- Ingresar dinero
		 * 4.- Salir
		 * - Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opcion (un numero)
		 * - Mostrar al usuario la opcion que eligio y permitir que elija otra opcion 
		 * - El usuario puede salir del programa escribiendo 4 (Salir)
		 * */
		
		System.out.println("Bienvenido a TU BANCO, por favor, inrese un numero para continuar:  ");
		System.out.println("1.- Consultar saldo");
		System.out.println("2.- Ingresar dinero");
		System.out.println("3.- Retirar dinero" );
		System.out.println("4.- Salir");
		
		Scanner skner = new Scanner(System.in);
		int opcionSeleccionada;
		
		do {
		opcionSeleccionada= skner.nextInt();
		
		switch(opcionSeleccionada) {
		case 1:
			System.out.println("Consultar saldo");
			break;
		case 2:
			System.out.println("Ingresar dinero");
			break;
		case 3:
			System.out.println("Retirar dinero");
			break;
		case 4: 
			System.out.println("Salir");
			break;
			default:
				System.out.println("Elige una opción válida");
				break;
			}
		}while (opcionSeleccionada!=4);
		
		
		
		
		
		skner.close();
	}
}
