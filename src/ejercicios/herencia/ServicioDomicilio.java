package ejercicios.herencia;

public class ServicioDomicilio extends Servicios{

	private int productoadicional;

	public ServicioDomicilio() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public ServicioDomicilio(int precio, int codigo, int numhoras, int productoadicional) {
		super(precio, codigo, numhoras);
		this.productoadicional = productoadicional;
	}



	public int getProductoadicional() {
		return productoadicional;
	}

	public void setProductoadicional(int productoadicional) {
		this.productoadicional = productoadicional;
	}
	
	
	
}
