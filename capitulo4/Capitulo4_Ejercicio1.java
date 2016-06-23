
package capitulo4;

import java.util.Scanner;

public class Capitulo4_Ejercicio1 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double N1 , N2, N3, N4;
        System.out.println("Ingresar primer numero");
        N1 = intro.nextDouble();
        System.out.println("Ingresar segundo numero");
        N2 = intro.nextDouble();
        System.out.println("Ingresar tercer numero");
        N3 = intro.nextDouble();
        System.out.println("Ingresar cuarto numero");
        N4 = intro.nextDouble();
        if((N1>N2)&&(N1>N3)&&(N1>N4)){
            System.out.println("El mayor es: "+N1);
        }else{
            if((N2>N1)&&(N2>N3)&&(N2>N4)){
                System.out.println("El mayor es: "+N2);
            }else{
                if((N3>N1)&&(N3>N2)&&(N3>N4)){
                    System.out.println("El mayor es: "+N3);   
                }else{
                    if((N4>N1)&&(N4>N2)&&(N4>N3)){
                        System.out.println("El mayor es: "+N4);
                    }else{
                        System.out.println("***Numeros mal ingresados***");
                    }
                }
            }
        }
    }
    
}
