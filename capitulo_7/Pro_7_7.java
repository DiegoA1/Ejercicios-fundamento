
package capitulo_7;

import java.util.Scanner;

public class Pro_7_7 {
    static final int N = 30;
    public static void main(String[] args) {
        int ventas[]=new int [N];
        ingresar(ventas);
        System.out.println("El día con mayor venta fue: "+mayorVenta(ventas));
        System.out.println("El total de ventas del mes es: "+calcularVenta(ventas));
        mostrarVenta(ventas);
        
    }
    public static void ingresar(int v[]) {
        Scanner intro = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            do{
                System.out.println("Ingresar valor total logrado en ventas  del día N°"+(i+1)+": ");
                v[i]=intro.nextInt();
                if(v[i]<0)
                    System.out.println("***Incorrecto, ingrese nuevamente***");
            }while(v[i]<0);
        }
    }
    public static int mayorVenta(int v[]) {
        int dia = 0;
        int mayor = 0;
        for (int i = 0; i < N; i++) {
            if(mayor < v[i]){
                mayor = v[i];
                dia = i;
            }   
        }
        return dia+1;
    }
    public static int calcularVenta(int v[]) {
        int suma = 0;
        for (int i = 0; i < N; i++) {
            suma = suma + v[i];
        }
        return suma;
    }
    public static void mostrarVenta(int v[]) {
        for (int i = 0; i < N; i++) {
            if(v[i]<10000){
                System.out.println("El dia con ventas inferiores a los $10.000 es: "+(i+1)+" con: $"+v[i]);
            }
        }
    }
}
