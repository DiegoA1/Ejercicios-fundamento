
package capitulo_7;

import java.util.Scanner;

public class Res_7_6 {
    static final int empleados = 2;
    static final int meses = 12;
    public static void main(String[] args) {
        int pagos[][]=new int [empleados][meses];
        ingresar(pagos);
        System.out.println("El empleado que gana más en el año es: "+ganaMas(pagos));
        System.out.println("El mes en el que se pago menos es: "+menorPago(pagos));
        System.out.println("El promedio anual de remuneraciones es: "+promedioAnual(pagos));
    }
    public static void ingresar(int p[][]) {
        int i, j;
        Scanner intro = new Scanner(System.in);
        for (i = 0; i < empleados; i++) {
            System.out.println("Ingrese remuneraciones para el empleado "+(i+1));
            for (j = 0; j < meses; j++) {
                p[i][j]=intro.nextInt();
            }
        }
    }
    public static int ganaMas(int p[][]) {
        int suma = 0;
        int mayor = 0;
        int i, j;
        int emple = 0;
        for (i = 0; i < empleados; i++) {
            suma = 0;
            for (j = 0; j < meses; j++) {
                suma = suma + p[i][j];
            }
            if(mayor < suma){
                mayor = suma;
                emple = 1;
            }
        }
        return emple+1;
    }
    public static int menorPago(int p[][]) {
        int suma = 0;
        int menor = 9999999;
        int i, j;
        int mes = 0;
        for (j = 0; j < meses; j++) {
            suma = 0;
            for (i = 0; i < empleados; i++) {
                suma = suma + p[i][j];
            }
            if(menor > suma){
                menor = suma;
                mes = j;
            }
        }
        return mes;
    }
    public static float promedioAnual(int p[][]) {
        int suma = 0;
        int i, j;
        for (i = 0; i < empleados; i++) {
            for (j = 0; j < meses; j++) {
                suma = suma + p[i][j];
            }
        }
        return (float)suma/(30*15);
    }
}
