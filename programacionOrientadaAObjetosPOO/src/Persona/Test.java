package Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	
	//Metodo principal para instanciar mis clase
	public static void main(String[] args) {
		
		/*
		//Instancia de persona
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@mail.com");
		
		
		System.out.println(Felipe); // Imprime el lugar de la memoria
		Felipe.imprimirInfo();// Imprime informacion 
		Felipe.saludar(); // Imprime saludos
		
		
		//Instancia de dentista
		Dentista Simi = new Dentista("Dr.Simi","Lares", (byte)50, "12345678", "simi@lares.com", "Odontologia", "5511223344", "500", "avanzado", "matutino", 500 );
		
		System.out.println("***************");
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
		
		//Instancia de Paciente con todos los datos
		Paciente Chencho = new Paciente ("CHNCH1234", "RH Positivo", true, true, "05/Oct/2023", "Dr. Simi Lares", false);
		
		System.out.println("***************");
		System.out.println(Chencho);
		
		
		//Instancia de paciente con datos obligados
		Paciente Masiosare = new Paciente ("MASI12345", false, false);
		System.out.println("***************");
		System.out.println(Masiosare);
		
		
		//Cambiar el false de seguroMedico a true
		//Masiosare.seguroGastosMedicos = true;
		System.out.println("***************");
		System.out.println(Masiosare);
		
		*/
		
		
		//Implementacion de ArrayList de Dentistas
		List<Dentista> listaDentistasArrayList = new ArrayList <>();
		
		//Primero genero una instancia de Dentista
		Dentista DrChapatin = new Dentista("Dr. Chapatin", "Chespirito", (byte)45, "11223344", "chapatin@mail.com", "General", "666123455", "Consultorio 200", "avanzado", "matutino", 450);
		
		//Luego la agrego a la lista
		listaDentistasArrayList.add(DrChapatin);
		
		//Si agrego la instancia a una variable, puedo imprimir su informacion usando un toString, o un metodo mostrarInfo();
		
		
		
		
		//Hago una instancia y la agrego directamente a la lista
		listaDentistasArrayList.add (new Dentista ("Dr.Simi","Lares", (byte)50, "12345678", "simi@lares.com", "Odontologia", "5511223344", "500", "avanzado", "matutino", 500 ));
		
		//Si genero la instancia y la agrego directamente al arrayList, para sacar el dato tendre que utilizar un forEach o alguin ciclo para imprimir dato por dato  
		
		
		//Implementacion de lista de Dentista con un HashSet
		Set<Dentista> conjuntoDentistas = new HashSet <>();
		
		//Agregar Dentista a mi Conjunto 
		conjuntoDentistas.add(new Dentista("Dr.Simi","Lares", (byte)50, "12345678", "simi@lares.com", "Odontologia", "5511223344", "500", "avanzado", "matutino", 500 ));
		
		//Implementacion de un hashMap de Dentistas
		Map<String, Dentista> mapaDentistas = new HashMap<>();
		
		//Agregar un dentista a mi mapa
		mapaDentistas.put("Dr. House", new Dentista("Gregory","House", (byte)55, "12345678", "house@lares.com", "Cirujano", "5511223344", "Consultorio 600", "avanzado", "vespertino", 1400 ));
		
		//Imprimir el objeto Dr House
		Dentista DoctorBuscado = mapaDentistas.get("Dr. House");
				
		System.out.println(DoctorBuscado);
		
		
	}//Cierre de metodo main 
	

}//Cierre clase persona
