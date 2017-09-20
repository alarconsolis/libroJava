package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

public class ListarVolumenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unidades de nuestro pc");
		File f = new File("");
		File[] volumenes = f.listRoots();
		for (File v : volumenes) {
			System.out.println(v);
		}
	}

}
