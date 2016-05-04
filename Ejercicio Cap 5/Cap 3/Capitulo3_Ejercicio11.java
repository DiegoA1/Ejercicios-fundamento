
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio11 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double Parc, Taller, Tareas, Invest;
        System.out.println("Ingresar calificaciones parciales");
        Parc = intro.nextDouble();
        System.out.println("Ingresar promedio de talleres");
        Taller = intro.nextDouble();
        System.out.println("Ingresar promedio de tareas");
        Tareas = intro.nextDouble();
        System.out.println("Ingresar exposicion del tema de investigacion");
        Invest = intro.nextDouble();
        double CaliPa = Parc * 0.5;
        double PromTller = Taller * 0.25;
        double PromTar = Tareas * 0.15;
        double ExpInv = Invest * 0.1;
        double CaliFinal = Math.round(CaliPa + PromTller + PromTar + ExpInv);
        System.out.println("La calificacion dinal es: "+CaliFinal);
    }
    
}
