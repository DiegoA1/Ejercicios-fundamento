
package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner intro = new Scanner(System.in);
        int num;
        System.out.println("ingrese numero");
        num = intro.nextInt();
        if (num%2==0){
            System.out.println("numero par");
            
        }else{
            System.out.println("numero impar");
        }
    }
    
}
