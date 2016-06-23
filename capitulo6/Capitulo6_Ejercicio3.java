
package capitulo6;

import java.util.Scanner;

public class Capitulo6_Ejercicio3 {
    public static void main(String[] args) {
        final int jornadas = 3;
        final int dias = 7;
        int reclamos [][] = new int[jornadas][dias];
        int i, j;
        int suma = 0;
        int mayor = 0;
        int dia = 0;
        Scanner intro = new Scanner(System.in);
        for (j = 0; j < dias; j++) {
            System.out.println("Ingresar los reclamos para el día "+(int)(j+1));
            for (i = 0; i < jornadas; i++) {
                System.out.println("Ingresar el reclamo de la jornada "+(int)(i+1));
                reclamos[i][j]=intro.nextInt();
            }
        }
        suma = 0;
        for (i = 0; i < dias; i++) 
            suma = suma + reclamos[2][i];
        System.out.println("El promedio de reclamos para la jornada de 15:00 a 20:00 hrs es: "+(float)(suma/dias));
        for (j = 0; j < dias; j++) {
            suma = 0;
            for (i = 0; i < jornadas; i++) {
                suma = suma + reclamos[i][j];
            }
            if (mayor < suma){
                mayor = suma;
                dia = j;
            }
        }
        System.out.println("El día de la semana que tuvo más reclamos fue "+dia);
    }
    
}
