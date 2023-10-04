package Persona;

public class Test {

	
	//Metodo principal para instanciar mis clase
	public static void main(String[] args) {
		
		
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
		Masiosare.seguroGastosMedicos = true;
		System.out.println("***************");
		System.out.println(Masiosare);
		
		
	}//Cierre de metodo main 
	

}//Cierre clase persona
