
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio6 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int CI=0, CCh=0, HQ=0, Ch=0, Cerv=0, Bebi=0;
        System.out.println("Ingresar cantidad de completos italianos");
        CI = intro.nextInt();
        System.out.println("Ingresar cantidad de completos a la chilena");
        CCh = intro.nextInt();
        System.out.println("Ingresar cantidad de hamburguesa - queso");
        HQ = intro.nextInt();
        System.out.println("Ingresar cantidad de churrascos");
        Ch = intro.nextInt();
        System.out.println("Ingresar cantidad de cervezas");
        Cerv = intro.nextInt();
        System.out.println("Ingresar cantidad de bebidas");
        Bebi = intro.nextInt();
        double iva = 21 / 100;
        double orden1 = Math.round((CI * 690) + (690 * iva));
        double orden2 = Math.round((CCh * 890) + (890 * iva));
        double orden3 = Math.round((HQ * 990) + (990 * iva));
        double orden4 = Math.round((Ch * 1100) + (1100 * iva));
        double orden5 = Math.round((Cerv * 700) + (700 * iva));
        double orden6 = Math.round((Bebi * 500) + (500 * iva));
        System.out.println("El total de completos italianos es: $"+orden1);
        System.out.println("El total de completos a la chilena es: $"+orden2);
        System.out.println("El total de hamburguesa-queso es: $"+orden3);
        System.out.println("El total de churrascos es: $"+orden4);
        System.out.println("El total de la cerveza es: $"+orden5);
        System.out.println("El total de la bebida es: $"+orden6);
        double OrTotal = orden1 + orden2 + orden3 + orden4 + orden5 + orden6;
        System.out.println("El total es: $"+OrTotal);
    }
}
