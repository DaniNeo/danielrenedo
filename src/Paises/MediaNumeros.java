package Paises;

import java.util.Scanner;

public class MediaNumeros {

	/**
	 * PEDIR TRES NUMEROS POR PANTALLA Y SACAR LA MEDIA
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el numerouno: ");
		Float.parseFloat(sc.nextLine());
		boolean terminar = true;
		float total = 0f;
		float numero = 0f;
		float contador = 0f;

		do {
			System.out.println("introduce el numerodos: ");
			Float.parseFloat(sc.nextLine());
			total = total + numero;
			System.out.println("quieres terminar'si'");

			String linea = sc.nextLine();
			if (linea.equalsIgnoreCase("si")) {

				terminar = false;
				contador++;
			}
		} while (terminar);

		sc.close();
	}
}
