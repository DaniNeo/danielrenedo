package objetos.avanzados;

import java.util.ArrayList;
import java.util.Scanner;




import objetos.avanzados.Cuadro; 

public class Cuadros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		boolean respuesta=true;
		int opcion=0;
		int N=0;
		 
		 ArrayList<Cuadro> Cuadrados = new ArrayList <Cuadro>();
		 
		 System.out.println("Iniciar programa");
		 do {
			 
			 System.out.println("quieres introducir datos...:");
			 respuesta=Boolean.parseBoolean(sc.nextLine());
			 
			 System.out.println("Escribe una opcion del 1 al 3....: ");
			 opcion=Integer.parseInt(sc.nextLine());
			 switch (opcion) {
			 
			 case 1:
				
				 System.out.println("opcion uno");
				 do {
			            System.out.println("Número de libros? ");
			            N = Integer.parseInt(sc.nextLine());
			        } while (N < 0);
			        
				 
				 for (int i=1; i<=N;i++) {
					
					 
					 System.out.println(" "+i);
					 System.out.println("titulo");
					
					 System.out.println("Introduce el titulo: ");
					 String titulos="";
					 titulos=sc.nextLine();
					 
					
					 System.out.println("Introduce el autor: ");
					 String autores= "";
					 autores=sc.nextLine();
					
					 System.out.println("Introduce la altura: ");
					 int alturas=0;
					 alturas=Integer.parseInt(sc.nextLine());
					 
					 System.out.println("Introduce el anchura: ");
					 int anchuras=0;
					 anchuras=Integer.parseInt(sc.nextLine());
					 
					 System.out.println("Introduce el año: ");
					 int años=0;
					 años=Integer.parseInt(sc.nextLine());
					
					 System.out.println("Introduce el precio: ");
					 int precios=0;
					 precios=Integer.parseInt(sc.nextLine());
					
					 System.out.println("Introduce si esta restaurado: ");
					 Boolean restaurados=true;
					 restaurados= Boolean.parseBoolean(sc.nextLine());
					
					 Cuadro crd=new Cuadro();
					 crd.setTitulo(titulos);
					 crd.setRestaurado(restaurados);
					 crd.setPrecio(precios);
					 crd.setAño(años);
					 crd.setAnchura(anchuras);
					 crd.setAutor(autores); 
					 crd.setAltura(alturas);
					 
					 Cuadrados.add(crd);	
					 }//fin del for
					
				
				break;
			
			case 2:
				
				System.out.println("mostrar datos...");
				for (Cuadro cuadro : Cuadrados) {
					System.out.println("Cuadro");
					System.out.println(cuadro.toString());
				}	
				
			
				break;
			
			case 3:
				System.out.println("Salir del programa...");
				respuesta=false;
				break;
			
			default:
				break;
			 
			 		 
			 }
			 		 	 	
			 }while (respuesta);
	
	
	

	}//fin del main



}//fin de clase cuadros
