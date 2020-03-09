package çejercicios.basicos.estructura.condicional;


import java.io.IOException;
import java.util.Scanner;

public class cuatro {
	public static void main(String[] args) throws IOException {
		char a;
		char b;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("introduzca el valor del caracter a: ");
		a =(char)System.in.read();
		sc.hasNextLine();
		

		System.out.print("introduzca el valor del caracter b: ");
		b =(char)System.in.read();
		
		if ( a == b){
			System.out.println("son iguales los caracteres");
		}else {
			
			System.out.println("no son iguales los caracteres");
				
			}
		sc.close();
		}
		
	}

