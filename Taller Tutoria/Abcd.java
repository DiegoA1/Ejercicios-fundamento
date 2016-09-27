
package ejercicios;

import java.util.Scanner;



public class Abcd {
    public static void main(String[] args) {
        
        Scanner intro = new Scanner(System.in);
        char letra[]=new char[26];
        for (int i = 0; i < letra.length; i++) {
            System.out.println("Ingresar las letras del abecedario en orden");
            letra[i]=intro.next().charAt(0);
        }
        for (int i = 0; i < letra.length; i++) {
            System.out.print(letra[i]+", ");
            
        }
        
    }
}
