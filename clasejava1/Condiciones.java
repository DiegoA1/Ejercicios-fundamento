
package clasejava1;

import java.util.Scanner;


public class Condiciones {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese un numero natural para saber si es positivo o negativo");
        num=intro.nextInt();
        
        if(num==0){
            System.out.println("El numero es cero");
        }else{
            if(num>0){
                System.out.println("El numero es positivo");
            }else{
                System.out.println("El numero es negativo");
            }
        }
        intro.close();
    }
}
