
package capitulo_7;

import java.util.Scanner;

public class Res_7_2 {
    public static void main(String[] args) {
        int n;
        Scanner intro = new Scanner(System.in);
        do{
            System.out.println("Ingrese numero mayor que 1000");
            n = intro.nextInt();
        }while(n<1000);
        System.out.println("El valor de la serie es: "+serie(n));
    }
    public static double factorial(int x) {
        int i;
        double factor = 1;
        if(x<2){
            return 1;
        }else{
            for (i = 1; i <= x; i++) {
                factor = factor * i;
            }
        }
        return factor;
    }
    public static double serie(int n) {
        int i;
        double suma = 0;
        for (i = 1; i <= n; i++) {
            suma = suma + (double)1/factorial(i);
        }
        return suma;
    }
}
