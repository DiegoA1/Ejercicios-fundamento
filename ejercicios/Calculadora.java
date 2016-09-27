
package ejercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double X, Y, resul=0;
        String ope;
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingresar primer valor");
        X=intro.nextDouble();
        System.out.println("Ingresar operacion");
        ope=intro.next();
        System.out.println("Ingresar segundo valor");
        Y=intro.nextDouble();
        switch(ope){
            case "+":
                resul=X+Y;
                break;
            case "-":
                resul=X-Y;
                break;
            case "*":
                resul=X*Y;
                break;
            case "/":
                resul=X/Y;
                break;
        }
        System.out.println("El resultado es: "+resul);
                
    }
    
}
