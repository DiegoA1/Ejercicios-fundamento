
package ejercicios;

import java.util.Scanner;

public class Tarea_Shell_sort {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int x, salto;
        boolean cambios;
        double aux;
        System.out.println("Ingresar cantidad de numeros");
        x = intro.nextInt();
        double num[] = new double[x];
        for (int i = 0; i < num.length; i++) {
            num[i]=(int)(Math.random()*20+1);
        }
        for (salto = num.length/2; salto!=0 ; salto/=2) {
            cambios=true;
            while(cambios){
                cambios=false;
                for (int i = salto; i < num.length; i++) {
                    if(num[i-salto]>num[i]){
                        aux=num[i];
                        num[i]=num[i-salto];
                        num[i-salto]=aux;
                        cambios=true;
                    }
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+", ");
        }
    }
}
