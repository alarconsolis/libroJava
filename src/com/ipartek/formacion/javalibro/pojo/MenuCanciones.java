package com.ipartek.formacion.javalibro.pojo;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuCanciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String seleccion="";
		Scanner sc = new Scanner(System.in);
		
		
	
		
		ArrayList song = new ArrayList();
		song.add(new Cancion("Highway to Star", "Deep Purple", "5:45"));
		song.add(new Cancion("Highway to Hell", "AC/DC", "3:50"));
		song.add(new Cancion("Starway to Heaven", "Led Zeppelin", "4:23"););
		song.add(new Cancion("song 2", "Blur", "2:02"));
		
		System.out.println("----------//MENU DE CANCIONES//----------");
		System.out.println("1- LISTAR");
		System.out.println("2- ELIMINAR");
		System.out.println("3- AÑADIR");
		System.out.println("4- DETALLE");
		System.out.println("¿que accion desea realizar? ");
		seleccion=sc.nextLine();
		switch (seleccion) {
		case seleccion="1":
			
			break;
		case seleccion="2":
			
			break;
		case seleccion="3":
			System.out.println("----------//AÑADIR CANCIONES//----------");
		System.out.println("¿que cancion desea añadir?");
		System.out.println("Titulo: ");
		String titulo =sc.nextLine();
		System.out.println("Artista: ");
		String artista =sc.nextLine();
		System.out.println("Duracion: ");
		String duracion=sc.nextLine();
			song.add(new Cancion(titulo, artista, duracion));
			
			break;
		case seleccion="4":
	
			break;


		default:
			break;
		}
		
		
		System.out.println(song.get(0));
		System.out.println(song.get(1));
		System.out.println(song.get(2));
		System.out.println(song.get(3));
		
		System.out.println("que cancion desea escuchar? ");
		
		
		
	}

}
