/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package prfsemana03alejandroespinoza.proyectointroduccionaprogramacion;

//IMPORTS
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
//
/**
 *
 * @author aleja
 */
public class verificacionInicial {
    
    public static Map<String, String> administradores = new HashMap<>();
    public static Map<String, String> clientes = new HashMap<>();
    
    public void ingresarDatos(){
        //Variables
        administradores.put("Ale","123");
        clientes.put("Jenny","456");
        Administradores administrador = new Administradores();
        Usuarios usuario = new Usuarios();
        String user ="";
        String pass ="";
        int intentos = 3;
        boolean permitir = false;
        
        //Verificacion
        while (permitir == false && intentos !=0) {
            user = JOptionPane.showInputDialog("Digite su usuario: ");
            pass = JOptionPane.showInputDialog("Digite su contraseña: ");
            //JOptionPane.showMessageDialog(null, "Usuario "+user+" Contrasenna: "+pass);
            if (administradores.containsKey(user) && administradores.get(user).equals(pass)){
                permitir = true;
                JOptionPane.showMessageDialog(null,"Eres administrador");
                administrador.Bienvenida();
            } else if (clientes.containsKey(user) && clientes.get(user).equals(pass)){
                permitir = true;
                JOptionPane.showMessageDialog(null,"Eres usuario");
                administrador.Bienvenida();
            } else {
                intentos--;
                JOptionPane.showMessageDialog(null,"Contraseña o usuario incorrecto, "
                        + "por favor vuelva a intentear, le quedan "+intentos+" intentos");
            }
        }
        if(permitir == false){
            JOptionPane.showMessageDialog(null,"Debido al numero de intentos su cuenta ha sido bloqueada, "
                    + "por favor contacte a un administrador para que esta sea desbloqueada nuevamente");
        }
    }     
}
