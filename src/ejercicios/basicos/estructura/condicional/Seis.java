package ejercicios.basicos.estructura.condicional;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Seis {
/*
 * La primera consiste en comprobar si el carácter es un dígito mediante el método isDigit
 * de la clase Character. Este método devuelve 
 * true si el carácter que se le pasa como parámetro es una cifra entre 0 y 9:
 */
	public static void main(String[] args) throws IOException {
		
		char a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("escribe un caracter: ");
		a = (char)System.in.read();
		sc.hasNextLine();
		if(Character.isDigit(a)){  ///isDigit es un metodo que devuelve true en caso de que el caracare es una cifra entre 0 y 9
			System.out.println("caracter esta entre 0 y 9");
		}else{
			System.out.println("caracter no entre 0 y 9");
		}
		sc.close();
	}
}
