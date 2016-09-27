
package capitulo5;

import java.util.Scanner;

public class Capitulo5_Ejercicio10 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int X, z, i, a=0,Mult;
        long fact=1;
        System.out.println("Ingresar numero");
        X = intro.nextInt();
        for (i = 1; i < X; i++) {
            if (X%i==0)
                a++;
        }
        if (a!=2){
            System.out.println("No es Primo");
        }else{
            System.out.println("Si es Primo");
        }
        System.out.println("----------------------------------------------");
        for (i = 1; i <= X ; i++) {
            System.out.println(fact+"*"+i);
            fact=fact*i;   
        }
        System.out.println("----------------------------------------------");
        for (z = 1; z < 13; z++){
            Mult = X * z;
            System.out.println(X+"*"+z+"="+Mult);
        }
    }
}
