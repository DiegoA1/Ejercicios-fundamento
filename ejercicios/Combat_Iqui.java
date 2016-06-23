
package ejercicios;

import java.util.Scanner;

public class Combat_Iqui {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        
        int Us[][] = new int[5][5];
        int Pc[][] = new int[5][5];
        for (int i = 0; i < Pc.length; i++) {
            for (int j = 0; j < Pc.length; j++) {
                Pc[i][j]=(int)(Math.random()*1+1);
            }
            
        }
        for (int i = 0; i < Pc.length; i++) {
            for (int j = 0; j < Pc.length; j++) {
                System.out.print("|"+Pc[i][j]+"| \t");
            }
            System.out.println(" ");
        }
    }
}
