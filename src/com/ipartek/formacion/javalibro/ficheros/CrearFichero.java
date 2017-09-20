package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrearFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}// main


	private CrearFichero() {
		System.out.println("Introduce la Ruta completa: ");
		Scanner sc = new Scanner(System.in);

		String ruta = sc.nextLine();
		File archivo = new File(ruta);
		BufferedWriter bw;

		if (archivo.exists()) {
			// El fichero ya existe

			try {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write("El fichero de texto ya estaba creado.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			// El fichero no existe y hay que crearlo
			try {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write("Acabo de crear el fichero de texto.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}// else
	}
}
