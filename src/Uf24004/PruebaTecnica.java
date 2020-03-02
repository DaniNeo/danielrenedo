package Uf24004;

public class PruebaTecnica {

	public static void main(String[] args) {

		System.out.println("prueba tecnica");

		for (int i = 0; i < 10; i++) {

			System.out.println("Esta es la iteraccion numero" + i + " dentro del i");

			if (i == 0) {
				System.out.println(i + "Es cero ");
			} else if (i % 2 == 0) {
				System.out.println(i + "Es par");
			} else {
				System.out.println(i + "Es impar");
			}
		}

	}

}
