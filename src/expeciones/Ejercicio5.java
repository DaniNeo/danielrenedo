package expeciones;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) throws Throwable {
		int opc = 0;
		boolean respuesta = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("Un numero: ");
		opc = Integer.parseInt(sc.nextLine());
		try {

			switch (opc) {
			case 1:

				throw new NullPointerException();
			case 6:
				throw new IOException();
			case 2:
				throw new NumberFormatException();
			case 3:
				throw new SecurityException();

			default:
				System.out.println("El valor por defecto va de 1 a 6");
				break;
			}// fin switch
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// fin del main
}// fin clase
