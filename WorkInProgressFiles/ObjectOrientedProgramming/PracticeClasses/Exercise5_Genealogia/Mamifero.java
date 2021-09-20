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
public class Mamifero extends Object{
    private String identificador;
    private String especie;
    private Date fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;
    private Mamifero abueloMaterno;
    private Mamifero abuelaMaterna;
    private Mamifero abueloPaterno;
    private Mamifero abuelaPaterna;
    
    public String getIdentificador(){
        return this.identificador;
    }
    
    public void setIdentificador(String identificador){
        this.identificador = identificador;
    }
    
    public String getEspecie(){
        return this.especie;
    }
    
    public void setEspecie(String especie){
        this.especie = especie;
    }
    
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Mamifero getPadre(){
        return this.padre;
    }
    
    public void setPadre(Mamifero padre){
        this.padre = padre;
    }
    
    public Mamifero getMadre(){
        return this.madre;
    }
    
    public void setMadre(Mamifero madre){
        this.madre = madre;
    }
    
    public Mamifero getAbueloMaterno(){
        return this.abueloMaterno;
    }
    
    public void setAbueloMaterno(Mamifero abueloMaterno){
        this.abueloMaterno = abueloMaterno;
    }
    
    public Mamifero getAbuelaMaterna(){
        return this.abuelaMaterna;
    }
    
    public void setAbuelaMaterna(Mamifero abuelaMaterna){
        this.abuelaMaterna = abuelaMaterna;
    }
    
    public Mamifero getAbueloPaterno(){
        return abueloPaterno;
    }
    
    public void setAbueloPaterno(Mamifero abueloPaterno){
        this.abueloPaterno = abueloPaterno;
    }
    
    public Mamifero getAbuelaPaterna(){
        return this.abuelaPaterna;
    }
    
    public void setAbuelaPaterna(Mamifero abuelaPaterna){
        this.abuelaPaterna = abuelaPaterna;
    }
    
    public Boolean tieneComoAncestroA(Mamifero ancestro){
        String idAncestro = ancestro.getIdentificador();
        if(idAncestro == this.getMadre().getIdentificador())
            return true;
        else
            if(idAncestro == this.getPadre().getIdentificador())
                return true;
            else
                if(idAncestro == this.getAbuelaMaterna().getIdentificador())
                    return true;
                else 
                    if(idAncestro == this.getAbueloMaterno().getIdentificador())
                        return true;
                    else 
                        if(idAncestro == this.getAbuelaPaterna().getIdentificador())
                            return true;
                        else 
                            if(idAncestro == this.getAbueloPaterno().getIdentificador())
                                return true;
                            else 
                                return false;
    }
}