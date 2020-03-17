package ejercicios.herencia;

public class Servicios extends Producto{
	
	private int precio;
	private int codigo;
	private int numhoras;
	
	
	
	public Servicios(int precio, int codigo, int numhoras) {
		super();
		this.precio = precio;
		this.codigo = codigo;
		this.numhoras = numhoras;
	}
	public Servicios() {
		super();
		
	}
	public Servicios(int referencia, int precio) {
		super(referencia, precio);
		
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumhoras() {
		return numhoras;
	}
	public void setNumhoras(int numhoras) {
		this.numhoras = numhoras;
	}
	

}
