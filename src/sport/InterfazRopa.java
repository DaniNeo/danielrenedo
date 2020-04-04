package sport;


import java.util.ArrayList;

import java.util.Scanner;



public interface InterfazRopa {

	Scanner sc = new Scanner(System.in);
	public static ArrayList<Ropa> ropas = new ArrayList<Ropa>();
	int opcion = 0;
	
	public static void crearRopa() {

		System.out.println("Creamos una ropa de prueba.......");

		Ropa playera = new Ropa();
		playera.setTalla(2);
		playera.setPrecio(10);
		playera.setColor("verde");
		
		ropas.add(playera);

		// TODO podeis crear mas aniamles, pero recordar de actualizar la varaible
		// global "IDS"

	}

	 public static void verMascotas() {

		System.out.println("-----------  Ropas  ---------------------------");
		System.out.println("---- Tenemos " + ropas.size() + " en nuestar tienda ---------");
		System.out.println("------------------------------------------------");

		for (Ropa ropa : ropas) {
			
		
			System.out.println(ropas);
		}

		System.out.println("------------------------------------------------");

	}

	/**
	 * Método que muestra una mascota buscando por su id
	 */
	 public static Ropa buscarPorId() {
		int id = 0;
		Ropa ropaEncontrado = null;
		System.out.println("Introduzca id a buscar");
		id = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < ropas.size(); i++) {
			if (ropas.get(i).getId() == id) {
				ropaEncontrado = ropas.get(i);
				break;
			}
		}
		return ropaEncontrado;
	}

	/**
	 * Método que añade un registro nuevo de un ingreso de una mascota
	 */
	

	/**
	 * Método que muestra el historial de ingresos de una mascota
	 */
	

	/**
	 * Método que da de alta una mascota
	 */
	public static void registrarRopa() {
		int ids=0;
		Ropa ropa = new Ropa();
		System.out.println("Introduzca la talla");
		ropa.setTalla(Integer.parseInt(sc.nextLine()));
		System.out.println("Introduzca el precio");
		ropa.setPrecio(Integer.parseInt(sc.nextLine()));
		System.out.println("Introduzca el color");
		ropa.setColor(sc.nextLine());
		ropa.setId(ids);
		ropas.add(ropa);

	
	
}

	Ropa getById(int id) throws Exception;

	String delete(int id) throws Exception;
}