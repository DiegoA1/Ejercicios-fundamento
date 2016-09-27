
package prueba_entrada;

import java.util.Scanner;

class Prueba_entrada {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int X, i, x, y, rendi=15;
        double d, x2, y2,combus;
        double Km=0;
        int cont=1;
        System.out.println("***Bienvenido***");
        do{
            System.out.println("Ingresar la cantidad de entregas");
            X = intro.nextInt();
            if(X<1){
                System.out.println("***El numero de entregas está mal ingresado***");
            }
        }while(X<1);
        
        System.out.println("------------------------------------------");
        for (i = 0; i < X; i++) {
            
            do{
                System.out.println("Ingresar distabcia en x de entrega "+cont);
                x=intro.nextInt();
                if(x<1){
                    System.out.println("**Mumero mal ingresado**");
                }
            }while(x<1);
            do{
                System.out.println("Ingresar distancia en y de entrega "+cont);
                y=intro.nextInt();
                if(y<1){
                    System.out.println("**Numero mal ingresado**");
                }
            }while(x<1);
            cont=cont+1;
            x2 = Math.pow(x, 2);
            y2 = Math.pow(y, 2);
            d = Math.sqrt(x2+y2);
            Km = Math.round(Km + d);
        }
        System.out.println("La distancia total es: "+Km+" Km");
        combus = Math.round(Km/rendi)*50;
        System.out.println("-------------------------------------------");
        System.out.println("El combustible que se ocupara es: "+combus+" Km/litro");
        
    }
    
}
