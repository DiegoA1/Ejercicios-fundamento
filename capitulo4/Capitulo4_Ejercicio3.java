
package capitulo4;

import java.util.Scanner;

public class Capitulo4_Ejercicio3 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        float Nota;
        System.out.println("Ingresar nota del alumno");
        Nota = intro.nextFloat();
        if(Nota>=6.0 && Nota<=7.0){
            System.out.println("Muy bien");
        }else{
            if(Nota>=5.0 && Nota<=5.9){
                System.out.println("Bien");
            }else{
                if(Nota>=4.0 && Nota<=4.9){
                    System.out.println("Susficiente");
                }else{
                    if(Nota>=1.0 && Nota<=3.9){
                        System.out.println("Insuficiente");
                    }else{
                        System.out.println("***Nota mal ingresada***");
                    }
                }
            }
        }
    }
}
