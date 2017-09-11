package com.ipartek.formacion.javalibro.utilidades;

import junit.framework.TestCase;

public class UtilidadesColeccionesTest extends TestCase {

	
	public void testOrdenacionArray() {
		
		int[] aDesordando = {0,3,1,8,7,2,5,4,6,9};
		
		int[] ordenadorMenorMayor = UtilidadesColecciones.ordenarArray(aDesordando, false);
		
		for (int i = 0; i < ordenadorMenorMayor.length; i++) {
			assertEquals(i, ordenadorMenorMayor[i]);
		}
		
		
		//TODO comprobar orden inverso
		
		int[] ordenadorMayorMenor = UtilidadesColecciones.ordenarArray(aDesordando, true);
		
		for (int i = ordenadorMayorMenor.length-1; i < 0; --i) {
			assertEquals(i, ordenadorMayorMenor[i]);
		}
		
		
		
	}
	
}