package expeciones;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
	 * calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con la
	 * división por cero. Pruebe a introducir b=”Carlos” para ver cómo se comporta
	 * el programa. Añada excepciones para recoger estas excepciones y avisar del
	 * problema al usuario
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b = 0;

		boolean repetir = true;

		do {
			System.out.println("Lee un numero a: ");
			a = (int) Integer.parseInt(sc.nextLine());
			System.out.println("Lee un numero b: ");
			b = (int) Integer.parseInt(sc.nextLine());
			try {

				System.out.println("try....");
				System.out.println("Estas escribiendo a un numero....bien");
				System.out.println(Integer.toString(a));
				System.out.println("Escribe un numero b: ....bien");
				System.out.println(Integer.toString(b));
				repetir = false;

			} catch (Exception e) {
				System.out.println("catch....");
				System.out.println("Has escrito una letra ");
				e.printStackTrace();
			}

		} while (repetir == true);
		System.out.println("La suma es: " + Integer.sum(a, b));
		sc.close();
	}

}
