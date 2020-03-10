package ejercicios.generales;

import java.util.Scanner;

public class NumerosAcabaDos {

	/*
	 * 
	 * pedir numero por pantalla hasta que escriba un negativo
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int doses = 0;
		int numero = 0;
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("escribe un numero por teclado: ");
			numero = Integer.parseInt(sc.nextLine());
			if (numero == 2) {
				doses++;
				continuar = false;

			}

			if (numero < 0) {
				continuar = false;
			}

		} while (continuar);

		System.out.println("adios terminar programa");
		System.out.println("tenemos contados doses: " + doses);

		sc.close();
	}

}
