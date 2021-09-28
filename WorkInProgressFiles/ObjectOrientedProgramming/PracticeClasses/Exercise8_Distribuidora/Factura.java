/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclasses;
import java.util.Date;
/**
 *
 * @author mauro
 */
public class Consumo {
    private Date fecha;
    private Double consumoEnergiaActiva;
    private Double consumoEnergiaReactiva;
    
    public Consumo(Date fecha, Double consumoEnergiaActiva, Double consumoEnergiaReactiva){
        this.fecha = fecha;
        this.consumoEnergiaActiva = consumoEnergiaActiva;
        this.consumoEnergiaReactiva = consumoEnergiaReactiva;
    }
    
    public Double getConsumoEnergiaActiva(){
        return this.consumoEnergiaActiva;
    }
    
    public Double getConsumoEnergiaReactiva(){
        return this.consumoEnergiaReactiva;
    }
    
    public Double costoEnBaseA(Double precioKWh){
        Double costo = consumoEnergiaActiva * precioKWh;
        return costo;
    }
    
    public Double factorDePotencia(){
        Double fpe = (consumoEnergiaActiva/((consumoEnergiaActiva*consumoEnergiaActiva)-(consumoEnergiaReactiva*consumoEnergiaReactiva)));
        return fpe;
    }   
}