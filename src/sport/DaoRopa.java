package sport;


	

import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.ArrayList;



	public interface DaoRopa extends InterfazRopa {
		Ropa ropa= new Ropa();
		static ListAdapter listados=ListAdapter.create(ropa);
		
		/**
		 * 
		 * @return listado de animales
		 */
		   ArrayList<Ropa> getAll();

		  	
		 
		
		/**
		 * Busca Animal por su identificador
		 * 
		 * @param id int identificador del animal
		 * @return Animal buscado
		 * @throws Exception si no encuentra el Animal por su id
		 */
		public default Ropa getById(int id) throws Exception{

		
				if(listados.get(id).equals(ropas)){
					
					return (Ropa) listados.get(id);
				}
				else
					return null;
		
				
		}
		/**
		 * Elimina Animal
		 * 
		 * @param id int identificador del animal
		 * @return Animal que acaba de eliminar
		 * @throws Exception lanza excepcion si no lo encuentra o no puede eliminar
		 */
		public default  String delete(int id) throws Exception{
			if(listados.get(id)!=null){
			Ropa ropaeliminada = new Ropa();
			listados.set(id, ropa);
			listados.remove(id);
			
						
				return ropaeliminada.toString();
			}else
				return null;
		
		}
		
		
		/**
		 * Actualiza el animal
		 * 
		 * @param animal Animal a modificar, es importante que tenga id
		 * @return Animal modificado
		 * @throws Exception si no encuentra o no puede modificar el Animal
		 */
		public default Ropa update(Ropa ropa) throws Exception{
			
				if( ropa.getId()<0){
					
					System.out.println("falta id");
					return ropa;
				}
				else{
					listados.add(ropa);
					return ropa;
		}
		}
		/**
		 * Crea un nuevo animal y actualiza su id
		 * 
		 * @param animal Animal a crear sin el id actualizado
		 * @return Animal a creado con el id actualizado
		 * @throws Exception Si no puede crear el animal
		 */
		public default Ropa create(Ropa ropa) throws Exception{
		
		if( ropa.getId()<0){
			
			System.out.println("falta id");
			return ropa;
		}
		else{
			listados.add(ropa);
			return ropa;
}
}
		
	}

	
	
	
	

