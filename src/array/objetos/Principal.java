package array.objetos;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * En esta entrada vamos a escribir un programa Java que crea un ArrayList de Objetos de tipo Coche. 
 * El programa pide por teclado los datos de los coches y los guarda en el array. 
 * A continuación utilizará el ArrayList para mostrar por pantalla lo siguiente:
-         Todos los coches introducidos.
-         Todos los coches de una marca determinada.
-         Todos los coches con menos de un número determinado de Kilómetros.
-         El coche con mayor número de Kilómetros.
-         Todos los coches ordenados por número de kilómetros de menor a mayor.
 * @author Daniel Renedo Castaños
 *
 */
public class Principal {

	static ArrayList<Coche> coches = new ArrayList<Coche>();
	
	
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		InsertarCoches();
		leerCoches();
		leerMarcaCoches();
		leerKmsCoches();
		leerMayorKm();
		ordenarCoches();
		sc.close();
	

	}

	private static void ordenarCoches() {
		// TODO Auto-generated method stub
		
	}

	private static void leerMayorKm() {
		// TODO Auto-generated method stub
		
	}

	private static void leerKmsCoches() {
		// TODO Auto-generated method stub
		
	}

	private static void leerMarcaCoches() {
		// TODO Auto-generated method stub
		
	}

	public static void InsertarCoches() {
		
		
		
		
			Coche car;
			car =new Coche();
			car.InsertarMatricula(3423);
			car.InsertarMarca("Citroen");
			car.InsertarModelo("C5");
			car.InsertarKms(0);
			
			
			
		
		coches.add(car);
		
	}

	public static void leerCoches() {
		
		for (int i = 0; i < coches.size(); i++) {
			
		
		System.out.println("La marca del coche es: "+coches.get(i).DevolverMarca());
		System.out.println("El modelo del coche es: "+coches.get(i).DevolverModelo());
		System.out.println("Los kilometros del coche es: "+coches.get(i).DevolverKms());
		System.out.println(coches.get(i).DevolverMatricula());
	}
	}
}
