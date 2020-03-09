package ejercicios.generales;

import java.util.Scanner;

public class uno {

	/*
	 * 
	 * Programa Java que pide un número entero por teclado y calcula y muestra el
	 * número de cifras que tiene.
	 * 
	 * Por ejemplo si se introduce el número 54391 el programa mostrará el mensaje:
	 * 
	 * El número tiene 5 cifras
	 * 
	 * Si se introduce el número 101 se mostrará el mensaje:
	 * 
	 * El número tiene 3 cifras
	 * 
	 * El proceso leer un número y contar sus cifras se repetirá hasta que se
	 * conteste ‘N’ a la pregunta Continuar? (S/N) Si se responde 'S' se volverá a
	 * pedir otro número.
	 * 
	 * Para saber cuántas cifras tiene un número entero haremos lo siguiente:
	 * 
	 * Dividiremos el número sucesivamente entre 10. En cada división tomaremos la
	 * parte entera y volvemos a dividir. Este proceso se repite hasta que se
	 * obtenga un cero como cociente en la división.
	 * 
	 * Por ejemplo, si el número leído es 1234 haremos las siguientes operaciones:
	 * 
	 * 1234 / 10 = 123 123 / 10 = 12 12 / 10 = 1 1 / 10 = 0
	 * 
	 * hemos realizado 4 divisiones hasta obtener un cero como cociente, por lo
	 * tanto el número tiene 4 cifras.
	 */

	public static void main(String[] args) {
		int i = 1;
		boolean verdadero = true;
		String resp = "";
		int numero = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una respuesta de si o no para realizar el ejercicio: ");
		resp = sc.nextLine();

		if (resp.equalsIgnoreCase("SI")) {

			System.out.println("Escribe un numero de cinco cifras: ");
			numero = Integer.parseInt(sc.nextLine());

			do {
				i++;

				numero = numero / 10;

				if (numero > 0 && numero <= 10) {

					verdadero = false;
				}

			} while (verdadero == true);

		} else {
			System.out.println("no");
		}
		System.out.println("el numero de cifras del numero es: " + i);

	}

}
