package com.ipartek.formacion.javalibro.utilidades;

public class UtilidadesString {
/**
 * Cuenta las palabras que esten contenidas dentro del 'texto'
 * @param texto String donde buscar las palabras
 * @param busqueda String palabra que buscamos dentro del 'texto'
 * @return int 0 si no encuentra, numero de palabras encontradas
 */
	static int buscarpalabra(String texto, String busqueda) {
		//TODOimplementar despues del test
		int contador=0;
		int resultado=-1;
		int pos=-1;
		String delimitadores= \W;
		String[] palabrasSeparadas = texto.split(delimitadores);
		if (texto==null||busqueda==null) {
			resultado=0;
		}else {
			
			pos=texto.indexOf(busqueda);
			//while hasta pos=-1
			
			//sumar uno al resultado
			
			//recortar el texto
			
			while (pos != -1) {
				if (pos != -1) {
					 texto = texto.substring(pos+busqueda.length(),texto.length());
		    resultado++; 
				}
		   
		}
		
		}
		return resultado;
	}
	
	
}
