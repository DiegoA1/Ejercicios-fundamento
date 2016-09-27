
package capitulo6;

import java.util.Scanner;

public class Capitulo6_Ejercicio5 {
    public static void main(String[] args) {
        int Mayor=0, Menor=100, i=0, Suma=0;
        int X[];
        X=new int[12];
        Scanner intro = new Scanner(System.in);
        for (i = 0; i < X.length; i++) {
            System.out.println("Ingresar el saldo del mes "+(i+1));
            X[i]=intro.nextInt();
            if (X[i]>Mayor) 
                Mayor=X[i];
            if (X[i]<Menor)
                Menor=X[i];
        }
        System.out.println("El mes con menor saldo es: "+Menor);
        System.out.println("El mes con mayor saldo es: "+Mayor);
        Suma = Suma+X[i];
        double prom = Suma/12;
        System.out.println("El promedio de saldos para el año es: "+prom);
    }
}
