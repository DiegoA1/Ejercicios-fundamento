package ejercicios;

import java.util.Scanner;

public class Eje_fun21 {
    public static boolean funcion3(int[]arreglo,int valor,int valor2){
        int i=0;
        while(i<valor){
            if(arreglo[i]==valor2){
                return true;
            }
            i++;
        }
        return false;
    }
    
    public static void main (String[]args){
        Scanner intro=new Scanner (System.in);
        System.out.println("Ingresar largo de arreglo");
        int large=intro.nextInt();
        int array []= new int [large];
        System.out.println("Llene el arreglo");
        funcion1(array,large);
        System.out.println("Ingresar valor a comparar");
        int valor=intro.nextInt();
        if(funcion3(array,large,valor)){
            System.out.println("El numero "+valor+" si esta dentro del arreglo");
        }else{
            System.out.println("El numero no esta dentro del arreglo");
        }
    }
    
    public static void funcion1(int[]arreglo,int valor){
        int i=0;
        Scanner intro=new Scanner (System.in);
        while(i<valor){
            arreglo[i] = intro.nextInt();
            i++;
        }
    }
   
}
