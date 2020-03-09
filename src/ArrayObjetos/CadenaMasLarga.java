
import java.util.*;



public class CadenaMasLarga {

	
	/*
	 * Programa Java para calcular el String de mayor longitud de todos los contenidos 
	 * en un ArrayList de String. 
	 * El programa utilizar� los siguientes m�todos adem�s del m�todo main:
	 *M�todo leerArray(): este m�todo recibe como par�metro el arrayList de Strings vac�o.
	 *El m�todo pide por teclado cadenas de caracteres y las a�ade al ArrayList. La lectura
	 *de cadenas termina cuando se introduce la palabra �FIN�.
	 *M�todo cadenaMasLarga():este m�todo recibe como par�metro el ArrayList de Strings 
	 *con todas las cadenas le�das anteriormente y devuelve el String de mayor longitud.
	 */
	
	public static void main(String[] args) {
		
		ArrayList <String> acadena = new ArrayList<String>();
		
		for (int i = 0; i < acadena.size() ; i++) {
			
			acadena.add(i, null);
					
		}
		
		leerArray(acadena);
		cadenaLarga(acadena);
	
	}

	public static void cadenaLarga(ArrayList<String> acadena) {
		for (int i =0 ; i < acadena.size(); i++) {
			int contadorcaracter=0;
			boolean respuesta=true;
			do {
				
			
			try {
				System.out.println("try");
				
				contadorcaracter=acadena.get(i).charAt(i);
				System.out.println(contadorcaracter);
				
				
			} catch (Exception e) {
				e.toString();
				
			
			}
			} while (respuesta==true);
		}
	}

	public static void leerArray(ArrayList<String> acadena) {
		int i=0;
		Scanner sc =new Scanner(System.in);
		String respuesta=null;
		
		do {
			
		System.out.println("Escribe un texto: ");
		acadena.add(i, sc.nextLine());
		i++;
		System.out.println("Quieres finalizar de insertar texto....si escribes Fin se finaliza: ");
		respuesta=sc.nextLine();
		
		
		} while (!respuesta.contentEquals("fin"));
			sc.close();
	

	
	}

	
}