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
public class Laptop extends Equipo {
    
    private String memoria;
    private double dimencionPantalla ;
    private double capacidadDiscoDuro;

    public Laptop(String memoria, double dimencionPantalla, double capacidadDiscoDuro, String fabricante, String modelo, String microprocesador) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.dimencionPantalla = dimencionPantalla;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }
    
     public String getMemoria  () {
        return memoria;
    } 
    
    public void setMemoria(String memoria){
       this.memoria = memoria;       
    }
    
     public double getDimencionPantalla  () {
        return dimencionPantalla;
    } 
    
     public void setDimencionPantalla(double  dimencionPantalla){
       this.dimencionPantalla=dimencionPantalla;
       
     }
     
     public double getCapacidadDiscoDuro () {
        return capacidadDiscoDuro;
    } 
    
     public void setcapacidadDiscoDuro(double  capacidadDiscoDuro){
       this.capacidadDiscoDuro=capacidadDiscoDuro;
       
     }

    @Override
    public String toString() {
        return "Laptop{fabricante="+ fabricante + ", modelo="+ modelo + ", microprocesador="+ microprocesador + ", memoria=" + memoria + ", dimencionPantalla=" + dimencionPantalla + ", capacidadDiscoDuro=" + capacidadDiscoDuro + '}';
    }
     
     
     
}
