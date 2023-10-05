package Persona;

public class TestAsistenteDental {

	public static void main(String[] args) {
		
		// Instancia de nuestro asistente
		
		AsistenteDental Francisca = new AsistenteDental("05/10/2023", 875.40d);
		
		//Impresion de a informacion de nuestro asistente
		Francisca.mostrarDatosAsistente();
		
		
		
		//El sueldo de Francisca no es de 875.4, es de 87.54
		//Cambio de salario
		//Francisca.salario=87.54d;
		
		
		
		//Mostrar soo el sueldo (Antes del getter)
		//System.out.println(Francisca.salario);
		
		//Mostrar el sueldo (Despues del getter)
		System.out.println(Francisca.getSalario());
		
		
		//Modificar salario con el setter
		Francisca.setSalario(30.00); //Si cumple la condicion
		
		//Imprimir el nuevo salario de Francisca
		System.out.println(Francisca.getSalario());
		
		
	}//metodo main 

}
