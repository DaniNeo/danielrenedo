package com.ipartek.formacion.metodos;

import java.io.Serializable;

public class Utilidades {

	public static final String IDIOMA_CASTELLANO = "es";
	public static final String IDIOMA_EUSKERA = "eu";
	public static final String IDIOMA_INGLES = "en";

	static void saludar(String nombre) {
		System.out.println("Hola  " + nombre);
	}

	/**
	 * Saluda al nombre pasado por parametro en el idioma seleccionado
	 * 
	 * @see idiomas definidos en esta clase, por ejemplo: public static final String
	 *      IDIOMA_CASTELLANO
	 * @param nombre
	 * @param idioma
	 */
	static void saludar(String nombre, String idioma) {
		System.out.println("Hola  " + nombre);
	}

	static int suma(int a, int b) {
		return a + b;
	}

	@SuppressWarnings("unused")
	static char calcularLetraDni(int dni) {

		char resultado=' ';
		int resultados=0;
		
		resultados=dni% 23;
		
		
		for(int i='a'; i<Character.getType(resultados); i++) {
			resultado=Character.toChars(i);
		}
		
		return resultado;
			
	}

	static char calcularLetraDni(String dni) {
		// TODO cacular la letra vosotros
		return 'x';
	}

}
