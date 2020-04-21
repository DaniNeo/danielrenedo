package juego;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		String[] palabras = {"elefante","amor", "casa"};
		int posicionalternativa= (int) Math.floor(Math.random()*palabras.length);
		String palabra = palabras[posicionalternativa];
		
		System.out.println(palabra);
		boolean verdadero=false;
		
		
			
		
		char [] letras = palabra.toCharArray();
		char[] letrasGuiones= new char[letras.length];
		
		
		for(int i=0; i<letras.length; i++) {

			letrasGuiones[i]='.';
			
			
		}
	
		
		
			
		
		System.out.println(letrasGuiones);
		while(verdadero==false) {
		System.out.println("Introduce una letra: ");
		Scanner teclado= new Scanner(System.in);
		char letraIntroducida = teclado.next().charAt(0);
	
		for(int i=0; i<letras.length; i++) {
			if(letras[i]==letraIntroducida){
			letrasGuiones[i]=letraIntroducida;
			System.out.println(letrasGuiones[i]);	
			
			
			if (Arrays.equals(letras,letrasGuiones)){
				
				verdadero=true;
			 }
			System.out.println(letrasGuiones);
			
				
		}
		
		}
		
		
		}
		
			
		
		
		
		System.out.println(letrasGuiones);
	
		
		
		
		
	}
}
