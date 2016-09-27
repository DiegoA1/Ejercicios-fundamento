package ejercicios;

import java.util.Scanner;

public class Eje_fun23 {
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
    
    public static void main(String []args){
        Scanner intro=new Scanner (System.in);
        System.out.println("Ingrese largo del arreglo 1 y 2");
        int large1=intro.nextInt();int large2=intro.nextInt();
        int array1[]=new int [large1];int array2[]=new int[large2];
        System.out.println("Llene el arreglo 1");
        funcion1(array1,large1);
        System.out.println("Llene el arreglo 2");
        funcion1(array2,large2);
        System.out.println("Valores iguales entre los 2 arreglos");
        for(int i=0;i<array2.length;i++){
            if(funcion3(array1,large1,array2[i])){
                System.out.println("El valor "+array2[i]+" esta en el arreglo 1 y 2");
            }
        }
    }
    
    public static void funcion1(int[]array,int valor){
        int i=0;
        Scanner intro=new Scanner (System.in);
        while(i<valor){
            array[i]=intro.nextInt();
            i++;
        }
    }
}
