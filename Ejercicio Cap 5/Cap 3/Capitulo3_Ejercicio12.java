
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio12 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int Presupuesto;
        System.out.println("Ingresar monto presupuestado");
        Presupuesto = intro.nextInt();
        double Kine = Presupuesto * 0.2;
        double Gine = Presupuesto * 0.25;
        double Trau = Presupuesto * 0.3;
        double Pedi = Presupuesto * 0.25;
        System.out.println("El dinero de Kinesiologia es: "+Kine);
        System.out.println("EL dinero de Ginecologia es: "+Gine);
        System.out.println("El dinero de Traumatologia es: "+Trau);
        System.out.println("El dinero de Pediatria es: "+Pedi);
        
    }
}
