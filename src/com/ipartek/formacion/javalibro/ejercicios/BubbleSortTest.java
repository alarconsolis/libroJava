package com.ipartek.formacion.javalibro.ejercicios;

import junit.framework.TestCase;

public class BubbleSortTest extends TestCase {

	public void testOrdenarArray() {
		int[] numero = { 0, 3, 1, 8, 7, 2, 5, 4, 6, 9 };
		System.out.println("-------ARRAY------------");
		for  (int x=0; x<numero.length; x++)
			  System.out.println(numero[x]);		
		for (int i = 0; i < numero.length - 1; i++) {
			
			
			for (int j = i + 1; j < numero.length; j++) {
				if (numero[i] > numero[j]) {
					int aux = numero[i];
					numero[i] = numero[j];
					numero[j] = aux;
				}

			}
		}
		System.out.println("-------ORDENADOS------------");
		for  (int z=0; z<numero.length; z++)
			  assertEquals(z, numero[z]);
	}

}
