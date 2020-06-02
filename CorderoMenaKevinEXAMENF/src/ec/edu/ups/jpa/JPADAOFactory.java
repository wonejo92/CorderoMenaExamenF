package ec.edu.ups.jpa;

import ec.edu.ups.dao.ComidaDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.PedidoDAO;
import ec.edu.ups.dao.TcreditoDAO;

public class JPADAOFactory extends DAOFactory {

	public JPADAOFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public PedidoDAO getPedidoDAO() {
		// TODO Auto-generated method stub
		return  new JPAPedidoDAO();
	}

	@Override
	public ComidaDAO getComidaDAO() {
		// TODO Auto-generated method stub
		return  new JPAComidasDAO();
	}

	@Override
	public TcreditoDAO getTcreditoDAO() {
		// TODO Auto-generated method stub
		return  new JPATcreditoDAO();
	}

}
