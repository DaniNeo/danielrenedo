package array.objetos;

import java.util.ArrayList;

public class Coche {

		
		private String matricula;
		private String marca;
		private String modelo;
		private int potencia;
		private int cilindrada;
		private String color;

	public Coche(String matricula, String marca, String modelo, int potencia, int cilindrada, String color) {
			super();
			this.matricula = matricula;
			this.marca = marca;
			this.modelo = modelo;
			this.potencia = potencia;
			this.cilindrada = cilindrada;
			this.color = color;
		}



		public String getColor() {
			return color;
		}



		public void setColor(String color) {
			this.color = color;
		}



		public String getMatricula() {
			return matricula;
		}



		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}



		public String getMarca() {
			return marca;
		}



		public void setMarca(String marca) {
			this.marca = marca;
		}



		public String getModelo() {
			return modelo;
		}



		public void setModelo(String modelo) {
			this.modelo = modelo;
		}



		public int getPotencia() {
			return potencia;
		}



		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}



		public int getCilindrada() {
			return cilindrada;
		}



		public void setCilindrada(int cilindrada) {
			this.cilindrada = cilindrada;
		}



		



		@Override
		public String toString() {
			return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia="
					+ potencia + ", cilindrada=" + cilindrada + ", color=" + color + "]";
		}



		public Coche() {
			super();
			// TODO Auto-generated constructor stub
		}


}