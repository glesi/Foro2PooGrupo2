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
                break;
            case "3":
                break;
        }
    }

    public void verEquipos(String tipo, List<Equipo> equipos) {
        List<Equipo> lista = null;
        switch (tipo) {
            case "1"://Desktop
                break;
            case "2"://Laptop
                break;
            case "3"://Tablet
                break;
        }
    }
}
