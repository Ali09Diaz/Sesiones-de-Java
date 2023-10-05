package colecciones;

public class Colecciones {

	public static void main(String[] args) {
		
		//Array
		//Tipo de datos del array, nombre, instancia de objeto arreglo, los datos
		String[] listaDeCompras = new String[] {"Leche", "Pan", "Huevos"};
		
		System.out.println(listaDeCompras);
		
		//Imprimir info de listaDeCompras con un forEach
		//Para e dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir 
		for(String productoAImprimir : listaDeCompras) {
			System.out.println(productoAImprimir);
		}//forEach
		
		
		


		
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
 * */
