package com.ipartek.formacion.javalibro.ejercicios;

public class JugandoConString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String manolo = "manolo Kabezabolo";

//convertir minusculas
System.out.println("---------------");
System.out.println(manolo.toLowerCase());

//convertir a mayusculas
System.out.println("---------------");
System.out.println(manolo.toUpperCase());
//numero de caracteres
System.out.println("---------------");
System.out.println(manolo.length());

//mostrar la posicion de la letra "K"
/*System.out.println("---------------");
String sTextoBuscado = "K";
// Contador de ocurrencias 
int contador = 0;

while (manolo.indexOf(sTextoBuscado) > -1) {
  manolo = manolo.substring(manolo.indexOf(
    sTextoBuscado)+sTextoBuscado.length(),manolo.length());
  contador++; 
}

System.out.println (contador);
*/
//System.out.println(manolo.);
//separar en dos variables el nombre y "apellido" con substring
System.out.println("---------------");

 String[]part =manolo.split(" ");
 String nombre=part[0];//Manolo
 String apellido=part[1];//Kabezabolo
//OTRA MANERA
//nombre=manolo.substring(0,6);
//apellido=manolo.substring(7);
System.out.println(nombre);
System.out.println(apellido);


/*Comparando */
//Comparar c1 y c2 con equals y equalIgnoreCase
System.out.println("---------------");
String c1 ="casa";
String c2 ="Casa";
System.out.println(c1.equals(c2));//compara todas las diferencias
System.out.println(c2.equalsIgnoreCase(c1)); //ignorando mayusculas



/*Limpiando entradas de Datos*/
//las dos variables sean iguales => trim
System.out.println("---------------");
String c3 ="perro";
String c4 ="      perro     ";
System.out.println(c3);
System.out.println(c4.trim());

//mostrar longitud
//mostrar todas las vocales
//indicar el numero de veces que aparece 'at'
System.out.println("---------------");
String lorem="Lorem ipsum dolor sit amet, consectetur adipiscing elit.Donec posuere, quam in eleifend dictum, risus ipsum venenatis dui, vel blandit tortor mauris non nunc. Vivamus faucibus congue ex, ut congue arcu mollis sed. Sed feugiat dolor nec tortor dictum, in efficitur augue rutrum. Aenean tempor orci tortor, ullamcorper malesuada ipsum rhoncus egestas.	Donec finibus faucibus vehicula. Phasellus et leo eros. Aenean rutrum est nulla, vel fermentum ante congue id. Praesent luctus ex eget facilisis pulvinar. Proin eu tincidunt dui, ac fermentum tortor.Aenean fermentum molestie nisl in cursus. Duis lectus ex, malesuada sed pulvinar ac, dapibus at tortor. Maecenas et est tortor.Integer tempor id dui at fermentum. Sed congue leo euismod tortor porttitor, non ornare nisi semper.";


System.out.println("lorem tiene: " + lorem.length() + " letras");
System.out.println("---------------");
char[] aVocales =lorem.toLowerCase().toCharArray();
char vocal ='a';
char [] vocales = {'a','e','i','o','u'};
int contadorVocales=0;
for (int i = 0; i < aVocales.length; i++) {
	vocal=aVocales[i];
	for (int j = 0; j < vocales.length; j++) {
			if (vocales[j]==vocal) {
				contadorVocales++;
				break;
			}
	}

}

System.out.println("lorem tiene: " + contadorVocales + " vocales");
System.out.println("---------------");
System.out.println("lorem tiene: " + lorem.split(" ").length + " palabras");

System.out.println("---------------");
int contador=0;
lorem=lorem.toLowerCase();
String palabra="at";
while (lorem.indexOf(palabra) > -1) {
    lorem = lorem.substring(lorem.indexOf(
    		palabra)+palabra.length(),lorem.length());
    contador++; 
}

System.out.println(palabra);
System.out.println("la Palabra 'at' aparece: "+ contador + " veces");
String prueba="El perro at es at verde at";
int contador2=0;
while (prueba.indexOf(palabra) > -1) {
    prueba = prueba.substring(prueba.indexOf(
    		palabra)+palabra.length(),prueba.length());
    contador2++; 
}
System.out.println("segundo contador: "+ contador2);
	}
}
