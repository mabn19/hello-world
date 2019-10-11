
package calculadora;

import javax.swing.JFrame;


public class Calculadora {


    public static void main(String[] args) {
    GUI interfaz = new GUI();
    interfaz.setSize(500,500);
    interfaz.setTitle("Calculadora de Complejos");
    interfaz.setLocation(500,200);
    interfaz.setResizable(false);
    interfaz.setVisible(true);
    interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
