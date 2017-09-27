package com.ipartek.formacion.javalibro.utilidades;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

public class CargarTXTArrayList {

	/**
	 * 
	 * @param fileRoute ruta del fichero
	 * @param numCamposLinea numero de Campos que tiene cada linea 
	 * @param separador separador por el que acotar el array
	 * @return 
	 */
	public String CargarTXTArrayList(String fileRoute, int numCamposLinea,String separador ) {
		
		String resul = null;
		ArrayList<Persona> lista = new ArrayList();
		FileReader fr = null;     
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(fileRoute);
			br = new BufferedReader(fr);
			String linea = "";
			Persona p = null;
			String[] campos;
			while( (linea = br.readLine()) != null ) {
				
				campos = linea.split(separador);
				
				if ( campos.length == numCamposLinea ) {
					try {
						p = mapeoLinea(campos);
						lista.add(p);
					}catch (Exception e) {
						System.out.println("DATOS INCORRECTOS: " + linea);
					}	
				}				
			}			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//TODO cerrar recursos abiertos
		}
		
		return resul;
}
	private static Persona mapeoLinea (String[] campos) throws PersonaException {
		
		Persona p = new Persona(    campos[0], 
									campos[1], 
									campos[2], 
									campos[3], 
									campos[4], 
									campos[5],
									Integer.parseInt(campos[6]));	
		return p;
	}
}
