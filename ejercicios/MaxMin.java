
package ejercicios;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int a=0, max=0, min=100, i=0;
        do{
            System.out.println("ingresar numero");
            a = intro.nextInt();
            if(a>=max)
                max=a;
            if(a<=min)
                min=a;
            i++;
            
        }while(i<5);
        System.out.println("maximo: "+max+" minimo: "+min);
    }
    
}
