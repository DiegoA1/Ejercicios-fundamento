package ejercicios;


import java.util.Scanner;

public class Eje_fun3 {

    public static void main(String[] args) {
        int array1[][] = new int[32][12];
        consumo(array1);
        gasto(array1);
        anual(array1);
        piso(array1);
    }

    public static void consumo(int[][] array) {
        System.out.println("Ingrese consumo por departamento y mes");
        Scanner intro = new Scanner(System.in);
        for (int j = 0; j < array[j].length; j++) {
            System.out.println("Ingresar datos consumo del mes " + (j + 1));
            for (int i = 0; i < array.length; i++) {
                System.out.println("Departamento " + (i + 1));
                array[i][j] = intro.nextInt();
            }
        }
    }
    public static void gasto (int [][]array){
        int acum=0;
        for (int j = 0; j < array[j].length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i][j]<=5){
                    acum=acum+(array[i][j]*100);
                }else{
                    if(array[i][j]>5&&array[i][j]<12){
                        acum=acum+(array[i][j]*100)+2000;
                    }else{
                        if(array[i][j]>=12){
                            acum=acum+(array[i][j]*120)+(array[i][j]/10);
                        }
                    }
                }
            }
        }
        System.out.println("Consumo total: $"+acum);
    }

    public static void anual(int[][] array) {
        int año = 0, max = 0, cont = 0, mes = 0;
        for (int j = 0; j < array[j].length; j++) {
            for (int i = 0; i < array.length; i++) {
                año = año + array[i][j];
                cont = cont + array[i][j];
            }
            if (cont > max) {
                max = cont;
                mes = j;
            }
            cont = 0;
        }
        System.out.println("Consumo en m3:");
        System.out.println(año);
        System.out.println("Mes con mas consumo:");
        System.out.println(mes);
    }

    public static void piso(int[][] array) {
        int acum=0, cont=0, cont2=0;
        System.out.println("Piso    Consumo");
        for (int j = 0; j < array.length; j++) {
            cont++;
            for (int i = 0; i < array[i].length; i++) {
                acum=acum+array[j][i];
            }
            if (cont==4){
                cont2++;
                cont=0;
                System.out.println(cont2+"  "+acum);
            }
        }
    }

}
