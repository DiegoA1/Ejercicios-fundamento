
package ejercicios;

import java.util.Scanner;

public class S_R2 {
    public static void main(String[] args) {
        int pc[]=new int[24];
        int caso, Pc, k;
        Scanner intro= new Scanner(System.in);
        do{
            System.out.println("Ingresar 1 para reservar pc\nIngresar 2 para liberar pc\nIngresar 3 para salir");
            caso=intro.nextInt();
            switch(caso){
                case 1:
                    do{
                        System.out.println("Ingresar n° de pc que se va a reservar");
                        Pc=intro.nextInt();
                        pc[Pc]=pc[Pc]=1;
                    }while(Pc<=1||Pc>=24);
                    k=0;
                    while(k<Pc||pc[k]!=pc[Pc]){
                        if(pc[Pc]==pc[k])
                            Pc--;
                        k++;
                    }
                    System.out.println("Pc reservado");  
                    break;
                case 2:
                    do{
                        System.out.println("Ingresar n° de pc que se va a liberar");
                        Pc=intro.nextInt();
                        pc[Pc]=pc[Pc]=0;
                    }while(Pc<=1||Pc>=24);
                    k=0;
                    while(k<Pc||pc[k]!=pc[Pc]){
                        if(pc[Pc]==pc[k])
                            Pc--;
                        k++;
                    }
                    System.out.println("Pc liberado");  
                    break;
                
            }
        }while(caso<3);    
    }
}
