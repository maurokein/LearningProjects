/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclasses;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author mauro
 */
public class Farola {
    private Boolean encendida;
    private List <Farola> farolasVecinas;
    
    public Farola(){
        this.encendida = false;
        this.farolasVecinas = new ArrayList <Farola>();
    }
    
    public void pairWithNeighbour(Farola otraFarola){
        farolasVecinas.add(otraFarola);
        otraFarola.pairWithNeighbour(this);
    }
    
    public List<Farola> getNeighbours(){
        return this.farolasVecinas;
    }
    
    public void turnOn(){
        if (!this.encendida){
            this.encendida = true;
            for (int i = 0; i < this.farolasVecinas.size(); i++){
                this.farolasVecinas.get(i).turnOn();
            }
        }
    }
    
    public void turnOff(){
        if (this.encendida){
            this.encendida = false;
            for (int i = 0; i < this.farolasVecinas.size(); i++){
                this.farolasVecinas.get(i).turnOff();
            }
        }
    }
    
    public Boolean isOn(){
        if(this.encendida){
            return true;
        }
        else{
            return false;
        }
    }
}
