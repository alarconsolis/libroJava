
public class TocaLeer {
 static String [] alumnos= {"Arkaitz",
							"Erlantz",
							"Fran",
							"Cristian",
							"Leire",
							"Mikel",
							"Josu",
							"Alberto",
							"Jon",
							"Naiara",
							"Lander",
							"German"};
 
 
	public static void main(String[] args) {

		int numAleatorio=generarNumeroAleatorio( alumnos.length);
		String alumnos="Ander";
		
		//numAleatorio=(int)(Math.random()*TocaLeer.alumnos.length);
		
		System.out.println("el afortunad@ es: " + TocaLeer.alumnos[numAleatorio]);
		
		
	}
	
	/**
	 * generamos de manera aleatoria un numero mediante una nueva funcion estatica introduciendo los valores:
	 * @param min --> valor minimo
	 * @param max --> valor maximo
	 * @return -->lo que esta funcion va a devolver
	 */
	public static int generarNumeroAleatorio(int max) {
		//TODO falta implementar logica
		int resultado =-1;
		
		resultado=(int) (Math.random()*max);
		
		return resultado;
	}
	
	
	
}
