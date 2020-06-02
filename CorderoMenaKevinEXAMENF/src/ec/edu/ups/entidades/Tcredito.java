package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tcredito
 *
 */
@Entity

public class Tcredito implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numerotarjeta;
	private String nombre;
	private String fechaCaducidad;
	private String cvv;
	@ManyToOne
	@JoinColumn
	private Pedido numeroP;
	
	public Tcredito(int numerotarjeta, String nombre,String fechaCaducidad,String cvv,Pedido numeroP) {
		super();
		this.numerotarjeta=numerotarjeta;
		this.nombre=nombre;
		this.fechaCaducidad=fechaCaducidad;
		this.cvv=cvv;
		this.numeroP= numeroP;
	}
	
	public Tcredito() {
	}

	public int getNumerotarjeta() {
		return numerotarjeta;
	}

	public void setNumerotarjeta(int numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public Pedido getNumeroP() {
		return numeroP;
	}

	public void setNumeroP(Pedido numeroP) {
		this.numeroP = numeroP;
	}

	@Override
	public String toString() {
		return "Tcredito [numerotarjeta=" + numerotarjeta + ", nombre=" + nombre + ", fechaCaducidad=" + fechaCaducidad
				+ ", cvv=" + cvv + ", numeroP=" + numeroP + "]";
	}
	
}
