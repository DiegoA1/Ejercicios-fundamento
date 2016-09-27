
package capitulo5;

import java.util.Scanner;

public class Capitulo5_Ejercicio8 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int X1, Y1, X2, Y2, F;
        System.out.println("Ingresar X1");
        X1 = intro.nextInt();
        System.out.println("Ingresar Y1");
        Y1 = intro.nextInt();
        System.out.println("Ingresar X2");
        X2 = intro.nextInt();
        System.out.println("Ingresar Y2");
        Y2 = intro.nextInt();
        
        F=(X2-X1)/(Y2-Y1);
        System.out.println("La distancia que los separa es de: "+F);
        System.out.println("La ecuacion de la recta sera: "+F+"X+"+"Y+"+(-Y1+(F*-X1*-1)));
    }
    
}
