package introduccion.herencia;


import java.util.ArrayList;
import java.util.Scanner;

import introduccion.herencia.*;

public class principal    {

	public static void main(String[] args) {
	
		String nom ="";
		String tipo ="";
		int pulg = 0;
		int prec = 0;
		
		
		ArrayList <Electrodomestico> el = new ArrayList <Electrodomestico>();
		televisionplana tvplasma = new televisionplana();
		
		
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Iniciar programa");
		System.out.println();
		System.out.println("Te recojo los datos de tu televisor de plasma:...");
		System.out.println("nombre del televisor: ");
		nom=sc.nextLine();
		System.out.println("pulgadas: ");
		pulg=Integer.parseInt(sc.nextLine());
		System.out.println("tipo pantalla: ");
		tipo=sc.nextLine();
		System.out.println("precio: ");
		prec=Integer.parseInt(sc.nextLine());
		tvplasma.setNombre(nom);
		tvplasma.setPulgadas(pulg);
		tvplasma.setTipopantalla(tipo);
		tvplasma.setPrecio(prec);
		
		el.add(tvplasma);
		
	}

}
