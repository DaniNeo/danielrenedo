package sport;

import java.util.ArrayList;




public class RopaDaoImpArrayList implements DaoRopa{

	
	private static ArrayList<Ropa> lista;
	private static int contadorIds;

	/* PATRON SINGLETON @see https://es.wikipedia.org/wiki/Singleton */

	private static RopaDaoImpArrayList INSTANCE = null;

	// Private constructor, no se puede hacer NEW de esta clase, hay que usar el
	// metodo GETINSTANCE() que tenemos abajo
	private  RopaDaoImpArrayList() {
		super();

	}

	public static synchronized RopaDaoImpArrayList getInstance() {

		if (INSTANCE == null) {
			// haqui es donde se hace el new, por lo cual solo se puede crear un objeto
			INSTANCE = new RopaDaoImpArrayList();

			// inicializamos las variables
			lista = new ArrayList<Ropa>();
			contadorIds = 1;
		}
		return INSTANCE;
	}

	/* Fin patron singleton */

	@Override
	public ArrayList<Ropa> getAll() {
		return lista;
	}

	@Override
	public Ropa getById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Ropa update(Ropa ropa) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ropa create(Ropa ropa) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

	
	
	

