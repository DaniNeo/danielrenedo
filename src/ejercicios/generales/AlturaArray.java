package ejercicios.generales;

import java.util.Scanner;

public class AlturaArray {

	public static void main(String[] args) {

		float[] ar = new float[4];
		Scanner sc = new Scanner(System.in);
		float suma = 0.0f;
		float media = 0.0f;

		for (int i = 0; i < ar.length; i++) {

			System.out.println();

			System.out.println("Introduce la altura" + (i + 1) + ": ");

			ar[i] = Integer.parseInt(sc.nextLine());
			System.out.println("La primera altura es.....");
			System.out.println("altura:" + ar[i] + "cms");
			suma = ar[i] + suma;

		} // final del for
		media = suma / ar.length;
		System.out.println("media de altura: " + media + "cms");

	}// final del main

}// fin clase
