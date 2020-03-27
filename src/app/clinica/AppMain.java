package app.clinica;

import java.awt.image.SampleModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class AppMain  {

	static private Scanner sc;
	// Nos va a servir para gestionar los IDs para los animales
	public static void main(String[] args) {
		
		
			
		
		
		
		sc = new Scanner(System.in);
		
		int opcion = 0;


		do {
			System.out.println("Bienvenido a la aplicacion gestion de mascotas");
			System.out.println("Introduzca una opcion");
			System.out.println("0.- Ver Mascotas");
			System.out.println("1.- Registrar nueva mascota");
			System.out.println("2.- Buscar mascotas por id");
			System.out.println("3.- Ver historial de la mascota");
			System.out.println("4.- Nueva Revision para la mascota");
			System.out.println("5.- Salir");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 0:
				
				
				
				break;

			case 1:
			
				InterfazAnimal.registrarMascota();

				break;

			case 2:
				Animal buscado = InterfazAnimal.buscarPorId();
				if (buscado != null) {
					System.out.println(buscado);
				} else {
					System.out.println("Lo sentimos pero no hemos encontrado la mascota");
				}
				break;

			case 3:
				InterfazAnimal.verHistorialMascota();
				break;

			case 4:
				InterfazAnimal.nuevaRevision();
				break;

			default:
				break;
			}
		} while (opcion != 5);
		System.out.println("Salio del programa");

	}
	

	
}
