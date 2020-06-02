package ec.edu.ups.test;

import ec.edu.ups.dao.ComidaDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.PedidoDAO;
import ec.edu.ups.dao.TcreditoDAO;
import ec.edu.ups.entidades.Comidas;
import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Tcredito;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se agrega el pedido
		PedidoDAO peDAO = DAOFactory.getFactory().getPedidoDAO();
		Pedido p = new Pedido();
		p.setCliente("Pedro");
		p.setFecha("08/02/2020");
		p.setTotal(3.50);
		p.setObservaciones("Mala presentacion");
		peDAO.create(p);
		//Se agrega la comida
		ComidaDAO comDAO = DAOFactory.getFactory().getComidaDAO();
		Comidas com = new Comidas();
		com.setNumeroP(p);
		com.setNombre("Guatita");
		com.setPrecioU(4.20);
		comDAO.create(com);
		//Se agrega la tarjeta de credito
		TcreditoDAO tcreDAO= DAOFactory.getFactory().getTcreditoDAO();
		Tcredito t= new Tcredito();
		t.setNumerotarjeta(1236987451);
		t.setNombre("Pedro");
		t.setFechaCaducidad("06/02/2022");
		t.setCvv("367");
		t.setNumeroP(p);
		tcreDAO.create(t);
		
	}

}
