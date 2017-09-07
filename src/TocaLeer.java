
public class TocaLeer {
 /*static String [] alumnos= {"Arkaitz",
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
 */
 static Participante[] alumnos = new Participante[15];
 
	public static void main(String[] args) {

		alumnos[0] = new Participante("arkaitz","arkaitzgl");
		alumnos[1] = new Participante("Erlantz1 ","erliglesias");
		alumnos[2] = new Participante("Fran ","FranPerez92");
		alumnos[3] = new Participante("Cristhian ","CristianVar");
		alumnos[4] = new Participante("Erlantz2 ","Erlantzcabrejas ");
		alumnos[5] = new Participante("Leire","LeireBustin");
		alumnos[6] = new Participante("mikel ","zoroa84");
		alumnos[7] = new Participante("Josu ","Katakume");
		alumnos[8] = new Participante("Alberto ","amsoria91");
		alumnos[9] = new Participante("Jon ","alarconsolis");
		alumnos[10] = new Participante("","");
		alumnos[11] = new Participante("Naiara ","naiaramateos");
		alumnos[12] = new Participante("Lander ","LanderAB");
		alumnos[13] = new Participante("Yeray ","LordBlacKhiin");
		alumnos[14] = new Participante("","");
		
		
		int numAleatorio=generarNumeroAleatorio( alumnos.length);
		//String alumnos="Ander";
		
		//numAleatorio=(int)(Math.random()*TocaLeer.alumnos.length);
		
		System.out.println("el afortunad@ es: " + alumnos[numAleatorio].getNombre());
		
		
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
