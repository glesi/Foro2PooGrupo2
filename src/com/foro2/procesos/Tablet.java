/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foro2.procesos;

/**
 *
 * @author Fab
 */
public class Tablet extends Equipo {
    
    private String diagonalPantalla;
    private String capacitivaResistiva;
    private String tamañoMemoriaNAND;
    private String sistemaOperativo;
    
    public Tablet(String tamañoPantalla, String capacitivaResistiva, String tamañoMemoriaNAND, String sistemaOperativo, String fabricante, String modelo, String microprocesador) {
        super(fabricante, modelo, microprocesador);
        this.diagonalPantalla = tamañoPantalla;
        this.capacitivaResistiva = capacitivaResistiva;
        this.tamañoMemoriaNAND = tamañoMemoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public String gettamañoPatalla () {
        return diagonalPantalla;
    }
    
    public void settamañoPantalla (String tamañoPantalla){
        this.diagonalPantalla = tamañoPantalla;
    }
    
    public String getcapacitivaResistiva (){
        return capacitivaResistiva;
    }
    
    public void setcapacitivaResistiva (String capacitivaResistiva){
        this.capacitivaResistiva = capacitivaResistiva;
    }
    
    public String gettamañoMemoriaNAND (){ 
        return tamañoMemoriaNAND;
    }
    
    public void settamañoMemoriaNAND (String tamañoMemoriaNAND) {
        this.tamañoMemoriaNAND = tamañoMemoriaNAND;
    }
    
    public String getsistemaOperativo (){
        return sistemaOperativo;
    } 
    
    public void setsistemaOperativo (String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
    
    @Override
    public String toString (){
        return "Tablet{fabricante=" + fabricante + ", modelo=" + modelo + ", microprocesador=" + microprocesador + ", diagonalPantalla=" + diagonalPantalla + ", capacitivaResistiva=" + capacitivaResistiva + ",tamañoMemoriaNAND=" + tamañoMemoriaNAND + ", sistemaOperativo=" + sistemaOperativo + '}';
    } 
}