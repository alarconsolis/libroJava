package com.ipartek.formacion.javalibro.utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

public class CargarPersona {
	static final String PATH_FICHERO_PERSONAS = "data\\personas.txt";
	
	static final int CAMPOS= 7;
	static final int NOMBRE = 0;
	static final int APELLIDO = 1;
	static final int CIUDAD = 2;
	static final int EDAD = 3;
	static final int EMAIL = 4;
	static final int DNI = 5;	
	static final int ROL = 6;
	
	static final String DNI_BUSCAR = "26779063W";

public static void main(String[] args) {
		
		
		cargarPersonas(PATH_FICHERO_PERSONAS);
				
		
		cargaHahsMap();		
		
	}
private static void cargaHahsMap() {
		HashMap<String,Persona> mapa = new HashMap<String,Persona>();
		FileReader fr = null;     
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(PATH_FICHERO_PERSONAS);
			br = new BufferedReader(fr);
			String linea = "";
			Persona p = null;
			String[] campos;
			while( (linea = br.readLine()) != null ) {
				
				campos = linea.split(",");
				if ( campos.length == CAMPOS ) {
					try {
						p = mapeoLinea(campos);
						mapa.put(p.getDni(), p);
					}catch (Exception e) {
						System.out.println("LINEA INCORRECTA: " + linea);
					}	
				}				
			}			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//TODO cerrar recursos abiertos
		}
				
		//recorrer de uno en uno para ver cuanto tarda
		long inicio = System.currentTimeMillis();
		
		Collection cole = mapa.values();		
		Iterator<Persona> it = cole.iterator();
		Persona pIteracion = null;
		while( it.hasNext() ) {
			pIteracion = it.next();
		}
		
		long fin = System.currentTimeMillis();
		System.out.println("HashMap Listar " + ( fin - inicio ) + " ms");
				
		//buscar
		inicio = System.currentTimeMillis();
		Persona pencontrada = mapa.get(DNI_BUSCAR);
		fin = System.currentTimeMillis();
		System.out.println("HashMap buscar dni " + ( fin - inicio ) + " ms");
		
	}
public static ArrayList<Persona> cargarPersonas(String ruta) {
	ArrayList<Persona> lista = new ArrayList<Persona>();
	FileReader fr = null;     
	BufferedReader br = null;
	
	try {
		
		fr = new FileReader(PATH_FICHERO_PERSONAS);
		br = new BufferedReader(fr);
		String linea = "";
		Persona p = null;
		String[] campos;
		while( (linea = br.readLine()) != null ) {
			
			campos = linea.split(",");
			if ( campos.length == CAMPOS ) {
				try {
					p = new Persona(campos[NOMBRE],campos[APELLIDO],campos[CIUDAD],campos[EDAD],campos[EMAIL],campos[DNI],campos[ROL]);
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
	return lista;
	
	
	
	//recorrer de uno en uno para ver cuanto tarda
	long inicio = System.currentTimeMillis();
	
	Iterator<Persona> it = lista.iterator();
	Persona pIteracion = null;
	while( it.hasNext() ) {
		pIteracion = it.next();
	}
	
	long fin = System.currentTimeMillis();
	System.out.println("ArrayList Listar " + ( fin - inicio ) + " ms");
	
	
	//buscar
	inicio = System.currentTimeMillis();
	it = lista.iterator();
	pIteracion = null;
	while( it.hasNext() ) {
		pIteracion = it.next();
		if ( DNI_BUSCAR.equalsIgnoreCase(pIteracion.getDni())) {
			//System.out.println("encontrada persona " + pIteracion.toString());
			break;
		}
	}		
	fin = System.currentTimeMillis();
	System.out.println("ArrayList buscar dni " + ( fin - inicio ) + " ms");
	
	
}

public static Persona mapeoLinea (String[] campos) throws PersonaException {
	
	Persona p = new Persona(    campos[NOMBRE], 
								campos[APELLIDO], 
								campos[CIUDAD], 
								campos[EMAIL], 
								campos[DNI], 
								campos[ROL],
								Integer.parseInt(campos[CAMPOS_EDAD]));	
	return p;
}

}
}
