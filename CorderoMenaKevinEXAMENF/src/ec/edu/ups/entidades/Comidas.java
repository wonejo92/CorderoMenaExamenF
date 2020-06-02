package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comidas
 *
 */
@Entity

public class Comidas implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private double precioU;
	@ManyToOne
	@JoinColumn
	private Pedido numeroP;
	
	public Comidas() {
		
	}
	public Comidas(int codigo, String nombre,double precioU , Pedido numeroP) {
		super();
		this.codigo=codigo;
		this.nombre=nombre;
		this.precioU=precioU;
		this.numeroP=numeroP;
	}
	
	//Getters and Setters.
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioU() {
		return precioU;
	}
	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}
	
	public Pedido getNumeroP() {
		return numeroP;
	}
	public void setNumeroP(Pedido numeroP) {
		this.numeroP = numeroP;
	}
	// hashCode & equals.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comidas other = (Comidas) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
//toString
	@Override
	public String toString() {
		return "Comidas [codigo=" + codigo + ", nombre=" + nombre + ", precioU=" + precioU + ", numeroP=" + numeroP
				+ "]";
	}
}
