package ejercicios.generales;

import java.util.Scanner;

public class Tablamultiplicar {

	public static void main(String[] args) {

		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int numero = 0;
		System.out.println("escribe un numero: ");
		numero = Integer.parseInt(sc.nextLine());

		for (i = 0; i <= 10; i++) {

			resultado = numero * i;
			System.out.println(" " + i + "-> " + numero + " * " + i + " resultado " + resultado);

		}

		sc.close();

	}

}
