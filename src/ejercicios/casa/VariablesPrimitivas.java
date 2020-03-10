package ejercicios.casa;

public class variablesprimitivas {

	public static void main(String[] args) {

		/*
		 * las variables primitivas siempre empizan por minuscula y siempre tienen un
		 * valor inicial
		 */

		// boleanos

		boolean tienescoronavirus = true; // valor por defecto en el standard false

		// enteros

		byte bite = 0;// 1bytes=8bits
		int entero = 0; // 4 bytes
		long largue = 0; // 8 bytes
		short corto = 0; // 2 bytes

		// reales
		float numeroflotante = 2f; // es necesario poner f al final o float al principio
		double masgrande = 6; // no hace falta poner el tipo
		// letras
		char letra = 'a';
		char letraA = 65;

		/**
		 * wrappers: spmn clases que nos ayudan a trabajar con las variables primitivas
		 * estan empiezan siempre con mayusculas int->Integer boolean->Boolean
		 * car->Character ...<br>
		 * ... html .../n en el string
		 */

		System.out.println("ocupa 32 bits: " + Integer.SIZE);
		System.out.println("valor minimo: " + Integer.MIN_VALUE + " max ocupa: " + Integer.MAX_VALUE);

		String numeroEnFormatoTexto = "23";
		int numero2 = 2;
		int total = numero2 + Integer.parseInt(numeroEnFormatoTexto);
		System.out.println("total: " + numeroEnFormatoTexto + "-------" + numero2 + " numerodos ");

	}// main

}// clase
