package ec.edu.ups.jpa;

import ec.edu.ups.dao.ComidaDAO;
import ec.edu.ups.entidades.Comidas;

public class JPAComidasDAO extends JPAGenericDAO<Comidas, Integer> implements ComidaDAO{

	public JPAComidasDAO() {
		// TODO Auto-generated constructor stub
		super(Comidas.class);
	}

}
