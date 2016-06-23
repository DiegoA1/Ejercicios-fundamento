
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio9 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int DiaL, DiaMa, DiaMi, DiaJ, DiaV, DiaS;
        System.out.println("Ingresar el tiempo del día Lunes (en minutos)");
        DiaL = intro.nextInt();
        System.out.println("Ingresar el tiempo del día Martes (en minutos)");
        DiaMa = intro.nextInt();
        System.out.println("Ingresar el tiempo del día Miercoles (en minutos)");
        DiaMi = intro.nextInt();
        System.out.println("Ingresar el tiempo del día Jueves (en minutos)");
        DiaJ = intro.nextInt();
        System.out.println("Ingresar el tiempo del día Viernes (en minutos)");
        DiaV = intro.nextInt();
        System.out.println("Ingresar el tiempo del día Sabado (en minutos)");
        DiaS = intro.nextInt();
        int TiempoTtal = (DiaL + DiaMa + DiaMi + DiaJ + DiaV + DiaS)/6;
        System.out.println("El tiempo promedio es: "+TiempoTtal+" minutos");
    }
    
}
