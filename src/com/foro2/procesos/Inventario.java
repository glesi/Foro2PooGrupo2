/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foro2.procesos;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author glesi
 */
public class Inventario {

    public void agregarEquipo(String equipo, List<Equipo> equipos) {
        switch (equipo) {
            case "1": 
                break;
            case "2": //Laptop
                registrarLaptop(equipos);
                break;
            case "3":
                break;
        }
    }
    
    private void registrarLaptop(List<Equipo> laptops) {
        // Pedir los datos al usuario    
        String nombreFabricante = JOptionPane.showInputDialog("Ingrese el nombre del fabricante:");
        String nombreModelo = JOptionPane.showInputDialog("Ingrese el nombre del modelo:");       
        String microprocesador = JOptionPane.showInputDialog("Ingrese el microprocesador:");
        String memoria = JOptionPane.showInputDialog("Ingrese la memoria:");
        String dimencionPantalla = JOptionPane.showInputDialog("Ingrese el tamaño de la pantalla (en pulgadas):");
        String capacidadDiscoDuro = JOptionPane.showInputDialog("Ingrese la capacidad del disco duro:");
        
        Laptop laptop = new Laptop(
                memoria,
                Double.parseDouble(dimencionPantalla),
                Double.parseDouble(capacidadDiscoDuro),
                nombreFabricante,
                nombreModelo,
                microprocesador
        );

        Desktop des = new Desktop();
        
        laptops.add(des);
        
        laptops.add(laptop);
    }

    public void verEquipos(String tipo, List<Equipo> equipos) {
        List<Equipo> lista = null;
        switch (tipo) {
            case "1"://Desktop
                break;
            case "2"://Laptop
                verLaptops(equipos);
                break;
            case "3"://Tablet
                break;
        }
    }
    
    private void verLaptops(List<Equipo> laptops){
        laptops.forEach((laptop) -> {
            if(laptop instanceof Laptop){             
                System.out.println(laptop.toString());
            }
        });
        
    }
}
