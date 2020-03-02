package Uf24004;
/*
 *podemos comentar varias lineas de codigo
 * 
 */
public class HolaMundo {
	// LAS CLASES EMPIEZAN CON MAYUSCULA
	// las variable empiezan con minuscula
	// todo nuestro codigo para ejecutar debe esta dentro del MAIN

	public static void main(String[] args) {
		/*
		 * String es el tipo de la varible nombre: es la variable ander el valor que le
		 * asignamos a la variable
		 */

		String nombre = "ANDER";
		int edad = 38;
		float altura = 1.70f;// hay que poner una f al final o por delante
		float otraAltura = (float) 1.70;
		boolean isGoodday = true;

		System.out.println("Hola klase " + nombre);
		System.out.println("Edad es " + edad);
		System.out.println("Mi altura es : " + altura + "cm");
		System.out.println("mi otra altura es: " + otraAltura + "mets");
		System.out.println("Hoy tengo un dia bueno");
		System.out.println("Hoy es un dia de mierda");

		if (isGoodday) {
			System.out.println("verdadero es bueno");
		} else {
			System.out.println("falso es malo");

		}
		// usamos el + para concatenar las cadenas de texto o string
	}// final metodo main

}// final de la clase
