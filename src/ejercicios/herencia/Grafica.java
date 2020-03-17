package ejercicios.herencia;

public class Grafica extends DiscoDuro {
	
	private int memoria;
	private int conexion;
	private String claseProcesador;
	public Grafica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public int getConexion() {
		return conexion;
	}
	public void setConexion(int conexion) {
		this.conexion = conexion;
	}
	public String getClaseProcesador() {
		return claseProcesador;
	}
	public void setClaseProcesador(String claseProcesador) {
		this.claseProcesador = claseProcesador;
	}
	public Grafica(int memoria, int conexion, String claseProcesador) {
		super();
		this.memoria = memoria;
		this.conexion = conexion;
		this.claseProcesador = claseProcesador;
	}
	@Override
	public String toString() {
		return "Grafica [memoria=" + memoria + ", conexion=" + conexion + ", claseProcesador=" + claseProcesador
				+ ", getCapacidad()=" + getCapacidad() + ", getVelocidad()=" + getVelocidad() + ", isSsd()=" + isSsd()
				+ ", getPrecio()=" + getPrecio() + "]";
	}
	
	
	

}
