package Coches;

public class Coche {

		private int matricula;
		private String marca;
		private String modelo;
		private int km;
		
		public int DevolverMatricula() {
			
			return matricula;
		
		}
		
		public void InsertarMarca(String mc) {
			
			this.marca=mc;
			
		}
		
		public String DevolverMarca() {
			
			return marca;
		
		}
		
		public void InsertarKms(int k) {
			
			this.km=k;
			
		}
		
		public String DevolverModelo() {
			
			return modelo;
		
		}
		
		public void InsertarModelo(String mo) {
			
			this.modelo=mo;
			
		}
		
}
