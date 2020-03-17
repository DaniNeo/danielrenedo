package introduccion.herencia;

public class televisionplana extends televisor {

	private String tipopantalla;

	public televisionplana() {
		super();
		
	}

	public televisionplana(String tipopantalla) {
		super();
		this.tipopantalla = tipopantalla;
	}

	public String getTipopantalla() {
		return tipopantalla;
	}

	public void setTipopantalla(String tipopantalla) {
		this.tipopantalla = tipopantalla;
	}

	
	
	
}
