
package ejercicios;

import java.util.Scanner;

public class Sistem_reserva {
    public static void main(String[] args) {
        int pc[]= new int[24];
        int caso, exit=0;
        Scanner intro = new Scanner(System.in);
        do{
            System.out.println("Ingresar numero de pc a reservar");
            caso = intro.nextInt();
            switch(caso){
                case 1:
                    int op1;
                    pc[0]=1;
                    if(pc[0]==1){
                        System.out.println("El pc esta reservado\n¿Quiere liberar pc?(1 para liberar, 2 para omitir");
                        op1=intro.nextInt();
                        if(op1==1){
                            pc[0]=0;
                        }else{
                            if(op1==2);
                            pc[0]=1;
                        }
                    }break;
                    
                case 2:
                    int op2;
                    pc[1]=1;
                    if(pc[1]==1){
                        System.out.println("El pc esta reservado\n¿Quiere liberar pc?(1 para liberar, 2 para omitir");
                        op2=intro.nextInt();
                        if(op2==1){
                            pc[1]=0;
                        }else{
                            if(op2==2);
                            pc[1]=0;
                        }
                    }break;
            }     
        }while(exit==3);
    }
}
