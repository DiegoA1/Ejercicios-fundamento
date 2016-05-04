
package capitulo4;

import java.util.Scanner;

public class Capitulo4_Ejercicio4 {
    public static void main(String[] args) {
        double paghex=0;
        double sueldobase=0;
        double desc=0;
        double descafp=0;
        double Descuento;
        double Sueldo;
        Scanner intro = new Scanner(System.in);
        int H, Grado, Isapre, Afp;
        System.out.println("Ingresar cantidad Horas Trabajadas");
        H = intro.nextInt();
        System.out.println("Ingresar numero de Grado");
        Grado = intro.nextInt();
        System.out.println("Ingresar numero de Isapre");
        Isapre = intro.nextInt();
        System.out.println("Ingresar numero de Afp");
        Afp = intro.nextInt();
        int hex = H-40;
        if (hex>=1 && hex<=3){
             paghex = 2000;
        }else{
            if(hex>=4 && hex<=7){
                paghex = 3000;
            }else{
                if(hex>7){
                    paghex = 3500;
                }
            }
        }
        if(Grado==1){
            sueldobase = 450000;
        }else{
            if(Grado==2){
                sueldobase = 550000;
            }else{
                if(Grado==3){
                    sueldobase = 700000;
                }
            }
        }
        if(Isapre==1){
            desc = 6.5;
        }else{
            if(Isapre==2){
                desc = 7.3;
            }else{
                if(Isapre==3){
                    desc = 7;
                }else{
                    if(Isapre==4){
                        desc = 7;
                    }
                }
            }
        }
        if(Afp==1){
            descafp = 12;
        }else{
            if(Afp==2){
                descafp = 13.4;
            }else{
                if(Afp==3){
                    descafp = 12.3;
                }else{
                    if(Afp==4){
                        descafp = 12.9;
                    }
                }
            }
        }
        Descuento = sueldobase*((desc/100)+(descafp/100));
        Sueldo = (sueldobase+paghex) - Descuento;
        System.out.println("El sueldo liquido de el trabajado es: "+Sueldo);
    }
}
