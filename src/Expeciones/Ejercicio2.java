package Expeciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;

		boolean repetir = true;

		do {

			try {

				System.out.println("try....");
				System.out.println("Estas escribiendo a un numero....bien");
				b = Integer.parseInt(sc.nextLine());
				System.out.println("Escribe un numero b: ....bien");
				a = Integer.parseInt(sc.nextLine());
				if (true == Character.isDigit(a)) {
					repetir = false;
				}
				if (true == Character.isDigit(b)) {
					repetir = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("catch....");
				System.out.println("Has escrito una letra..... pon un numero por favor:.... ");

			} finally {
				System.out.println("fin del programa");
				repetir = false;
			}

		} while (repetir == true);
		System.out.println("La suma es: " + Integer.sum(a, b));
		sc.close();
	}

}
