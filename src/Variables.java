import java.text.NumberFormat;
import java.util.Iterator;

/*
 * Ejercicio para probar las variables de Java
 */
public class Variables {
	/**
	 * mediante esta funcion crearemos una tabla con los simbolos de check"\u2714" y cross "\u2716"
	 * @param valor boolean
	 * @return si valor true check y si false cross
	 */
		public static char dameSimbolo ( boolean valor) {
			char resul = '\u2716';
			if (valor) {
				resul = '\u2714';
			}
			return resul;
		}
		
	
	public static void main(String[] args) {
	
		System.out.println("Ejercicio con Variables");
		
		System.out.println("1. Enteros");
		System.out.println("2. Reales");
		System.out.println("3. Boleanas");
		System.out.println("4. Caracteres");
		
		
		
		System.out.println("Enteros:");
		
		//TODO terminar de poner el resto
		System.out.println("int "+ Integer.BYTES+" bytes entero " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE );
		System.out.println("float "+ Float.BYTES+" bytes entero " + Short.MIN_VALUE + " " + Short.MAX_VALUE );
		System.out.println("double "+ Double.BYTES+" bytes entero " + Double.MIN_VALUE + " " + Double.MAX_VALUE );
		System.out.println("boolean " + " bytes entero " + Short.MIN_VALUE + " " + Short.MAX_VALUE );
		
		System.out.println("Reales:");		
		float sueldoMesGerman = 1200.23f;		
		System.out.println("German cobra " + NumberFormat.getInstance().format(sueldoMesGerman) + " € al mes");
		
		String sSueldoGerman = String.valueOf(sueldoMesGerman);
		sSueldoGerman = sSueldoGerman.replace('.', ',');
		System.out.println("German cobra " + sSueldoGerman + " € al mes");
		
		
		//TODO declarar una variable primitiva de cada tipo y usar su Wrapper		
		
		/*char variable1 = 'a';
		char variable2 = 'F';
		char variable3 = '3' ;
		char variable4 = 'j';*/
		
		char [] chars = {'a','F','3','j'};
		
		
		/*boolean mayusculas1= Character.isUpperCase(variable1);
		boolean mayusculas2= Character.isUpperCase(variable2);
		boolean mayusculas3= Character.isUpperCase(variable3);
		boolean mayusculas4= Character.isUpperCase(variable4);
		boolean mayusculas5= Character.isUpperCase(variable5);
		System.out.println(variable1 + mayusculas1);
		System.out.println(variable2 + mayusculas2);
		System.out.println(variable3 + mayusculas3);
		System.out.println(variable4 + mayusculas4);
		System.out.println(variable5 + mayusculas5);
		*/
		
		
		
		
		
		
		
		System.out.println("   " + " digito " +" letra " + " Mayusculas " + " minusculas ");
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i] + "		" + dameSimbolo(Character.isDigit(chars[i]))+ "    "
								+dameSimbolo(Character.isLetter(chars[i]))+ "     "
								+dameSimbolo(Character.isUpperCase(chars[i]))+ "     " 
								+dameSimbolo(Character.isLowerCase(chars[i])));
		}
		
	
		/*System.out.println(variable1+"   " + Character.isDigit(chars[i])+ "   " + Character.isLetter(chars[i])+ "   " +Character.isUpperCase(chars[i])+ "   " +Character.isLowerCase(chars[i]));
		System.out.println(variable2+"   " + Character.isDigit(variable2)+ "   " +Character.isLetter(variable2)+ "   " +Character.isUpperCase(variable2)+ "   " +Character.isLowerCase(variable2));
		System.out.println(variable3+"   " + Character.isDigit(variable3)+ "   " +Character.isLetter(variable3)+ "   " +Character.isUpperCase(variable3)+ "   " +Character.isLowerCase(variable3));
		System.out.println(variable4+"   " + Character.isDigit(variable4)+ "   " +Character.isLetter(variable4)+ "   " +Character.isUpperCase(variable4)+ "   " +Character.isLowerCase(variable4));
		String charToPrint = "u2714";
		System.out.println(charToPrint);
	*/
	
	}
	
	
	
}




