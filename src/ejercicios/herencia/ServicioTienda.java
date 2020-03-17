package ejercicios.herencia;

/**
 * @author BEEP
 *
 */
public class ServicioTienda extends Servicios {
	
	private String gastoAdicional;

	public ServicioTienda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGastoAdicional() {
		return gastoAdicional;
	}

	public void setGastoAdicional(String gastoAdicional) {
		this.gastoAdicional = gastoAdicional;
	}

	public ServicioTienda(int precio, int codigo, int numhoras, String gastoAdicional) {
		super(precio, codigo, numhoras);
		this.gastoAdicional = gastoAdicional;
	}

	public ServicioTienda(int precio, int codigo, int numhoras) {
		super(precio, codigo, numhoras);
		// TODO Auto-generated constructor stub
	}

	public ServicioTienda(int referencia, int precio) {
		super(referencia, precio);
		// TODO Auto-generated constructor stub
	}

	

}


