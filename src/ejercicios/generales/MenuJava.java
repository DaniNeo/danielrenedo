package ejercicios.generales;

import java.util.Scanner;

/*
 * 
 * CREAR UN ARRAY DE 5 PERSONAS CON LAS ALTURAS CMS DE CADA UNA PIDIENDO POR TECLADO UNA
 * VEZ QUE HEMOS RELLENADO EL ARRAY CALCULAR LA ALTURA MEDIA Y CALCULAR EL MAS BAJO Y EL MAS 
 * ALTO
 * 
 * CREAR UN PROYECTO EN MODDO CONSOLA QUE NOS MUESTR UN MENU CON 3 OPCIONES:
 * 1-CALCULAR LA LETRA DEL DNI
 * 2-CALCULAR MEDIDA DE GRADOS A FHARENHEIT
 * 3-SALIR DEL MENU
 */
public class MenuJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean respuesta = true;
		int opcion = 0;

		do {

			System.out.println("1-Calcular la Letra del Dni");
			System.out.println("2-Calcular Medida de Grados a Kelvin");
			System.out.println("3-Salir del Menu");
			System.out.println();
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("La opcion es UNO, volvemos al menu....");
				System.out.println();
				break;

			case 2:
				System.out.println("La opcion es DOS, volvemos al menu....");
				System.out.println();
				break;

			case 3:
				System.out.println("La opcion es TRES, salimos del programa....");
				System.out.println();
				respuesta = false;
				break;

			default:
				System.out.println("La opcion es DEFECTO");
				break;
			}

		} while (respuesta);

		// final del metodo

	}// final del main

}// final de la clase
// TODO CALCULA MEDIA
// TODO CALULAR ALTURA MIN
// TODO CALCULAR ALTURA MAX
/*
 * FOR COLECCION DE DATOS DO WHILE AL MENOS UNA REPETICION WHILE UN BUCLE
 * REPETITIVO
 * 
 */
