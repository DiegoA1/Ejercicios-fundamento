package ejercicios;

import java.util.Scanner;

public class Eje_fun22 {
    
    public static void main(String[]args){
        Scanner intro=new Scanner (System.in);
        System.out.println("Ingrese largo de arreglo");
        int large=intro.nextInt();
        int array[]=new int [large];
        System.out.println("Llene el arreglo");
        funcion1(array,large);
        funcion4(array,large);
        System.out.println("EL numero mayor del arreglo es "+array[0]);    
    }
    
    public static void funcion1(int[]arreglo,int valor){
        int i=0;
        Scanner intro=new Scanner (System.in);
        while(i<valor){
            arreglo[i]=intro.nextInt();
            i++;
        }
    }
    
    public static void funcion4(int[]arreglo,int valor){
        int i=0,j,x;
        while(i<valor){
        j=i+1;
        while(j<valor){
            if(arreglo[i]<arreglo[j]){
                x=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=x;
            }
            j++;
        }
        i++;
    }
    }
}
