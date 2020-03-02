package clasedos;

import java.util.Scanner;

public class Paises {

	public static void main(String[] args) {

		final String[] PAISES = { "Noruega", "Alemania", "RepublicaCheca", "Italia" };

		boolean[] PaisesInfectados = { false, false, false, false };
		int[] NumeroInfectados = { 0, 0, 0, 0 };
		int recuentosi = Integer.MAX_VALUE;
		int recuentono = Integer.MAX_VALUE;

		/*
		 * recorrer paises y preguntar si existe algun caso de coronavirus en caso
		 * afirmativo,preguntar numero de infectados finalmente 1:mostrar paises libres
		 * de coronavirus 2:mostrar paises infectados con su mnuemro de casos 2: total
		 * numero de personas infectadas
		 * 
		 */

		PaisesInfectados[1] = true;// muestra
		NumeroInfectados[1] = 5;/// muestra
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < PAISES.length; i++) {

			System.out.println(PAISES[i]);
			System.out.println("Existe un caso de coronavirus en su pais: ,'si' o no");
			String linea = sc.nextLine();
			if (linea.equalsIgnoreCase("si")) {
				System.out.println(PAISES[i]);
				recuentosi++;

			} else if (linea.equalsIgnoreCase("no")) {
				System.out.println(PAISES[i]);
				recuentono++;
			}

		}

		System.out.println("numero de casos total: " + recuentosi);ç
		sc.close();
	}
}
