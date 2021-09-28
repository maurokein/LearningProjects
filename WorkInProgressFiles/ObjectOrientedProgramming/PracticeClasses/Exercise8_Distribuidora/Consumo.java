/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclasses;
import java.util.Date;
import java.time.LocalDate;
/**
 *
 * @author mauro
 */
public class Factura {
    private Double montoEnergiaActiva;
    private Double descuento;
    private LocalDate fecha;
    private Usuario usuario;
    
    public Factura(Double montoEnergiaActiva, Double descuento, LocalDate fecha, Usuario usuario){
        this.montoEnergiaActiva = montoEnergiaActiva;
        this.descuento = descuento;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
    public Double montoTotal(){
        Double monto = this.montoEnergiaActiva;
        if(this.descuento > 0){
            monto = monto * 0.9;
        }
        return monto;
    }
    
    public Usuario usuario(){
        return this.usuario;
    }
    
    public LocalDate fecha(){
        return this.fecha;
    }
    
    public Double descuento(){
        return this.descuento;
    }
}