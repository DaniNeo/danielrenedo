package ejercicios.basicos.estructura.condicional;

import java.io.IOException;
import java.util.Scanner;

public class Siete {

	/*
	 * Ejemplo de programa con estructura condicional
	 * Programa que lea dos números por teclado y muestre el resultado
	 * de la división del primero por el segundo.
	 * Se comprueba que el divisor es distinto de cero.
	 */
	
	public static void main(String[] args) throws IOException {
		
		int a,b;
	

		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un numero por teclado: ");
		a = System.in.read();
		sc.hasNextLine();
		System.out.println("Escribe un segundo numero por teclado: ");
		b= System.in.read();
		
		if( (a<='0' && b<='0' || a<b) ){
			System.out.println("para hacer la division tendriamos que meter valores mayores que cero y positivos y valores"
					+ "donde el dividendo sea mayor al divisor");
		}else{
			System.out.println("El resultado de la division es: " +a/b);
				
			}
		
		
		sc.close();
	}

	}


