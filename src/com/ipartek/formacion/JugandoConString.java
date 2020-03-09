package com.ipartek.formacion;

public class JugandoConString {

	public static void main(String[] args) {

		// ¿ Que valor tiene por defecto un String si no lo inicializamos ?
		String sinInicializar;

		String nombre = " AaAnN 5 ";

		// longitud
		System.out.println("Longitud del nombre " + nombre.length());

		// numero vocales
		int numeroVocales = 0;
		int numeroMayusculas = 0;
		int numeroMinusculas = 0;
		int numeroConsonantes = 0;

		// TODO contar numeros y espacios en blanco

		char caracter;
		for (int i = 0; i < nombre.length(); i++) {

			caracter = nombre.charAt(i);
			System.out.println("En la posicion " + i + " tenemos caracter " + caracter);

			// contar mayusculas y minusculas
			if (Character.isLowerCase(caracter)) {
				numeroMinusculas++;
			}
			if (Character.isUpperCase(caracter)) {
				numeroMayusculas++;
			}

			// Contar (Vocales o Consonates) Si => es Letra

			if (Character.isLetter(caracter)) {

				caracter = Character.toLowerCase(caracter);
				switch (caracter) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					numeroVocales++;
					break;

				default:
					numeroConsonantes++;
					break;
				}// switch

			} // if isLetter

		} // for

		System.out.println("Numero Mayusculas " + numeroMayusculas);
		System.out.println("Numero Minusculas " + numeroMinusculas);
		System.out.println("Numero Vocales " + numeroVocales);
		System.out.println("Numero Consonantes " + numeroConsonantes);

		// numero de palabras

		String palabras = "hola mi nombre es Ander";
		String[] arrayPalabras = palabras.split(" ");

		System.out.println("Tenemos " + arrayPalabras.length + " palabras en la frase");

		String lineaCVS = "jose;froilan;16;35.000";
		// TODO mostrar nombre y apellido, la edad y el sueldo anual

		// buscar posicion de una letra concreta
		String buscarLetra = "Abracadrabra";
		System.out.println("La primera b esta en la poscion " + buscarLetra.indexOf('b'));
		System.out.println("La primera a esta en la poscion " + buscarLetra.indexOf('a'));
		System.out.println("¿Que pasa si no encuentra? " + buscarLetra.indexOf('z'));
		// TODO buscar primera 'd'
		System.out.println("buscar la primera d " + buscarLetra.indexOf('d'));

		// TODO buscar posicion ultima 'a'
		System.out.println("buscar la ultima a " + buscarLetra.lastIndexOf('a'));

		// limpiar espacios en blanco
		String datosIntroducidosUsuario = "    minombre     es Manolo    ";
		String limpiarEspacios = datosIntroducidosUsuario.trim();
		limpiarEspacios = limpiarEspacios.replace("  ", "");
		System.out.println(limpiarEspacios);

		// TODO cambiar numeros por letras y ademas pasar todo a MAYSUCULAS
		String textoCodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";

		System.out.println("escribe la cadena texto codificado: " + textoCodificado.toUpperCase());
		String descodificado = "m1 n0mb3 3s m4n0l0 ";

		descodificado = descodificado.replaceAll("h0l4", "hola");
		descodificado = descodificado.replaceAll("m1", "mi");
		descodificado = descodificado.replaceAll("n0mb3", "nombre");
		descodificado = descodificado.replaceAll("3s", "es");
		descodificado = descodificado.replace("m4n0l0", "manolo");
		System.out.println(descodificado + " y " + textoCodificado);
		String dni = "2111112";

		int auxsuma = 0;

		for (int i = 0; i < dni.length(); i++) {

			auxsuma = auxsuma + Character.getNumericValue(dni.charAt(i));

			System.out.println("el valor del dni es: " + dni.charAt(i));

			System.out.println("La suma total es: " + auxsuma);
		}

		int letra = auxsuma % 23;
		int aux = 0;
		for (char l = 'a'; l < 'z'; l++) {

			aux++;
			if (aux == letra) {
				System.out.println("La letra del dni es : " + l);
				// TODO buscar por interenet como se calcula la letra
			} // fin del if
		}
	}// fin del main
}// fin de la clase
