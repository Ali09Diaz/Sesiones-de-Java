package dataTypes;

public class DatosPrimitivos {
	public static void main(String[] args) {
		//System.out.println("Hola");
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven 
para gestionar los tipos
		 * Existen 8 tipos de datos primitivos: byte, 
short, int, long, float, double, boolean, char
		 */
		//BYTE Vmin y Vmax
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		System.out.println("El valor minimo de byte es " + minByte);
		System.out.println("El valor maximo de byte es " + maxByte);
		
		//SHORT Vmin y Vmax
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor minimo de short es " + minShort);
		System.out.println("El valor maximo de short es " + maxShort);
		
		//int Vmin y Vmax
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor minimo de int es " + minInt);
		System.out.println("El valor maximo de int es " + maxInt);
		
		//long Vmin y Vmax
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor minimo de Long es " + minLong);
		System.out.println("El valor maximo de Long es " + maxLong);
		
		//float Vmin y Vmax
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("El valor minimo de Float es " + minFloat);
		System.out.println("El valor maximo de Float es " + maxFloat);
		
		//double Vmin y Vmax
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor minimo de Double es " + minDouble);
		System.out.println("El valor maximo de Double es " + maxDouble);		
		
		//char. INT Vmin y Vmax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor minimo de character es " + minChar);
		System.out.println("El valor maximo de character es " + maxChar);
		
		//Long
		long isbn = 9788499169019L;
		System.out.println(isbn);
		
		//float
		float salary = 15000f;
		System.out.println(salary);
		
		//double
		double ISR = 1239.45d;
		System.out.println(ISR);
		
		char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		/* Casteo ( Conversion de tipos en JAVA
		 * --Automatico (dato mas pequenoa un dato mas grande)
		 * --Manual (tipo de dato mas grande a tipo de dato mas pequeno)
		 */
		
		int myNumber = 125;
		System.out.println(myNumber);
		//int < double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		//--Manual 
		
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		
		//Convertir de float a int
		float myFloat = 1.99f;
		System.out.println(myFloat);
		//Conversion
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat);
		
		//Convertir de char a int
		char myChar = 'M';
		System.out.println(myChar);
		int myNewChar = myChar;
		System.out.println(myNewChar);
		
	}
}
