package ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class gestionStock {

	public static void main(String[] args) {
		
		
		ArrayList <Comercio> acomercio= new ArrayList <Comercio>();
		String opcion="";
		int opc=0;
		Scanner teclado=new Scanner(System.in);
		Producto pd=new Producto();
		Comercio comercio = new Comercio();
		Producto prod=new Producto();
		boolean respuesta=true;
		
		do{
			
		
		System.out.println("COMERCIO");
		System.out.println();
		System.out.println(comercio.toString());
		System.out.println(prod.toString());
		System.out.println("A:Añadir al stock de la tienda");
		System.out.println("B:vender producto");
		System.out.println("C:veder servicio informático");
		
		
		
		opcion= teclado.nextLine();
		System.out.println(opcion);
		opcion=String.valueOf(opcion).toUpperCase();
		if (opcion.contentEquals("A") || opcion.contentEquals("b") || opcion.contentEquals("C")){
			respuesta=false;
		}else{
				respuesta=true;
			}
		
	
		
		} while (respuesta);		
		do{
		switch (opcion) {
		case "A":
			
				do{
				
				System.out.println("AÑADIR AL STOCK DE LA TIENDA");
				System.out.println();
				
				System.out.println("A:Disco Duro");
				System.out.println("B:Procesador");
				System.out.println("C:Grafica");
				
				opcion=teclado.nextLine();
			
				System.out.println(opcion);
				opcion=String.valueOf(opcion).toUpperCase();
				if (opcion.contentEquals("A") || opcion.contentEquals("b") || opcion.contentEquals("C")){
					respuesta=false;
				}else{
						respuesta=true;
					}
				
				
				switch (opcion) {
				case "A":
					
					System.out.println("Añadir Disco Duro");
					System.out.println("La referecia es: ");
					int rf= Integer.parseInt(teclado.nextLine());
					System.out.println("Capacidad: ");
					String capac= teclado.nextLine();
					System.out.println("velocidad: ");
					int velo=Integer.parseInt(teclado.nextLine());
					System.out.println("ssd");
					boolean sd=Boolean.parseBoolean(teclado.nextLine());
					DiscoDuro cd=new DiscoDuro(capac,velo,sd);
					prod.setReferencia(rf);
					acomercio.add(prod);
					acomercio.add(cd);
					System.out.println("Discoduro: "+acomercio.toString());
					respuesta=false;
					break;
					
				case "B":
					
					
					System.out.println("Procesador");
					
					System.out.println("Modelo: ");
					String modelo= teclado.nextLine();
					System.out.println("velocidad: ");
					int veloc=Integer.parseInt(teclado.nextLine());
					Procesador pro=new Procesador(modelo,veloc);
					acomercio.add(pro);
					System.out.println("Procesador: "+acomercio.toString());
					respuesta=false;
					
					
					break;
					
				case "C":
					
					System.out.println("Grafica");
					
					System.out.println("Memoria: ");
					int mem= Integer.parseInt(teclado.nextLine());
					System.out.println("Conexion: ");
					int conex=Integer.parseInt(teclado.nextLine());
					System.out.println("Clase Procesador");
					String proc=teclado.nextLine();
					Grafica gf= new Grafica(mem, conex, proc);
					acomercio.add(gf);
					System.out.println("Grafico: "+acomercio.toString());
					respuesta=false;
					
					
					break;
					
				default:
					System.out.println("El valor por de entrada es A , a , B , b , C, c");
					
					break;
				}
				} while (opcion=="A" || opcion=="B" || opcion=="C" || respuesta);
				
				
				
		case "B":
			
			System.out.println("VENDER PRODUCTO");
			System.out.println();
			System.out.println("Dime la referencia del producto");
			int ref=Integer.parseInt(teclado.nextLine());
			
		
			for (Comercio comercio2 : acomercio) {
				
				
				acomercio.toString();
				
			}
			acomercio.remove(ref);
			for (Comercio comercio2 : acomercio) {
				
				acomercio.toString();
				System.out.println("la referencia es: "+ref);
				System.out.println("producto: "+acomercio.equals(prod.getReferencia()));
			}
			
			break;
			
		case "C":
			
			
			
			
			break;
			
		default:
			System.out.println("El valor por de entrada es A , a , B , b , C, c");
			
			break;
		}
			if (opcion.contentEquals("A") || opcion.contentEquals("b") || opcion.contentEquals("C")){
				respuesta=false;
			}else{
					respuesta=true;
				}
			
	
				//fin del switch
	} while( respuesta); 
		
		

	}//fin del main
}//fin clase
