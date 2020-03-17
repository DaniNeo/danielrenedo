package ejercicios.herencia;

public class Producto extends Comercio {
	
	private int referencia;
	private int precio;
	public Producto() {
		super();
		
	}
	public int getReferencia() {
		return referencia;
	}
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Producto(int referencia, int precio) {
		super();
		this.referencia = referencia;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [referencia=" + referencia + ", precio=" + precio + "]";
	}
	

}
