package ejercicios.herencia;

public class DiscoDuro extends Producto {

		public DiscoDuro(){
		super();
		
	}
		private String capacidad;
		private int velocidad;
		private boolean ssd;
		public String getCapacidad() {
			return capacidad;
		}
		
		public DiscoDuro(String capacidad, int velocidad, boolean ssd) {
			super();
			this.capacidad = capacidad;
			this.velocidad = velocidad;
			this.ssd = ssd;
		}

		public void setCapacidad(String capacidad) {
			this.capacidad = capacidad;
		}
		public int getVelocidad() {
			return velocidad;
		}
		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}
		public boolean isSsd() {
			return ssd;
		}
		public void setSsd(boolean ssd) {
			this.ssd = ssd;
		}

		@Override
		public String toString() {
			return "DiscoDuro [capacidad=" + capacidad + ", velocidad=" + velocidad + ", ssd=" + ssd
					+ ", getCapacidad()=" + getCapacidad() + ", getVelocidad()=" + getVelocidad() + ", isSsd()="
					+ isSsd() + ", getReferencia()=" + getReferencia() + ", getPrecio()=" + getPrecio() + "]";
		}
		
	
	
}
