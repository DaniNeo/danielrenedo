package introduccion.herencia;

import introduccion.herencia.*;


public class Electrodomestico  {

	
	private String nombre;
	private int precio;
	public Electrodomestico() {
		super();
		
	}
	public Electrodomestico(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
