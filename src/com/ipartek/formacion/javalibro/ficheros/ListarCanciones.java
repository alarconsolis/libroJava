package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

/**
 * Listar todas las canciones de la carpeta:
 * 
 * @author Administrador
 *
 */
public class ListarCanciones {
	public static void listarDirectorio(File directorio, String separador) {
		File[] ficheros = directorio.listFiles();
		for (int x = 0; x < ficheros.length; x++) {
			System.out.println(separador + ficheros[x].getName());

			if (ficheros[x].isDirectory()) {
				String nuevo_separador;
				nuevo_separador = separador + " ";
				listarDirectorio(ficheros[x], nuevo_separador);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("vamos a mostar las canciones de un directorio:");
		File f = new File("c:\\desarollo\\");
		listarDirectorio(f, "-------");
		/*
		 * File[] carpetas = f.listFiles(); for (File c : carpetas) { File[] canciones =
		 * c.listFiles(); System.out.println("[" + canciones.length + "]" +
		 * c.getName()); for (File cancion : canciones) { System.out .println("[" +
		 * canciones.length + "]" + c.getName() + " " + (cancion.length() / 1024) +
		 * "/kbs"); }
		 * 
		 * }
		 */
	}

}
