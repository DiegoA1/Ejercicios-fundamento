
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio14 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int Amigo1, Amigo2, Amigo3;
        System.out.println("Ingresar la cantidad de dinero del primer amigo");
        Amigo1 = intro.nextInt();
        System.out.println("Ingresar la cantidad de dinero del segundo amigo");
        Amigo2 = intro.nextInt();
        System.out.println("Ingresar la cantidad de dinero del tercer amigo");
        Amigo3 = intro.nextInt();
        int DinTotal = Amigo1 + Amigo2 + Amigo3;
        double PAmigo1 = (Amigo1 * 100)/DinTotal;
        double PAmigo2 = (Amigo2 * 100)/DinTotal;
        double PAmigo3 = (Amigo3 * 100)/DinTotal;
        System.out.println("El porcentaje del Primer amigo es de: "+PAmigo1);
        System.out.println("El porcentaje del segundo amigo es de: "+PAmigo2);
        System.out.println("El porcentaje del tercer amigo es de: "+PAmigo3);
    }
}
