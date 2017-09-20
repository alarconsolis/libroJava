package com.ipartek.formacion.javalibro.colecciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Descomprime el fichero "data/buscatesoro.rar" donde quieras y recorre forma
 * recursiva los ficheros, hasta encontrar dentro de un .txt la palabra
 * "osobuko".<br>
 * Muestra por pantalla la ruta del fichero que contiene la palabra a buscar.
 * 
 * @author ur00
 *
 */
public class BuscarPalabra {

	public static void main(String[] args) {

		File f = new File("C:\\desarrollo\\personas");
		buscarpalabra(f, "26779063w");

	}

	private static void buscarpalabra(File f, String busqueda) {
		
		//recursos para lectura de ficheros de caracteres
		FileReader fr = null;
		BufferedReader br = null;
		
		File[] ficheros = f.listFiles();
			
		ArrayList<String> lista = new ArrayList<String>();String str;
		for (File fichero : ficheros) {

			if (fichero.isDirectory()) {           // es un directorio
				buscarpalabra(fichero, busqueda);
			} else {                               // es un fichero

				//buscar palabra
				try {
					fr = new FileReader(fichero);
					br = new BufferedReader(fr);
					String linea = "";
					//leer linea a linea todo el fichero de texto
					while ((linea = br.readLine()) != null) {
						if (linea.indexOf(busqueda) != -1) {
							System.out.println("Hemos encontrado la palabra " + busqueda + " en " + tiempo + "  tiempo");
						}
						
						lista.add(str.split(","));
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						br.close();
						fr.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}// finally
				
			}//end else
		}// enf for ficheros
	}//buscarpalabra

	private static void persona() {
		// TODO Auto-generated method stub
		
	}

}