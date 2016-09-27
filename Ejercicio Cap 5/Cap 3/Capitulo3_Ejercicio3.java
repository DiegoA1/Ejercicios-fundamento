
package capitulo3;

import java.util.Scanner;


public class Capitulo3_Ejercicio3 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int Edad=0;
        System.out.println("Ingresar edad");
        Edad = intro.nextInt();
        int Dv = 365 * Edad;
        System.out.println("Los dias que a vivido son: "+Dv);
    }
}
