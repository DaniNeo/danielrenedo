package ejercicios.herencia;

public class Comercio  {

	public Comercio() {
		super();
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		Producto producto =new Producto();
		Grafica grafica = new Grafica();
		DiscoDuro duro= new DiscoDuro();
		return "Comercio [producto: "+producto.toString()+"Grafica: "+grafica.toString()+"Disco Duro: "+duro.toString()+ "]";
	}

	
	

	
}
