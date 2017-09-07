import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------Calculadora 21%-----------\n");
		int iva = 0;
		boolean continuar=false;
		boolean importeCorrecto =true;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("por favor introduce un importe en euros: ");
			//comprobar que sea numero
			do{
				try{
					 sc = new Scanner(System.in);
				float importe = sc.nextFloat();
				importeCorrecto=false;
				}catch (NullPointerException e) {
					// TODO: handle exception
					System.out.println("no se ha introducido ningun valor!");
				}catch (InputMismatchException e) {
					// TODO: handle exception
					System.out.println("Valor incorrecto introduce un numero, por ejemplo: 100");
				}
			catch (Exception e) {
				// TODO: handle exception
				System.err.println("ha habido un error");
			}
				}while(importeCorrecto);
			System.out.println("el iva repercutido: " + importe * 0.21);

			System.out.println("Quieres continuar? (s/n) ");
			//Scanner sc2 = new Scanner(System.in);

			continuar = "s".equalsIgnoreCase(sc.next());
			}while (continuar);
				iva = 0;
			} else if (continuar==false) {
				iva = 1;
				break;
			} else {
				System.err.println("No es valido");
				iva = 0;
				sc.close();
			}

		
			}System.out.println("ha sido un placer ayudarte!");}}
