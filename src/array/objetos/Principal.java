package array.objetos;

import java.util.ArrayList;
import java.util.Scanner;

/**	EJERCICIO DOS
 * @author Daniel Renedo Castaños
 *
 */
public class Principal {

	 static ArrayList<Coche> coches = new ArrayList<Coche>();
	 static Scanner sc = new Scanner(System.in);
	 static String opcion="";
	 static int N=0;
	 
	public static void main(String[] args) {
	
		
		
			
		boolean respuesta = true;
		do {
			System.out.println("Quieres traer nuevos coches (responda ''si'' en casa de que quiera sino ''no'' ''o cualquier otra tecla''.....): ");
			opcion =sc.nextLine();
			
			
			opcion=opcion.toLowerCase();	
		
		
		
		switch (opcion) {
		case "si" :
			
			System.out.println("Insertar los coches: ");
			System.out.println("Cuantos coches quieres en la fabrica:");
			N =Integer.parseInt(sc.nextLine());
			InsertarCoches(N);
			System.out.println("**************************");
			System.out.println("Mostrar los coches");
			leerCoches();
			break;
			
		case "no":
			System.out.println("Finalizamos el programa, hasta otra.....de nueva...");
			respuesta=false;
			break;
		default:
			System.out.println("las respuesta validas son si o no , para seguir con el gestor de programa");
			respuesta=true;
			break;
		}
			} while ((opcion=="si" || opcion == "no" || respuesta));
	
	}

	

	public static void InsertarCoches( int N) {
		
		
		
		
			Coche car;
			car =new Coche();
			for (int i=0; i< N; i++){
				System.out.println("Introduce la matricula del coche: ");
				car.setMatricula(sc.nextLine());
				
				System.out.println("Introduce la marca del coche: ");
				car.setMarca(sc.nextLine());
				
				
				System.out.println("Introduce el modelo del coche: ");
				car.setModelo(sc.nextLine());
				
				System.out.println("Introduce el color del coche: ");
				car.setColor(sc.nextLine());
				
				
				System.out.println("Introduce la cilindrada del coche: ");
				car.setCilindrada(Integer.parseInt(sc.nextLine()));
				
				System.out.println("Introduce la potencia del coche: ");
				car.setPotencia(Integer.parseInt(sc.nextLine()));
				coches.add(i, car);
			}
			
			
			
		
	
		
	}

	public static void leerCoches() {
		
		for (Coche coche : coches) {
			
			System.out.println(coche.toString());
		}
	
	}
}
