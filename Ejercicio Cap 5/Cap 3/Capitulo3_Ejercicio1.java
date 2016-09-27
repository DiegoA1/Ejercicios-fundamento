
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner intro = new Scanner(System.in);
        double R=0;
        double H=0;
        System.out.println("Ingresar Radio");
        R = intro.nextDouble();
        System.out.println("Ingresar altura");
        H = intro.nextDouble();
        double Area = 2 * 3.14 * R * (H+R);
        double Volumen = 3.14 * R * R * H;
        System.out.println("El area total es: "+Area);
        System.out.println("El volumen es: "+Volumen);
    }
    
}
