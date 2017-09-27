package com.ipartek.formacion.javalibro.entregar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.ipartek.formacion.javalibro.entregar.Persona;
import com.ipartek.formacion.javalibro.entregar.PersonaException;

public class SubsanarFicheroPersonasJonAlarcon {
	
	private static final String PERSONAS = "C:\\desarrollo\\personas.txt";
	private static final String PER_ERROR = "C:\\desarrollo\\personas_error.txt";
	private static final String PER_OK = "C:\\desarrollo\\personas_ok.txt";
	private static final int CAMPOS = 7;
	
	public static void comprobarCampos() {
		//Declarar valores
		//Para leer el fichero
		FileReader fr = null;
		BufferedReader br = null;
		
		//Para escribir en el fichero bueno
		FileWriter fwOk = null;
		BufferedWriter bwOk = null;
		
		//Para escribir en el fichero de Error
		FileWriter fwError = null;
		BufferedWriter bwError = null;
		
		String linea = "";
		
		//Contadores para los registros
		int ok = 0;
		int error = 0;
		
		try {
			//Inicializar valores
			fr = new FileReader(PERSONAS);
			br = new BufferedReader(fr);
			
			fwOk = new FileWriter(PER_OK);
			bwOk = new BufferedWriter(fwOk);
			
			fwError = new FileWriter(PER_ERROR);
			bwError = new BufferedWriter(fwError);
			
			Persona p = null;
						
			String[] valor = new String[CAMPOS];
			
			
			while((linea = br.readLine()) != null) {
				try {
					valor = linea.split(",");
					if(valor.length <CAMPOS) {
						fwError.write(linea);
						error++;
						fwError.write("\r\n");
						fwError.flush();
						
					} else {
						p=new Persona(valor[0], valor[1], valor[2], Integer.parseInt(valor[3]), valor[4], valor[5], valor[6]);
						fwOk.write(linea);
						ok++;
						fwOk.write("\r\n");
						fwOk.flush();
					} 
				} catch (PersonaException | NumberFormatException e) {
					
					
					
						fwError.write(linea);
						error++;
						fwError.write("\r\n");
						fwError.flush();
					
						System.out.println("No se ha podido escribir");
						e.printStackTrace();
					
				} //fin catch PersonaException
				
			} //final  while
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // FIN CATCH FILES

		
		System.out.println("Registros OK : " + ok);
		System.out.println("Registros ERROR : " + error);
	}

	public static void main(String[] args) {
		
		comprobarCampos();
	}

}
