/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclasses;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author mauro
 */
public class Usuario {
    private String domicilio;
    private String nombre;
    private ArrayList<Consumo> consumos;
    
    public void agregarMedicion(Consumo medicion){
        consumos.add(medicion);
    }
    
    public Consumo ultimoConsumoActivo(){
        int pos = this.consumos.size() - 1;
        return consumos.get(pos);
    }
    
    public Factura facturarEnBaseA(Double precioKWh){
        Double bonificacion;
        Double montoEnergiaActiva = this.ultimoConsumoActivo().getConsumoEnergiaActiva()* precioKWh;
        LocalDate fecha = LocalDate.now();
        if(this.ultimoConsumoActivo().factorDePotencia() > 0.8){
            bonificacion = 0.1;
        }else{
            bonificacion = 0.0;
        };
        Factura f = new Factura(montoEnergiaActiva, bonificacion, fecha, this);
        return f;
    }   
}