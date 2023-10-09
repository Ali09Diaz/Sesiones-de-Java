package Figura;

public class TestFiguras {
	
	public static void main(String[] args) {
		
		//Generar las instancias de nuestras clases
		
		//1.- Instancia de la clase Figura
		//Figura Generica = new Figura();
		
		
		//2.- Instancia de un rctangulo
		Figura rectangulo = new Rectangulo (5.0, 6.5);
		
		//3.- instancia de un circulo
		Figura circulo = new Circulo(3.14, 3.0);
		
		//4.- Instancia de un triangulo
		Figura triangulo = new Triangulo(3.2, 5.0);
		
		//Invocacion del metodo
		System.out.println(rectangulo.calcularArea()); 
		System.out.println(circulo.calcularArea());
		System.out.println(triangulo.calcularArea());
		
		
		
		
	}//Metodo main 

}//Class TestFiguras
