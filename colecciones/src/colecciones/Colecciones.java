package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Colecciones {

	public static void main(String[] args) {
		
		//Array
		//Tipo de datos del array, nombre, instancia de objeto arreglo, los datos
		String[] listaDeCompras = new String[] {"Leche", "Pan", "Huevos"};
		
		System.out.println(listaDeCompras);
		
		//Imprimir info de listaDeCompras con un forEach
		//Para e dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir 
		/*for(String productoAImprimir : listaDeCompras) {
			System.out.println(productoAImprimir);
		}//forEach*/
		
		
		
		
		//Implementacion de un arrayList
		//Clase Genera (interfaz), tipo de dato que usaré, nombre de mí estructura de datos, instancia de dicha clase general
		List<String> listaDeContactos = new ArrayList<> ();
		
		//Agrego elementos de tipo String a mi arrayList llamado listaDeContactos
		listaDeContactos.add("Felipe");
		listaDeContactos.add("Roberto");
		listaDeContactos.add("Alicia");
		listaDeContactos.add("Fatima");
		
		//Obtener un elemento de a lista - asignarlo a una variable
		String datoFelipe = listaDeContactos.get(0);
		
		System.out.println(datoFelipe);
		


		
	}//metodo main 
	
	
}//Colecciones



/*
 * Colecciones
 * 
 * 
 * 	- Arrays (arreglos)
 * 
 * Es una estructura de datos lineal que contiene del mismo tipo. Los elementos estan almacenados de forma contigua (uno a ado de otro), y se pueden acceder a ellos a traves de un indice Las principales caracteristicas de un array son:
 * 
 * 		- Es una estructura de datos fija, generalmente almacena datos de mismo tipo
 * 		- La longitud de un array se establece al momento de crearo, y no cambia.
 * 		- Podemos acceder a elementos por medio de indice
 * 		- Los arrays pueden contener datos primitivos y objetos
 * 		- No proporcionan metodos adicionales para agregar o eliminar elementos
 * 
 * Un ejemplo de array es una lista de compras del supermercado
 * 
 * 
 * -ArrayList
 * 
 * Es una implementacion de una lista (List), es decir, que esta en un nivel abajo de las listas. Utiliza un array dinamico que permite almadenar datos. 
 * 
 * Sus principales características son:
 * 
 * 	-	Tamaño dinámico, a diferencia de los arrays tradicionales, el tamaño de un aarayist si se puede modificar. 
 *  -	Acceso rápido, podemos acceder a un elemento del arrayist por su posición oindice
 *  -	Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos. 
 *  
 *  
 *  
 *  
 * 
 * */
