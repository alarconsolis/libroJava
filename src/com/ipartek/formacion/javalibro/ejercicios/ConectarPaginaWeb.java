package com.ipartek.formacion.javalibro.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/*
 * Nos conectaremos una pagina web http://www.example.com/ para descargar el codigo fuente
 * 
 * */
public class ConectarPaginaWeb {

	public static void main(String[] args) {

		final String PAGINA_WEB = "http://www.example.com/";
		
		try {
			// creamos URL
			
				
			URL url = new URL(PAGINA_WEB);

			// abrimos conexion
			URLConnection con = url.openConnection();

			//crear inputStream y Buffer asociado
			InputStreamReader isr = new InputStreamReader(con.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			// leemos el codigo fuente linea a linea
			String linea = "";
			while ( (linea=br.readLine()) != null ) {
				
				//conseguir h1
				if ( linea.indexOf("<h1>") != -1 ) {
					System.out.println(linea);
				}
				//conseguir enlace
				if ( linea.indexOf("<a") != -1 ) {
					System.out.println(linea);
					String [] linea2 =linea.split("\"");
					System.out.println("------"+linea2[1]+"--------");
					url =new URL(linea2[1]);
					// abrimos conexion
					 con = url.openConnection();

					//crear inputStream y Buffer asociado
					 isr = new InputStreamReader(con.getInputStream());
					 br = new BufferedReader(isr);
					
					// leemos el codigo fuente linea a linea
					linea = "";
					while ( (linea=br.readLine()) != null ) {
						System.out.println(linea);
					}
					}
				
			}
			

		} catch (MalformedURLException e) {
			System.out.println("URL mal escrita " + PAGINA_WEB);
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("No podemos establecer conexion");
			e.printStackTrace();
		}

	}

}