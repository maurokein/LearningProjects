package ar.edu.unlp.info.oo1.Exercise2;

public class Balanza extends Object{
	private Producto [] productos;
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private Ticket ticket;
	
	public Balanza() {
		this.productos = new Producto[50];
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
		productos[cantidadDeProductos] = producto;
		cantidadDeProductos++;
		double precioPorProducto = producto.getPeso() * producto.getPrecio();
		pesoTotal = pesoTotal + producto.getPeso();
		precioTotal = precioTotal + precioPorProducto;
	}
	
	public Ticket emitirTicket() {
		fecha = LocalDate.Now();
		ticket = new Ticket(fecha, this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
	}

}