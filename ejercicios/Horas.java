
package ejercicios;

import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {
        int grados[]=new int[24];
        int i=0, max=0, min=100, posmax=0, posmin=0, suma=0;
        Scanner intro = new Scanner(System.in);
        for (i = 0; i < grados.length; i++) {
            System.out.println("Ingresar grados de la hora "+(i+1));
            grados[i]=intro.nextInt();    
            if(grados[i]>max){
                max=grados[i];
                posmax=i;
            }    
            if(grados[i]<min){
                min=grados[i];
                posmin=i;
            }
            suma = suma+grados[i];
        }
        for (i = 0; i < grados.length; i++) {
            System.out.println("los grados que hubieron a la hora "+(i+1)+" son: "+grados[i]+"°");
            
        }
        
        double prom = suma/24;
        System.out.println("La temperatura maxima fue a las: "+(posmax+1)+"hrs con "+max+"°");
        System.out.println("La temperatura minima fue a las: "+(posmin+1)+"hrs con "+min+"°");
        System.out.println("El promedio de los grados es: "+prom);
        System.out.println("----------------------------------------------------------------");
        System.out.println("ingresar numero que quiere saber");
        
    }
}
