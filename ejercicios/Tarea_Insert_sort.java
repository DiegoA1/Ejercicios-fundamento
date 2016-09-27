package ejercicios;

import java.util.Scanner;

public class Tarea_Insert_sort {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int x;
        double aux;
        System.out.println("Ingresar cantidad de numeros");
        x = intro.nextInt();
        double num[] = new double[x];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 20 + 1);
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i; 0 < j && num[j] < num[j-1]; j--) {
                aux = num[j];
                num[j]=num[j-1];
                num[j-1]=aux;
                
            }

        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+", ");
        }
    }
}
