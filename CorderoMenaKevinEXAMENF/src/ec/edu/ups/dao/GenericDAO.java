package ec.edu.ups.dao;

import java.util.List;


import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Comidas;
import ec.edu.ups.entidades.Tcredito;

public interface GenericDAO<T, ID> {

    public void create(T entity);

    public T read(ID id);

    public void update(T entity);

    public void delete(T entity);

    public void deleteByID(ID id);
    
    public List<T> findAll();
    
    //public List<Usuario> ListarU();
    
    //public Usuario validar(String correo,String contrasena);
    
   // public List<Telefono> BCedula(String cedula);
    
   // public List<Telefono> BTelefonos(String cedula);
    
   // public List<Telefono> BCorreo(String correo);
	
	
}
