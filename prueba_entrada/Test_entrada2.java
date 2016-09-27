
package prueba_entrada;

import java.util.Scanner;

public class Test_entrada2 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int i, j,Alum, AlmAzar, preg, punt=0;
        String altern;
        System.out.println("Ingresar cantidad de alumnos");
        Alum = intro.nextInt();
        AlmAzar = (int)(Math.random()*Alum+1);
        for (i = 0; i < 3; i++){
            
            int Preg = (int)(Math.random()*5+1);
            switch(Preg){
                case 1:
                    System.out.println("Pregunta 1");
                    System.out.println("a) Alternativa 1");
                    System.out.println("b) Alternativa 2");
                    System.out.println("c) Alternativa 3");
                    System.out.println("d) Alternativa 4");
                    System.out.println("e) Alternativa 5");
                    for (j = 0; j < 3; j++) {
                        altern = intro.next();
                        if(altern=="d"){
                            punt = punt + 15;
                        }else{
                            if(punt>5){
                                punt = punt - 5;
                            }else{
                                punt = punt - 0;
                            }
                        }
                    }    
                    break;
                case 2:
                    System.out.println("Pregunta 2");
                    System.out.println("a) Alternativa 1");
                    System.out.println("b) Alternativa 2");
                    System.out.println("c) Alternativa 3");
                    System.out.println("d) Alternativa 4");
                    System.out.println("e) Alternativa 5");
                    for (j = 0; j < 10; j++) {
                        altern = intro.next(); 
                        if(altern=="b"){
                            punt = punt + 15;
                        }else{
                            if(punt>5){
                                punt = punt - 5;
                            }else{
                                punt = punt - 0;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Pregunta 2");
                    System.out.println("a) Alternativa 1");
                    System.out.println("b) Alternativa 2");
                    System.out.println("c) Alternativa 3");
                    System.out.println("d) Alternativa 4");
                    System.out.println("e) Alternativa 5");
                    for (j = 0; j < 10; j++) {
                        altern = intro.next(); 
                        if(altern=="e"){
                            punt = punt + 15;
                        }else{
                            if(punt>5){
                                punt = punt - 5;
                            }else{
                                punt = punt - 0;
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Pregunta 2");
                    System.out.println("a) Alternativa 1");
                    System.out.println("b) Alternativa 2");
                    System.out.println("c) Alternativa 3");
                    System.out.println("d) Alternativa 4");
                    System.out.println("e) Alternativa 5");
                    for (j = 0; j < 10; j++) {
                       altern = intro.next(); 
                        if(altern=="a"){
                            punt = punt + 15;
                        }else{
                            if(punt>5){
                                punt = punt - 5;
                            }else{
                                punt = punt - 0;
                            }
                        } 
                    }
                    break;
                case 5:
                    System.out.println("Pregunta 2");
                    System.out.println("a) Alternativa 1");
                    System.out.println("b) Alternativa 2");
                    System.out.println("c) Alternativa 3");
                    System.out.println("d) Alternativa 4");
                    System.out.println("e) Alternativa 5");
                    for (j = 0; j < 10; j++) {
                       altern = intro.next(); 
                        if(altern=="c"){
                            punt = punt + 15;
                        }else{
                            if(punt>5){
                                punt = punt - 5;
                            }else{
                                punt = punt - 0;
                            }
                        } 
                    }
                    break;
            }
            System.out.println("El puntaje obtenido es: "+punt);
        }
    }
}
