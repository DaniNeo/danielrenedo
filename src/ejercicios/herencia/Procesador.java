package ejercicios.herencia;

public class Procesador extends Producto {
	
		private String modelo="";
		private int velocidad=0;
		public Procesador() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public int getVelocidad() {
			return velocidad;
		}
		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}
		public Procesador(String modelo, int velocidad) {
			super();
			this.modelo = modelo;
			this.velocidad = velocidad;
		}
		
		
}
