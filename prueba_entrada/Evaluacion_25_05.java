
package prueba_entrada;

import java.util.Scanner;

public class Evaluacion_25_05 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int Presu,total,max=0,i,j,k,l;
        int entr[]=new int[4];
        int plat[]=new int[4];
        int ensa[]=new int[4];
        int post[]=new int[4];
        do{
            System.out.println("Ingrese la cantidad de presupuesto que tiene");
            Presu = intro.nextInt();
            if(Presu<1)
                System.out.println("Presupuesto mal ingresado");
        }while(Presu<1);
        for (i = 0; i < entr.length; i++) {
            entr[i]=(int)(Math.random()*10000+1000);
        }
        for (i = 0; i < plat.length; i++) {
            plat[i]=(int)(Math.random()*10000+1000);
        }
        for (i = 0; i < ensa.length; i++) {
            ensa[i]=(int)(Math.random()*10000+1000);   
        }
        for (i = 0; i < post.length; i++) {
            post[i]=(int)(Math.random()*10000+1000);
        }
        for (i = 0; i < entr.length; i++) {
            for (j = 0; j < plat.length; j++) {
                for (k = 0; k < ensa.length; k++) {
                    for (l = 0; l < post.length; l++) {
                        if(Presu>(entr[i]+plat[j]+ensa[k]+post[l])){
                            System.out.println("Puede escojer: ");
                            System.out.println("Entrada de: "+entr[i]);
                            System.out.println("PLato de: "+plat[j]);
                            System.out.println("Ensalada de: "+ensa[k]);
                            System.out.println("Postre de: "+post[l]);
                            total=entr[i]+plat[j]+ensa[k]+post[l];
                            System.out.println("--------------------");
                            System.out.println("Total: "+total);
                            System.out.println("******************************");
                        }
                    }
                    
                }
                
            }
        }
    }
}
