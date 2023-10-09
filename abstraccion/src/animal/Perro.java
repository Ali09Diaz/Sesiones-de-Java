package animal;

public class Perro extends Animal { //Herencia de la clase superior animal
	
		
		//"Polimorfear" o sobreescribir el metodo heredado
		
		@Override //Con la anotacion @Override, le decimos a Java que el metodo hacerSonido sera sobreescrito
		public void hacerSonido () {
			
			System.out.println("El perrito ladra y hace guau");
			
		}//metodo hacer sonido heredado de animal 
		
		
		
		public static void main (String[] args) {
			
			//Aqui NO hay polimorfismo, ya que instancio un anima generico, y utilizo su metodo hacerSonido
			Animal Generico = new Animal ();//Generar un animal generico (abstracto)
			
			
			//Generar la instancia de mi perrito
			Animal chilaquil = new Perro();
			chilaquil.hacerSonido();
			
			
			
		}//metodo main 
		
		
		
		
	

}//cierre clase perro
