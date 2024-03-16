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
    private double capacitivaResistiva;
    private double tamañoMemoriaNAND;
    private double sistemaOperativo;
    
    public Tablet(String tamañoPantalla, double capacitivaResistiva, double tamañoMemoriaNAND, double sistemaOperativo, String fabricante, String modelo, String microprocesador) {
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
    
    public double getcapacitivaResistiva (){
        return capacitivaResistiva;
    }
    
    public void setcapacitivaResistiva (double capacitivaResistiva){
        this.capacitivaResistiva = capacitivaResistiva;
    }
    
    public double gettamañoMemoriaNAND (){
        return tamañoMemoriaNAND;
    }
    
    public void settamañoMemoriaNAND (double tamañoMemoriaNAND) {
        this.tamañoMemoriaNAND = tamañoMemoriaNAND;
    }
    
    public double getsistemaOperativo (){
        return sistemaOperativo;
    } 
    
    public void setsistemaOperativo (double sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
    
    @Override
    public String toString (){
        return "Tablet{fabricante=" + fabricante + ", modelo=" + modelo + ", microprocesador=" + microprocesador + ", diagonalPantalla=" + diagonalPantalla + ", capacitivaResistiva=" + capacitivaResistiva + ",tamañoMemoriaNAND=" + tamañoMemoriaNAND + ", sistemaOperativo=" + sistemaOperativo + '}';
    } 
