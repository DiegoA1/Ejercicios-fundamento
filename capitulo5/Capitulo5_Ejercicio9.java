
package capitulo5;

import java.util.Scanner;

public class Capitulo5_Ejercicio9 {
    public static void main(String[] args) {
        int x, y, k, Aciertos = 0;
        int Azar;
        int NumAzar[];
        int NumJug[];
        NumAzar = new int[6];
        NumJug = new int[6];
        Scanner intro = new Scanner(System.in);
        for (x = 0; x < 6; x++){
            do{
                System.out.println("Ingresar Numero "+(x+1)+" para el sorteo");
                NumJug[x]=intro.nextInt();
            }while(NumJug[x]<=0 || NumJug[x]>=42);
            k=0;
            while(k<x || NumJug[k]!=NumJug[x]){
                if(NumJug[x]==NumJug[k])
                    x--;
                k++;
            }
        }
        System.out.println("-------------------------------------------------");
        for (x = 0; x < 6; x++){
            Azar = (int) (Math.random()*41+1);
            NumAzar[x]=Azar;
            System.out.println("Los numero del sorteo son: "+NumAzar[x]);
        }
        for (x = 0; x < 6; x++){
            for (y = 0; y < 6; y++){
                if (NumAzar[x]==NumJug[y]){
                   Aciertos++;
                   break;
                }
            }
        }
        System.out.println("Sus numero acertados fueron: "+Aciertos);
        if (Aciertos==6){
            System.out.println("Usted a ganado el LOTO");
        }else{
            if (Aciertos==5){
                System.out.println("Gano la Quina");
            }else{
                if (Aciertos==4){
                    System.out.println("Gano la Cuartena");
                }else{
                    if (Aciertos==3){
                        System.out.println("Gano la Terna");
                    }else{
                        System.out.println("Usted no gano nada");
                    }
                }
            }
        }
    }
}