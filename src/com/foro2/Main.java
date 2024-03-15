/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foro2;

import com.foro2.procesos.Equipo;
import com.foro2.procesos.Inventario;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author glesi
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Equipo> equipos = new ArrayList<>();
        Inventario inventario = new Inventario();

        // Agregar un menú con las diferentes opciones
        while (true) {
            try {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1. Registrar equipo\n2. Ver equipos\n3. Salir"));

                switch (opcion) {
                    case 1:
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione equipo a registrar\n1. Desktop \n2. Laptop\n3. Tablet"));
                        inventario.agregarEquipo(opcion, equipos);
                        break;
                    case 2:
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione equipo a listar\n1. Desktop \n2. Laptop\n3. Tablet"));
                        inventario.verEquipos(opcion, equipos);
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido");
            }
        }
    }
}
