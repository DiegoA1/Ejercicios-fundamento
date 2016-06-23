
package ejercicios;

import java.util.Scanner;

public class Tarea_Select_sort {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int x;
        double aux;
        System.out.println("Ingresar cantidad de numeros");
        x = intro.nextInt();
        double num[] = new double[x];
        for (int i = 0; i < num.length; i++) {
            num[i]=(int)(Math.random()*20+1);
        }
        for (int i = 0; i < num.length-1; i++) {
            int k=i;
            for (int j = i+1; j < num.length; j++) {
                if(num[j]<num[k])
                    k=j;
            }
            aux = num[i];
            num[i]=num[k];
            num[k]=aux;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+", ");
        }
    }
}
