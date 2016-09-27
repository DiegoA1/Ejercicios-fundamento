
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio7 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int Edad=0;
        System.out.println("Ingresar su edad");
        Edad = intro.nextInt();
        double NPuls = Math.round(220 - Edad)/10;
        System.out.println("El numero de pulsaciones que tienes es: "+NPuls+ " pulsaciones");
    }
}
