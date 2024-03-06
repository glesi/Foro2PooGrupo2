
package registrodeventas;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author JC
 */
public class RegistroDeVentas {


    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
       List<String> equipos = new ArrayList<>();
       
        while (true) {
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
        }
    }
    
    

        
    }
    
}
