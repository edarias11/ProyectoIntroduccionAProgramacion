/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prfsemana03alejandroespinoza.proyectointroduccionaprogramacion;
import javax.swing.JOptionPane;
/**
 *
 * @author aleja
 */
public class Prueba {
    public static void main(String[] args) {
        // Declarar una variable para almacenar la opción elegida
        int opcion = 0;
        // Crear un ciclo while que se repita hasta que la opción sea 5 (salir)
        while (opcion != 5) {
            // Mostrar un cuadro de diálogo con las opciones disponibles
            String input = JOptionPane.showInputDialog(null, "Elige una opción:\n"
                    + "1. Hacer algo\n"
                    + "2. Hacer otra cosa\n"
                    + "3. Hacer algo más\n"
                    + "4. Hacer lo último\n"
                    + "5. Salir");
            // Convertir el input a un número entero
            opcion = Integer.parseInt(input);
            // Usar una estructura if-else para ejecutar una acción según la opción
            if (opcion == 1) {
                // Hacer algo
                JOptionPane.showMessageDialog(null, "Has elegido hacer algo");
            } else if (opcion == 2) {
                // Hacer otra cosa
                JOptionPane.showMessageDialog(null, "Has elegido hacer otra cosa");
            } else if (opcion == 3) {
                // Hacer algo más
                JOptionPane.showMessageDialog(null, "Has elegido hacer algo más");
            } else if (opcion == 4) {
                // Hacer lo último
                JOptionPane.showMessageDialog(null, "Has elegido hacer lo último");
            } else if (opcion == 5) {
                // Salir
                JOptionPane.showMessageDialog(null, "Has elegido salir");
            } else {
                // Opción inválida
                JOptionPane.showMessageDialog(null, "Opción inválida, por favor elige una opción del 1 al 5");
            }
        }
    }
}

