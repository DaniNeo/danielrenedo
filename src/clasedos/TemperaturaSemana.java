package clasedos;

import java.util.Scanner;

public class TemperaturaSemana {

	/**
	 * 
	 * 
	 * pedir al usuario la temperatura de los dias de la semana, comenzando por el
	 * lunes<br>
	 * Mostrar por pantalla la media de la temperatura de la semana y la temperatura
	 * mas alta y mas baja
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		float temperaturamax = 0f;
		float temperaturamin = 0f;
		int temperatura = 0;
		int mediatemp = 0;
		int sumatemp = 0;
		final String[] DIAS_SEMANAS = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < DIAS_SEMANAS.length; i++) {
			System.out.println(DIAS_SEMANAS[i]);

			System.out.println("temperatura dia: ");
			temperatura = Integer.parseInt(sc.nextLine());

			sumatemp = temperatura + sumatemp;
			temperaturamin = Integer.MIN_VALUE; // Integer.MIN_VALUE;
			temperaturamax = Integer.MAX_VALUE;
		}

		System.out.println("la temperatura maxima es: " + temperaturamin);
		System.out.println("la temperatura maxima es: " + temperaturamax);
		mediatemp = sumatemp / DIAS_SEMANAS.length;
		System.out.println("temperatura es de media: " + mediatemp);
		sc.close();
	}

}
