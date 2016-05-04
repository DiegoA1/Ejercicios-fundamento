
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio2 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int n1=0, n2=0;
        System.out.println("Ingresar primer numero");
        n1 = intro.nextInt();
        System.out.println("Ingresar segundo numero");
        n2 = intro.nextInt();
        int suma = n1 + n2;
        int multi = n1 * n2;
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la multiplicacion es: "+multi);
    }
}
