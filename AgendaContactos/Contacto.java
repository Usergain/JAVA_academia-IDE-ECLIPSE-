package AgendaContactos;

import java.util.List;

public class Contacto {
	
	private String nombre;
	private String email;
	private String telefono;
	
	public Contacto(){
		
	}

	public Contacto(String nombre, String email, String telefono) {
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + "]";
	}

}

