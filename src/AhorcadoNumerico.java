import java.util.InputMismatchException;
import java.util.Scanner;

public class AhorcadoNumerico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroGenerado = 5;
		boolean valorCorrecto = true;
		int numero = -1;
		System.out.println("--------Bienvenido al Ahorcado Numerico-----");
		for (int i = 0; i < 3; i++) {
			do {
				System.out.println("Introduce un numero: ");

				try {
					sc = new Scanner(System.in);
					numero = sc.nextInt();
					if(numeroGenerado==numero) {
						valorCorrecto=false;
					}
					//valorCorrecto = (numeroGenerado==numero) ? true : false;
				} catch (NullPointerException e) {
					// TODO: handle exception
					System.err.println("no se ha introducido ningun valor!");
				} catch (InputMismatchException e) {
					// TODO: handle exception
					System.err.println("Valor incorrecto introduce un numero, por ejemplo: 2");
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println("ha habido un error");
				}
			} while (valorCorrecto);
			if (valorCorrecto == false) {
				System.out.println("ENORABUENA");
				break;
			}
		}//for
	}

}
