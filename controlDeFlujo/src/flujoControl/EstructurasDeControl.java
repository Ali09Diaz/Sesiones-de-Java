package flujoControl;
import java.util.Scanner;//Para que la terminal me pueda preguntar
public class EstructurasDeControl { //Debe coincidir la clase con el nombre del documento
	
	public static void main(String[] args) { //Todo dentro del metodo main

// Recordar que para que algo se ejecute, siempre debe ir dentro del metodo principal
		
		
		//Primero genero una variable del tipo String donde almacen un dato
		String citaProgramada= "28-09-23"; // Dejamos en Null y despues lo cambiamos a una fecha "28-09-23"
		//La variable declarada, se inicia en null a proposito para tener un espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		
		if (citaProgramada != null) {
			System.out.println("Ya hay una cita programada, una disculpa");//Porque la variable ya esta ocupada o llena
		}else {
			System.out.println("Puede registrar una cita");// Podemos registrar otra cita o una cita
		}
///////////////////////////////////////////////////////
		
	// Seleccionando una opcion y almacenando la variable opcion
		
		int opcion = 2  ;
		
		//Creamos un menu 
		System.out.println("Menu de el Diente Feliz Consultorio Dental");
		System.out.println("1.- Deasea Programar una cita? ");
		System.out.println("2.- Verificar Cita Programada? ");
		System.out.println("3.- Cancelar Cita");
		System.out.println("4.- Sair del Menu");
		System.out.print("Seleccione una opcion del Menu(1-4): ");
		
		switch (opcion) {
		case 1:
			System.out.println("Usted ha seleccionado la pcion programar cita"); //Agregar la logica para programar una cita 
			break;
		case 2:
			System.out.println("Usted ha seleccionado verificar cita programada");
			break;
		case 3:
			System.out.println("Usted ha seleccionado la opcion de cancelar cita :c ");
			break;
		case 4:
			System.out.println("Usted ha seleccionado la opcion salir del menú");
			break;
		default:
			System.out.println("La opcion que usted selecciono no es valida. Por favor seleccione una opcion  de nuestro menu (1-4).");
			break;
		}//Cierre de switch
///////////////////////////////////////////////////////////
		
		//Actividad en equipo -Metodo nextLine()-
		Scanner input = new Scanner(System.in);  // Crea un Scanner para solicitar un inpit
		System.out.println("Ingrese la edad: ");
		
		int edad = input.nextInt();  // Se lee el input del usuario y con el metodo nextInt lo tenemos en entero 
		
		//String mensaje=edad>=18?"Si es mayor de edad, le proporcionamos servicio":"No es mayor de edad, debe ser acompanado por un adulto";
		//System.out.println(mensaje);
		
		
		if (edad<18){
			System.out.println("Esta acompanado por un adulto?, Si(true) No(false)");
			boolean verdad = input.nextBoolean();
			String verificarMensaje=verdad?"Se le da servicio":"Debe ser acompanado por un adulto";
			System.out.println(verificarMensaje);
			
		}else {
			System.out.println("Si es mayor de edad, le proporcionamos servicio");
		}
		System.out.println("Fin del programa, vuelva pronto.");
		input.close(); //Se cierra el proceso como buena practica
		
		
		
	}//Metodo

}// Clase
