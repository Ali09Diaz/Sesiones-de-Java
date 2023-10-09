package Figura;

public class Triangulo extends Figura {
	
	//1.-Parametros
	double base;
	double altura;
	
	//2.-Constructor 
	
	Triangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	//3.- Metodos (metodo abstracto heredado de figura)
		@Override
		public double calcularArea() {
			double areaTriangulo =  (base*altura)/2;
			return areaTriangulo ;
		}//metodo calcularArea

}// clas triangulo 
