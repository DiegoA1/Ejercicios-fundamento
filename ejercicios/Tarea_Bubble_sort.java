
package ejercicios;

import java.util.Scanner;

public class Tarea_Bubble_sort {
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
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if(num[i]>num[j]){
                    aux=num[i];
                    num[i]=num[j];
                    num[j]=aux;
                }    
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+", ");
        }
    }
}
