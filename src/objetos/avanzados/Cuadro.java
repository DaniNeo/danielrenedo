package objetos.avanzados;

public class Cuadro {

	private String titulo;
	private String autor;
	private int altura;
	private int anchura;
	private boolean restaurado;
	private int precio;
	private int a�o;
	
	
	public Cuadro() {
		
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getAnchura() {
		return anchura;
	}


	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}


	public boolean isRestaurado() {
		return restaurado;
	}


	public void setRestaurado(boolean restaurado) {
		this.restaurado = restaurado;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int prec) {
		this.precio = prec;
	}


	public int getA�o() {
		return a�o;
	}


	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

@Override
public String toString() {
	
	String mensaje=("el titulo del cuadro :"+titulo
					+"el precio es: "+precio);
	
	return mensaje;
}
	

}
