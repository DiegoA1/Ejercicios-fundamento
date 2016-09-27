
package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class weas {
    public static void main(String[] args) {
        int opcion;
        Scanner intro = new Scanner(System.in);
        menu();
        JOptionPane.showMessageDialog(null, "ingrese opcion del menú");
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese opción del menú"));
        JOptionPane.showMessageDialog(null,"La opción seleccionada es: "+opcion);
    }
    
    
    public static void menu() {
        JOptionPane.showMessageDialog(null,"MENú\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir");
        
    }
}
