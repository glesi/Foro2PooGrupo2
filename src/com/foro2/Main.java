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
                        registrarEquipo(equipos);
                        break;

                    case 2:
                        verEquipos(equipos);
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

    // Método para registrar un equipo
    private static void registrarEquipo(List<Equipo> equipos) {
        // Aquí iría la lógica para registrar un equipo
        JOptionPane.showMessageDialog(null, "Registrar equipo");
        String[] opciones = {"Desktop", "Laptop", "Tablet"};
        String tipo = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de equipo:", "Registro de equipo",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        String fabricante = JOptionPane.showInputDialog("Ingrese el fabricante:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
        String microprocesador = JOptionPane.showInputDialog("Ingrese el microprocesador:");

        Equipo equipo = new Equipo(fabricante, modelo, microprocesador);
        equipos.add(equipo);
        
        JOptionPane.showMessageDialog(null, "Registrar equipo");
    }

    // Método para ver los equipos
    private static void verEquipos(List<Equipo> equipos) {
        // Aquí iría la lógica para mostrar los equipos
        JOptionPane.showMessageDialog(null, "Ver equipos");
        StringBuilder mensaje = new StringBuilder();
        equipos.forEach((equipo) -> {
            mensaje.append(equipo).append("\n\n");
        });
        JOptionPane.showMessageDialog(null, "Ver equipos");
    }
}
