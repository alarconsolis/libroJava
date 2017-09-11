package com.ipartek.formacion.javalibro.utilidades;

public class UtilidadesColecciones {

	/**
	 * Ordena un Array con el metodo bubble-sort
	 * 
	 * @see https://www.youtube.com/watch?v=lyZQPjUT5B4
	 * @param aDesordenado
	 *            Array desordenado
	 * @param orden
	 *            true de mayor a menor, false de menor a mayor
	 * @return array ordenado segun parametro <code>orden</code>
	 */
	static int[] ordenarArray(int[] aDesordenado, boolean orden) {

		int[] resul = aDesordenado.clone();
		if (orden == true) {
			for (int i = 0; i < resul.length - 1; i++) {
				for (int j = i + 1; j < resul.length; j++) {
					if (resul[i] < resul[j]) {
						int aux = resul[i];
						resul[i] = resul[j];
						resul[j] = aux;
					}

				}
			}

		
		} else {
			for (int i = 0; i < resul.length - 1; i++) {
				for (int j = i + 1; j < resul.length; j++) {
					if (resul[i] > resul[j]) {
						int aux = resul[i];
						resul[i] = resul[j];
						resul[j] = aux;
					}

				}
			}

		}

		return resul;
	}

}