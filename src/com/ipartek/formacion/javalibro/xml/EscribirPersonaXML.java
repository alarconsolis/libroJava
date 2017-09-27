package com.ipartek.formacion.javalibro.xml;

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
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.ipartek.formacion.javalibro.colecciones.CargarPersonas;
import com.ipartek.formacion.javalibro.pojo.Persona;

import java.io.File;

public class EscribirPersonaXML {
	public static void main(String argv[]) {

	      try {
	         DocumentBuilderFactory dbFactory =
	         DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.newDocument();
	         
	         // crear nodo raiz
	         Element rootElement = doc.createElement("personas");
	         doc.appendChild(rootElement);
	         //TODO conseguir arraylist<persona> a partir del fichero de texto
	         CargarPersonas.c;
	         //TODO bucle para todas las personas
	         System.out.println(CargarPersonas);
	         //añadir elementos Persona al nodo raiz
	         Element ePersona = doc.createElement("persona");
	         Element eNombre= doc.createElement("nombre");
	         eNombre.setTextContent("ted");
	         
	         
	         ePersona.appendChild(eNombre);
	         rootElement.appendChild(ePersona);	         
	         //TODO resto de Campos o Elementos
	         
	         
	         //guardar en fichero
	         TransformerFactory transformerFactory = TransformerFactory.newInstance();
	         Transformer transformer = transformerFactory.newTransformer();
	         DOMSource source = new DOMSource(doc);
	         StreamResult result = new StreamResult(new File("data\\personas.xml"));
	         transformer.transform(source, result);
	
	      }catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
