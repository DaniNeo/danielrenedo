package Uf24004;

import java.util.Scanner;

public class PreguntaNumeroJava {

	public static void main(String[] args) {

		System.out.println("Dime un numero");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		System.out.println("Pregunta un numero: " + numero);
		teclado.close();

	}

}
