package com.ipartek.formacion.javalibro.entregar;

import java.util.regex.Pattern;

import com.ipartek.formacion.javalibro.entregar.PersonaException;
import com.ipartek.formacion.javalibro.utilidades.Validaciones;

public class Persona {
	
	public static int MAYOR_EDAD = 18;
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	private String nombre;
	private String apellido1;
	private String ciudad;
	private int edad;
	private String email;
	private String dni;
	private String rol;
	

	public Persona(String nombre, String apellido1, String ciudad, int edad, String email, String dni, String rol )
			throws PersonaException {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.ciudad = ciudad;
		// this.email = email;
		setEmail(email);
		// this.dni = dni;
		setDni(dni);
		this.rol = rol;
		// this.edad = edad;
		setEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getciudad() {
		return ciudad;
	}

	public void setciudad(String apellido2) {
		this.ciudad = apellido2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws PersonaException {

		if (!Validaciones.email(email)) {
			throw new PersonaException(PersonaException.SMS_EMAIL_ERROR);
		}
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws PersonaException {
		if(!Validaciones.dni(dni)) {
			
			throw new PersonaException(PersonaException.SMS_DNI_ERROR);		
		
		}
		this.dni = dni;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public int getEdad() {
		return edad;
	}

	/**
	 * Setea la edad de la Persona
	 * 
	 * @param edad
	 *            int años de la Persona
	 * @throws PersonaException
	 *             edad < 18
	 */
	public void setEdad(int edad) throws PersonaException {
		if (edad < MAYOR_EDAD) {
			throw new PersonaException(PersonaException.SMS_EDAD_MENOR);
		}
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", ciudad=" + ciudad + ", email=" + email
				+ ", dni=" + dni + ", rol=" + rol + ", edad=" + edad + "]";
	}

}