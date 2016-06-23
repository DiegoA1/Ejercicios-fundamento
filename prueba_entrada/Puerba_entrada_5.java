
package prueba_entrada;

import java.util.Scanner;

public class Puerba_entrada_5 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int x;
        double aux=0, num=0;
        double par[];
        par =new double [21];
        double imp[];
        imp = new double [21];
        System.out.println("Ingresar cantidad de numeros");
        x=intro.nextInt();
        double numero[]=new double[x];
        for (int i = 0; i < numero.length; i++) {
            numero[i]= (int)(Math.random()*20+1);
            
        }
        
        for (int i = 0; i < numero.length; i++) {
            for (int j = 1; j < numero.length; j++) {
                if(numero[i]==numero[j])
                    num=numero[i];
            }  
        }
        System.out.println("El numero que más veces se repite es: "+num);
        
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero.length; j++) {
                if(numero[i]>numero[j]){
                    aux = numero[i];
                    numero[i] = numero[j];
                    numero[j] = aux;
                }  
            }
            
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]+", ");
        }
        
        for (int i = 0; i < numero.length; i++) {
            if(numero[i]/2==0){
                par[i]=numero[i];
            }else{
                imp[i]=numero[i];
            }
            
        }
         
    }
    
}
