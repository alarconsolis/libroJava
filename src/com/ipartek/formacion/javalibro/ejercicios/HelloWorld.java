package com.ipartek.formacion.javalibro.ejercicios;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int DIAS_SEMANA = 7;
		
  System.out.println("hello World");
	
	String [] alumnos= {
						"Ander",
						"Arkaitz",
						"Erlantz",
						"Fran",
						"Cristian",
						"Leire",
						"Mikel",
						"Josu",
						"Alberto",
						"Jon",
						"Lander",
						"German"};
	System.out.println("--------Listado Alumn@s-------------");
	for (int i = 0; i < alumnos.length; i++) {
		System.out.println(i + " - " + alumnos[i]);
	}
	
	
	
	}

}
