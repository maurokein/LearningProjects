package ar.edu.unlp.info.oo1.Exercise2;

import java.util.ArrayList;

public class Balanza extends Object{
	private ArrayList <Producto> productos;
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private Ticket ticket;
	
	public Balanza() {
		this.productos = new ArrayList<Producto>();
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	} 
	
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
		cantidadDeProductos++;
		double precioPorProducto = producto.getPeso() * producto.getPrecio();
		pesoTotal = pesoTotal + producto.getPeso();
		precioTotal = precioTotal + precioPorProducto;
	}
	
	public Ticket emitirTicket() {
		LocalDate date = LocalDate.now();
		ticket = new Ticket(date, this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
		return ticket;
	}

}