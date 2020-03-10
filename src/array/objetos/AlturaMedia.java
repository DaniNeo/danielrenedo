package array.objetos;

import java.util.ArrayList;
import java.util.Scanner;;

public class AlturaMedia {
	/**
	 * Programa Java que pida por teclado las alturas de N alumnos de una clase y
	 * las guarde en un ArrayList de tipo Double. A continuación el programa
	 * calculará la altura media de todos los alumnos, cuantos alumnos hay más altos
	 * que la media y cuantos más bajos. Para resolverlo vamos a utilizar 4 métodos
	 * además del método main: Método numeroAlumnos(): este método pide por teclado
	 * el número de alumnos de la clase y devuelve dicho número al programa
	 * principal. Método leerAlturas(): pide por teclado las alturas de los N
	 * alumnos y las almacena en el ArrayList. Este método recibe como parámetros el
	 * ArrayList inicialmente vacío y el número de alumnos a leer. Método
	 * calcularMedias(): calcula y devuelve la media de los alumnos de la clase.
	 * Este método recibe como parámetro el ArrayList con las alturas de todos los
	 * alumnos. Método mostrarResultados(): muestra por pantalla todas las alturas y
	 * calcula y muestra el número de alumnos con altura superior e inferior a la
	 * media. Recibe como parámetros el ArrayList con las alturas de todos los
	 * alumnos y la media calculada anteriormente.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		System.out.println("Iniciar programa");
		System.out.println("Los alumnos que esta escribiendo: " + NumeroAlumnos());
		ArrayList<Double> ar = new ArrayList<Double>();
		for (int i = 0; i < ar.size(); i++) {
			ar.add((double) 0);

		}
		System.out.println("");

		LeerAlturas(NumeroAlumnos(), ar);
		CalcularMedias(ar);

	}

	public static int NumeroAlumnos() {
		Scanner sc = new Scanner(System.in);

		int numAlumnos = 0;
		System.out.println("Numero de Alumnos para introducir: ");
		numAlumnos = Integer.parseInt(sc.nextLine());
		return numAlumnos;

	}// final del NumeroAlumnos
	/*
	 * Ahora creamos un metodo LeerAltura con el tamaño N alumnos del metodo de
	 * NumerodeAlumnos y y las introducimos en la lista de alturas por alumnos
	 */

	public static void LeerAlturas(int N, ArrayList<Double> ar) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < N;) {

			Double altura = (double) 0;

			do {

				System.out.println("Introduce la altura del alumno: ");
				altura = Double.parseDouble(sc.nextLine());
				i++;
			} while (i < N);

			ar.add(altura);
			sc.close();

		} // fin del for

	}// fin leer alturas

	/*
	 * CalcularMedias nos calcula la media de la lista de alturas de los alumnos
	 */
	public static void CalcularMedias(ArrayList<Double> a) {

		int media = 0;

		for (int i = 0; i < a.size(); i++) {

			media = (int) Double.sum(media, a.get(i));
		}
		System.out.println("La media es: " + media);

	} // final CalcularMedias

}// final de la clase
