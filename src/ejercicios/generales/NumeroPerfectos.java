package ejercicios.generales;

import java.util.Scanner;

public class NumeroPerfectos {
	/*
	 * 
	 * 
	 * Un número es perfecto si es igual a la suma de todos sus divisores positivos
	 * sin incluir el propio número.
	 * 
	 * Por ejemplo, el número 6 es perfecto.
	 * 
	 * El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor
	 * para comprobar si es perfecto.
	 * 
	 * Si sumamos 1 + 2 + 3 = 6
	 */
	public static void main(String[] args) {
		boolean perfecto = true;
		int divisor = 0;
		int numeroperfecto = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero perfecto: ");
		numeroperfecto = Integer.parseInt(sc.nextLine());
		for (int j = 1; j <= numeroperfecto || perfecto == true; j++) {

			perfecto = (numeroperfecto % j == 0);
			if (perfecto == true) {

				divisor = j;
				System.out.println("los divisores son: " + divisor);

			} else {
				perfecto = false;

			}
		}
		System.out.println("El numero " + numeroperfecto + " es perfecto: " + perfecto);

	}
}