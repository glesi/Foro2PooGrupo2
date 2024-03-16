/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foro2.procesos;

/**
 *
 * @author JC
 */
public class Desktop extends Equipo {

    private String memoria;
    private String tarjetaGrafica;
    private String tamañoTorre;
    private double capacidadDiscoDuro;
    
    public Desktop(String memoria, String tarjetaGrafica, String tamañoTorre, double capacidadDiscoDuro,String fabricante, String modelo, String microprocesador) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamañoTorre = tamañoTorre;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public String getMemoria() {
        return memoria;
    } 
    
    public void setMemoria(String memoria) {
        this.memoria = memoria;       
    }
    
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    } 
    
    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;       
    }
    
    public String getTamañoTorre() {
        return tamañoTorre;
    } 
    
    public void setTamañoTorre(String tamañoTorre) {
        this.tamañoTorre = tamañoTorre;       
    }
    
    public double getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    } 
    
    public void setCapacidadDiscoDuro(double capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;       
    }

    @Override
    public String toString() {
        return "Desktop{fabricante=" + fabricante + ", modelo=" + modelo + ", microprocesador=" + microprocesador + ", memoria=" + memoria + ", tarjetaGrafica=" + tarjetaGrafica + ", tamañoTorre=" + tamañoTorre + ", capacidadDiscoDuro=" + capacidadDiscoDuro + '}';
    } 

}