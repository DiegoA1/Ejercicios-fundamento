
package capitulo6;

import java.util.Scanner;

public class Capitulo6_Ejercicio2 {
    public static void main(String[] args) {
        int N = 12;
        int[] cuenta = new int[N];
        float prom, vari;
        int i, mayor, mes, suma;
        Scanner intro = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.println("Ingresar abono para el mes " + (int)(i+1));
            cuenta[i] = intro.nextInt();
        }
        mayor = cuenta[0];
        mes = 0;
        for (i = 0; i < 10; i++) {
            if(cuenta[i] > mayor){
                mes = i;
            }
        }
        System.out.println("El mes en que se ingreso el mayor ahorro es "+mes);
        suma = 0;
        for (i = 1; i < N; i++)
            suma = suma + cuenta[i];
        prom = (float) suma / N;
        System.out.println("El promedio de dinero en la cuenta de ahorro para el año es "+prom);
        for (i = 0; i < 10; i++) {
            suma = suma + (cuenta[i]-(int)prom) * (cuenta[i]-(int)prom);
        }
        vari = (float) suma / N-1;
        System.out.println("La varianza es "+vari);
        System.out.println("Y la desviacion estandar es "+Math.sqrt(vari));
    }
}
