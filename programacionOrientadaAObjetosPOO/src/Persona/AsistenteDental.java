package Persona;

public class AsistenteDental {
	
	//1.- Atributos
	private String fechaIngreso;
	private double salario;
	
	//2.- Constructor publico (dejo el constructor publico para poder acceder a el de forma sencilla
	public AsistenteDental(String fechaIngreso, double salario) {
		//Generalmente, el constructor siempre va en publico para evitar errores al momento de la instancia
		this.fechaIngreso = fechaIngreso;
		this.salario = salario; 
	}//Constructor
	
	
	
	//3.- Metodos 
	//Metodo para imprimir informacion
	public void mostrarDatosAsistente() {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
		System.out.println("El salario del asistente es: " + salario);
	}//metodo imprimir informacion
	
	
	//Getters y setters para poder acceder a mis datos privados y poder realizar operaciones con ellos
	//Sin getters, la informacion me aparece en null
	//Sin setters, no puedo cambiar la informacion 
	
	public String getfechaIngreso() {
		return fechaIngreso;
	}//getFechaIngreso
	
	//Getter ara el salario
	public double getSalario () {
		return salario;
	}//getSalario
	
	
	//setter para salario (mdificar los datos)
	public void setSalario(double nuevoSalario) {
		if (nuevoSalario >0 && nuevoSalario <100) {
			salario = nuevoSalario;
		}//cierre if
	}//cierre setter
	
	
	

}// Cierre AsistenteDental
