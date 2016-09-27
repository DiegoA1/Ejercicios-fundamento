
package capitulo_7;

import java.util.Scanner;

public class Res_7_5 {
    static final int N = 30;
    public static void main(String[] args) {
        int ventaCd[] = new int [N];
        ingresar(ventaCd);
        System.out.println("El promedio de ventas durante los primeros 15 dias es :"+promedio15Dias(ventaCd));
        mostrarVentas(ventaCd);
        System.out.println("El de mayor venta es: "+mayorVenta(ventaCd));
    }
    public static void ingresar(int[] x) {
        Scanner intro = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            do{
                System.out.println("Ingrese venta de cd para dia: "+(i+1));
                x[i] = intro.nextInt();
                if(x[i]<0)
                    System.out.println("***Ventas mal ingresada***");
            }while(x[i]<0);
        }
    }
    public static float promedio15Dias(int [] x) {
        int suma = 0;
        for (int i = 0; i < 15; i++) {
            suma = suma + x[i];
        }
        return (float)suma/15;
    }
    public static void mostrarVentas(int [] x) {
        for (int i = 0; i < N; i++) {
            if(x[i]>345000){
                System.out.println("venta dia "+(i+1)+" es: "+x[i]);
            }
        }
    }
    public static int mayorVenta(int [] x) {
        int i = 0;
        int dia = 0;
        int mayor = 0;
        for (i = 1; i < N; i++) {
            if(mayor < x[i]){
                mayor = x[i];
                dia = i;
            }
        }
        return dia+1;
    }
}
