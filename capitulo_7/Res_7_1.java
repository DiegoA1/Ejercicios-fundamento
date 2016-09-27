
package capitulo_7;

import java.util.Scanner;

public class Res_7_1 {
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros");
        n1 = intro.nextInt();
        n2 = intro.nextInt();
        n3 = intro.nextInt();
        n4 = intro.nextInt();
        n1 = mayor(n1, n2);
        n1 = mayor(n1, n3);
        n1 = mayor(n1, n4);
        System.out.println("El mayor es: "+n1);
    }
    public static int mayor(int num1, int num2) {
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
}
