package com.ipartek.formacion.javalibro.entregar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;

/**
 * Ejercicio para convertir un data/personas.txt a data/personas.xml
 * 
 * Estructura xml:
 * 
 * <personas> 
 * 		<persona> 
 * 			<nombre></nombre> 
 * 			<apellido1></apellido1>
 * 			<apellido2></apellido2> 
 * 			<edad></edad> 
 * 			<email></email> 
 * 			<dni></dni> 
 * 			<rol></rol>
 * 		</persona>
 * </personas>
 * ... 
 * 
 * @author Administrador
 *
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.ipartek.formacion.javalibro.colecciones.CargarPersonas;

public class EscribirPersonaXML {
	static final String PERSONAS = "C:\\desarrollo\\personas.txt";
	static final int CAMPOS = 7;
	static final int NOMBRE = 0;
	static final int APELLIDO = 1;
	static final int CIUDAD = 2;
	static final int EDAD = 3;
	static final int EMAIL = 4;
	static final int DNI = 5;
	static final int ROL = 6;

	public static void main(String argv[]) {
		ArrayList<Persona> Persona = new ArrayList<Persona>();
		
        Persona = CargarPersonas(PERSONAS);
		
        generarXML(Persona);
	}
	public static void generarXML(ArrayList<Persona> Persona) {
	      try {
	         DocumentBuilderFactory dbFactory =
	         DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.newDocument();
	         
	         // crear nodo raiz
	         Element rootElement = doc.createElement("personas");
	         doc.appendChild(rootElement);
	         //TODO conseguir arraylist<persona> a partir del fichero de texto
	         CargarPersonas(PERSONAS);
	         Element ePersona = doc.createElement("persona");
	        
	         //añadir elementos Persona al nodo raiz
	         for(int i = 0; i < Persona.size(); i++) {
		        	if(Persona.get(i) != null) {
		        		Element eNombre = doc.createElement("nombre");
			        	eNombre.setTextContent(Persona.get(i).getNombre());
			        	ePersona.appendChild(eNombre);
			        	
			        	Element eApellido = doc.createElement("apellido");
			        	eApellido.setTextContent(Persona.get(i).getApellido1());
			        	ePersona.appendChild(eApellido);
			        	
			        	Element eApellido2 = doc.createElement("apellido2");
			        	eApellido2.setTextContent(Persona.get(i).getciudad());
			        	ePersona.appendChild(eApellido2);
			        	
			        	Element eEdad = doc.createElement("edad");
			        	eEdad.setTextContent(String.valueOf(Persona.get(i).getEdad()));
			        	ePersona.appendChild(eEdad);
			        	
			        	Element eEmail = doc.createElement("email");
			        	eEmail.setTextContent(Persona.get(i).getEmail());
			        	ePersona.appendChild(eEmail);
			        	
			        	Element eDni = doc.createElement("dni");
			        	eDni.setTextContent(Persona.get(i).getDni());
			        	ePersona.appendChild(eDni);
			        	
			        	Element eRol = doc.createElement("rol");
			        	eRol.setTextContent(Persona.get(i).getRol());
			        	ePersona.appendChild(eRol); 
		        	}
		        		
		        	
		        }
	         
	         

	         rootElement.appendChild(ePersona);	        
	         
	         
	         //guardar en fichero
	         
	         // Obtención del TransfomerFactory y del Transformer a partir de él.
	         TransformerFactory transformerFactory = TransformerFactory.newInstance();
	         Transformer transformer = transformerFactory.newTransformer();
	        
	      // Creación de la fuente XML a partir del documento.
	         DOMSource source = new DOMSource(doc);
	      // Creación del resultado, que será un fichero.
	         StreamResult result = new StreamResult(new File("data\\personas1.txt"));
	      // Se realiza la transformación, de Document a Fichero.
	         transformer.transform(source, result);
	
	      }catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Persona> CargarPersonas(String ruta) {

		ArrayList<Persona> resul = new ArrayList<Persona>();
		// Inicializar valores
		FileReader fr = null;
		BufferedReader br = null;
		Persona p = null;
		String[] valor = new String[CAMPOS];
		String linea = "";
		if (resul != null) {
			try {

				fr = new FileReader(PERSONAS);
				br = new BufferedReader(fr);
				while ((linea = br.readLine()) != null) {

					valor = linea.split(",");
					if (valor.length == CAMPOS) {
						try {

							p = mapeoLinea(valor);
							resul.add(p);

						
						} catch (PersonaException e) {
							System.out.println("Pasable");
							e.printStackTrace();
						}
						
					}
				}//end while

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} // FIN CATCH FILES
		return resul;
	}

	public static Persona mapeoLinea(String[] campos) throws PersonaException {

		Persona p = new Persona(campos[NOMBRE], campos[APELLIDO], campos[CIUDAD], Integer.parseInt(campos[EDAD]),
				campos[EMAIL], campos[DNI], campos[ROL]);

		return p;
	}
}
