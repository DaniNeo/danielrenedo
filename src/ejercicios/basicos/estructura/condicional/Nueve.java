package ejercicios.basicos.estructura.condicional;


import java.util.*;
import java.io.IOException;

import java.util.Scanner;

public class Nueve {
	 /*
	 * Programa java que lea tres números enteros H, M, S que contienen hora, minutos y
	 * segundos respectivamente, y comprueba si la hora que indican es una hora válida.
	 */
	public static void main(String[] args) throws IOException  {
		
	
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Escribe la hora en horas: ");
		h= System.in.read();	
		
	*/
	
		char a;
		

		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe la hora por teclado: ");
		a = (char)System.in.read();
		sc.hasNextLine();
	    
	    	   
	    
	     if( (a=='a' || a=='z' || a=='A' || a =='Z') && (a<0 || a>24) ){
	    	 System.out.println("es un caracter...introduce un  digito o no esta dentro de la hora....");
	    	 
	    	 System.out.println("Introduzca la hora: ");
	    	 a=(char)System.in.read();
	    	 sc.hasNextLine();
	    	 System.out.println("la hora es : "+a);
	     }else {
	    		 System.out.println("esta dentro de la hora...es:"+a);
	    	 
			
	     	}
	     
	         	 
	     sc.close();
	
	}
	     
}	     
		
			
		/*System.out.println("Escribe la hora en minutos: ");
		m= (char)System.in.read();
		
		
		if ( h<0 || h>60){
			System.out.println("es un caracter hay que introducir un numero por teclado");
			System.out.println("Escribe la hora en minutos: ,comprenidas entre 0 horas y 60 horas");
			m = (char)System.in.read();
			sc.nextLine();
		}else{
				 	
				System.out.println("ok");
				
			}
				
		System.out.println("Escribe la hora en segundos: ");
		s= (char)System.in.read();	
		
		if ( h<0 || h>60){
			System.out.println("es un caracter hay que introducir un numero por teclado");
			System.out.println("Escribe la hora en segundos: ,comprenidas entre 0 horas y 12 horas");
			s = (char)System.in.read();
		}else{
				System.out.println("ok");
			}
		
		sc.close();
		

	}
*/

