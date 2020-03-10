package ejercicios.casa;

import java.util.Scanner;

public class MediaNumeros2 {

	/**
	 * PEDIR TRES NUMEROS POR PANTALLA Y SACAR LA MEDIA
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2, numero3 = 0;
		float media;

		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el numerouno: ");
		String linea = sc.nextLine();
		numero1 = Integer.parseInt(linea);

		System.out.println("introduce el numerouno: ");
		String linea2 = sc.nextLine();
		numero2 = Integer.parseInt(linea2);

		System.out.println("introduce el numerouno: ");
		String linea3 = sc.nextLine();
		numero3 = Integer.parseInt(linea3);

		media = (numero1 + numero2 + numero3) / 3f;// ahi que poner en decimal para que el float salga en decimal o f al

		System.out.println("media: " + media);
		sc.close();
	}

}
