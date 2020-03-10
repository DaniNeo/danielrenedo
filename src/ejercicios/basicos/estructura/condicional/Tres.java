package ejercicios.basicos.estructura.condicional;

import java.io.IOException;
import java.util.Scanner;

public class Tres {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        char car;
        System.out.print("Introduzca un carácter: ");
        car = (char)System.in.read();
        if (car>='A' && car<='Z'){
        	
        	System.out.println("mayuscula es" +car);
        	
        }else
        		System.out.println("minuscula es" +car);
        	
        }
		
	

	}


