package arraylista;

import java.util.ArrayList;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		String respuesta="";
		boolean respuestados=true;
		 
		
		ArrayList <PrendaVestir> pv = new ArrayList<PrendaVestir>();
		
		
		do{
		System.out.println("Desesas introducir una prenda:.....");
		respuesta=teclado.nextLine();
		respuesta.toLowerCase();
		switch (respuesta) {
		case "si":
			String produc="";
			int talla=0;
			double precio=0;
			System.out.println("Añade un elemento nuevo a la lista de prendas");
			System.out.println("Nombre producto: ");
			produc=teclado.nextLine();
			System.out.println("Añade un elemento nuevo a la lista de prendas");
			System.out.println("Numero de talla: ");
			talla=Integer.parseInt(teclado.nextLine());
			System.out.println("Añade un elemento nuevo a la lista de prendas");
			System.out.println("Precio: ");
			precio=Double.parseDouble(teclado.nextLine());
			PrendaVestir prenda= new PrendaVestir(produc,talla,precio);
			pv.add(prenda);
			
			break;
			
		
		case "no":
			System.out.println("es no");
			for (PrendaVestir prendaVestir : pv) {
				
				prendaVestir.mostrarDatoProducto();
			}
			
			respuestados=false;
			break;
		
		
		default:
			System.out.println("Escribe una contestacion de si o no");
			break;
		}
		
	}while(respuestados);
	
		teclado.close();
	}

}
