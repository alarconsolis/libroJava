package com.ipartek.formacion.javalibro.ejercicios;
import sun.util.resources.cldr.ar.CalendarData_ar_SA;

/**
 * Las variables primitivas se pasan por valor
 * las variables de clase se pasan por refencia
 * 
 * @author Administrador
 *
 */
public class VariblesReferenciaYvalor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int primitiva=1;
System.out.println("primitiva= " + primitiva);
int primitiva2 =sumar(primitiva);
System.out.println("primitiva = " + primitiva);
System.out.println("primitiva2 = " + primitiva2); 

		
// las variables de clase se pasan por refencia		
	String referencia ="1";
	String referencia2 =sumar(primitiva2)(referencia);
	System.out.println("referencia: " + referencia);
	System.out.println("referencia2: " + referencia2);
	
static int sumar(int i) {
	return ++i;
}
static String sumar (String s) {
	s="2";
	return s;
}

}

	private static String sumar(int primitiva) {
		// TODO Auto-generated method stub
		return null;
	}
}
