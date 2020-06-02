package ec.edu.ups.jpa;

import ec.edu.ups.dao.PedidoDAO;
import ec.edu.ups.entidades.Pedido;


public class JPAPedidoDAO extends JPAGenericDAO<Pedido, Integer> implements PedidoDAO  {

	public JPAPedidoDAO() {
		// TODO Auto-generated constructor stub
		super(Pedido.class);
	}

}
