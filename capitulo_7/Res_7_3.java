
package capitulo_7;

import java.util.Scanner;

public class Res_7_3 {
    static final int jornadas = 3;
    static final int dias = 7;
    static Scanner intro;
    public static void main(String[] args) {
        intro = new Scanner(System.in);
        int [][] reclamos = new int [jornadas][dias];
        ingresar (reclamos);
        System.out.println("El promedio de reclamos para la jornada de 15:00 a 20:00 hrs es: " + promedioReclamos(reclamos, 2));
        System.out.println("El dia de la semana que tuvo más reclamos fue: "+diaReclamos(reclamos));
    }
    public static void ingresar(int[][]rcm) {
        int i, j;
        for (j = 0; j < dias; j++) {
            System.out.println("Ingrese los reclamos para el dia: "+(j+1));
            for (i = 0; i < jornadas; i++) {
                System.out.println("Ingrese el reclamos para la jornada: "+(i+1));
                rcm[i][j] = intro.nextInt();
            }
        }
    }
    public static float promedioReclamos(int[][] rcm, int jornada) {
        int i;
        int suma = 0;
        int dia = 0;
        for (i = 0; i < dias; i++) {
            suma = suma + rcm[jornada][i];
        }
        return (float)suma/dias;
    }
    public static int diaReclamos(int[][] rcm) {
        int i, j;
        int suma;
        int mayor = 0;
        int dia = 0;
        for (j = 0; j < dias; j++) {
            suma = 0;
            for (i = 0; i < jornadas; i++) {
                suma = suma + rcm [i][j];
            }
            if(mayor < suma){
                mayor = suma;
                dia = j+i;
            }
        }
        return dia;
    }
}
