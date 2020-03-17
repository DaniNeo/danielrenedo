package introduccion.herencia;

import introduccion.herencia.*;


public class televisor extends Electrodomestico {
	
	private int pulgadas;

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public televisor(int pulgadas) {
		super();
		this.pulgadas = pulgadas;
	}

	public televisor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
