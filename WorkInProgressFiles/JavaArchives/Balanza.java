/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author mauro
 */
public class Balanza {
    private double monto;
    private int cantItems;
    private String resumen;
    
    public Balanza(double monto, int cantItems) {
        this.monto = monto;
        this.cantItems = cantItems;
    }
    public Balanza(){
    }
    
    public void iniciarCompra() {
        this.monto = 0;
        cantItems = 0;
        resumen = "";
    }
    
    public void registrarProducto(Producto producto, double precio) {
        monto = monto + producto.getPesoEnKg()*precio;
        precio = producto.getPesoEnKg()*precio;
        cantItems ++;
        resumen = resumen + producto.getDescripcion()+precio;
    }
    public double devolverMontoAPagar() {
        return monto;
    }
    public String devolverResumenDeCompra(){
        String aux1, aux2;
        aux1 = "Total a pagar: " + monto;
        aux2 = " por la compra de " + cantItems + " productos";
        return resumen + aux1 + aux2;
    }
}
