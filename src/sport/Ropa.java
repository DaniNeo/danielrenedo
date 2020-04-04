package sport;

public class Ropa {
	
	private int id;
	private int talla;
	private int precio;
	private String color;
	public Ropa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ropa(int talla, int precio, String color) {
		super();
		this.talla = talla;
		this.precio = precio;
		this.color = color;
	}
	public int getTalla() {
		return talla;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public String getColor() {
		return color;
	}
	
	
	
	@Override
	public String toString() {
		return "Ropa [talla=" + talla + ", precio=" + precio + ", color=" + color + "]";
	}
	public void setTalla(int talla2) {
		
		this.talla= talla2;
	}
	public void setPrecio(int precio2) {
		
		this.precio= precio2;
		
	}
	public void setColor(String color2) {
		
		this.color= color2;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
