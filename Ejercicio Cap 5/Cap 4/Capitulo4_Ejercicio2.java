
package capitulo4;

import java.util.Scanner;

public class Capitulo4_Ejercicio2 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int Dinero;
        System.out.println("Ingrese la cantidad de dinero");
        Dinero = intro.nextInt();
        double C1 = Math.floor(Dinero/20000);
        double C2 = Math.floor((Dinero%20000)/10000);
        double C3 = Math.floor((Dinero%10000)/5000);
        double C4 = Math.floor((Dinero%5000)/2000);
        double C5 = Math.floor((Dinero%2000)/1000);
        double C6 = Math.floor((Dinero%1000)/500);
        double C7 = Math.floor((Dinero%500)/100);
        double C8 = Math.floor((Dinero%100)/50);
        double C9 = Math.floor((Dinero%50)/10);
        double C10 = Math.floor((Dinero%10)/5);
        double C11 = Math.floor((Dinero%5)/1);
        System.out.println("Billetes de $20.000: "+C1);
        System.out.println("Billetes de $10.000: "+C2);
        System.out.println("Billetes de $5.000: "+C3);
        System.out.println("Billetes de $2.000: "+C4);
        System.out.println("Billetes de $1.000: "+C5);
        System.out.println("Monedas de $500: "+C6);
        System.out.println("Monedas de $100: "+C7);
        System.out.println("Monedas de $50: "+C8);
        System.out.println("Monedas de $10: "+C9);
        System.out.println("Monedas de $5: "+C10);
        System.out.println("Monedas de $1: "+C11);
    }
    
}
