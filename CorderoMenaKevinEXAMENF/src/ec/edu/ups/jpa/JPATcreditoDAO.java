package ec.edu.ups.jpa;

import ec.edu.ups.dao.TcreditoDAO;
import ec.edu.ups.entidades.Tcredito;

public class JPATcreditoDAO extends JPAGenericDAO<Tcredito, Integer>  implements TcreditoDAO{

	public JPATcreditoDAO() {
		// TODO Auto-generated constructor stub
		super(Tcredito.class);
	}

}
