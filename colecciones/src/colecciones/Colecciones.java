package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		//Borrar un elemento de la lista 
		listaDeContactos.remove(1);
		System.out.println(listaDeContactos);
		
		
		//Implementación de un conjunto (SET)
		//Sintaxis
		//Interface de donde implemento + tipo de dato que usaré + nombre que le doy al conjunto + instancia de la clase específica 
		
		Set<String> cartasDeJuego = new HashSet <> (); //Se importó Set y HashSet
		
		//Agregar elementos
		cartasDeJuego.add("As de corazones");
		cartasDeJuego.add("2 de picas");
		cartasDeJuego.add("Reina de treboles");
		
		//No puedo saber posiciones, solo saber si o contiene
		if(cartasDeJuego.contains("Reina de Treboles")) {
			System.out.println("La reina de treboles si estan en el conjunto");
		}else {
			System.out.println("No encuentro el elemento solicitado");
		}
		
		
		
		
		
		//Implementacion de un mapa (hashMap)
		
		Map <String, String> libretaDirecciones = new HashMap <> ();
		
		//Agregar elementos a mi libreta de direcciones donde mi K=nombre y mi V= direccion
		libretaDirecciones.put("Felipe", "Tlanepantla");
		libretaDirecciones.put("Dr. Simi", "CDMX");
		libretaDirecciones.put("Konoha", "Naruto");
		
		//Metodo para sacar informacion de la libreta, creando una nueva variable
		String direccionDeFelipe = libretaDirecciones.get("Felipe");
		String direccionDeNaruto = libretaDirecciones.get("Naruto");
		
		//Impresion
		System.out.println(direccionDeFelipe);
		System.out.println(direccionDeNaruto);
		
		
		


		
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
 *  Set (conjunto)
 *  
 *  Estructura de datos que almacena datos unicos sin orden especifico. Las principales caracteríasticas de un set son:
 *  
 *  	- No hay elementos duplicados,ya que los conjuntos no pueden contener. Si se intenta agregar un elemento ya existente, la operación se ignora.
 *  	- No hay orden específico, los elementos se alamacenan sin orden específico
 *  	- La busqueda de mas sencilla, ya que al no tener elementos	duplicados se usa una función hash para encontratar el elemento deseado.
 *  
 *  
 *  
 *  Map (mapas)
 *  
 *  Un mapa es una estructura de datos que almacena pares de clave-valor
 *  
 *  	- Almacenamiento con pares K-V
 *  	- Sin orden especifico(similar a un Set)
 *  	- Busqueda rapida, la busqueda se hace por medio de un valor (key), y usa una duncion interna hash para buscar elementos.
 *  
 *  
 *  
 *  Agenda telefonica (agregar, modificar, eliminar)
 *  
 *  
 * 
 * */
