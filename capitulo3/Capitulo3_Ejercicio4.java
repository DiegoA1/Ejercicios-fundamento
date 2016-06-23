
package capitulo3;

import java.util.Scanner;

public class Capitulo3_Ejercicio4 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int n1=0, n2=0, n3=0;
        System.out.println("Ingresar primer numero");
        n1 = intro.nextInt();
        System.out.println("Ingresar segundo numero");
        n2 = intro.nextInt();
        System.out.println("Ingresar tercer numero");
        n3 = intro.nextInt();
        int prom = (n1+n2+n3)/3;
        int suma = n1+n2+n3;
        int doble = n1 * 2;
        int triple = n2 * 3;
        int cuadr = n3 * n3;
        System.out.println("El promedio es: "+prom);
        System.out.println("La suma de: "+suma);
        System.out.println("El doble del primer numero es: "+doble);
        System.out.println("El triple del segundo numero es: "+triple);
        System.out.println("El cuadrado del tercer numero es: "+cuadr);
        
    }
    
}
