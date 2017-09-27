package com.ipartek.formacion.javalibro.entregar;

public class PersonaException extends Exception {

	private static final long serialVersionUID = 1L;

	public final static String SMS_EDAD_MENOR = "Debe ser mayor que 18";
	public final static String SMS_EMAIL_ERROR = "Email no es correcto";
	public final static String SMS_DNI_ERROR = "Dni no es correcto";
	
	public PersonaException(String messageException) {
		super(messageException);
	}

}