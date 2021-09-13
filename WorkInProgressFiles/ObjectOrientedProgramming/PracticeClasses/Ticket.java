package ar.edu.unlp.info.oo1.Exercise2;

public class Ticket extends Object {
	private java.time.LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;

	Public Ticket(java.time.LocalDate fecha, int cantidadDeProductos, double pesoTotal, double precioTotal) {
		this.setFecha(fecha);
		this.setCantidadDeProductos(cantidadDeProductos);
		this.setPesoTotal(pesoTotal);
		this.setPrecioTotal(precioTotal);
	}
	
	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public java.time.LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public double impuesto() {
		double impuestoAplicado = this.getPrecioTotal() * 0.21;
		return impuestoAplicado;
	}
}