
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio10 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int Aprob, Reprob, Notab, SobreS;
        System.out.println("Ingresar la cantidad de alumnos aprobados");
        Aprob = intro.nextInt();
        System.out.println("Ingresar la cantidad de alumnos reprobados");
        Reprob = intro.nextInt();
        System.out.println("Ingresar la cantidad de alumnos notables");
        Notab = intro.nextInt();
        System.out.println("Ingresar la cantidad de alumnos sobresalientes");
        SobreS = intro.nextInt();
        int Total = Aprob + Reprob + Notab + SobreS;
        double PorAprob = Math.round((Aprob *100)/Total);
        double PorReprob = Math.round((Reprob * 100)/Total);
        double PorNotab = Math.round((Notab * 100)/Total);
        double PorSobreS = Math.round((SobreS * 100)/Total);
        System.out.println("El porciento de alumnos Aprobados es: "+PorAprob);
        System.out.println("El porciento de alumnos Reprobados es: "+PorReprob);
        System.out.println("El porciento de alumnos Notables es: "+Notab);
        System.out.println("EL porciento de alumnos Sobresalientes es: "+PorSobreS);
    }
}
