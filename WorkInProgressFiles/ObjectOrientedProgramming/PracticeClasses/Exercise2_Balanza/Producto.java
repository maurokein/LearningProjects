package ar.edu.unlp.info.oo1.Exercise2;

public class Producto extends Object{
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	} 
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public double getPrecio( ) {
		return this.precioPorKilo;
	}

}