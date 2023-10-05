package Persona;

public class Usuario {
	
	//Atributo
	private String tipoUsuario;
	private String username;
	private String password;
	
	
	//Crear un nuevo usuario (Constructor)
	public Usuario(String tipoUsuario, String username, String password) {
		this.tipoUsuario = tipoUsuario;
		this.username = username;
		this.password = password;
	}//constructor 
	
	
	//Recuperar contrasena (getter)
	public String getPassword(/* String usernameAValidar*/) {
		//si el usuario registado coincide con el usuario que paso como parametro, entonces obtengo la contrasena 
		return password;
	}//getter
	
	
	//Cambiar contrasena (setter)
	public void setPassword (String nuevoPassword) {
		//Si la nueva contrasena es diferente a una cadena vacia y es diferente a la contrasena anterior...
		if (nuevoPassword != "" && nuevoPassword != password ) {
			//..Entonces reemplazo la contrasena anterior 
			password = nuevoPassword;
			System.out.println("Contrasena cambiada exitosamente");
		}else {
			System.out.println("Lo siento, no puedo cambiar la contrasena");
		}
	}
	
	
	//Cambiar la contrasena d eun objeto del tipo usuario
	
	//Felipe.setPassword  (Una donde a contrasena este vacia)
	//Felipe.setPassword  (Una donde la ocntrasena no este vacia pero sea igual a la anterior
	//Felipe.setPassword  (Se cumpla las 2 condiciones)
	
	
	
	

}//Cierre usuario
