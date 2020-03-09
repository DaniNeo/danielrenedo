package ejercicios.generales;

import java.util.Scanner;

public class PasardegradoscentígradosakelvinenJava {

	public static void main(String[] args) {

		float temperatura = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe la temperatura en centigrados: ");
		temperatura = Integer.parseInt(sc.nextLine());
		System.out.println("La temperatura en kelvin es: " + (temperatura + 270) + "º");

	}

}
