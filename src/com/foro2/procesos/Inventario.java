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

    public void agregarEquipo(int equipo, List<Equipo> equipos) {
        switch (equipo) {
            case 1:
                break;
            case 2: //Laptop
                registrarLaptop(equipos);
                break;
            case 3:
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

        laptops.add(laptop);
        JOptionPane.showMessageDialog(null, "Equipo agregado exitosamente", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void verEquipos(int opcion, List<Equipo> equipos) {
        switch (opcion) {
            case 1://Desktop
                break;
            case 2://Laptop
                verLaptops(equipos);
                break;
            case 3://Tablet
                break;
        }
    }

    private void verLaptops(List<Equipo> laptops) {    
        StringBuilder sb = new StringBuilder("<html><body>");
        sb.append("<h1>Laptops</h1>");
        sb.append("<table>");

        for (Equipo equipo : laptops) {
            if(equipo instanceof Laptop){
                Laptop lap = (Laptop) equipo;
                sb.append("<tr><td><strong>Fabricante:</strong></td><td>").append(lap.getFabricante()).append("</td></tr>");
                sb.append("<tr><td><strong>Modelo:</strong></td><td>").append(lap.getModelo()).append("</td></tr>");
                sb.append("<tr><td><strong>Microprocesador:</strong></td><td>").append(lap.gettMicroprocesador()).append("</td></tr>");
                sb.append("<tr><td><strong>Memoria:</strong></td><td>").append(lap.getMemoria()).append("</td></tr>");
                sb.append("<tr><td><strong>Tamaño pantalla:</strong></td><td>").append(lap.getDimencionPantalla()).append("</td></tr>");
                sb.append("<tr><td><strong>Capacidad de disco duro:</strong></td><td>").append(lap.getCapacidadDiscoDuro()).append("</td></tr>");
                sb.append("<tr><td colspan='2'><hr></td></tr>");
            }     
        }

        sb.append("</table></body></html>");
        
        JOptionPane.showMessageDialog(null, sb.toString(), "Detalles de las Laptops", JOptionPane.INFORMATION_MESSAGE);
    }
}
