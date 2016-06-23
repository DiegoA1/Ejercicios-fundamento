
package capitulo6;

import java.util.Scanner;

public class Capitulo6_Ejercicio4 {
    public static void main(String[] args) {
        int i=0, j = 0, suma=0, SDiagonal;
        int matriz[][];
        double prom;
        matriz = new int[10][10];
        Scanner intro = new Scanner(System.in);
        for (i = 0; i < matriz.length; i++) {
            System.err.println("fila n° "+(i+1));
            for (j = 0; j < matriz.length; j++) {
                System.out.println("Ingresar numero de columna n° "+(j+1));
                matriz[i][j] = intro.nextInt();
            }
        }
        suma = suma + matriz[1][j];
        prom = suma / 10;
        System.out.println("El promedio de la fila n°1 es: "+prom);
        SDiagonal = matriz[1][1]+matriz[2][2]+matriz[3][3]+matriz[4][4]+matriz[5][5]+matriz[6][6]+matriz[7][7]+matriz[8][8]+matriz[9][9]+matriz[10][10];
        System.out.println("La suma de los números de la diagonal es: "+SDiagonal);
    }
}
