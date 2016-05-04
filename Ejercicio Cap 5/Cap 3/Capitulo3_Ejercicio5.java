
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio5 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int SB=0, HT=0;
        System.out.println("Ingresar sueldo base");
        SB = intro.nextInt();
        System.out.println("Ingresar horas trabajadas");
        HT = intro.nextInt();
        int HEx = (HT - (44 * 4));
        int PHEx = HEx * 5000;
        double Desc = SB * 0.2;
        double DescP = SB - Desc;
        double Total = DescP + PHEx;
        System.out.println("El sueldo base es: "+SB);
        System.out.println("El descuento es: "+Desc);
        System.out.println("El total ganado es: "+Total);
        
    }
}
