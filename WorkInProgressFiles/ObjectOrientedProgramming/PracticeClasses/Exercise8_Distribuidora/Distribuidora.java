/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclasses;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
/**
 *
 * @author mauro
 */
public class Distribuidora {
    private Double precioKWh;
    private ArrayList<Usuario> usuarios;
    
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public List<Factura> facturar(){
        List <Factura> facturas = usuarios.stream().
                map(usr -> usr.facturarEnBaseA(this.precioKWh)).
                collect(Collectors.toList());
        return facturas;
    }
    
    public Double consumoTotalActiva(){
        Double consumoTotal = usuarios.stream().
                mapToDouble(usr -> usr.ultimoConsumoActivo().getConsumoEnergiaActiva()).
                sum();
        return consumoTotal;
    }
    
    public void precioKWh(Double precio){
        this.precioKWh = precio;
    }
    
    public Double getPrecioKWh(){
        return this.precioKWh;
    }
}