package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class GenerarFicheroTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("c\\prueba.txt");

			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("yeahhh esto escribe");
			
			bw.close();
			fw.close();
			System.out.println("fichero creado correctamente");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no se puede escribir en el fichero");
			e.printStackTrace();
		}

	}
	private static void buscarpalabra(File f, String busqueda) {
		
		//recursos para lectura de ficheros de caracteres
		FileReader fr = null;
		BufferedReader br = null;
		
		File[] ficheros = f.listFiles();

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
							System.out.println("Hemos encontrado la palabra " + busqueda + " en fichero " + fichero);
						}
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

}
