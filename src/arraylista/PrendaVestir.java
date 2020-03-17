package arraylista;

public class PrendaVestir {

	private String nombreproducto;
	private int talla;
	private double precio;
	
	
	
	public PrendaVestir() {
		super();
		
	}
	public PrendaVestir(String nombreproducto, int talla, double precio) {
		super();
		this.nombreproducto = nombreproducto;
		this.talla = talla;
		this.precio = precio;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void mostrarDatoProducto() {
		int i=1;
		System.out.println("Cantidad de articulos: "+(i++)
							+this.nombreproducto+ " de la talla "+this.talla+" , "+this.precio);
	}
	
	
}
