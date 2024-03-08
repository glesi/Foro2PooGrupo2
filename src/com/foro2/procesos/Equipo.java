/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foro2.procesos;

/**
 *
 * @author glesi
 */
public class Equipo {
    
    protected String fabricante;
    protected String modelo;
    protected String microprocesador;

    public Equipo(String fabricante, String modelo, String microprocesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
    }
    
    public String getFabricante  () {
        return fabricante;
    } 
    
    public void setFabricante(String fabricante){
       this.fabricante = fabricante;       
    }
    
    public String getModelo(){
        return modelo;
        
    }
    
    public void setModelo(String modelo){
        this.modelo= modelo;
    }
    
    public String gettMicroprocesador (){
        return microprocesador;
    }
    
    public void setMicroprocesador(String microprocesador){
        this.microprocesador=microprocesador;
    }

    @Override
    public String toString() {
        return "Equipo{" + "fabricante=" + fabricante + ", modelo=" + modelo + ", microprocesador=" + microprocesador + '}';
    }
    
    
}
    
