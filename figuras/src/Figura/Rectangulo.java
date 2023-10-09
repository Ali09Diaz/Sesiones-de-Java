//En esta clase vamos a heredar el atributo de la clase abstracta figuras, y lo vamos a sobreescribir


package Figura;

//1.- aplicamos herencia

public class Rectangulo extends Figura {
	
	//Parametros
	double base;
	double altura;
	
	
	//Constructor
	Rectangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}//cnstructor
	
	
	//Metodos
	@Override
	public double calcularArea () {
		double formulaRectangulo = base * altura;
		return formulaRectangulo;
	}//Metodo calcularArea

}//Clase figura 
