package array.objetos;

import java.util.ArrayList;

public class Coche {

		
		private int matricula;
		private String marca;
		private String modelo;
		private int km;
		
		

		public int DevolverMatricula() {
			
			return matricula;
		
		}
		
		
		
		public String DevolverMarca() {
			
			return marca;
		
		}
		
		public void InsertarKms(int k) {
			
			this.km=k;
			
		}
		
		public int DevolverKms() {
			
			return km;			
		
			
		}
		
		public String DevolverModelo() {
			
			return modelo;
		
		}
		
		public void InsertarModelo(String mo) {
			
			this.modelo=mo;
			
		}

		public void InsertarMatricula(int mc) {
				this.matricula=mc;
			
		}



		public void InsertarMarca(String m) {
				this.marca=m;
			
		}
		
}
